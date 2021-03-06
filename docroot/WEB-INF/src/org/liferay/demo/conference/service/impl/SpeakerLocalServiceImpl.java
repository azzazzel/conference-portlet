/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * The contents of this file are subject to the terms of the Liferay Enterprise
 * Subscription License ("License"). You may not use this file except in
 * compliance with the License. You can obtain a copy of the License by
 * contacting Liferay, Inc. See the License for the specific language governing
 * permissions and limitations under the License, including but not limited to
 * distribution rights of the Software.
 *
 *
 *
 */

package org.liferay.demo.conference.service.impl;

import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.repository.model.FileEntry;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.util.ContentTypes;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.Repository;
import com.liferay.portal.model.ResourceConstants;
import com.liferay.portal.model.User;
import com.liferay.portal.portletfilerepository.PortletFileRepositoryUtil;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portlet.asset.model.AssetEntry;
import com.liferay.portlet.asset.model.AssetLinkConstants;
import com.liferay.portlet.documentlibrary.model.DLFolderConstants;

import java.io.InputStream;
import java.util.Date;
import java.util.List;

import org.liferay.demo.conference.ConferenceConstants;
import org.liferay.demo.conference.model.Speaker;
import org.liferay.demo.conference.service.SpeakerLocalServiceUtil;
import org.liferay.demo.conference.service.base.SpeakerLocalServiceBaseImpl;

/**
 * The implementation of the speaker local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link org.liferay.demo.conference.service.SpeakerLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author Milen Dyankov
 * @see org.liferay.demo.conference.service.base.SpeakerLocalServiceBaseImpl
 * @see org.liferay.demo.conference.service.SpeakerLocalServiceUtil
 */
public class SpeakerLocalServiceImpl extends SpeakerLocalServiceBaseImpl {

	public List<Speaker> getSpeakers(long groupId) throws SystemException {
		return speakerPersistence.findByGroup(groupId);
	}
	
	@Indexable(type = IndexableType.REINDEX)
	public Speaker addSpeaker(String name, String bio, InputStream image,
			ServiceContext serviceContext) throws SystemException,
			PortalException {

		Speaker speaker = SpeakerLocalServiceUtil
				.createSpeaker(CounterLocalServiceUtil.increment(Speaker.class
						.getName()));

		long userId = serviceContext.getUserId();
		User user = userPersistence.fetchByPrimaryKey(userId);

		speaker.setName(name);
		speaker.setBio(bio);

		speaker.setUuid(serviceContext.getUuid());
		speaker.setCompanyId(serviceContext.getCompanyId());
		speaker.setGroupId(serviceContext.getScopeGroupId());
		speaker.setUserId(userId);
		speaker.setUserName(user.getFullName());
		speaker.setCreateDate(new Date());
		speaker.setModifiedDate(new Date());
		speaker.setExpandoBridgeAttributes(serviceContext);

		speakerPersistence.update(speaker);

		saveSpeakerImage(speaker, image, serviceContext);

		addResource(speaker, serviceContext);
		updateAsset(speaker, serviceContext);
		return speaker;
	}

	@Indexable(type = IndexableType.DELETE)
	public Speaker deleteSpeaker(long speakerId, ServiceContext serviceContext)
			throws PortalException, SystemException {

		Speaker speaker = speakerPersistence.findByPrimaryKey(speakerId);

		AssetEntry asset = assetEntryLocalService.fetchEntry(
				Speaker.class.getName(), speakerId);
		if (asset != null) {
			assetLinkLocalService.deleteLinks(asset.getEntryId());
			assetEntryLocalService.deleteAssetEntry(asset);
		}

		try {
			PortletFileRepositoryUtil.deletePortletFileEntry(
					speaker.getGroupId(),
					DLFolderConstants.DEFAULT_PARENT_FOLDER_ID,
					String.valueOf(speakerId));
		} catch (Exception e) {
		}

		resourceLocalService.deleteResource(serviceContext.getCompanyId(),
				Speaker.class.getName(), ResourceConstants.SCOPE_INDIVIDUAL,
				speakerId);

		return speakerPersistence.remove(speakerId);
	}

	public void deleteSpeakers(long groupId) throws PortalException,
			SystemException {

		List<Speaker> speakers = getSpeakers(groupId);

		for (Speaker speaker : speakers) {
			speakerLocalService.deleteSpeaker(speaker.getSpeakerId());
		}
	}

	@Indexable(type = IndexableType.REINDEX)
	public Speaker updateSpeaker(long speakerId, String name, String bio,
			InputStream image, ServiceContext serviceContext)
			throws SystemException, PortalException {

		Speaker speaker = SpeakerLocalServiceUtil.getSpeaker(speakerId);
		speaker.setName(name);
		speaker.setBio(bio);
		speaker.setModifiedDate(new Date());
		speaker.setExpandoBridgeAttributes(serviceContext);

		speakerPersistence.update(speaker);

		saveSpeakerImage(speaker, image, serviceContext);

		updateAsset(speaker, serviceContext);
		return speaker;
	}

	/*
	 *  HELPER METHODS
	 */
	
	private void saveSpeakerImage(Speaker speaker, InputStream image,
			ServiceContext serviceContext) throws PortalException,
			SystemException {
		if (image != null) {

			try {
				Repository repository = PortletFileRepositoryUtil
						.fetchPortletRepository(
								serviceContext.getScopeGroupId(),
								ConferenceConstants.FILE_REPOSITORY);

				FileEntry fileEntry = PortletFileRepositoryUtil
						.getPortletFileEntry(repository.getRepositoryId(),
								DLFolderConstants.DEFAULT_PARENT_FOLDER_ID,
								String.valueOf(speaker.getSpeakerId()));

				if (fileEntry != null) {
					PortletFileRepositoryUtil.deletePortletFileEntry(fileEntry
							.getFileEntryId());
				}
			} catch (Exception e) {
			}

			PortletFileRepositoryUtil.addPortletFileEntry(
					serviceContext.getScopeGroupId(),
					serviceContext.getUserId(), Speaker.class.getName(),
					speaker.getSpeakerId(),
					ConferenceConstants.FILE_REPOSITORY,
					DLFolderConstants.DEFAULT_PARENT_FOLDER_ID, image,
					String.valueOf(speaker.getSpeakerId()), StringPool.BLANK,
					true);
		}
	}
	
	private void addResource(Speaker speaker, ServiceContext serviceContext)
			throws PortalException, SystemException {

		if (serviceContext.isAddGroupPermissions()
				|| serviceContext.isAddGuestPermissions()) {

			resourceLocalService.addResources(speaker.getCompanyId(), // companyId
					serviceContext.getScopeGroupId(), // groupId
					serviceContext.getUserId(), // userId
					Speaker.class.getName(), // name
					speaker.getSpeakerId(), // primKey
					false, // portletActions
					serviceContext.isAddGroupPermissions(), // addGroupPersmissions
					serviceContext.isAddGuestPermissions() // addGuestPersmissions
					);
		} else {
			resourceLocalService.addModelResources(speaker.getCompanyId(), // companyId
					serviceContext.getScopeGroupId(), // groupId
					serviceContext.getUserId(), // userId
					Speaker.class.getName(), // name
					speaker.getSpeakerId(), // primKey
					serviceContext.getGroupPermissions(), // addGroupPersmissions
					serviceContext.getGuestPermissions() // addGuestPersmissions
					);
		}

	}

	private AssetEntry updateAsset(Speaker speaker,
			ServiceContext serviceContext) throws PortalException,
			SystemException {

		AssetEntry asset = assetEntryLocalService.updateEntry(
				serviceContext.getUserId(), // userId
				speaker.getGroupId(), // groupId
				speaker.getCreateDate(), // create date
				speaker.getModifiedDate(), // modified date
				Speaker.class.getName(), // className
				speaker.getSpeakerId(), // classPK
				speaker.getUuid(), // classUuid
				0, // classTypeId
				serviceContext.getAssetCategoryIds(), // categoryIds
				serviceContext.getAssetTagNames(), // tagNames
				true, // visible
				null, // startDate
				null, // endDate
				null, // expirationDate
				ContentTypes.TEXT_HTML, // mimeType
				speaker.getName(), // title
				null, // description
				null, // summary
				null, // url
				null, // layoutUuid
				0, // height
				0, // width
				null, // priority
				false // sync
				);

		assetLinkLocalService.updateLinks(serviceContext.getUserId(),
				asset.getEntryId(), serviceContext.getAssetLinkEntryIds(),
				AssetLinkConstants.TYPE_RELATED);

		return asset;
	}
}
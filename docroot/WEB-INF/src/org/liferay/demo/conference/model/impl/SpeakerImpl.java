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

package org.liferay.demo.conference.model.impl;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.repository.model.FileEntry;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.Repository;
import com.liferay.portal.portletfilerepository.PortletFileRepositoryUtil;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.portlet.documentlibrary.model.DLFolderConstants;
import com.liferay.portlet.documentlibrary.util.DLUtil;

import org.liferay.demo.conference.ConferenceConstants;

/**
 * The extended model implementation for the Speaker service. Represents a row in the &quot;CONFERENCE_Speaker&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * Helper methods and all application logic should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link org.liferay.demo.conference.model.Speaker} interface.
 * </p>
 *
 * @author Milen Dyankov
 */
public class SpeakerImpl extends SpeakerBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. All methods that expect a speaker model instance should use the {@link org.liferay.demo.conference.model.Speaker} interface instead.
	 */
	public SpeakerImpl() {
	}
	
	public FileEntry getCustomImage() throws SystemException, PortalException {
		Repository repository = PortletFileRepositoryUtil
				.fetchPortletRepository(getGroupId(),
						ConferenceConstants.FILE_REPOSITORY);

		if (repository == null) {
			return null;
		}

		FileEntry fileEntry = null;
		try {
			return PortletFileRepositoryUtil.getPortletFileEntry(
					repository.getRepositoryId(),
					DLFolderConstants.DEFAULT_PARENT_FOLDER_ID,
					String.valueOf(getSpeakerId()));
		} catch (Exception e) {
		}

		return fileEntry;
	}

	
	public String getImageURL(ThemeDisplay themeDisplay)
			throws PortalException, SystemException {

		FileEntry fileEntry = getCustomImage();

		if (fileEntry != null) {
			return DLUtil.getPreviewURL(fileEntry,
					fileEntry.getLatestFileVersion(), themeDisplay,
					StringPool.BLANK);
		} else {
			return themeDisplay.getPortalURL()
					+ ConferenceConstants.APP_CONTEXT + "/images/speaker.jpg";
		}
	}

	public boolean hasCustomImage() throws PortalException, SystemException {
		FileEntry fileEntry = getCustomImage();

		if (fileEntry != null) {
			return true;
		}

		return false;
	}

}
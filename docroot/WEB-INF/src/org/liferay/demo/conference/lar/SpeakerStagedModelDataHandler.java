/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package org.liferay.demo.conference.lar;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.lar.BaseStagedModelDataHandler;
import com.liferay.portal.kernel.lar.ExportImportPathUtil;
import com.liferay.portal.kernel.lar.PortletDataContext;
import com.liferay.portal.kernel.lar.StagedModelDataHandlerUtil;
import com.liferay.portal.kernel.repository.model.FileEntry;
import com.liferay.portal.kernel.trash.TrashHandler;
import com.liferay.portal.kernel.xml.Element;
import com.liferay.portal.service.ServiceContext;

import java.io.InputStream;
import java.util.List;

import org.liferay.demo.conference.model.Speaker;
import org.liferay.demo.conference.service.SpeakerLocalServiceUtil;

/**
 * @author Milen Dyankov
 */
public class SpeakerStagedModelDataHandler
	extends BaseStagedModelDataHandler<Speaker> {

	public static final String[] CLASS_NAMES = {Speaker.class.getName()};

	@Override
	public void deleteStagedModel(
			String uuid, long groupId, String className, String extraData)
		throws PortalException, SystemException {

		Speaker speaker = SpeakerLocalServiceUtil.fetchSpeakerByUuidAndGroupId(
			uuid, groupId);

		if (speaker != null) {
			SpeakerLocalServiceUtil.deleteSpeaker(speaker);
		}
	}

	@Override
	public String[] getClassNames() {
		return CLASS_NAMES;
	}

	@Override
	public String getDisplayName(Speaker speaker) {
		return speaker.getName();
	}

	@Override
	protected void doExportStagedModel(
			PortletDataContext portletDataContext, Speaker speaker)
		throws Exception {

		Element speakerElement = portletDataContext.getExportDataElement(speaker);

		if (speaker.hasCustomImage()) {
			FileEntry fileEntry = speaker.getCustomImage();

			StagedModelDataHandlerUtil.exportReferenceStagedModel(
				portletDataContext, speaker, Speaker.class, fileEntry,
				FileEntry.class, PortletDataContext.REFERENCE_TYPE_WEAK);
		}

		portletDataContext.addClassedModel(
			speakerElement, ExportImportPathUtil.getModelPath(speaker), speaker);
	}

	@Override
	protected void doImportStagedModel(
			PortletDataContext portletDataContext, Speaker speaker)
		throws Exception {


		ServiceContext serviceContext = portletDataContext.createServiceContext(
			speaker);

		Speaker importedSpeaker = null;

		if (portletDataContext.isDataStrategyMirror()) {
			Speaker existingSpeaker =
				SpeakerLocalServiceUtil.fetchSpeakerByUuidAndGroupId(
					speaker.getUuid(), portletDataContext.getScopeGroupId());

			if (existingSpeaker == null) {
				serviceContext.setUuid(speaker.getUuid());

				importedSpeaker = SpeakerLocalServiceUtil.addSpeaker(
					speaker.getName(), speaker.getBio(), null,
					serviceContext);
			}
			else {
				importedSpeaker = SpeakerLocalServiceUtil.updateSpeaker(
					existingSpeaker.getSpeakerId(), speaker.getName(),
					speaker.getBio(), null, serviceContext);
			}
		}
		else {
			importedSpeaker = SpeakerLocalServiceUtil.addSpeaker(
				speaker.getName(), speaker.getBio(), null,
				serviceContext);
		}

		Element speakerElement =
			portletDataContext.getImportDataStagedModelElement(speaker);

		List<Element> attachmentElements =
			portletDataContext.getReferenceDataElements(
				speakerElement, FileEntry.class,
				PortletDataContext.REFERENCE_TYPE_WEAK);

		for (Element attachmentElement : attachmentElements) {
			
			String fileEntryUUID = attachmentElement.attributeValue("uuid");
			Element fileEntryElement =
					portletDataContext.getImportDataElement("FileEntry", "uuid", fileEntryUUID);
			String binPath = fileEntryElement.attributeValue("bin-path");
			InputStream image = portletDataContext.getZipEntryAsInputStream(binPath);
			
			importedSpeaker = SpeakerLocalServiceUtil.updateSpeaker(
				importedSpeaker.getSpeakerId(), importedSpeaker.getName(),
				importedSpeaker.getBio(), image,
				serviceContext);
		}

		portletDataContext.importClassedModel(speaker, importedSpeaker);
	}

	@Override
	protected void doRestoreStagedModel(
			PortletDataContext portletDataContext, Speaker speaker)
		throws Exception {

		long userId = portletDataContext.getUserId(speaker.getUserUuid());

		Speaker existingSpeaker =
			SpeakerLocalServiceUtil.fetchSpeakerByUuidAndGroupId(
				speaker.getUuid(), portletDataContext.getScopeGroupId());

		if ((existingSpeaker == null) || !existingSpeaker.isInTrash()) {
			return;
		}

		TrashHandler trashHandler = existingSpeaker.getTrashHandler();

		if (trashHandler.isRestorable(existingSpeaker.getSpeakerId())) {
			trashHandler.restoreTrashEntry(
				userId, existingSpeaker.getSpeakerId());
		}
	}

	@Override
	protected boolean validateMissingReference(
			String uuid, long companyId, long groupId)
		throws Exception {

		Speaker speaker = SpeakerLocalServiceUtil.fetchSpeakerByUuidAndGroupId(
			uuid, groupId);

		if (speaker == null) {
			return false;
		}

		return true;
	}

}
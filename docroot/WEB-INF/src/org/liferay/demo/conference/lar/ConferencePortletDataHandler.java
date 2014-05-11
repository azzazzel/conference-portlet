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

import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.lar.BasePortletDataHandler;
import com.liferay.portal.kernel.lar.PortletDataContext;
import com.liferay.portal.kernel.lar.PortletDataHandlerBoolean;
import com.liferay.portal.kernel.lar.StagedModelDataHandlerUtil;
import com.liferay.portal.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.xml.Element;

import java.util.List;

import javax.portlet.PortletPreferences;

import org.liferay.demo.conference.model.Speaker;
import org.liferay.demo.conference.service.SpeakerLocalServiceUtil;
import org.liferay.demo.conference.service.persistence.SpeakerExportActionableDynamicQuery;

/**
 * @author Milen Dyankov
 */
public class ConferencePortletDataHandler extends BasePortletDataHandler {

	public static final String NAMESPACE = "conference";

	public ConferencePortletDataHandler() {
		setDeletionSystemEventStagedModelTypes(
			new StagedModelType(Speaker.class)
			);
		setExportControls(
			new PortletDataHandlerBoolean(
				NAMESPACE, "speakers", true, false, null,
				Speaker.class.getName())
			);
		setImportControls(getExportControls());
		setPublishToLiveByDefault(true);
	}

	@Override
	protected PortletPreferences doDeleteData(
			PortletDataContext portletDataContext, String portletId,
			PortletPreferences portletPreferences)
		throws Exception {

		SpeakerLocalServiceUtil.deleteSpeakers(
			portletDataContext.getScopeGroupId());

		return portletPreferences;
	}

	@Override
	protected String doExportData(
			PortletDataContext portletDataContext, String portletId,
			PortletPreferences portletPreferences)
		throws Exception {

		Element rootElement = addExportDataRootElement(portletDataContext);

		if (portletDataContext.getBooleanParameter(NAMESPACE, "speakers")) {
			ActionableDynamicQuery speakerActionableDynamicQuery =
				new SpeakerExportActionableDynamicQuery(portletDataContext);

			speakerActionableDynamicQuery.performActions();
		}

		return getExportDataRootElementString(rootElement);
	}

	@Override
	protected PortletPreferences doImportData(
			PortletDataContext portletDataContext, String portletId,
			PortletPreferences portletPreferences, String data)
		throws Exception {

		if (portletDataContext.getBooleanParameter(NAMESPACE, "speakers")) {
			Element speakersElement =
				portletDataContext.getImportDataGroupElement(Speaker.class);

			List<Element> speakerElements = speakersElement.elements();

			for (Element speakerElement : speakerElements) {
				StagedModelDataHandlerUtil.importStagedModel(
					portletDataContext, speakerElement);
			}
		}

		return null;
	}

	@Override
	protected void doPrepareManifestSummary(
			PortletDataContext portletDataContext,
			PortletPreferences portletPreferences)
		throws Exception {

		ActionableDynamicQuery speakerActionableDynamicQuery =
			new SpeakerExportActionableDynamicQuery(portletDataContext);

		speakerActionableDynamicQuery.performCount();
	}

}
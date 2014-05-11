package org.liferay.demo.conference.portlet;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.upload.UploadPortletRequest;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.ServiceContextFactory;
import com.liferay.portal.util.PortalUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

import java.io.IOException;
import java.io.InputStream;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import org.liferay.demo.conference.model.Speaker;
import org.liferay.demo.conference.service.SpeakerServiceUtil;

/**
 * Portlet implementation class SpeakersPortlet
 */
public class SpeakersPortlet extends MVCPortlet {

	public void saveSpeaker(ActionRequest request, ActionResponse response) {
		try {
			UploadPortletRequest uploadPortletRequest = PortalUtil
					.getUploadPortletRequest(request);

			ServiceContext serviceContext = ServiceContextFactory.getInstance(
					Speaker.class.getName(), uploadPortletRequest);

			InputStream image = uploadPortletRequest.getFileAsStream("file");
			String name = ParamUtil.getString(uploadPortletRequest, "name");
			String bio = ParamUtil.getString(uploadPortletRequest, "bio");
			long speakerId = ParamUtil.getLong(uploadPortletRequest,
					"speakerId");

			if (speakerId > 0) {
				SpeakerServiceUtil.updateSpeaker(speakerId, name, bio, image,
						serviceContext);
				SessionMessages.add(request, "speakerUpdated");

			} else {
				SpeakerServiceUtil.addSpeaker(name, bio, image, serviceContext);
				SessionMessages.add(request, "speakerAdded");

			}

			SessionMessages.add(uploadPortletRequest, PortalUtil.getPortletId(uploadPortletRequest)
					+ SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_SUCCESS_MESSAGE);

			String redirect = ParamUtil.getString(uploadPortletRequest, "redirect");
			response.sendRedirect(redirect);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void deleteSpeaker(ActionRequest request, ActionResponse response)
			throws IOException, SystemException, PortalException {

		long speakerId = ParamUtil.getLong(request, "speakerId");

		ServiceContext serviceContext = ServiceContextFactory.getInstance(
				Speaker.class.getName(), request);

		SpeakerServiceUtil.deleteSpeaker(speakerId, serviceContext);

		SessionMessages.add(request, PortalUtil.getPortletId(request)
				+ SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_SUCCESS_MESSAGE);

		String redirect = ParamUtil.getString(request, "redirect");
		response.sendRedirect(redirect);
	}

}

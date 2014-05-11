package org.liferay.demo.conference.asset;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.portlet.LiferayPortletRequest;
import com.liferay.portal.kernel.portlet.LiferayPortletResponse;
import com.liferay.portal.model.User;
import com.liferay.portal.security.permission.PermissionChecker;
import com.liferay.portal.service.UserLocalServiceUtil;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.portal.util.PortalUtil;
import com.liferay.portlet.asset.model.BaseAssetRenderer;

import java.util.Locale;

import javax.portlet.PortletRequest;
import javax.portlet.PortletURL;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.portlet.WindowState;

import org.liferay.demo.conference.ConferenceConstants;
import org.liferay.demo.conference.model.Speaker;

public class SpeakerAssetRenderer extends BaseAssetRenderer {

	Speaker speaker;

	public SpeakerAssetRenderer(Speaker speaker) {
		this.speaker = speaker;
	}

	@Override
	public String getClassName() {
		return speaker.getClass().getName();
	}

	@Override
	public long getClassPK() {
		return speaker.getSpeakerId();
	}

	@Override
	public long getGroupId() {
		return speaker.getGroupId();
	}

	@Override
	public String getSummary(Locale locale) {
		return speaker.getName();
	}

	@Override
	public String getTitle(Locale locale) {
		return speaker.getName();
	}

	@Override
	public long getUserId() {
		return speaker.getUserId();
	}

	@Override
	public String getUserName() {
		try {
			User user = UserLocalServiceUtil.getUser(speaker.getUserId());
			return user.getFullName();
		} catch (Exception e) {
		}
		return null;
	}

	@Override
	public String getUuid() {
		return speaker.getUuid();
	}

	@Override
	public String render(RenderRequest renderRequest,
			RenderResponse renderResponse, String template) throws Exception {

			renderRequest.setAttribute("speaker", speaker);
			return "/html/speakers/assets/" + template + ".jsp";
	}

	@Override
	public String getIconPath(ThemeDisplay themeDisplay) {

		try {
			return speaker.getImageURL(themeDisplay);
		} catch (Exception e) {
			return themeDisplay.getPortalURL()
					+ ConferenceConstants.APP_CONTEXT + "/images/speaker.jpg";
		}
		
	}

	@Override
	public boolean hasEditPermission(PermissionChecker permissionChecker)
			throws PortalException, SystemException {
		return permissionChecker.hasPermission(speaker.getGroupId(), Speaker.class.getName(), speaker.getSpeakerId(), "UPDATE");
	}

	@Override
	public PortletURL getURLView(LiferayPortletResponse liferayPortletResponse,
			WindowState windowState) throws Exception {

		PortletURL portletURL = liferayPortletResponse.createLiferayPortletURL(
				ConferenceConstants.SPEAKERS_PORTLET_ID,
				PortletRequest.RENDER_PHASE);

		portletURL.setParameter("jspPage", "/html/speakers/speaker.jsp");
		portletURL.setParameter("speakerId",
				String.valueOf(speaker.getSpeakerId()));
		portletURL.setWindowState(windowState);

		return portletURL;
	}

	@Override
	public String getURLViewInContext(
			LiferayPortletRequest liferayPortletRequest,
			LiferayPortletResponse liferayPortletResponse,
			String noSuchEntryRedirect) throws Exception {
		
		long scopeGroupId = PortalUtil.getScopeGroupId(liferayPortletRequest);
		long plid = PortalUtil.getPlidFromPortletId(scopeGroupId, ConferenceConstants.SPEAKERS_PORTLET_ID);

		PortletURL portletURL = liferayPortletResponse.createLiferayPortletURL(plid,
				ConferenceConstants.SPEAKERS_PORTLET_ID,
				PortletRequest.RENDER_PHASE);

		portletURL.setParameter("jspPage", "/html/speakers/speaker.jsp");
		portletURL.setParameter("speakerId",
				String.valueOf(speaker.getSpeakerId()));

		return portletURL.toString();
	}
	
	@Override
	public PortletURL getURLEdit(
			LiferayPortletRequest liferayPortletRequest,
			LiferayPortletResponse liferayPortletResponse)
		throws Exception {

		PortletURL portletURL = liferayPortletResponse.createLiferayPortletURL(
			getControlPanelPlid(liferayPortletRequest),
			ConferenceConstants.SPEAKERS_PORTLET_ID, PortletRequest.RENDER_PHASE);

		portletURL.setParameter("jspPage", "/html/speakers/edit.jsp");
		portletURL.setParameter("speakerId", String.valueOf(speaker.getSpeakerId()));

		return portletURL;
	}
}

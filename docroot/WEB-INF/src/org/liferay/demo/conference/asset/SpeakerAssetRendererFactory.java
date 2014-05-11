package org.liferay.demo.conference.asset;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.portlet.asset.model.AssetRenderer;
import com.liferay.portlet.asset.model.BaseAssetRendererFactory;

import org.liferay.demo.conference.ConferenceConstants;
import org.liferay.demo.conference.model.Speaker;
import org.liferay.demo.conference.service.SpeakerLocalServiceUtil;

public class SpeakerAssetRendererFactory extends BaseAssetRendererFactory {

	@Override
	public AssetRenderer getAssetRenderer(long classPK, int type)
			throws PortalException, SystemException {
		Speaker speaker = SpeakerLocalServiceUtil.getSpeaker(classPK);
		return new SpeakerAssetRenderer(speaker);
	}

	@Override
	public String getClassName() {
		return Speaker.class.getName();
	}

	@Override
	public String getType() {
		return "speaker";
	}

	@Override
	public boolean isLinkable() {
		return true;
	}

	@Override
	protected String getIconPath(ThemeDisplay themeDisplay) {
		return themeDisplay.getPortalURL() + ConferenceConstants.APP_CONTEXT
				+ "/icons/speaker.png";
	}
}

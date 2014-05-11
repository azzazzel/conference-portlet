package org.liferay.demo.conference.expando;

import com.liferay.portlet.expando.model.BaseCustomAttributesDisplay;

import org.liferay.demo.conference.model.Speaker;

public class SpeakerCustomAttributeDisplay extends BaseCustomAttributesDisplay {

	@Override
	public String getClassName() {
		return Speaker.class.getName();
	}

}

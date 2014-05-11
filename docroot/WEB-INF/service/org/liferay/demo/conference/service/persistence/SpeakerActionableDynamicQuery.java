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

package org.liferay.demo.conference.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import org.liferay.demo.conference.model.Speaker;
import org.liferay.demo.conference.service.SpeakerLocalServiceUtil;

/**
 * @author Milen Dyankov
 * @generated
 */
public abstract class SpeakerActionableDynamicQuery
	extends BaseActionableDynamicQuery {
	public SpeakerActionableDynamicQuery() throws SystemException {
		setBaseLocalService(SpeakerLocalServiceUtil.getService());
		setClass(Speaker.class);

		setClassLoader(org.liferay.demo.conference.service.ClpSerializer.class.getClassLoader());

		setPrimaryKeyPropertyName("speakerId");
	}
}
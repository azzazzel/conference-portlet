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

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.security.auth.PrincipalException;
import com.liferay.portal.service.ServiceContext;

import java.io.InputStream;

import org.liferay.demo.conference.ConferenceConstants;
import org.liferay.demo.conference.model.Speaker;
import org.liferay.demo.conference.service.base.SpeakerServiceBaseImpl;

/**
 * The implementation of the speaker remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link org.liferay.demo.conference.service.SpeakerService} interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author Milen Dyankov
 * @see org.liferay.demo.conference.service.base.SpeakerServiceBaseImpl
 * @see org.liferay.demo.conference.service.SpeakerServiceUtil
 */
public class SpeakerServiceImpl extends SpeakerServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link org.liferay.demo.conference.service.SpeakerServiceUtil} to access the speaker remote service.
	 */
	
	public Speaker addSpeaker(String name, String bio, InputStream image,
			ServiceContext serviceContext) throws SystemException,
			PortalException {

		checkPermission(serviceContext.getScopeGroupId(), ConferenceConstants.MODEL_PACKAGE,
				serviceContext.getScopeGroupId(), "ADD_SPEAKER");

		return speakerLocalService.addSpeaker(name, bio, image, serviceContext);
	}

	public Speaker updateSpeaker(long speakerId, String name, String bio, InputStream image,
			ServiceContext serviceContext) throws SystemException,
			PortalException {

		checkPermission(serviceContext.getScopeGroupId(), Speaker.class.getName(),
				speakerId, "UPDATE");

		return speakerLocalService
				.updateSpeaker(speakerId, name, bio, image, serviceContext);
	}

	public Speaker deleteSpeaker(long speakerId, ServiceContext serviceContext)
			throws SystemException, PortalException {

		checkPermission(serviceContext.getScopeGroupId(),
				Speaker.class.getName(), speakerId, "DELETE");

		return speakerLocalService.deleteSpeaker(speakerId, serviceContext);
	}

	private void checkPermission(long siteId, String className, long id,
			String permission) throws PrincipalException {
		if (!getPermissionChecker().hasPermission(siteId, className, id,
				permission)) {
			throw new PrincipalException();
		}
	}

}
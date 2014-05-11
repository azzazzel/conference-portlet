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

package org.liferay.demo.conference.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link SpeakerService}.
 *
 * @author Milen Dyankov
 * @see SpeakerService
 * @generated
 */
public class SpeakerServiceWrapper implements SpeakerService,
	ServiceWrapper<SpeakerService> {
	public SpeakerServiceWrapper(SpeakerService speakerService) {
		_speakerService = speakerService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _speakerService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_speakerService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _speakerService.invokeMethod(name, parameterTypes, arguments);
	}

	@Override
	public org.liferay.demo.conference.model.Speaker addSpeaker(
		java.lang.String name, java.lang.String bio, java.io.InputStream image,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _speakerService.addSpeaker(name, bio, image, serviceContext);
	}

	@Override
	public org.liferay.demo.conference.model.Speaker updateSpeaker(
		long speakerId, java.lang.String name, java.lang.String bio,
		java.io.InputStream image,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _speakerService.updateSpeaker(speakerId, name, bio, image,
			serviceContext);
	}

	@Override
	public org.liferay.demo.conference.model.Speaker deleteSpeaker(
		long speakerId, com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _speakerService.deleteSpeaker(speakerId, serviceContext);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public SpeakerService getWrappedSpeakerService() {
		return _speakerService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedSpeakerService(SpeakerService speakerService) {
		_speakerService = speakerService;
	}

	@Override
	public SpeakerService getWrappedService() {
		return _speakerService;
	}

	@Override
	public void setWrappedService(SpeakerService speakerService) {
		_speakerService = speakerService;
	}

	private SpeakerService _speakerService;
}
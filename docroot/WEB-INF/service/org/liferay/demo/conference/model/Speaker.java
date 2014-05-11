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

package org.liferay.demo.conference.model;

import com.liferay.portal.model.PersistedModel;

/**
 * The extended model interface for the Speaker service. Represents a row in the &quot;CONFERENCE_Speaker&quot; database table, with each column mapped to a property of this class.
 *
 * @author Milen Dyankov
 * @see SpeakerModel
 * @see org.liferay.demo.conference.model.impl.SpeakerImpl
 * @see org.liferay.demo.conference.model.impl.SpeakerModelImpl
 * @generated
 */
public interface Speaker extends SpeakerModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link org.liferay.demo.conference.model.impl.SpeakerImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public com.liferay.portal.kernel.repository.model.FileEntry getCustomImage()
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	public java.lang.String getImageURL(
		com.liferay.portal.theme.ThemeDisplay themeDisplay)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	public boolean hasCustomImage()
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;
}
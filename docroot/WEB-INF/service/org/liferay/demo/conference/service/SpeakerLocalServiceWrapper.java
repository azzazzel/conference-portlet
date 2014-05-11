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
 * Provides a wrapper for {@link SpeakerLocalService}.
 *
 * @author Milen Dyankov
 * @see SpeakerLocalService
 * @generated
 */
public class SpeakerLocalServiceWrapper implements SpeakerLocalService,
	ServiceWrapper<SpeakerLocalService> {
	public SpeakerLocalServiceWrapper(SpeakerLocalService speakerLocalService) {
		_speakerLocalService = speakerLocalService;
	}

	/**
	* Adds the speaker to the database. Also notifies the appropriate model listeners.
	*
	* @param speaker the speaker
	* @return the speaker that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.liferay.demo.conference.model.Speaker addSpeaker(
		org.liferay.demo.conference.model.Speaker speaker)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _speakerLocalService.addSpeaker(speaker);
	}

	/**
	* Creates a new speaker with the primary key. Does not add the speaker to the database.
	*
	* @param speakerId the primary key for the new speaker
	* @return the new speaker
	*/
	@Override
	public org.liferay.demo.conference.model.Speaker createSpeaker(
		long speakerId) {
		return _speakerLocalService.createSpeaker(speakerId);
	}

	/**
	* Deletes the speaker with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param speakerId the primary key of the speaker
	* @return the speaker that was removed
	* @throws PortalException if a speaker with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.liferay.demo.conference.model.Speaker deleteSpeaker(
		long speakerId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _speakerLocalService.deleteSpeaker(speakerId);
	}

	/**
	* Deletes the speaker from the database. Also notifies the appropriate model listeners.
	*
	* @param speaker the speaker
	* @return the speaker that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.liferay.demo.conference.model.Speaker deleteSpeaker(
		org.liferay.demo.conference.model.Speaker speaker)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _speakerLocalService.deleteSpeaker(speaker);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _speakerLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _speakerLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.liferay.demo.conference.model.impl.SpeakerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _speakerLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.liferay.demo.conference.model.impl.SpeakerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _speakerLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _speakerLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _speakerLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public org.liferay.demo.conference.model.Speaker fetchSpeaker(
		long speakerId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _speakerLocalService.fetchSpeaker(speakerId);
	}

	/**
	* Returns the speaker with the matching UUID and company.
	*
	* @param uuid the speaker's UUID
	* @param companyId the primary key of the company
	* @return the matching speaker, or <code>null</code> if a matching speaker could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.liferay.demo.conference.model.Speaker fetchSpeakerByUuidAndCompanyId(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _speakerLocalService.fetchSpeakerByUuidAndCompanyId(uuid,
			companyId);
	}

	/**
	* Returns the speaker matching the UUID and group.
	*
	* @param uuid the speaker's UUID
	* @param groupId the primary key of the group
	* @return the matching speaker, or <code>null</code> if a matching speaker could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.liferay.demo.conference.model.Speaker fetchSpeakerByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _speakerLocalService.fetchSpeakerByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Returns the speaker with the primary key.
	*
	* @param speakerId the primary key of the speaker
	* @return the speaker
	* @throws PortalException if a speaker with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.liferay.demo.conference.model.Speaker getSpeaker(long speakerId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _speakerLocalService.getSpeaker(speakerId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _speakerLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the speaker with the matching UUID and company.
	*
	* @param uuid the speaker's UUID
	* @param companyId the primary key of the company
	* @return the matching speaker
	* @throws PortalException if a matching speaker could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.liferay.demo.conference.model.Speaker getSpeakerByUuidAndCompanyId(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _speakerLocalService.getSpeakerByUuidAndCompanyId(uuid, companyId);
	}

	/**
	* Returns the speaker matching the UUID and group.
	*
	* @param uuid the speaker's UUID
	* @param groupId the primary key of the group
	* @return the matching speaker
	* @throws PortalException if a matching speaker could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.liferay.demo.conference.model.Speaker getSpeakerByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _speakerLocalService.getSpeakerByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Returns a range of all the speakers.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.liferay.demo.conference.model.impl.SpeakerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of speakers
	* @param end the upper bound of the range of speakers (not inclusive)
	* @return the range of speakers
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<org.liferay.demo.conference.model.Speaker> getSpeakers(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _speakerLocalService.getSpeakers(start, end);
	}

	/**
	* Returns the number of speakers.
	*
	* @return the number of speakers
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getSpeakersCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _speakerLocalService.getSpeakersCount();
	}

	/**
	* Updates the speaker in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param speaker the speaker
	* @return the speaker that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.liferay.demo.conference.model.Speaker updateSpeaker(
		org.liferay.demo.conference.model.Speaker speaker)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _speakerLocalService.updateSpeaker(speaker);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _speakerLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_speakerLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _speakerLocalService.invokeMethod(name, parameterTypes, arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public SpeakerLocalService getWrappedSpeakerLocalService() {
		return _speakerLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedSpeakerLocalService(
		SpeakerLocalService speakerLocalService) {
		_speakerLocalService = speakerLocalService;
	}

	@Override
	public SpeakerLocalService getWrappedService() {
		return _speakerLocalService;
	}

	@Override
	public void setWrappedService(SpeakerLocalService speakerLocalService) {
		_speakerLocalService = speakerLocalService;
	}

	private SpeakerLocalService _speakerLocalService;
}
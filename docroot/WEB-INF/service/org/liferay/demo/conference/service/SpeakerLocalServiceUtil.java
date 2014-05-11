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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for Speaker. This utility wraps
 * {@link org.liferay.demo.conference.service.impl.SpeakerLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Milen Dyankov
 * @see SpeakerLocalService
 * @see org.liferay.demo.conference.service.base.SpeakerLocalServiceBaseImpl
 * @see org.liferay.demo.conference.service.impl.SpeakerLocalServiceImpl
 * @generated
 */
public class SpeakerLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link org.liferay.demo.conference.service.impl.SpeakerLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the speaker to the database. Also notifies the appropriate model listeners.
	*
	* @param speaker the speaker
	* @return the speaker that was added
	* @throws SystemException if a system exception occurred
	*/
	public static org.liferay.demo.conference.model.Speaker addSpeaker(
		org.liferay.demo.conference.model.Speaker speaker)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addSpeaker(speaker);
	}

	/**
	* Creates a new speaker with the primary key. Does not add the speaker to the database.
	*
	* @param speakerId the primary key for the new speaker
	* @return the new speaker
	*/
	public static org.liferay.demo.conference.model.Speaker createSpeaker(
		long speakerId) {
		return getService().createSpeaker(speakerId);
	}

	/**
	* Deletes the speaker with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param speakerId the primary key of the speaker
	* @return the speaker that was removed
	* @throws PortalException if a speaker with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.liferay.demo.conference.model.Speaker deleteSpeaker(
		long speakerId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteSpeaker(speakerId);
	}

	/**
	* Deletes the speaker from the database. Also notifies the appropriate model listeners.
	*
	* @param speaker the speaker
	* @return the speaker that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static org.liferay.demo.conference.model.Speaker deleteSpeaker(
		org.liferay.demo.conference.model.Speaker speaker)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteSpeaker(speaker);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery);
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
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery, start, end);
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
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static org.liferay.demo.conference.model.Speaker fetchSpeaker(
		long speakerId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchSpeaker(speakerId);
	}

	/**
	* Returns the speaker with the matching UUID and company.
	*
	* @param uuid the speaker's UUID
	* @param companyId the primary key of the company
	* @return the matching speaker, or <code>null</code> if a matching speaker could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.liferay.demo.conference.model.Speaker fetchSpeakerByUuidAndCompanyId(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchSpeakerByUuidAndCompanyId(uuid, companyId);
	}

	/**
	* Returns the speaker matching the UUID and group.
	*
	* @param uuid the speaker's UUID
	* @param groupId the primary key of the group
	* @return the matching speaker, or <code>null</code> if a matching speaker could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.liferay.demo.conference.model.Speaker fetchSpeakerByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchSpeakerByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Returns the speaker with the primary key.
	*
	* @param speakerId the primary key of the speaker
	* @return the speaker
	* @throws PortalException if a speaker with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.liferay.demo.conference.model.Speaker getSpeaker(
		long speakerId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getSpeaker(speakerId);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
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
	public static org.liferay.demo.conference.model.Speaker getSpeakerByUuidAndCompanyId(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getSpeakerByUuidAndCompanyId(uuid, companyId);
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
	public static org.liferay.demo.conference.model.Speaker getSpeakerByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getSpeakerByUuidAndGroupId(uuid, groupId);
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
	public static java.util.List<org.liferay.demo.conference.model.Speaker> getSpeakers(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getSpeakers(start, end);
	}

	/**
	* Returns the number of speakers.
	*
	* @return the number of speakers
	* @throws SystemException if a system exception occurred
	*/
	public static int getSpeakersCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getSpeakersCount();
	}

	/**
	* Updates the speaker in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param speaker the speaker
	* @return the speaker that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static org.liferay.demo.conference.model.Speaker updateSpeaker(
		org.liferay.demo.conference.model.Speaker speaker)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateSpeaker(speaker);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public static java.lang.String getBeanIdentifier() {
		return getService().getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public static void setBeanIdentifier(java.lang.String beanIdentifier) {
		getService().setBeanIdentifier(beanIdentifier);
	}

	public static java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return getService().invokeMethod(name, parameterTypes, arguments);
	}

	public static java.util.List<org.liferay.demo.conference.model.Speaker> getSpeakers(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getSpeakers(groupId);
	}

	public static org.liferay.demo.conference.model.Speaker addSpeaker(
		java.lang.String name, java.lang.String bio, java.io.InputStream image,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().addSpeaker(name, bio, image, serviceContext);
	}

	public static org.liferay.demo.conference.model.Speaker deleteSpeaker(
		long speakerId, com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteSpeaker(speakerId, serviceContext);
	}

	public static void deleteSpeakers(long groupId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().deleteSpeakers(groupId);
	}

	public static org.liferay.demo.conference.model.Speaker updateSpeaker(
		long speakerId, java.lang.String name, java.lang.String bio,
		java.io.InputStream image,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .updateSpeaker(speakerId, name, bio, image, serviceContext);
	}

	public static void clearService() {
		_service = null;
	}

	public static SpeakerLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					SpeakerLocalService.class.getName());

			if (invokableLocalService instanceof SpeakerLocalService) {
				_service = (SpeakerLocalService)invokableLocalService;
			}
			else {
				_service = new SpeakerLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(SpeakerLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(SpeakerLocalService service) {
	}

	private static SpeakerLocalService _service;
}
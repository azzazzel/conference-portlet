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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import org.liferay.demo.conference.model.Speaker;

import java.util.List;

/**
 * The persistence utility for the speaker service. This utility wraps {@link SpeakerPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Milen Dyankov
 * @see SpeakerPersistence
 * @see SpeakerPersistenceImpl
 * @generated
 */
public class SpeakerUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(Speaker speaker) {
		getPersistence().clearCache(speaker);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Speaker> findWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Speaker> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Speaker> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static Speaker update(Speaker speaker) throws SystemException {
		return getPersistence().update(speaker);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static Speaker update(Speaker speaker, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(speaker, serviceContext);
	}

	/**
	* Returns all the speakers where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching speakers
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.liferay.demo.conference.model.Speaker> findByUuid(
		java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUuid(uuid);
	}

	/**
	* Returns a range of all the speakers where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.liferay.demo.conference.model.impl.SpeakerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of speakers
	* @param end the upper bound of the range of speakers (not inclusive)
	* @return the range of matching speakers
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.liferay.demo.conference.model.Speaker> findByUuid(
		java.lang.String uuid, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	* Returns an ordered range of all the speakers where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.liferay.demo.conference.model.impl.SpeakerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of speakers
	* @param end the upper bound of the range of speakers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching speakers
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.liferay.demo.conference.model.Speaker> findByUuid(
		java.lang.String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	* Returns the first speaker in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching speaker
	* @throws org.liferay.demo.conference.NoSuchSpeakerException if a matching speaker could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.liferay.demo.conference.model.Speaker findByUuid_First(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.liferay.demo.conference.NoSuchSpeakerException {
		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the first speaker in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching speaker, or <code>null</code> if a matching speaker could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.liferay.demo.conference.model.Speaker fetchByUuid_First(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the last speaker in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching speaker
	* @throws org.liferay.demo.conference.NoSuchSpeakerException if a matching speaker could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.liferay.demo.conference.model.Speaker findByUuid_Last(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.liferay.demo.conference.NoSuchSpeakerException {
		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the last speaker in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching speaker, or <code>null</code> if a matching speaker could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.liferay.demo.conference.model.Speaker fetchByUuid_Last(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the speakers before and after the current speaker in the ordered set where uuid = &#63;.
	*
	* @param speakerId the primary key of the current speaker
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next speaker
	* @throws org.liferay.demo.conference.NoSuchSpeakerException if a speaker with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.liferay.demo.conference.model.Speaker[] findByUuid_PrevAndNext(
		long speakerId, java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.liferay.demo.conference.NoSuchSpeakerException {
		return getPersistence()
				   .findByUuid_PrevAndNext(speakerId, uuid, orderByComparator);
	}

	/**
	* Removes all the speakers where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByUuid(java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByUuid(uuid);
	}

	/**
	* Returns the number of speakers where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching speakers
	* @throws SystemException if a system exception occurred
	*/
	public static int countByUuid(java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByUuid(uuid);
	}

	/**
	* Returns the speaker where uuid = &#63; and groupId = &#63; or throws a {@link org.liferay.demo.conference.NoSuchSpeakerException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching speaker
	* @throws org.liferay.demo.conference.NoSuchSpeakerException if a matching speaker could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.liferay.demo.conference.model.Speaker findByUUID_G(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.liferay.demo.conference.NoSuchSpeakerException {
		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	* Returns the speaker where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching speaker, or <code>null</code> if a matching speaker could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.liferay.demo.conference.model.Speaker fetchByUUID_G(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	* Returns the speaker where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching speaker, or <code>null</code> if a matching speaker could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.liferay.demo.conference.model.Speaker fetchByUUID_G(
		java.lang.String uuid, long groupId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByUUID_G(uuid, groupId, retrieveFromCache);
	}

	/**
	* Removes the speaker where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the speaker that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static org.liferay.demo.conference.model.Speaker removeByUUID_G(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.liferay.demo.conference.NoSuchSpeakerException {
		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	* Returns the number of speakers where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching speakers
	* @throws SystemException if a system exception occurred
	*/
	public static int countByUUID_G(java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	* Returns all the speakers where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching speakers
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.liferay.demo.conference.model.Speaker> findByUuid_C(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	* Returns a range of all the speakers where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.liferay.demo.conference.model.impl.SpeakerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of speakers
	* @param end the upper bound of the range of speakers (not inclusive)
	* @return the range of matching speakers
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.liferay.demo.conference.model.Speaker> findByUuid_C(
		java.lang.String uuid, long companyId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	* Returns an ordered range of all the speakers where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.liferay.demo.conference.model.impl.SpeakerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of speakers
	* @param end the upper bound of the range of speakers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching speakers
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.liferay.demo.conference.model.Speaker> findByUuid_C(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end, orderByComparator);
	}

	/**
	* Returns the first speaker in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching speaker
	* @throws org.liferay.demo.conference.NoSuchSpeakerException if a matching speaker could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.liferay.demo.conference.model.Speaker findByUuid_C_First(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.liferay.demo.conference.NoSuchSpeakerException {
		return getPersistence()
				   .findByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the first speaker in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching speaker, or <code>null</code> if a matching speaker could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.liferay.demo.conference.model.Speaker fetchByUuid_C_First(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last speaker in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching speaker
	* @throws org.liferay.demo.conference.NoSuchSpeakerException if a matching speaker could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.liferay.demo.conference.model.Speaker findByUuid_C_Last(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.liferay.demo.conference.NoSuchSpeakerException {
		return getPersistence()
				   .findByUuid_C_Last(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last speaker in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching speaker, or <code>null</code> if a matching speaker could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.liferay.demo.conference.model.Speaker fetchByUuid_C_Last(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByUuid_C_Last(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the speakers before and after the current speaker in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param speakerId the primary key of the current speaker
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next speaker
	* @throws org.liferay.demo.conference.NoSuchSpeakerException if a speaker with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.liferay.demo.conference.model.Speaker[] findByUuid_C_PrevAndNext(
		long speakerId, java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.liferay.demo.conference.NoSuchSpeakerException {
		return getPersistence()
				   .findByUuid_C_PrevAndNext(speakerId, uuid, companyId,
			orderByComparator);
	}

	/**
	* Removes all the speakers where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByUuid_C(java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	* Returns the number of speakers where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching speakers
	* @throws SystemException if a system exception occurred
	*/
	public static int countByUuid_C(java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	* Returns all the speakers where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching speakers
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.liferay.demo.conference.model.Speaker> findByGroup(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByGroup(groupId);
	}

	/**
	* Returns a range of all the speakers where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.liferay.demo.conference.model.impl.SpeakerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of speakers
	* @param end the upper bound of the range of speakers (not inclusive)
	* @return the range of matching speakers
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.liferay.demo.conference.model.Speaker> findByGroup(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByGroup(groupId, start, end);
	}

	/**
	* Returns an ordered range of all the speakers where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.liferay.demo.conference.model.impl.SpeakerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of speakers
	* @param end the upper bound of the range of speakers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching speakers
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.liferay.demo.conference.model.Speaker> findByGroup(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByGroup(groupId, start, end, orderByComparator);
	}

	/**
	* Returns the first speaker in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching speaker
	* @throws org.liferay.demo.conference.NoSuchSpeakerException if a matching speaker could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.liferay.demo.conference.model.Speaker findByGroup_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.liferay.demo.conference.NoSuchSpeakerException {
		return getPersistence().findByGroup_First(groupId, orderByComparator);
	}

	/**
	* Returns the first speaker in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching speaker, or <code>null</code> if a matching speaker could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.liferay.demo.conference.model.Speaker fetchByGroup_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByGroup_First(groupId, orderByComparator);
	}

	/**
	* Returns the last speaker in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching speaker
	* @throws org.liferay.demo.conference.NoSuchSpeakerException if a matching speaker could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.liferay.demo.conference.model.Speaker findByGroup_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.liferay.demo.conference.NoSuchSpeakerException {
		return getPersistence().findByGroup_Last(groupId, orderByComparator);
	}

	/**
	* Returns the last speaker in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching speaker, or <code>null</code> if a matching speaker could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.liferay.demo.conference.model.Speaker fetchByGroup_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByGroup_Last(groupId, orderByComparator);
	}

	/**
	* Returns the speakers before and after the current speaker in the ordered set where groupId = &#63;.
	*
	* @param speakerId the primary key of the current speaker
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next speaker
	* @throws org.liferay.demo.conference.NoSuchSpeakerException if a speaker with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.liferay.demo.conference.model.Speaker[] findByGroup_PrevAndNext(
		long speakerId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.liferay.demo.conference.NoSuchSpeakerException {
		return getPersistence()
				   .findByGroup_PrevAndNext(speakerId, groupId,
			orderByComparator);
	}

	/**
	* Removes all the speakers where groupId = &#63; from the database.
	*
	* @param groupId the group ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByGroup(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByGroup(groupId);
	}

	/**
	* Returns the number of speakers where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching speakers
	* @throws SystemException if a system exception occurred
	*/
	public static int countByGroup(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByGroup(groupId);
	}

	/**
	* Returns all the speakers where groupId = &#63; and name LIKE &#63;.
	*
	* @param groupId the group ID
	* @param name the name
	* @return the matching speakers
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.liferay.demo.conference.model.Speaker> findByGroupAndName(
		long groupId, java.lang.String name)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByGroupAndName(groupId, name);
	}

	/**
	* Returns a range of all the speakers where groupId = &#63; and name LIKE &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.liferay.demo.conference.model.impl.SpeakerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param name the name
	* @param start the lower bound of the range of speakers
	* @param end the upper bound of the range of speakers (not inclusive)
	* @return the range of matching speakers
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.liferay.demo.conference.model.Speaker> findByGroupAndName(
		long groupId, java.lang.String name, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByGroupAndName(groupId, name, start, end);
	}

	/**
	* Returns an ordered range of all the speakers where groupId = &#63; and name LIKE &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.liferay.demo.conference.model.impl.SpeakerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param name the name
	* @param start the lower bound of the range of speakers
	* @param end the upper bound of the range of speakers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching speakers
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.liferay.demo.conference.model.Speaker> findByGroupAndName(
		long groupId, java.lang.String name, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByGroupAndName(groupId, name, start, end,
			orderByComparator);
	}

	/**
	* Returns the first speaker in the ordered set where groupId = &#63; and name LIKE &#63;.
	*
	* @param groupId the group ID
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching speaker
	* @throws org.liferay.demo.conference.NoSuchSpeakerException if a matching speaker could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.liferay.demo.conference.model.Speaker findByGroupAndName_First(
		long groupId, java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.liferay.demo.conference.NoSuchSpeakerException {
		return getPersistence()
				   .findByGroupAndName_First(groupId, name, orderByComparator);
	}

	/**
	* Returns the first speaker in the ordered set where groupId = &#63; and name LIKE &#63;.
	*
	* @param groupId the group ID
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching speaker, or <code>null</code> if a matching speaker could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.liferay.demo.conference.model.Speaker fetchByGroupAndName_First(
		long groupId, java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByGroupAndName_First(groupId, name, orderByComparator);
	}

	/**
	* Returns the last speaker in the ordered set where groupId = &#63; and name LIKE &#63;.
	*
	* @param groupId the group ID
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching speaker
	* @throws org.liferay.demo.conference.NoSuchSpeakerException if a matching speaker could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.liferay.demo.conference.model.Speaker findByGroupAndName_Last(
		long groupId, java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.liferay.demo.conference.NoSuchSpeakerException {
		return getPersistence()
				   .findByGroupAndName_Last(groupId, name, orderByComparator);
	}

	/**
	* Returns the last speaker in the ordered set where groupId = &#63; and name LIKE &#63;.
	*
	* @param groupId the group ID
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching speaker, or <code>null</code> if a matching speaker could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.liferay.demo.conference.model.Speaker fetchByGroupAndName_Last(
		long groupId, java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByGroupAndName_Last(groupId, name, orderByComparator);
	}

	/**
	* Returns the speakers before and after the current speaker in the ordered set where groupId = &#63; and name LIKE &#63;.
	*
	* @param speakerId the primary key of the current speaker
	* @param groupId the group ID
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next speaker
	* @throws org.liferay.demo.conference.NoSuchSpeakerException if a speaker with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.liferay.demo.conference.model.Speaker[] findByGroupAndName_PrevAndNext(
		long speakerId, long groupId, java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.liferay.demo.conference.NoSuchSpeakerException {
		return getPersistence()
				   .findByGroupAndName_PrevAndNext(speakerId, groupId, name,
			orderByComparator);
	}

	/**
	* Removes all the speakers where groupId = &#63; and name LIKE &#63; from the database.
	*
	* @param groupId the group ID
	* @param name the name
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByGroupAndName(long groupId, java.lang.String name)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByGroupAndName(groupId, name);
	}

	/**
	* Returns the number of speakers where groupId = &#63; and name LIKE &#63;.
	*
	* @param groupId the group ID
	* @param name the name
	* @return the number of matching speakers
	* @throws SystemException if a system exception occurred
	*/
	public static int countByGroupAndName(long groupId, java.lang.String name)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByGroupAndName(groupId, name);
	}

	/**
	* Caches the speaker in the entity cache if it is enabled.
	*
	* @param speaker the speaker
	*/
	public static void cacheResult(
		org.liferay.demo.conference.model.Speaker speaker) {
		getPersistence().cacheResult(speaker);
	}

	/**
	* Caches the speakers in the entity cache if it is enabled.
	*
	* @param speakers the speakers
	*/
	public static void cacheResult(
		java.util.List<org.liferay.demo.conference.model.Speaker> speakers) {
		getPersistence().cacheResult(speakers);
	}

	/**
	* Creates a new speaker with the primary key. Does not add the speaker to the database.
	*
	* @param speakerId the primary key for the new speaker
	* @return the new speaker
	*/
	public static org.liferay.demo.conference.model.Speaker create(
		long speakerId) {
		return getPersistence().create(speakerId);
	}

	/**
	* Removes the speaker with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param speakerId the primary key of the speaker
	* @return the speaker that was removed
	* @throws org.liferay.demo.conference.NoSuchSpeakerException if a speaker with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.liferay.demo.conference.model.Speaker remove(
		long speakerId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.liferay.demo.conference.NoSuchSpeakerException {
		return getPersistence().remove(speakerId);
	}

	public static org.liferay.demo.conference.model.Speaker updateImpl(
		org.liferay.demo.conference.model.Speaker speaker)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(speaker);
	}

	/**
	* Returns the speaker with the primary key or throws a {@link org.liferay.demo.conference.NoSuchSpeakerException} if it could not be found.
	*
	* @param speakerId the primary key of the speaker
	* @return the speaker
	* @throws org.liferay.demo.conference.NoSuchSpeakerException if a speaker with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.liferay.demo.conference.model.Speaker findByPrimaryKey(
		long speakerId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.liferay.demo.conference.NoSuchSpeakerException {
		return getPersistence().findByPrimaryKey(speakerId);
	}

	/**
	* Returns the speaker with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param speakerId the primary key of the speaker
	* @return the speaker, or <code>null</code> if a speaker with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.liferay.demo.conference.model.Speaker fetchByPrimaryKey(
		long speakerId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(speakerId);
	}

	/**
	* Returns all the speakers.
	*
	* @return the speakers
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.liferay.demo.conference.model.Speaker> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
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
	public static java.util.List<org.liferay.demo.conference.model.Speaker> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the speakers.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.liferay.demo.conference.model.impl.SpeakerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of speakers
	* @param end the upper bound of the range of speakers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of speakers
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.liferay.demo.conference.model.Speaker> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the speakers from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of speakers.
	*
	* @return the number of speakers
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static SpeakerPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (SpeakerPersistence)PortletBeanLocatorUtil.locate(org.liferay.demo.conference.service.ClpSerializer.getServletContextName(),
					SpeakerPersistence.class.getName());

			ReferenceRegistry.registerReference(SpeakerUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(SpeakerPersistence persistence) {
	}

	private static SpeakerPersistence _persistence;
}
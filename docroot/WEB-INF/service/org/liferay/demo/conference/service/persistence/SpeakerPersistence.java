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

import com.liferay.portal.service.persistence.BasePersistence;

import org.liferay.demo.conference.model.Speaker;

/**
 * The persistence interface for the speaker service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Milen Dyankov
 * @see SpeakerPersistenceImpl
 * @see SpeakerUtil
 * @generated
 */
public interface SpeakerPersistence extends BasePersistence<Speaker> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link SpeakerUtil} to access the speaker persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the speakers where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching speakers
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.liferay.demo.conference.model.Speaker> findByUuid(
		java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<org.liferay.demo.conference.model.Speaker> findByUuid(
		java.lang.String uuid, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<org.liferay.demo.conference.model.Speaker> findByUuid(
		java.lang.String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first speaker in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching speaker
	* @throws org.liferay.demo.conference.NoSuchSpeakerException if a matching speaker could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.liferay.demo.conference.model.Speaker findByUuid_First(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.liferay.demo.conference.NoSuchSpeakerException;

	/**
	* Returns the first speaker in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching speaker, or <code>null</code> if a matching speaker could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.liferay.demo.conference.model.Speaker fetchByUuid_First(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last speaker in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching speaker
	* @throws org.liferay.demo.conference.NoSuchSpeakerException if a matching speaker could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.liferay.demo.conference.model.Speaker findByUuid_Last(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.liferay.demo.conference.NoSuchSpeakerException;

	/**
	* Returns the last speaker in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching speaker, or <code>null</code> if a matching speaker could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.liferay.demo.conference.model.Speaker fetchByUuid_Last(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public org.liferay.demo.conference.model.Speaker[] findByUuid_PrevAndNext(
		long speakerId, java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.liferay.demo.conference.NoSuchSpeakerException;

	/**
	* Removes all the speakers where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	* @throws SystemException if a system exception occurred
	*/
	public void removeByUuid(java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of speakers where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching speakers
	* @throws SystemException if a system exception occurred
	*/
	public int countByUuid(java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the speaker where uuid = &#63; and groupId = &#63; or throws a {@link org.liferay.demo.conference.NoSuchSpeakerException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching speaker
	* @throws org.liferay.demo.conference.NoSuchSpeakerException if a matching speaker could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.liferay.demo.conference.model.Speaker findByUUID_G(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.liferay.demo.conference.NoSuchSpeakerException;

	/**
	* Returns the speaker where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching speaker, or <code>null</code> if a matching speaker could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.liferay.demo.conference.model.Speaker fetchByUUID_G(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the speaker where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching speaker, or <code>null</code> if a matching speaker could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.liferay.demo.conference.model.Speaker fetchByUUID_G(
		java.lang.String uuid, long groupId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the speaker where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the speaker that was removed
	* @throws SystemException if a system exception occurred
	*/
	public org.liferay.demo.conference.model.Speaker removeByUUID_G(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.liferay.demo.conference.NoSuchSpeakerException;

	/**
	* Returns the number of speakers where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching speakers
	* @throws SystemException if a system exception occurred
	*/
	public int countByUUID_G(java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the speakers where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching speakers
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.liferay.demo.conference.model.Speaker> findByUuid_C(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<org.liferay.demo.conference.model.Speaker> findByUuid_C(
		java.lang.String uuid, long companyId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<org.liferay.demo.conference.model.Speaker> findByUuid_C(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public org.liferay.demo.conference.model.Speaker findByUuid_C_First(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.liferay.demo.conference.NoSuchSpeakerException;

	/**
	* Returns the first speaker in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching speaker, or <code>null</code> if a matching speaker could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.liferay.demo.conference.model.Speaker fetchByUuid_C_First(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public org.liferay.demo.conference.model.Speaker findByUuid_C_Last(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.liferay.demo.conference.NoSuchSpeakerException;

	/**
	* Returns the last speaker in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching speaker, or <code>null</code> if a matching speaker could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.liferay.demo.conference.model.Speaker fetchByUuid_C_Last(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public org.liferay.demo.conference.model.Speaker[] findByUuid_C_PrevAndNext(
		long speakerId, java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.liferay.demo.conference.NoSuchSpeakerException;

	/**
	* Removes all the speakers where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByUuid_C(java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of speakers where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching speakers
	* @throws SystemException if a system exception occurred
	*/
	public int countByUuid_C(java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the speakers where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching speakers
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.liferay.demo.conference.model.Speaker> findByGroup(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<org.liferay.demo.conference.model.Speaker> findByGroup(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<org.liferay.demo.conference.model.Speaker> findByGroup(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first speaker in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching speaker
	* @throws org.liferay.demo.conference.NoSuchSpeakerException if a matching speaker could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.liferay.demo.conference.model.Speaker findByGroup_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.liferay.demo.conference.NoSuchSpeakerException;

	/**
	* Returns the first speaker in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching speaker, or <code>null</code> if a matching speaker could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.liferay.demo.conference.model.Speaker fetchByGroup_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last speaker in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching speaker
	* @throws org.liferay.demo.conference.NoSuchSpeakerException if a matching speaker could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.liferay.demo.conference.model.Speaker findByGroup_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.liferay.demo.conference.NoSuchSpeakerException;

	/**
	* Returns the last speaker in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching speaker, or <code>null</code> if a matching speaker could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.liferay.demo.conference.model.Speaker fetchByGroup_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public org.liferay.demo.conference.model.Speaker[] findByGroup_PrevAndNext(
		long speakerId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.liferay.demo.conference.NoSuchSpeakerException;

	/**
	* Removes all the speakers where groupId = &#63; from the database.
	*
	* @param groupId the group ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByGroup(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of speakers where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching speakers
	* @throws SystemException if a system exception occurred
	*/
	public int countByGroup(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the speakers where groupId = &#63; and name LIKE &#63;.
	*
	* @param groupId the group ID
	* @param name the name
	* @return the matching speakers
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.liferay.demo.conference.model.Speaker> findByGroupAndName(
		long groupId, java.lang.String name)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<org.liferay.demo.conference.model.Speaker> findByGroupAndName(
		long groupId, java.lang.String name, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<org.liferay.demo.conference.model.Speaker> findByGroupAndName(
		long groupId, java.lang.String name, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public org.liferay.demo.conference.model.Speaker findByGroupAndName_First(
		long groupId, java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.liferay.demo.conference.NoSuchSpeakerException;

	/**
	* Returns the first speaker in the ordered set where groupId = &#63; and name LIKE &#63;.
	*
	* @param groupId the group ID
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching speaker, or <code>null</code> if a matching speaker could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.liferay.demo.conference.model.Speaker fetchByGroupAndName_First(
		long groupId, java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public org.liferay.demo.conference.model.Speaker findByGroupAndName_Last(
		long groupId, java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.liferay.demo.conference.NoSuchSpeakerException;

	/**
	* Returns the last speaker in the ordered set where groupId = &#63; and name LIKE &#63;.
	*
	* @param groupId the group ID
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching speaker, or <code>null</code> if a matching speaker could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.liferay.demo.conference.model.Speaker fetchByGroupAndName_Last(
		long groupId, java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public org.liferay.demo.conference.model.Speaker[] findByGroupAndName_PrevAndNext(
		long speakerId, long groupId, java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.liferay.demo.conference.NoSuchSpeakerException;

	/**
	* Removes all the speakers where groupId = &#63; and name LIKE &#63; from the database.
	*
	* @param groupId the group ID
	* @param name the name
	* @throws SystemException if a system exception occurred
	*/
	public void removeByGroupAndName(long groupId, java.lang.String name)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of speakers where groupId = &#63; and name LIKE &#63;.
	*
	* @param groupId the group ID
	* @param name the name
	* @return the number of matching speakers
	* @throws SystemException if a system exception occurred
	*/
	public int countByGroupAndName(long groupId, java.lang.String name)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the speaker in the entity cache if it is enabled.
	*
	* @param speaker the speaker
	*/
	public void cacheResult(org.liferay.demo.conference.model.Speaker speaker);

	/**
	* Caches the speakers in the entity cache if it is enabled.
	*
	* @param speakers the speakers
	*/
	public void cacheResult(
		java.util.List<org.liferay.demo.conference.model.Speaker> speakers);

	/**
	* Creates a new speaker with the primary key. Does not add the speaker to the database.
	*
	* @param speakerId the primary key for the new speaker
	* @return the new speaker
	*/
	public org.liferay.demo.conference.model.Speaker create(long speakerId);

	/**
	* Removes the speaker with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param speakerId the primary key of the speaker
	* @return the speaker that was removed
	* @throws org.liferay.demo.conference.NoSuchSpeakerException if a speaker with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.liferay.demo.conference.model.Speaker remove(long speakerId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.liferay.demo.conference.NoSuchSpeakerException;

	public org.liferay.demo.conference.model.Speaker updateImpl(
		org.liferay.demo.conference.model.Speaker speaker)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the speaker with the primary key or throws a {@link org.liferay.demo.conference.NoSuchSpeakerException} if it could not be found.
	*
	* @param speakerId the primary key of the speaker
	* @return the speaker
	* @throws org.liferay.demo.conference.NoSuchSpeakerException if a speaker with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.liferay.demo.conference.model.Speaker findByPrimaryKey(
		long speakerId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.liferay.demo.conference.NoSuchSpeakerException;

	/**
	* Returns the speaker with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param speakerId the primary key of the speaker
	* @return the speaker, or <code>null</code> if a speaker with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.liferay.demo.conference.model.Speaker fetchByPrimaryKey(
		long speakerId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the speakers.
	*
	* @return the speakers
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.liferay.demo.conference.model.Speaker> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<org.liferay.demo.conference.model.Speaker> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<org.liferay.demo.conference.model.Speaker> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the speakers from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of speakers.
	*
	* @return the number of speakers
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}
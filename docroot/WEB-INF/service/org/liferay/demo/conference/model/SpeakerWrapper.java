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

import com.liferay.portal.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Speaker}.
 * </p>
 *
 * @author Milen Dyankov
 * @see Speaker
 * @generated
 */
public class SpeakerWrapper implements Speaker, ModelWrapper<Speaker> {
	public SpeakerWrapper(Speaker speaker) {
		_speaker = speaker;
	}

	@Override
	public Class<?> getModelClass() {
		return Speaker.class;
	}

	@Override
	public String getModelClassName() {
		return Speaker.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("speakerId", getSpeakerId());
		attributes.put("companyId", getCompanyId());
		attributes.put("groupId", getGroupId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("status", getStatus());
		attributes.put("statusByUserId", getStatusByUserId());
		attributes.put("statusByUserName", getStatusByUserName());
		attributes.put("statusDate", getStatusDate());
		attributes.put("name", getName());
		attributes.put("bio", getBio());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long speakerId = (Long)attributes.get("speakerId");

		if (speakerId != null) {
			setSpeakerId(speakerId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		Integer status = (Integer)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}

		Long statusByUserId = (Long)attributes.get("statusByUserId");

		if (statusByUserId != null) {
			setStatusByUserId(statusByUserId);
		}

		String statusByUserName = (String)attributes.get("statusByUserName");

		if (statusByUserName != null) {
			setStatusByUserName(statusByUserName);
		}

		Date statusDate = (Date)attributes.get("statusDate");

		if (statusDate != null) {
			setStatusDate(statusDate);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String bio = (String)attributes.get("bio");

		if (bio != null) {
			setBio(bio);
		}
	}

	/**
	* Returns the primary key of this speaker.
	*
	* @return the primary key of this speaker
	*/
	@Override
	public long getPrimaryKey() {
		return _speaker.getPrimaryKey();
	}

	/**
	* Sets the primary key of this speaker.
	*
	* @param primaryKey the primary key of this speaker
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_speaker.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the uuid of this speaker.
	*
	* @return the uuid of this speaker
	*/
	@Override
	public java.lang.String getUuid() {
		return _speaker.getUuid();
	}

	/**
	* Sets the uuid of this speaker.
	*
	* @param uuid the uuid of this speaker
	*/
	@Override
	public void setUuid(java.lang.String uuid) {
		_speaker.setUuid(uuid);
	}

	/**
	* Returns the speaker ID of this speaker.
	*
	* @return the speaker ID of this speaker
	*/
	@Override
	public long getSpeakerId() {
		return _speaker.getSpeakerId();
	}

	/**
	* Sets the speaker ID of this speaker.
	*
	* @param speakerId the speaker ID of this speaker
	*/
	@Override
	public void setSpeakerId(long speakerId) {
		_speaker.setSpeakerId(speakerId);
	}

	/**
	* Returns the company ID of this speaker.
	*
	* @return the company ID of this speaker
	*/
	@Override
	public long getCompanyId() {
		return _speaker.getCompanyId();
	}

	/**
	* Sets the company ID of this speaker.
	*
	* @param companyId the company ID of this speaker
	*/
	@Override
	public void setCompanyId(long companyId) {
		_speaker.setCompanyId(companyId);
	}

	/**
	* Returns the group ID of this speaker.
	*
	* @return the group ID of this speaker
	*/
	@Override
	public long getGroupId() {
		return _speaker.getGroupId();
	}

	/**
	* Sets the group ID of this speaker.
	*
	* @param groupId the group ID of this speaker
	*/
	@Override
	public void setGroupId(long groupId) {
		_speaker.setGroupId(groupId);
	}

	/**
	* Returns the user ID of this speaker.
	*
	* @return the user ID of this speaker
	*/
	@Override
	public long getUserId() {
		return _speaker.getUserId();
	}

	/**
	* Sets the user ID of this speaker.
	*
	* @param userId the user ID of this speaker
	*/
	@Override
	public void setUserId(long userId) {
		_speaker.setUserId(userId);
	}

	/**
	* Returns the user uuid of this speaker.
	*
	* @return the user uuid of this speaker
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _speaker.getUserUuid();
	}

	/**
	* Sets the user uuid of this speaker.
	*
	* @param userUuid the user uuid of this speaker
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_speaker.setUserUuid(userUuid);
	}

	/**
	* Returns the user name of this speaker.
	*
	* @return the user name of this speaker
	*/
	@Override
	public java.lang.String getUserName() {
		return _speaker.getUserName();
	}

	/**
	* Sets the user name of this speaker.
	*
	* @param userName the user name of this speaker
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_speaker.setUserName(userName);
	}

	/**
	* Returns the create date of this speaker.
	*
	* @return the create date of this speaker
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _speaker.getCreateDate();
	}

	/**
	* Sets the create date of this speaker.
	*
	* @param createDate the create date of this speaker
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_speaker.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this speaker.
	*
	* @return the modified date of this speaker
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _speaker.getModifiedDate();
	}

	/**
	* Sets the modified date of this speaker.
	*
	* @param modifiedDate the modified date of this speaker
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_speaker.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the status of this speaker.
	*
	* @return the status of this speaker
	*/
	@Override
	public int getStatus() {
		return _speaker.getStatus();
	}

	/**
	* Sets the status of this speaker.
	*
	* @param status the status of this speaker
	*/
	@Override
	public void setStatus(int status) {
		_speaker.setStatus(status);
	}

	/**
	* Returns the status by user ID of this speaker.
	*
	* @return the status by user ID of this speaker
	*/
	@Override
	public long getStatusByUserId() {
		return _speaker.getStatusByUserId();
	}

	/**
	* Sets the status by user ID of this speaker.
	*
	* @param statusByUserId the status by user ID of this speaker
	*/
	@Override
	public void setStatusByUserId(long statusByUserId) {
		_speaker.setStatusByUserId(statusByUserId);
	}

	/**
	* Returns the status by user uuid of this speaker.
	*
	* @return the status by user uuid of this speaker
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getStatusByUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _speaker.getStatusByUserUuid();
	}

	/**
	* Sets the status by user uuid of this speaker.
	*
	* @param statusByUserUuid the status by user uuid of this speaker
	*/
	@Override
	public void setStatusByUserUuid(java.lang.String statusByUserUuid) {
		_speaker.setStatusByUserUuid(statusByUserUuid);
	}

	/**
	* Returns the status by user name of this speaker.
	*
	* @return the status by user name of this speaker
	*/
	@Override
	public java.lang.String getStatusByUserName() {
		return _speaker.getStatusByUserName();
	}

	/**
	* Sets the status by user name of this speaker.
	*
	* @param statusByUserName the status by user name of this speaker
	*/
	@Override
	public void setStatusByUserName(java.lang.String statusByUserName) {
		_speaker.setStatusByUserName(statusByUserName);
	}

	/**
	* Returns the status date of this speaker.
	*
	* @return the status date of this speaker
	*/
	@Override
	public java.util.Date getStatusDate() {
		return _speaker.getStatusDate();
	}

	/**
	* Sets the status date of this speaker.
	*
	* @param statusDate the status date of this speaker
	*/
	@Override
	public void setStatusDate(java.util.Date statusDate) {
		_speaker.setStatusDate(statusDate);
	}

	/**
	* Returns the name of this speaker.
	*
	* @return the name of this speaker
	*/
	@Override
	public java.lang.String getName() {
		return _speaker.getName();
	}

	/**
	* Sets the name of this speaker.
	*
	* @param name the name of this speaker
	*/
	@Override
	public void setName(java.lang.String name) {
		_speaker.setName(name);
	}

	/**
	* Returns the bio of this speaker.
	*
	* @return the bio of this speaker
	*/
	@Override
	public java.lang.String getBio() {
		return _speaker.getBio();
	}

	/**
	* Sets the bio of this speaker.
	*
	* @param bio the bio of this speaker
	*/
	@Override
	public void setBio(java.lang.String bio) {
		_speaker.setBio(bio);
	}

	/**
	* Returns the trash entry created when this speaker was moved to the Recycle Bin. The trash entry may belong to one of the ancestors of this speaker.
	*
	* @return the trash entry created when this speaker was moved to the Recycle Bin
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.portlet.trash.model.TrashEntry getTrashEntry()
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _speaker.getTrashEntry();
	}

	/**
	* Returns the class primary key of the trash entry for this speaker.
	*
	* @return the class primary key of the trash entry for this speaker
	*/
	@Override
	public long getTrashEntryClassPK() {
		return _speaker.getTrashEntryClassPK();
	}

	/**
	* Returns the trash handler for this speaker.
	*
	* @return the trash handler for this speaker
	*/
	@Override
	public com.liferay.portal.kernel.trash.TrashHandler getTrashHandler() {
		return _speaker.getTrashHandler();
	}

	/**
	* Returns <code>true</code> if this speaker is in the Recycle Bin.
	*
	* @return <code>true</code> if this speaker is in the Recycle Bin; <code>false</code> otherwise
	*/
	@Override
	public boolean isInTrash() {
		return _speaker.isInTrash();
	}

	/**
	* Returns <code>true</code> if the parent of this speaker is in the Recycle Bin.
	*
	* @return <code>true</code> if the parent of this speaker is in the Recycle Bin; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public boolean isInTrashContainer() {
		return _speaker.isInTrashContainer();
	}

	/**
	* @deprecated As of 6.1.0, replaced by {@link #isApproved()}
	*/
	@Override
	public boolean getApproved() {
		return _speaker.getApproved();
	}

	/**
	* Returns <code>true</code> if this speaker is approved.
	*
	* @return <code>true</code> if this speaker is approved; <code>false</code> otherwise
	*/
	@Override
	public boolean isApproved() {
		return _speaker.isApproved();
	}

	/**
	* Returns <code>true</code> if this speaker is denied.
	*
	* @return <code>true</code> if this speaker is denied; <code>false</code> otherwise
	*/
	@Override
	public boolean isDenied() {
		return _speaker.isDenied();
	}

	/**
	* Returns <code>true</code> if this speaker is a draft.
	*
	* @return <code>true</code> if this speaker is a draft; <code>false</code> otherwise
	*/
	@Override
	public boolean isDraft() {
		return _speaker.isDraft();
	}

	/**
	* Returns <code>true</code> if this speaker is expired.
	*
	* @return <code>true</code> if this speaker is expired; <code>false</code> otherwise
	*/
	@Override
	public boolean isExpired() {
		return _speaker.isExpired();
	}

	/**
	* Returns <code>true</code> if this speaker is inactive.
	*
	* @return <code>true</code> if this speaker is inactive; <code>false</code> otherwise
	*/
	@Override
	public boolean isInactive() {
		return _speaker.isInactive();
	}

	/**
	* Returns <code>true</code> if this speaker is incomplete.
	*
	* @return <code>true</code> if this speaker is incomplete; <code>false</code> otherwise
	*/
	@Override
	public boolean isIncomplete() {
		return _speaker.isIncomplete();
	}

	/**
	* Returns <code>true</code> if this speaker is pending.
	*
	* @return <code>true</code> if this speaker is pending; <code>false</code> otherwise
	*/
	@Override
	public boolean isPending() {
		return _speaker.isPending();
	}

	/**
	* Returns <code>true</code> if this speaker is scheduled.
	*
	* @return <code>true</code> if this speaker is scheduled; <code>false</code> otherwise
	*/
	@Override
	public boolean isScheduled() {
		return _speaker.isScheduled();
	}

	@Override
	public boolean isNew() {
		return _speaker.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_speaker.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _speaker.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_speaker.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _speaker.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _speaker.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_speaker.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _speaker.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_speaker.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_speaker.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_speaker.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new SpeakerWrapper((Speaker)_speaker.clone());
	}

	@Override
	public int compareTo(org.liferay.demo.conference.model.Speaker speaker) {
		return _speaker.compareTo(speaker);
	}

	@Override
	public int hashCode() {
		return _speaker.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<org.liferay.demo.conference.model.Speaker> toCacheModel() {
		return _speaker.toCacheModel();
	}

	@Override
	public org.liferay.demo.conference.model.Speaker toEscapedModel() {
		return new SpeakerWrapper(_speaker.toEscapedModel());
	}

	@Override
	public org.liferay.demo.conference.model.Speaker toUnescapedModel() {
		return new SpeakerWrapper(_speaker.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _speaker.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _speaker.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_speaker.persist();
	}

	@Override
	public com.liferay.portal.kernel.repository.model.FileEntry getCustomImage()
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _speaker.getCustomImage();
	}

	@Override
	public java.lang.String getImageURL(
		com.liferay.portal.theme.ThemeDisplay themeDisplay)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _speaker.getImageURL(themeDisplay);
	}

	@Override
	public boolean hasCustomImage()
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _speaker.hasCustomImage();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof SpeakerWrapper)) {
			return false;
		}

		SpeakerWrapper speakerWrapper = (SpeakerWrapper)obj;

		if (Validator.equals(_speaker, speakerWrapper._speaker)) {
			return true;
		}

		return false;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return _speaker.getStagedModelType();
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Speaker getWrappedSpeaker() {
		return _speaker;
	}

	@Override
	public Speaker getWrappedModel() {
		return _speaker;
	}

	@Override
	public void resetOriginalValues() {
		_speaker.resetOriginalValues();
	}

	private Speaker _speaker;
}
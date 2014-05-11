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

package org.liferay.demo.conference.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import org.liferay.demo.conference.model.Speaker;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Speaker in entity cache.
 *
 * @author Milen Dyankov
 * @see Speaker
 * @generated
 */
public class SpeakerCacheModel implements CacheModel<Speaker>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(29);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", speakerId=");
		sb.append(speakerId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", status=");
		sb.append(status);
		sb.append(", statusByUserId=");
		sb.append(statusByUserId);
		sb.append(", statusByUserName=");
		sb.append(statusByUserName);
		sb.append(", statusDate=");
		sb.append(statusDate);
		sb.append(", name=");
		sb.append(name);
		sb.append(", bio=");
		sb.append(bio);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Speaker toEntityModel() {
		SpeakerImpl speakerImpl = new SpeakerImpl();

		if (uuid == null) {
			speakerImpl.setUuid(StringPool.BLANK);
		}
		else {
			speakerImpl.setUuid(uuid);
		}

		speakerImpl.setSpeakerId(speakerId);
		speakerImpl.setCompanyId(companyId);
		speakerImpl.setGroupId(groupId);
		speakerImpl.setUserId(userId);

		if (userName == null) {
			speakerImpl.setUserName(StringPool.BLANK);
		}
		else {
			speakerImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			speakerImpl.setCreateDate(null);
		}
		else {
			speakerImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			speakerImpl.setModifiedDate(null);
		}
		else {
			speakerImpl.setModifiedDate(new Date(modifiedDate));
		}

		speakerImpl.setStatus(status);
		speakerImpl.setStatusByUserId(statusByUserId);

		if (statusByUserName == null) {
			speakerImpl.setStatusByUserName(StringPool.BLANK);
		}
		else {
			speakerImpl.setStatusByUserName(statusByUserName);
		}

		if (statusDate == Long.MIN_VALUE) {
			speakerImpl.setStatusDate(null);
		}
		else {
			speakerImpl.setStatusDate(new Date(statusDate));
		}

		if (name == null) {
			speakerImpl.setName(StringPool.BLANK);
		}
		else {
			speakerImpl.setName(name);
		}

		if (bio == null) {
			speakerImpl.setBio(StringPool.BLANK);
		}
		else {
			speakerImpl.setBio(bio);
		}

		speakerImpl.resetOriginalValues();

		return speakerImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();
		speakerId = objectInput.readLong();
		companyId = objectInput.readLong();
		groupId = objectInput.readLong();
		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		status = objectInput.readInt();
		statusByUserId = objectInput.readLong();
		statusByUserName = objectInput.readUTF();
		statusDate = objectInput.readLong();
		name = objectInput.readUTF();
		bio = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(speakerId);
		objectOutput.writeLong(companyId);
		objectOutput.writeLong(groupId);
		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);
		objectOutput.writeInt(status);
		objectOutput.writeLong(statusByUserId);

		if (statusByUserName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(statusByUserName);
		}

		objectOutput.writeLong(statusDate);

		if (name == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(name);
		}

		if (bio == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(bio);
		}
	}

	public String uuid;
	public long speakerId;
	public long companyId;
	public long groupId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public int status;
	public long statusByUserId;
	public String statusByUserName;
	public long statusDate;
	public String name;
	public String bio;
}
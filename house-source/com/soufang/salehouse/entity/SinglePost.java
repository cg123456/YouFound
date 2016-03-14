package com.soufang.salehouse.entity;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/** 
* @author  作者 E-mail: fmuhai@foxmail.com
* @date 创建时间：2016年3月15日 上午12:07:37 
* @version 1.0 
*/
@XStreamAlias("singlepost")
public class SinglePost {

	private String announceid;
	private String tid;
	private String bid;
	private String masterId;
	private String userName;
	private String userId;
	private String UserImage;
	private String supportcnt;
	private String topic;
	private String fuCount;
	private String hits;
	
	private String bbsmurl;
	private String posturl;
	
	public SinglePost() {}

	public String getAnnounceid() {
		return announceid;
	}

	public void setAnnounceid(String announceid) {
		this.announceid = announceid;
	}

	public String getTid() {
		return tid;
	}

	public void setTid(String tid) {
		this.tid = tid;
	}

	public String getBid() {
		return bid;
	}

	public void setBid(String bid) {
		this.bid = bid;
	}

	public String getMasterId() {
		return masterId;
	}

	public void setMasterId(String masterId) {
		this.masterId = masterId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserImage() {
		return UserImage;
	}

	public void setUserImage(String userImage) {
		UserImage = userImage;
	}

	public String getSupportcnt() {
		return supportcnt;
	}

	public void setSupportcnt(String supportcnt) {
		this.supportcnt = supportcnt;
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public String getFuCount() {
		return fuCount;
	}

	public void setFuCount(String fuCount) {
		this.fuCount = fuCount;
	}

	public String getHits() {
		return hits;
	}

	public void setHits(String hits) {
		this.hits = hits;
	}

	public String getBbsmurl() {
		return bbsmurl;
	}

	public void setBbsmurl(String bbsmurl) {
		this.bbsmurl = bbsmurl;
	}

	public String getPosturl() {
		return posturl;
	}

	public void setPosturl(String posturl) {
		this.posturl = posturl;
	}

	@Override
	public String toString() {
		return "SinglePost [announceid=" + announceid + ", tid=" + tid + ", bid=" + bid + ", masterId=" + masterId
				+ ", userName=" + userName + ", userId=" + userId + ", UserImage=" + UserImage + ", supportcnt="
				+ supportcnt + ", topic=" + topic + ", fuCount=" + fuCount + ", hits=" + hits + ", bbsmurl=" + bbsmurl
				+ ", posturl=" + posturl + "]";
	}
	
	
}

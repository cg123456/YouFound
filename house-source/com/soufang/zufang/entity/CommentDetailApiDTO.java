package com.soufang.zufang.entity;

import javax.persistence.Entity;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/** 
* @author  作者 E-mail: fmuhai@foxmail.com
* @date 创建时间：2016年3月13日 下午5:07:25 
* @version 1.0 
*/
@Entity
@XStreamAlias("CommentDetailApiDTO")
public class CommentDetailApiDTO {
	
	private String result;
	private String message;
	private String HouseId;
	private String UserId;
	private String AgentID;
	private String UserName;
	private String CustomerMobile;
	private String Title;
	private String Description;
	private String StarNum;
	private String Tags;
	
	private String PhotoUrls;
	private String InsertTimeStr;
	private String CommentType;
	private String AgentName;
	private String ManagerName;
	private String MobileCode;
	private String AgentPhotoUrl;


	public CommentDetailApiDTO(String result, String message, String houseId, String userId, String agentID,
			String userName, String customerMobile, String title, String description, String starNum, String tags,
			String photoUrls, String insertTimeStr, String commentType, String agentName, String managerName,
			String mobileCode, String agentPhotoUrl) {
		super();
		this.result = result;
		this.message = message;
		HouseId = houseId;
		UserId = userId;
		AgentID = agentID;
		UserName = userName;
		CustomerMobile = customerMobile;
		Title = title;
		Description = description;
		StarNum = starNum;
		Tags = tags;
		PhotoUrls = photoUrls;
		InsertTimeStr = insertTimeStr;
		CommentType = commentType;
		AgentName = agentName;
		ManagerName = managerName;
		MobileCode = mobileCode;
		AgentPhotoUrl = agentPhotoUrl;
	}

	
	public String getResult() {
		return result;
	}


	public void setResult(String result) {
		this.result = result;
	}


	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}


	public String getHouseId() {
		return HouseId;
	}


	public void setHouseId(String houseId) {
		HouseId = houseId;
	}


	public String getUserId() {
		return UserId;
	}


	public void setUserId(String userId) {
		UserId = userId;
	}


	public String getAgentID() {
		return AgentID;
	}


	public void setAgentID(String agentID) {
		AgentID = agentID;
	}


	public String getUserName() {
		return UserName;
	}


	public void setUserName(String userName) {
		UserName = userName;
	}


	public String getCustomerMobile() {
		return CustomerMobile;
	}


	public void setCustomerMobile(String customerMobile) {
		CustomerMobile = customerMobile;
	}


	public String getTitle() {
		return Title;
	}


	public void setTitle(String title) {
		Title = title;
	}


	public String getDescription() {
		return Description;
	}


	public void setDescription(String description) {
		Description = description;
	}


	public String getStarNum() {
		return StarNum;
	}


	public void setStarNum(String starNum) {
		StarNum = starNum;
	}


	public String getTags() {
		return Tags;
	}


	public void setTags(String tags) {
		Tags = tags;
	}


	public String getPhotoUrls() {
		return PhotoUrls;
	}


	public void setPhotoUrls(String photoUrls) {
		PhotoUrls = photoUrls;
	}


	public String getInsertTimeStr() {
		return InsertTimeStr;
	}


	public void setInsertTimeStr(String insertTimeStr) {
		InsertTimeStr = insertTimeStr;
	}


	public String getCommentType() {
		return CommentType;
	}


	public void setCommentType(String commentType) {
		CommentType = commentType;
	}


	public String getAgentName() {
		return AgentName;
	}


	public void setAgentName(String agentName) {
		AgentName = agentName;
	}


	public String getManagerName() {
		return ManagerName;
	}


	public void setManagerName(String managerName) {
		ManagerName = managerName;
	}


	public String getMobileCode() {
		return MobileCode;
	}


	public void setMobileCode(String mobileCode) {
		MobileCode = mobileCode;
	}


	public String getAgentPhotoUrl() {
		return AgentPhotoUrl;
	}


	public void setAgentPhotoUrl(String agentPhotoUrl) {
		AgentPhotoUrl = agentPhotoUrl;
	}


	@Override
	public String toString() {
		return "CommentDetailApiDTO [result=" + result + ", message=" + message + ", HouseId=" + HouseId + ", UserId="
				+ UserId + ", AgentID=" + AgentID + ", UserName=" + UserName + ", CustomerMobile=" + CustomerMobile
				+ ", Title=" + Title + ", Description=" + Description + ", StarNum=" + StarNum + ", Tags=" + Tags
				+ ", PhotoUrls=" + PhotoUrls + ", InsertTimeStr=" + InsertTimeStr + ", CommentType=" + CommentType
				+ ", AgentName=" + AgentName + ", ManagerName=" + ManagerName + ", MobileCode=" + MobileCode
				+ ", AgentPhotoUrl=" + AgentPhotoUrl + "]";
	}



	

	

}

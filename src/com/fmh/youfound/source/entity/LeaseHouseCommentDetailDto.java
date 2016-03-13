package com.fmh.youfound.source.entity;

import javax.persistence.Entity;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/** 
* @author  作者 E-mail: fmuhai@foxmail.com
* @date 创建时间：2016年3月13日 下午4:41:32 
* @version 1.0 
*/
@Entity
@XStreamAlias("LeaseHouseCommentDetailDto")
public class LeaseHouseCommentDetailDto {

	private String UserID;
	private String Description;
	private String UpdateTime;
	private String AgentID;
	private String agentname;
	private String managername;
	private String mobilecode;
	private String agentphotourl;
	
	public LeaseHouseCommentDetailDto() {
		
	}

	public LeaseHouseCommentDetailDto(String userID, String description, String updateTime, String agentID,
			String agentname, String managername, String mobilecode, String agentphotourl) {
		super();
		UserID = userID;
		Description = description;
		UpdateTime = updateTime;
		AgentID = agentID;
		this.agentname = agentname;
		this.managername = managername;
		this.mobilecode = mobilecode;
		this.agentphotourl = agentphotourl;
	}

	public String getUserID() {
		return UserID;
	}

	public void setUserID(String userID) {
		UserID = userID;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public String getUpdateTime() {
		return UpdateTime;
	}

	public void setUpdateTime(String updateTime) {
		UpdateTime = updateTime;
	}

	public String getAgentID() {
		return AgentID;
	}

	public void setAgentID(String agentID) {
		AgentID = agentID;
	}

	public String getAgentname() {
		return agentname;
	}

	public void setAgentname(String agentname) {
		this.agentname = agentname;
	}

	public String getManagername() {
		return managername;
	}

	public void setManagername(String managername) {
		this.managername = managername;
	}

	public String getMobilecode() {
		return mobilecode;
	}

	public void setMobilecode(String mobilecode) {
		this.mobilecode = mobilecode;
	}

	public String getAgentphotourl() {
		return agentphotourl;
	}

	public void setAgentphotourl(String agentphotourl) {
		this.agentphotourl = agentphotourl;
	}

	@Override
	public String toString() {
		return "LeaseHouseCommentDetailDTO [UserID=" + UserID + ", Description=" + Description + ", UpdateTime="
				+ UpdateTime + ", AgentID=" + AgentID + ", agentname=" + agentname + ", managername=" + managername
				+ ", mobilecode=" + mobilecode + ", agentphotourl=" + agentphotourl + "]";
	}
	
	
}

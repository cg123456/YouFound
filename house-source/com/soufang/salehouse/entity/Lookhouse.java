package com.soufang.salehouse.entity;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/** 
* @author  作者 E-mail: fmuhai@foxmail.com
* @date 创建时间：2016年3月15日 上午2:09:40 
* @version 1.0 
*/
@XStreamAlias("lookhouse")
public class Lookhouse {

	private String LookHouseID;
	private String LookHouseName;
	private String LineID;
	private String LineName;
	private String ActivitieDate;
	private String BeginTime;
	private String EndTime;
	private String SignUpCount;
	
	public Lookhouse() {}

	public String getLookHouseID() {
		return LookHouseID;
	}

	public void setLookHouseID(String lookHouseID) {
		LookHouseID = lookHouseID;
	}

	public String getLookHouseName() {
		return LookHouseName;
	}

	public void setLookHouseName(String lookHouseName) {
		LookHouseName = lookHouseName;
	}

	public String getLineID() {
		return LineID;
	}

	public void setLineID(String lineID) {
		LineID = lineID;
	}

	public String getLineName() {
		return LineName;
	}

	public void setLineName(String lineName) {
		LineName = lineName;
	}

	public String getActivitieDate() {
		return ActivitieDate;
	}

	public void setActivitieDate(String activitieDate) {
		ActivitieDate = activitieDate;
	}

	public String getBeginTime() {
		return BeginTime;
	}

	public void setBeginTime(String beginTime) {
		BeginTime = beginTime;
	}

	public String getEndTime() {
		return EndTime;
	}

	public void setEndTime(String endTime) {
		EndTime = endTime;
	}

	public String getSignUpCount() {
		return SignUpCount;
	}

	public void setSignUpCount(String signUpCount) {
		SignUpCount = signUpCount;
	}

	@Override
	public String toString() {
		return "Lookhouse [LookHouseID=" + LookHouseID + ", LookHouseName=" + LookHouseName + ", LineID=" + LineID
				+ ", LineName=" + LineName + ", ActivitieDate=" + ActivitieDate + ", BeginTime=" + BeginTime
				+ ", EndTime=" + EndTime + ", SignUpCount=" + SignUpCount + "]";
	}
	
}

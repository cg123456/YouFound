package com.fmh.youfound.entity;

import javax.persistence.Entity;

import com.soufang.leasehouse.entity.AgentIDList;
import com.soufang.leasehouse.entity.CommentList;
import com.soufang.leasehouse.entity.CommentListNew;

/** 
* @author  作者 E-mail: fmuhai@foxmail.com
* @date 创建时间：2016年3月13日 上午2:23:05 
* @version 1.0 
*/
@Entity
public class YFLeaseHouse {

	private String id;
	private String sourceId;
	
	private String titleImage;		//标题图片路径
	private String houseTitle;		//显示标题
	private String houseStatus;		//房屋状态
	private String insertTime;		//发布时间
	private String updateTime;		//更新时间

	private String price;			//租金
	private String priceType;		//租金类型
	private String payDetail;		//房租支付细节，如：押一付二
	private String leaseType;		//出租类型，整租，月租，合租，短租等
	
	private String purpose;			//用途：住宅，别墅，写字楼，商铺等
	private Address address;		//地址：哪个城市，哪个区，路，具体地址，以及经度和纬度
	
	private String projectCode;		//工程代号
	private String projectName;
	
	private HouseType hourseType;	//三房一厅两卫一厨等
	
	//location
	private String floor;			//楼层
	private String totalFloor;		//总楼层
	private String floorPosition;	//低层/13
	private String faceTo;			//朝向
	
	
	private String buildArea;		//房屋面积
	private String fitment;			//装修类型：豪华装修，精装修，中等装修，简装修，毛坯房
	private String equipment;		//配套设施：床，宽带，电视，冰箱，洗衣机，空调，热水器，暖气
	
	//图片
	private String photoCount;		//图片数量
	private String phtotUrl;
	private String shinImgs;		//不知道是什么图片
	private String xqImgs;			//以"|"分隔
	private String hxImgs;
	private String qjImgs;
	
	private String phone400;		//4008903341转196082
	private String ownerName;		//户主姓名
	private String ownerPhone400;
	private AgentIDList agentIDList;
	
	private String isFiredHouse;	//是否解除租赁？
	private String linkurl;
	
	private String aroundService;	//周边服务设施
	private String traffic_other;	//其他交通（公交）
	private String subline;			//地铁线
	private String subwayStation;	//地铁站
	private String subwayDistance;	//距离
	
	private CommentList commentList;
	private CommentListNew commentListNew;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getSourceId() {
		return sourceId;
	}
	public void setSourceId(String sourceId) {
		this.sourceId = sourceId;
	}
	public String getTitleImage() {
		return titleImage;
	}
	public void setTitleImage(String titleImage) {
		this.titleImage = titleImage;
	}
	public String getHouseTitle() {
		return houseTitle;
	}
	public void setHouseTitle(String houseTitle) {
		this.houseTitle = houseTitle;
	}
	public String getHouseStatus() {
		return houseStatus;
	}
	public void setHouseStatus(String houseStatus) {
		this.houseStatus = houseStatus;
	}
	public String getInsertTime() {
		return insertTime;
	}
	public void setInsertTime(String insertTime) {
		this.insertTime = insertTime;
	}
	public String getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getPriceType() {
		return priceType;
	}
	public void setPriceType(String priceType) {
		this.priceType = priceType;
	}
	public String getPayDetail() {
		return payDetail;
	}
	public void setPayDetail(String payDetail) {
		this.payDetail = payDetail;
	}
	public String getLeaseType() {
		return leaseType;
	}
	public void setLeaseType(String leaseType) {
		this.leaseType = leaseType;
	}
	public String getPurpose() {
		return purpose;
	}
	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getProjectCode() {
		return projectCode;
	}
	public void setProjectCode(String projectCode) {
		this.projectCode = projectCode;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public HouseType getHourseType() {
		return hourseType;
	}
	public void setHourseType(HouseType hourseType) {
		this.hourseType = hourseType;
	}
	public String getFloor() {
		return floor;
	}
	public void setFloor(String floor) {
		this.floor = floor;
	}
	public String getTotalFloor() {
		return totalFloor;
	}
	public void setTotalFloor(String totalFloor) {
		this.totalFloor = totalFloor;
	}
	public String getFloorPosition() {
		return floorPosition;
	}
	public void setFloorPosition(String floorPosition) {
		this.floorPosition = floorPosition;
	}
	public String getFaceTo() {
		return faceTo;
	}
	public void setFaceTo(String faceTo) {
		this.faceTo = faceTo;
	}
	public String getBuildArea() {
		return buildArea;
	}
	public void setBuildArea(String buildArea) {
		this.buildArea = buildArea;
	}
	public String getFitment() {
		return fitment;
	}
	public void setFitment(String fitment) {
		this.fitment = fitment;
	}
	public String getEquipment() {
		return equipment;
	}
	public void setEquipment(String equipment) {
		this.equipment = equipment;
	}
	public String getPhotoCount() {
		return photoCount;
	}
	public void setPhotoCount(String photoCount) {
		this.photoCount = photoCount;
	}
	public String getPhtotUrl() {
		return phtotUrl;
	}
	public void setPhtotUrl(String phtotUrl) {
		this.phtotUrl = phtotUrl;
	}
	public String getShinImgs() {
		return shinImgs;
	}
	public void setShinImgs(String shinImgs) {
		this.shinImgs = shinImgs;
	}
	public String getXqImgs() {
		return xqImgs;
	}
	public void setXqImgs(String xqImgs) {
		this.xqImgs = xqImgs;
	}
	public String getHxImgs() {
		return hxImgs;
	}
	public void setHxImgs(String hxImgs) {
		this.hxImgs = hxImgs;
	}
	public String getQjImgs() {
		return qjImgs;
	}
	public void setQjImgs(String qjImgs) {
		this.qjImgs = qjImgs;
	}
	public String getPhone400() {
		return phone400;
	}
	public void setPhone400(String phone400) {
		this.phone400 = phone400;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public String getOwnerPhone400() {
		return ownerPhone400;
	}
	public void setOwnerPhone400(String ownerPhone400) {
		this.ownerPhone400 = ownerPhone400;
	}
	public AgentIDList getAgentIDList() {
		return agentIDList;
	}
	public void setAgentIDList(AgentIDList agentIDList) {
		this.agentIDList = agentIDList;
	}
	public String getIsFiredHouse() {
		return isFiredHouse;
	}
	public void setIsFiredHouse(String isFiredHouse) {
		this.isFiredHouse = isFiredHouse;
	}
	public String getLinkurl() {
		return linkurl;
	}
	public void setLinkurl(String linkurl) {
		this.linkurl = linkurl;
	}
	public String getAroundService() {
		return aroundService;
	}
	public void setAroundService(String aroundService) {
		this.aroundService = aroundService;
	}
	public String getTraffic_other() {
		return traffic_other;
	}
	public void setTraffic_other(String traffic_other) {
		this.traffic_other = traffic_other;
	}
	public String getSubline() {
		return subline;
	}
	public void setSubline(String subline) {
		this.subline = subline;
	}
	public String getSubwayStation() {
		return subwayStation;
	}
	public void setSubwayStation(String subwayStation) {
		this.subwayStation = subwayStation;
	}
	public String getSubwayDistance() {
		return subwayDistance;
	}
	public void setSubwayDistance(String subwayDistance) {
		this.subwayDistance = subwayDistance;
	}
	public CommentList getCommentList() {
		return commentList;
	}
	public void setCommentList(CommentList commentList) {
		this.commentList = commentList;
	}
	public CommentListNew getCommentListNew() {
		return commentListNew;
	}
	public void setCommentListNew(CommentListNew commentListNew) {
		this.commentListNew = commentListNew;
	}
	
	
}

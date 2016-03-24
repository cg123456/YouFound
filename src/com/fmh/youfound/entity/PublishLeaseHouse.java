package com.fmh.youfound.entity;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;

/** 
 * @author fengmuhai
 * @date 2016-3-24 下午5:23:09 
 * @version 1.0  
 */
@Entity
public class PublishLeaseHouse {

	@Id
	private UUID id;
		
	private String purpose;			//用途：住宅，别墅，写字楼，商铺等
	private String leaseType;		//出租类型，整租，月租，合租，短租等
	private String housingEstate;	//小区
	private Address address;		//房屋所在城市信息不需要再添加房源时写入，因为当用户登入的时候已经默认选择了城市
									//哪个城市，哪个区/商圈,哪个小区
	
	private HouseType houseType;	//户型
	private String buildArea;		//建筑面积
	private String fitment;			//装修类型：豪华装修，精装修，中等装修，简装修，毛坯房
	
	//location
	private String floor;			//楼层
	private String totalFloor;		//总楼层
	private String floorPosition;	//低层/13
	private String faceTo;			//朝向

	private String buildingNo;		// 幢/号/层|单元|室  (楼栋号不对外显示[只能填写数字])
	private String price;			//租金
	private String priceType;		//租金类型:元/月
	private String payDetail;		//房租支付细节，如：押一付二
	private String equipment;		//配套设施：床，宽带，电视，冰箱，洗衣机，空调，热水器，暖气
	
	private String houseTitle;		//显示标题(房源标题)
	private String description;		//房源描述
	private String publishImages;	//上传图片的路径，以|做分隔符
	private String checkInDate;		//入住时间
	
	private String contactPerson;	//联系人
	private String contactNumber;	//联系电话
	public UUID getId() {
		return id;
	}
	public void setId(UUID id) {
		this.id = id;
	}
	public String getPurpose() {
		return purpose;
	}
	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}
	public String getLeaseType() {
		return leaseType;
	}
	public void setLeaseType(String leaseType) {
		this.leaseType = leaseType;
	}
	public String getHousingEstate() {
		return housingEstate;
	}
	public void setHousingEstate(String housingEstate) {
		this.housingEstate = housingEstate;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public HouseType getHouseType() {
		return houseType;
	}
	public void setHouseType(HouseType houseType) {
		this.houseType = houseType;
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
	public String getBuildingNo() {
		return buildingNo;
	}
	public void setBuildingNo(String buildingNo) {
		this.buildingNo = buildingNo;
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
	public String getEquipment() {
		return equipment;
	}
	public void setEquipment(String equipment) {
		this.equipment = equipment;
	}
	public String getHouseTitle() {
		return houseTitle;
	}
	public void setHouseTitle(String houseTitle) {
		this.houseTitle = houseTitle;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getPublishImages() {
		return publishImages;
	}
	public void setPublishImages(String publishImages) {
		this.publishImages = publishImages;
	}
	public String getCheckInDate() {
		return checkInDate;
	}
	public void setCheckInDate(String checkInDate) {
		this.checkInDate = checkInDate;
	}
	public String getContactPerson() {
		return contactPerson;
	}
	public void setContactPerson(String contactPerson) {
		this.contactPerson = contactPerson;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	
	
	
}

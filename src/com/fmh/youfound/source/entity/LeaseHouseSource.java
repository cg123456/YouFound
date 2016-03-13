package com.fmh.youfound.source.entity;

import java.io.Serializable;

import javax.persistence.Entity;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/** 
* @author  作者 E-mail: fmuhai@foxmail.com
* @date 创建时间：2016年3月13日 上午2:23:05 
* @version 1.0 
*/
@Entity
@XStreamAlias("LeaseHouseDetailDTO")
public class LeaseHouseSource implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String result;				//返回代号
	private String message;				//返回信息
	private String HouseID;				//
	private String ShikanTitle;			//祈福新村月明轩 18号楼
	private String HouseStatus;			//
	private String InsertTime;			//2016-03-11T08:57:59.023
	private String UpdateTime;			//2016-03-11T08:57:59.023
	private String Price;
	private String PriceType;			//元/月
	private String PayDetail;
	
	private String LeaseStyle;			//整租
	private String Purpose;				//住宅
	private String District;			//番禺
	private String ComArea;				//<ComArea>祈福</ComArea>  
	private String ProjCode;			//<ProjCode>2811070493</ProjCode>
	private String ProjName;			//<ProjName>祈福新村月明轩</ProjNameProjName>  
	private String CreateTime;			
	private String Address;				//<Address>市广路与金山大道交汇处</Address>  
	private String Room;
	private String Hall;
	private String Floor;

	private String TotalFloor;
	private String FloorPosition;		//<FloorPosition>高层/6</FloorPosition>
	private String Forward;				//朝向
	private String BuildArea;
	private String Fitment;				//<Fitment>精装</Fitment> 
	private String Equipment;			//设施
	private String PhotoCount;			//图片数量？
	private String PhotoUrl;
	private String ShinImgs;
	private String XqImgs;
	private String HxImgs;

	private String QjImgs;
	private String Phone400;
	private String CrownUserID;
	private String BoardContent;
	private String HouseType;
	private String CommissionWireLess;
	private String OwnerDescription;
	private String OwnerName;
	private String IsOpenDisctrict;
	private String OwnerPhone400;
	
	
	private String DelegationType;		//委托类型(中介)
	private String DelegationTypeInt;
	
	//@XStreamAlias("AgentIDList")
	//@XStreamImplicit(itemFieldName="AgentIDList")	//加上这个注解表示指明List下的标签是“AgentID”，否则会报错
	//private List<String> AgentIDList;
	private AgentIDList AgentIDList;
	
	private String IsFiredHouse;
	private String linkurl;
	
	//@XStreamImplicit(itemFieldName="LeaseHouseCommentDetailDto")
	//private List<LeaseHouseCommentDetailDto> CommentList;
	private CommentList CommentList;
	
	private String coordx;				//经度？
	private String coordy;				//纬度
	private String aroundService;
	private String traffic_other;
	
	private String SubwayLine;
	private String SubwayStation;
	private String SubwayDistance;
	
	//@XStreamImplicit(itemFieldName="CommentListNew")
	//private List<CommentDetailApiDTO> CommentListNew;
	private CommentListNew CommentListNew;
	
	private String CommentNum;
	
	public LeaseHouseSource() {
		
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

	public String getHouseID() {
		return HouseID;
	}

	public void setHouseID(String houseID) {
		HouseID = houseID;
	}

	public String getShikanTitle() {
		return ShikanTitle;
	}

	public void setShikanTitle(String shikanTitle) {
		ShikanTitle = shikanTitle;
	}

	public String getHouseStatus() {
		return HouseStatus;
	}

	public void setHouseStatus(String houseStatus) {
		HouseStatus = houseStatus;
	}

	public String getInsertTime() {
		return InsertTime;
	}

	public void setInsertTime(String insertTime) {
		InsertTime = insertTime;
	}

	public String getUpdateTime() {
		return UpdateTime;
	}

	public void setUpdateTime(String updateTime) {
		UpdateTime = updateTime;
	}

	public String getPrice() {
		return Price;
	}

	public void setPrice(String price) {
		Price = price;
	}

	public String getPriceType() {
		return PriceType;
	}

	public void setPriceType(String priceType) {
		PriceType = priceType;
	}

	public String getPayDetail() {
		return PayDetail;
	}

	public void setPayDetail(String payDetail) {
		PayDetail = payDetail;
	}

	public String getLeaseStyle() {
		return LeaseStyle;
	}

	public void setLeaseStyle(String leaseStyle) {
		LeaseStyle = leaseStyle;
	}

	public String getPurpose() {
		return Purpose;
	}

	public void setPurpose(String purpose) {
		Purpose = purpose;
	}

	public String getDistrict() {
		return District;
	}

	public void setDistrict(String district) {
		District = district;
	}

	public String getComArea() {
		return ComArea;
	}

	public void setComArea(String comArea) {
		ComArea = comArea;
	}

	public String getProjCode() {
		return ProjCode;
	}

	public void setProjCode(String projCode) {
		ProjCode = projCode;
	}

	public String getProjName() {
		return ProjName;
	}

	public void setProjName(String projName) {
		ProjName = projName;
	}

	public String getCreateTime() {
		return CreateTime;
	}

	public void setCreateTime(String createTime) {
		CreateTime = createTime;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getRoom() {
		return Room;
	}

	public void setRoom(String room) {
		Room = room;
	}

	public String getHall() {
		return Hall;
	}

	public void setHall(String hall) {
		Hall = hall;
	}

	public String getFloor() {
		return Floor;
	}

	public void setFloor(String floor) {
		Floor = floor;
	}

	public String getTotalFloor() {
		return TotalFloor;
	}

	public void setTotalFloor(String totalFloor) {
		TotalFloor = totalFloor;
	}

	public String getFloorPosition() {
		return FloorPosition;
	}

	public void setFloorPosition(String floorPosition) {
		FloorPosition = floorPosition;
	}

	public String getForward() {
		return Forward;
	}

	public void setForward(String forward) {
		Forward = forward;
	}

	public String getBuildArea() {
		return BuildArea;
	}

	public void setBuildArea(String buildArea) {
		BuildArea = buildArea;
	}

	public String getFitment() {
		return Fitment;
	}

	public void setFitment(String fitment) {
		Fitment = fitment;
	}

	public String getEquipment() {
		return Equipment;
	}

	public void setEquipment(String equipment) {
		Equipment = equipment;
	}

	public String getPhotoCount() {
		return PhotoCount;
	}

	public void setPhotoCount(String photoCount) {
		PhotoCount = photoCount;
	}

	public String getPhotoUrl() {
		return PhotoUrl;
	}

	public void setPhotoUrl(String photoUrl) {
		PhotoUrl = photoUrl;
	}

	public String getShinImgs() {
		return ShinImgs;
	}

	public void setShinImgs(String shinImgs) {
		ShinImgs = shinImgs;
	}

	public String getXqImgs() {
		return XqImgs;
	}

	public void setXqImgs(String xqImgs) {
		XqImgs = xqImgs;
	}

	public String getHxImgs() {
		return HxImgs;
	}

	public void setHxImgs(String hxImgs) {
		HxImgs = hxImgs;
	}
	
	public String getQjImgs() {
		return QjImgs;
	}

	public void setQjImgs(String qjImgs) {
		QjImgs = qjImgs;
	}

	public String getPhone400() {
		return Phone400;
	}

	public void setPhone400(String phone400) {
		Phone400 = phone400;
	}

	public String getCrownUserID() {
		return CrownUserID;
	}

	public void setCrownUserID(String crownUserID) {
		CrownUserID = crownUserID;
	}

	public String getBoardContent() {
		return BoardContent;
	}

	public void setBoardContent(String boardContent) {
		BoardContent = boardContent;
	}

	public String getHouseType() {
		return HouseType;
	}

	public void setHouseType(String houseType) {
		HouseType = houseType;
	}

	public String getCommissionWireLess() {
		return CommissionWireLess;
	}

	public void setCommissionWireLess(String commissionWireLess) {
		CommissionWireLess = commissionWireLess;
	}

	public String getOwnerDescription() {
		return OwnerDescription;
	}

	public void setOwnerDescription(String ownerDescription) {
		OwnerDescription = ownerDescription;
	}

	public String getOwnerName() {
		return OwnerName;
	}

	public void setOwnerName(String ownerName) {
		OwnerName = ownerName;
	}

	public String getIsOpenDisctrict() {
		return IsOpenDisctrict;
	}

	public void setIsOpenDisctrict(String isOpenDisctrict) {
		IsOpenDisctrict = isOpenDisctrict;
	}

	public String getOwnerPhone400() {
		return OwnerPhone400;
	}

	public void setOwnerPhone400(String ownerPhone400) {
		OwnerPhone400 = ownerPhone400;
	}

	public String getDelegationType() {
		return DelegationType;
	}

	public void setDelegationType(String delegationType) {
		DelegationType = delegationType;
	}

	public String getDelegationTypeInt() {
		return DelegationTypeInt;
	}

	public void setDelegationTypeInt(String delegationTypeInt) {
		DelegationTypeInt = delegationTypeInt;
	}

	public AgentIDList getAgentIDList() {
		return AgentIDList;
	}

	public void setAgentIDList(AgentIDList agentIDList) {
		AgentIDList = agentIDList;
	}

	public String getIsFiredHouse() {
		return IsFiredHouse;
	}

	public void setIsFiredHouse(String isFiredHouse) {
		IsFiredHouse = isFiredHouse;
	}

	public String getLinkurl() {
		return linkurl;
	}

	public void setLinkurl(String linkurl) {
		this.linkurl = linkurl;
	}

	public CommentList getCommentList() {
		return CommentList;
	}

	public void setCommentList(CommentList commentList) {
		CommentList = commentList;
	}

	public String getCoordx() {
		return coordx;
	}

	public void setCoordx(String coordx) {
		this.coordx = coordx;
	}

	public String getCoordy() {
		return coordy;
	}

	public void setCoordy(String coordy) {
		this.coordy = coordy;
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

	public String getSubwayLine() {
		return SubwayLine;
	}

	public void setSubwayLine(String subwayLine) {
		SubwayLine = subwayLine;
	}

	public String getSubwayStation() {
		return SubwayStation;
	}

	public void setSubwayStation(String subwayStation) {
		SubwayStation = subwayStation;
	}

	public String getSubwayDistance() {
		return SubwayDistance;
	}

	public void setSubwayDistance(String subwayDistance) {
		SubwayDistance = subwayDistance;
	}

	public CommentListNew getCommentListNew() {
		return CommentListNew;
	}

	public void setCommentListNew(CommentListNew commentListNew) {
		CommentListNew = commentListNew;
	}

	public String getCommentNum() {
		return CommentNum;
	}

	public void setCommentNum(String commentNum) {
		CommentNum = commentNum;
	}

	@Override
	public String toString() {
		return "LeaseHouseSource: \n[result=" + result + ", \nmessage=" + message + ", \nHouseID=" + HouseID + ", \nShikanTitle="
				+ ShikanTitle + ", \nHouseStatus=" + HouseStatus + ", \nInsertTime=" + InsertTime + ", \nUpdateTime="
				+ UpdateTime + ", \nPrice=" + Price + ", \nPriceType=" + PriceType + ", \nPayDetail=" + PayDetail
				+ ", \nLeaseStyle=" + LeaseStyle + ", \nPurpose=" + Purpose + ", \nDistrict=" + District + ", \nComArea="
				+ ComArea + ", \nProjCode=" + ProjCode + ", \nProjName=" + ProjName + ", \nCreateTime=" + CreateTime
				+ ", \nAddress=" + Address + ", \nRoom=" + Room + ", \nHall=" + Hall + ", \nFloor=" + Floor + ", \nTotalFloor="
				+ TotalFloor + ", \nFloorPosition=" + FloorPosition + ", \nForward=" + Forward + ", \nBuildArea=" + BuildArea
				+ ", \nFitment=" + Fitment + ", \nEquipment=" + Equipment + ", \nPhotoCount=" + PhotoCount + ", \nPhotoUrl="
				+ PhotoUrl + ", \nShinImgs=" + ShinImgs + ", \nXqImgs=" + XqImgs + ", \nHxImgs=" + HxImgs + ", \nQjImgs=" + QjImgs 
				+ ", \nPhone400=" + Phone400 + ", \nCrownUserID=" + CrownUserID + ", \nBoardContent=" + BoardContent + ", \nHouseType="
				+ HouseType + ", \nCommissionWireLess=" + CommissionWireLess + ", \nOwnerDescription=" + OwnerDescription
				+ ", \nOwnerName=" + OwnerName + ", \nIsOpenDisctrict=" + IsOpenDisctrict + ", \nOwnerPhone400="+ OwnerPhone400 
				+ ", \nDelegationType=" + DelegationType + ", \nDelegationTypeInt=" + DelegationTypeInt+ ", \nAgentIDList=" 
				+ AgentIDList.toString() + ", \nIsFiredHouse=" + IsFiredHouse + ", \nlinkurl=" + linkurl+ ", \nCommentList=" 
				+ CommentList.toString() + ", \ncoordx=" + coordx + ", \ncoordy=" + coordy + ", \naroundService="+ aroundService 
				+ ", \ntraffic_other=" + traffic_other + ", \nSubwayLine=" + SubwayLine + ", \nSubwayStation="+ SubwayStation 
				;//+ ", \nSubwayDistance="+ SubwayDistance + ", \nCommentListNew=" + CommentListNew.toString() + ", \nCommentNum=" + "CommentNum" + "\n]";
	}

	
}

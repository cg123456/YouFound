package com.soufang.salehouse.entity;
/** 
* @author  作者 E-mail: fmuhai@foxmail.com
* @date 创建时间：2016年3月15日 上午1:55:50 
* @version 1.0 
*/
public class Tuan_Discount {

	private String aid;
	private String Discount;
	private String DiscountBtime;
	private String DiscountEtime;
	private String signcount;
	private String roomcount;
	private String PCTitle;
	private String wapTitle;
	private String shortWapTitle;
	private String isTailHouseProj;
	private String mobilePayment;
	private String wapurl;
	
	public Tuan_Discount() {}

	public String getAid() {
		return aid;
	}

	public void setAid(String aid) {
		this.aid = aid;
	}

	public String getDiscount() {
		return Discount;
	}

	public void setDiscount(String discount) {
		Discount = discount;
	}

	public String getDiscountBtime() {
		return DiscountBtime;
	}

	public void setDiscountBtime(String discountBtime) {
		DiscountBtime = discountBtime;
	}

	public String getDiscountEtime() {
		return DiscountEtime;
	}

	public void setDiscountEtime(String discountEtime) {
		DiscountEtime = discountEtime;
	}

	public String getSigncount() {
		return signcount;
	}

	public void setSigncount(String signcount) {
		this.signcount = signcount;
	}

	public String getRoomcount() {
		return roomcount;
	}

	public void setRoomcount(String roomcount) {
		this.roomcount = roomcount;
	}

	public String getPCTitle() {
		return PCTitle;
	}

	public void setPCTitle(String pCTitle) {
		PCTitle = pCTitle;
	}

	public String getWapTitle() {
		return wapTitle;
	}

	public void setWapTitle(String wapTitle) {
		this.wapTitle = wapTitle;
	}

	public String getShortWapTitle() {
		return shortWapTitle;
	}

	public void setShortWapTitle(String shortWapTitle) {
		this.shortWapTitle = shortWapTitle;
	}

	public String getIsTailHouseProj() {
		return isTailHouseProj;
	}

	public void setIsTailHouseProj(String isTailHouseProj) {
		this.isTailHouseProj = isTailHouseProj;
	}

	public String getMobilePayment() {
		return mobilePayment;
	}

	public void setMobilePayment(String mobilePayment) {
		this.mobilePayment = mobilePayment;
	}

	public String getWapurl() {
		return wapurl;
	}

	public void setWapurl(String wapurl) {
		this.wapurl = wapurl;
	}

	@Override
	public String toString() {
		return "Tuan_Discount [aid=" + aid + ", Discount=" + Discount + ", DiscountBtime=" + DiscountBtime
				+ ", DiscountEtime=" + DiscountEtime + ", signcount=" + signcount + ", roomcount=" + roomcount
				+ ", PCTitle=" + PCTitle + ", wapTitle=" + wapTitle + ", shortWapTitle=" + shortWapTitle
				+ ", isTailHouseProj=" + isTailHouseProj + ", mobilePayment=" + mobilePayment + ", wapurl=" + wapurl
				+ "]";
	}
	
}

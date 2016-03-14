package com.soufang.salehouse.entity;
/** 
* @author  作者 E-mail: fmuhai@foxmail.com
* @date 创建时间：2016年3月15日 上午2:03:41 
* @version 1.0 
*/
public class Pai_Discount {

	private String Pai_Pai_ID;
	private String Pai_Pai_FengDingPrice;
	private String Pai_Discount_Num;
	private String Pai_DiscountBtime;
	private String Pai_DiscountEtime;
	private String Pai_AveragePrice;
	private String Pai_huxing;
	private String Pai_signcount;
	
	private String Pai_PCTitle;
	private String Pai_wapTitle;
	private String Pai_shortWapTitle;
	private String Pai_wapurl;
	
	public Pai_Discount() {}

	public String getPai_Pai_ID() {
		return Pai_Pai_ID;
	}

	public void setPai_Pai_ID(String pai_Pai_ID) {
		Pai_Pai_ID = pai_Pai_ID;
	}

	public String getPai_Pai_FengDingPrice() {
		return Pai_Pai_FengDingPrice;
	}

	public void setPai_Pai_FengDingPrice(String pai_Pai_FengDingPrice) {
		Pai_Pai_FengDingPrice = pai_Pai_FengDingPrice;
	}

	public String getPai_Discount_Num() {
		return Pai_Discount_Num;
	}

	public void setPai_Discount_Num(String pai_Discount_Num) {
		Pai_Discount_Num = pai_Discount_Num;
	}

	public String getPai_DiscountBtime() {
		return Pai_DiscountBtime;
	}

	public void setPai_DiscountBtime(String pai_DiscountBtime) {
		Pai_DiscountBtime = pai_DiscountBtime;
	}

	public String getPai_DiscountEtime() {
		return Pai_DiscountEtime;
	}

	public void setPai_DiscountEtime(String pai_DiscountEtime) {
		Pai_DiscountEtime = pai_DiscountEtime;
	}

	public String getPai_AveragePrice() {
		return Pai_AveragePrice;
	}

	public void setPai_AveragePrice(String pai_AveragePrice) {
		Pai_AveragePrice = pai_AveragePrice;
	}

	public String getPai_huxing() {
		return Pai_huxing;
	}

	public void setPai_huxing(String pai_huxing) {
		Pai_huxing = pai_huxing;
	}

	public String getPai_signcount() {
		return Pai_signcount;
	}

	public void setPai_signcount(String pai_signcount) {
		Pai_signcount = pai_signcount;
	}

	public String getPai_PCTitle() {
		return Pai_PCTitle;
	}

	public void setPai_PCTitle(String pai_PCTitle) {
		Pai_PCTitle = pai_PCTitle;
	}

	public String getPai_wapTitle() {
		return Pai_wapTitle;
	}

	public void setPai_wapTitle(String pai_wapTitle) {
		Pai_wapTitle = pai_wapTitle;
	}

	public String getPai_shortWapTitle() {
		return Pai_shortWapTitle;
	}

	public void setPai_shortWapTitle(String pai_shortWapTitle) {
		Pai_shortWapTitle = pai_shortWapTitle;
	}

	public String getPai_wapurl() {
		return Pai_wapurl;
	}

	public void setPai_wapurl(String pai_wapurl) {
		Pai_wapurl = pai_wapurl;
	}

	@Override
	public String toString() {
		return "Pai_Discount [Pai_Pai_ID=" + Pai_Pai_ID + ", Pai_Pai_FengDingPrice=" + Pai_Pai_FengDingPrice
				+ ", Pai_Discount_Num=" + Pai_Discount_Num + ", Pai_DiscountBtime=" + Pai_DiscountBtime
				+ ", Pai_DiscountEtime=" + Pai_DiscountEtime + ", Pai_AveragePrice=" + Pai_AveragePrice
				+ ", Pai_huxing=" + Pai_huxing + ", Pai_signcount=" + Pai_signcount + ", Pai_PCTitle=" + Pai_PCTitle
				+ ", Pai_wapTitle=" + Pai_wapTitle + ", Pai_shortWapTitle=" + Pai_shortWapTitle + ", Pai_wapurl="
				+ Pai_wapurl + "]";
	}
	
}

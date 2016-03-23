package com.soufang.salehouse.entity;

import javax.persistence.Entity;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/** 
* @author  作者 E-mail: fmuhai@foxmail.com
* @date 创建时间：2016年3月14日 下午10:56:10 
* @version 1.0 
*/
@Entity
@XStreamAlias("house")
public class SaleHouseSource {

	private String house_id;
	private String projname;			//中海花湾壹号
	private String district;			//荔湾区
	private String comarea;				//广钢新城
	private String park;				
	private String right_year;			//使用年限
	private String priceaverage;
	private String pricetype;
	private String purpose;				//住宅
	private String district_price;		//22540元/平方米
	private String has_pinggu;
	
	private String yearadd;
	private String zhulihuxing;			//B2栋05/06户型,B2栋01户型 ,B2栋02户型
	private String bookhouseCount;
	private String privilege;
	private String bbspost;
	private String bbsurl;
	private String bbsid;
	
	private Tuan_Discount Tuan_Discount ;
	private Kuang_Discount Kuang_Discount;
	private Pai_Discount Pai_Discount;
	
	private String dongtai_num;
	
	private Dongtai_one dongtai_one;
	
	private String saling;
	private String outdoor_pic;
	private String picture_count;
	//@XStreamAlias("comarea")
	//private String comarea2;
	private String proj_desc;
	private String address;				//荔湾鹤洞路（地铁西朗站A出口）
	private String round_station;
	private String build_category;
	private String sale_date;
	private String live_date;			//交房
	private String fix_status;			//装修情况
	private String dimension;
	private String virescence_rate;
	
	private String total_door;
	private String sale_card;
	private String property_fee;		//3.60元/平方米·月
	private String manager;				//物业管理
	private String developer;
	private String proj_certitype;
	private String sale_address;
	private String map_coord_x;
	private String map_coord_y;
	private String baidu_coord_x;
	private String baidu_coord_y;
	
	private String around_service;
	private String traffic;
	private String telephone;
	private String teleclient;
	private String linkurl;
	private String shijingcount;
	private String yijucount;			//一居
	private String erjucount;			//二居
	private String sanjucount;			//三居
	private String sijucount;			//四居
	private String wujucount;			//五居
	private String qitacount;			//其他
	
	private String waijingcount;
	private String jiaotongcount;
	private String peitaocount;
	private String yangbancount;
	private String xiaoguocount;
	private String xianchangcount;
	private String shijingimg;
	
	
	private String yijuhxid;
	private String yijuimg;
	private String yijupicid;
	private String yijuimg_taonum;
	private String yijuimg_detail;
	private String yijuimg_detail_mianji;
	private String yijuimg_title;
	private String yijuimg_price;
	
	private String erjuhxid;
	private String erjuimg;
	private String erjupicid;
	private String erjuimg_taonum;
	private String erjuimg_detail;
	private String erjuimg_detail_mianji;
	private String erjuimg_title;
	private String erjuimg_price;
	
	private String sanjuhxid;
	private String sanjuimg;
	private String sanjupicid;
	private String sanjuimg_taonum;
	private String sanjuimg_detail;
	private String sanjuimg_detail_mianji;
	private String sanjuimg_title;
	private String sanjuimg_price;
	
	private String sijuhxid;
	private String sijuimg;
	private String sijupicid;
	private String sijuimg_taonum;
	private String sijuimg_detail;
	private String sijuimg_detail_mianji;
	private String sijuimg_title;
	private String sijuimg_price;
	
	private String wujuhxid;
	private String wujuimg;
	private String wujupicid;
	private String wujuimg_taonum;
	private String wujuimg_detail;
	private String wujuimg_detail_mianji;
	private String wujuimg_title;
	private String wujuimg_price;
	
	private String qitahxid;
	private String qitaimg;
	private String qitapicid;
	private String qitaimg_taonum;
	private String qitaimg_detail;
	private String qitaimg_detail_mianji;
	private String qitaimg_title;
	private String qitajuimg_price;
	
	private String waijingimg;
	private String jiaotongimg;
	private String peitaoimg;
	private String yangbanimg;
	private String xiaoguoimg;
	private String xianchangimg;
	private String titleimg;
	private String zhulihuxingindex;
	private String priceint;
	private String house_feature;
	
	private BbsPostList bbspostlist;
	
	private Lookhouse lookhouse;
	private Videos videos;
	private String videocount;
	private String allcountimg;
	private Districtinfo_match districtinfo_match;
	private Taglist taglist;
	private ChannelProjByNewcode ChannelProjByNewcode;
	private String xuexiao;
	private String xuexiao_new;
	private String keshou;
	private String isOrdinaryLoupan;
	
	private String newstyle;
	private String areatype;
	private String areadescription;
	
	public SaleHouseSource() {}

	public String getHouse_id() {
		return house_id;
	}

	public void setHouse_id(String house_id) {
		this.house_id = house_id;
	}

	public String getProjname() {
		return projname;
	}

	public void setProjname(String projname) {
		this.projname = projname;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getComarea() {
		return comarea;
	}

	public void setComarea(String comarea) {
		this.comarea = comarea;
	}

	public String getPark() {
		return park;
	}

	public void setPark(String park) {
		this.park = park;
	}

	public String getRight_year() {
		return right_year;
	}

	public void setRight_year(String right_year) {
		this.right_year = right_year;
	}

	public String getPriceaverage() {
		return priceaverage;
	}

	public void setPriceaverage(String priceaverage) {
		this.priceaverage = priceaverage;
	}

	public String getPricetype() {
		return pricetype;
	}

	public void setPricetype(String pricetype) {
		this.pricetype = pricetype;
	}

	public String getPurpose() {
		return purpose;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

	public String getDistrict_price() {
		return district_price;
	}

	public void setDistrict_price(String district_price) {
		this.district_price = district_price;
	}

	public String getHas_pinggu() {
		return has_pinggu;
	}

	public void setHas_pinggu(String has_pinggu) {
		this.has_pinggu = has_pinggu;
	}

	public String getYearadd() {
		return yearadd;
	}

	public void setYearadd(String yearadd) {
		this.yearadd = yearadd;
	}

	public String getZhulihuxing() {
		return zhulihuxing;
	}

	public void setZhulihuxing(String zhulihuxing) {
		this.zhulihuxing = zhulihuxing;
	}

	public String getBookhouseCount() {
		return bookhouseCount;
	}

	public void setBookhouseCount(String bookhouseCount) {
		this.bookhouseCount = bookhouseCount;
	}

	public String getPrivilege() {
		return privilege;
	}

	public void setPrivilege(String privilege) {
		this.privilege = privilege;
	}

	public String getBbspost() {
		return bbspost;
	}

	public void setBbspost(String bbspost) {
		this.bbspost = bbspost;
	}

	public String getBbsurl() {
		return bbsurl;
	}

	public void setBbsurl(String bbsurl) {
		this.bbsurl = bbsurl;
	}

	public String getBbsid() {
		return bbsid;
	}

	public void setBbsid(String bbsid) {
		this.bbsid = bbsid;
	}

	public Tuan_Discount getTuan_Discount() {
		return Tuan_Discount;
	}

	public void setTuan_Discount(Tuan_Discount tuan_Discount) {
		Tuan_Discount = tuan_Discount;
	}

	public Kuang_Discount getKuang_Discount() {
		return Kuang_Discount;
	}

	public void setKuang_Discount(Kuang_Discount kuang_Discount) {
		Kuang_Discount = kuang_Discount;
	}

	public Pai_Discount getPai_Discount() {
		return Pai_Discount;
	}

	public void setPai_Discount(Pai_Discount pai_Discount) {
		Pai_Discount = pai_Discount;
	}

	public String getDongtai_num() {
		return dongtai_num;
	}

	public void setDongtai_num(String dongtai_num) {
		this.dongtai_num = dongtai_num;
	}

	public Dongtai_one getDongtai_one() {
		return dongtai_one;
	}

	public void setDongtai_one(Dongtai_one dongtai_one) {
		this.dongtai_one = dongtai_one;
	}

	public String getSaling() {
		return saling;
	}

	public void setSaling(String saling) {
		this.saling = saling;
	}

	public String getOutdoor_pic() {
		return outdoor_pic;
	}

	public void setOutdoor_pic(String outdoor_pic) {
		this.outdoor_pic = outdoor_pic;
	}

	public String getPicture_count() {
		return picture_count;
	}

	public void setPicture_count(String picture_count) {
		this.picture_count = picture_count;
	}

	public String getProj_desc() {
		return proj_desc;
	}

	public void setProj_desc(String proj_desc) {
		this.proj_desc = proj_desc;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getRound_station() {
		return round_station;
	}

	public void setRound_station(String round_station) {
		this.round_station = round_station;
	}

	public String getBuild_category() {
		return build_category;
	}

	public void setBuild_category(String build_category) {
		this.build_category = build_category;
	}

	public String getSale_date() {
		return sale_date;
	}

	public void setSale_date(String sale_date) {
		this.sale_date = sale_date;
	}

	public String getLive_date() {
		return live_date;
	}

	public void setLive_date(String live_date) {
		this.live_date = live_date;
	}

	public String getFix_status() {
		return fix_status;
	}

	public void setFix_status(String fix_status) {
		this.fix_status = fix_status;
	}

	public String getDimension() {
		return dimension;
	}

	public void setDimension(String dimension) {
		this.dimension = dimension;
	}

	public String getVirescence_rate() {
		return virescence_rate;
	}

	public void setVirescence_rate(String virescence_rate) {
		this.virescence_rate = virescence_rate;
	}

	public String getTotal_door() {
		return total_door;
	}

	public void setTotal_door(String total_door) {
		this.total_door = total_door;
	}

	public String getSale_card() {
		return sale_card;
	}

	public void setSale_card(String sale_card) {
		this.sale_card = sale_card;
	}

	public String getProperty_fee() {
		return property_fee;
	}

	public void setProperty_fee(String property_fee) {
		this.property_fee = property_fee;
	}

	public String getManager() {
		return manager;
	}

	public void setManager(String manager) {
		this.manager = manager;
	}

	public String getDeveloper() {
		return developer;
	}

	public void setDeveloper(String developer) {
		this.developer = developer;
	}

	public String getProj_certitype() {
		return proj_certitype;
	}

	public void setProj_certitype(String proj_certitype) {
		this.proj_certitype = proj_certitype;
	}

	public String getSale_address() {
		return sale_address;
	}

	public void setSale_address(String sale_address) {
		this.sale_address = sale_address;
	}

	public String getMap_coord_x() {
		return map_coord_x;
	}

	public void setMap_coord_x(String map_coord_x) {
		this.map_coord_x = map_coord_x;
	}

	public String getMap_coord_y() {
		return map_coord_y;
	}

	public void setMap_coord_y(String map_coord_y) {
		this.map_coord_y = map_coord_y;
	}

	public String getBaidu_coord_x() {
		return baidu_coord_x;
	}

	public void setBaidu_coord_x(String baidu_coord_x) {
		this.baidu_coord_x = baidu_coord_x;
	}

	public String getBaidu_coord_y() {
		return baidu_coord_y;
	}

	public void setBaidu_coord_y(String baidu_coord_y) {
		this.baidu_coord_y = baidu_coord_y;
	}

	public String getAround_service() {
		return around_service;
	}

	public void setAround_service(String around_service) {
		this.around_service = around_service;
	}

	public String getTraffic() {
		return traffic;
	}

	public void setTraffic(String traffic) {
		this.traffic = traffic;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getTeleclient() {
		return teleclient;
	}

	public void setTeleclient(String teleclient) {
		this.teleclient = teleclient;
	}

	public String getLinkurl() {
		return linkurl;
	}

	public void setLinkurl(String linkurl) {
		this.linkurl = linkurl;
	}

	public String getShijingcount() {
		return shijingcount;
	}

	public void setShijingcount(String shijingcount) {
		this.shijingcount = shijingcount;
	}

	public String getYijucount() {
		return yijucount;
	}

	public void setYijucount(String yijucount) {
		this.yijucount = yijucount;
	}

	public String getErjucount() {
		return erjucount;
	}

	public void setErjucount(String erjucount) {
		this.erjucount = erjucount;
	}

	public String getSanjucount() {
		return sanjucount;
	}

	public void setSanjucount(String sanjucount) {
		this.sanjucount = sanjucount;
	}

	public String getSijucount() {
		return sijucount;
	}

	public void setSijucount(String sijucount) {
		this.sijucount = sijucount;
	}

	public String getWujucount() {
		return wujucount;
	}

	public void setWujucount(String wujucount) {
		this.wujucount = wujucount;
	}

	public String getQitacount() {
		return qitacount;
	}

	public void setQitacount(String qitacount) {
		this.qitacount = qitacount;
	}

	public String getWaijingcount() {
		return waijingcount;
	}

	public void setWaijingcount(String waijingcount) {
		this.waijingcount = waijingcount;
	}

	public String getJiaotongcount() {
		return jiaotongcount;
	}

	public void setJiaotongcount(String jiaotongcount) {
		this.jiaotongcount = jiaotongcount;
	}

	public String getPeitaocount() {
		return peitaocount;
	}

	public void setPeitaocount(String peitaocount) {
		this.peitaocount = peitaocount;
	}

	public String getYangbancount() {
		return yangbancount;
	}

	public void setYangbancount(String yangbancount) {
		this.yangbancount = yangbancount;
	}

	public String getXiaoguocount() {
		return xiaoguocount;
	}

	public void setXiaoguocount(String xiaoguocount) {
		this.xiaoguocount = xiaoguocount;
	}

	public String getXianchangcount() {
		return xianchangcount;
	}

	public void setXianchangcount(String xianchangcount) {
		this.xianchangcount = xianchangcount;
	}

	public String getShijingimg() {
		return shijingimg;
	}

	public void setShijingimg(String shijingimg) {
		this.shijingimg = shijingimg;
	}

	public String getYijuhxid() {
		return yijuhxid;
	}

	public void setYijuhxid(String yijuhxid) {
		this.yijuhxid = yijuhxid;
	}

	public String getYijuimg() {
		return yijuimg;
	}

	public void setYijuimg(String yijuimg) {
		this.yijuimg = yijuimg;
	}

	public String getYijupicid() {
		return yijupicid;
	}

	public void setYijupicid(String yijupicid) {
		this.yijupicid = yijupicid;
	}

	public String getYijuimg_taonum() {
		return yijuimg_taonum;
	}

	public void setYijuimg_taonum(String yijuimg_taonum) {
		this.yijuimg_taonum = yijuimg_taonum;
	}

	public String getYijuimg_detail() {
		return yijuimg_detail;
	}

	public void setYijuimg_detail(String yijuimg_detail) {
		this.yijuimg_detail = yijuimg_detail;
	}

	public String getYijuimg_detail_mianji() {
		return yijuimg_detail_mianji;
	}

	public void setYijuimg_detail_mianji(String yijuimg_detail_mianji) {
		this.yijuimg_detail_mianji = yijuimg_detail_mianji;
	}

	public String getYijuimg_title() {
		return yijuimg_title;
	}

	public void setYijuimg_title(String yijuimg_title) {
		this.yijuimg_title = yijuimg_title;
	}

	public String getYijuimg_price() {
		return yijuimg_price;
	}

	public void setYijuimg_price(String yijuimg_price) {
		this.yijuimg_price = yijuimg_price;
	}

	public String getErjuhxid() {
		return erjuhxid;
	}

	public void setErjuhxid(String erjuhxid) {
		this.erjuhxid = erjuhxid;
	}

	public String getErjuimg() {
		return erjuimg;
	}

	public void setErjuimg(String erjuimg) {
		this.erjuimg = erjuimg;
	}

	public String getErjupicid() {
		return erjupicid;
	}

	public void setErjupicid(String erjupicid) {
		this.erjupicid = erjupicid;
	}

	public String getErjuimg_taonum() {
		return erjuimg_taonum;
	}

	public void setErjuimg_taonum(String erjuimg_taonum) {
		this.erjuimg_taonum = erjuimg_taonum;
	}

	public String getErjuimg_detail() {
		return erjuimg_detail;
	}

	public void setErjuimg_detail(String erjuimg_detail) {
		this.erjuimg_detail = erjuimg_detail;
	}

	public String getErjuimg_detail_mianji() {
		return erjuimg_detail_mianji;
	}

	public void setErjuimg_detail_mianji(String erjuimg_detail_mianji) {
		this.erjuimg_detail_mianji = erjuimg_detail_mianji;
	}

	public String getErjuimg_title() {
		return erjuimg_title;
	}

	public void setErjuimg_title(String erjuimg_title) {
		this.erjuimg_title = erjuimg_title;
	}

	public String getErjuimg_price() {
		return erjuimg_price;
	}

	public void setErjuimg_price(String erjuimg_price) {
		this.erjuimg_price = erjuimg_price;
	}

	public String getSanjuhxid() {
		return sanjuhxid;
	}

	public void setSanjuhxid(String sanjuhxid) {
		this.sanjuhxid = sanjuhxid;
	}

	public String getSanjuimg() {
		return sanjuimg;
	}

	public void setSanjuimg(String sanjuimg) {
		this.sanjuimg = sanjuimg;
	}

	public String getSanjupicid() {
		return sanjupicid;
	}

	public void setSanjupicid(String sanjupicid) {
		this.sanjupicid = sanjupicid;
	}

	public String getSanjuimg_taonum() {
		return sanjuimg_taonum;
	}

	public void setSanjuimg_taonum(String sanjuimg_taonum) {
		this.sanjuimg_taonum = sanjuimg_taonum;
	}

	public String getSanjuimg_detail() {
		return sanjuimg_detail;
	}

	public void setSanjuimg_detail(String sanjuimg_detail) {
		this.sanjuimg_detail = sanjuimg_detail;
	}

	public String getSanjuimg_detail_mianji() {
		return sanjuimg_detail_mianji;
	}

	public void setSanjuimg_detail_mianji(String sanjuimg_detail_mianji) {
		this.sanjuimg_detail_mianji = sanjuimg_detail_mianji;
	}

	public String getSanjuimg_title() {
		return sanjuimg_title;
	}

	public void setSanjuimg_title(String sanjuimg_title) {
		this.sanjuimg_title = sanjuimg_title;
	}

	public String getSanjuimg_price() {
		return sanjuimg_price;
	}

	public void setSanjuimg_price(String sanjuimg_price) {
		this.sanjuimg_price = sanjuimg_price;
	}

	public String getSijuhxid() {
		return sijuhxid;
	}

	public void setSijuhxid(String sijuhxid) {
		this.sijuhxid = sijuhxid;
	}

	public String getSijuimg() {
		return sijuimg;
	}

	public void setSijuimg(String sijuimg) {
		this.sijuimg = sijuimg;
	}

	public String getSijupicid() {
		return sijupicid;
	}

	public void setSijupicid(String sijupicid) {
		this.sijupicid = sijupicid;
	}

	public String getSijuimg_taonum() {
		return sijuimg_taonum;
	}

	public void setSijuimg_taonum(String sijuimg_taonum) {
		this.sijuimg_taonum = sijuimg_taonum;
	}

	public String getSijuimg_detail() {
		return sijuimg_detail;
	}

	public void setSijuimg_detail(String sijuimg_detail) {
		this.sijuimg_detail = sijuimg_detail;
	}

	public String getSijuimg_detail_mianji() {
		return sijuimg_detail_mianji;
	}

	public void setSijuimg_detail_mianji(String sijuimg_detail_mianji) {
		this.sijuimg_detail_mianji = sijuimg_detail_mianji;
	}

	public String getSijuimg_title() {
		return sijuimg_title;
	}

	public void setSijuimg_title(String sijuimg_title) {
		this.sijuimg_title = sijuimg_title;
	}

	public String getSijuimg_price() {
		return sijuimg_price;
	}

	public void setSijuimg_price(String sijuimg_price) {
		this.sijuimg_price = sijuimg_price;
	}

	public String getWujuhxid() {
		return wujuhxid;
	}

	public void setWujuhxid(String wujuhxid) {
		this.wujuhxid = wujuhxid;
	}

	public String getWujuimg() {
		return wujuimg;
	}

	public void setWujuimg(String wujuimg) {
		this.wujuimg = wujuimg;
	}

	public String getWujupicid() {
		return wujupicid;
	}

	public void setWujupicid(String wujupicid) {
		this.wujupicid = wujupicid;
	}

	public String getWujuimg_taonum() {
		return wujuimg_taonum;
	}

	public void setWujuimg_taonum(String wujuimg_taonum) {
		this.wujuimg_taonum = wujuimg_taonum;
	}

	public String getWujuimg_detail() {
		return wujuimg_detail;
	}

	public void setWujuimg_detail(String wujuimg_detail) {
		this.wujuimg_detail = wujuimg_detail;
	}

	public String getWujuimg_detail_mianji() {
		return wujuimg_detail_mianji;
	}

	public void setWujuimg_detail_mianji(String wujuimg_detail_mianji) {
		this.wujuimg_detail_mianji = wujuimg_detail_mianji;
	}

	public String getWujuimg_title() {
		return wujuimg_title;
	}

	public void setWujuimg_title(String wujuimg_title) {
		this.wujuimg_title = wujuimg_title;
	}

	public String getWujuimg_price() {
		return wujuimg_price;
	}

	public void setWujuimg_price(String wujuimg_price) {
		this.wujuimg_price = wujuimg_price;
	}

	public String getQitahxid() {
		return qitahxid;
	}

	public void setQitahxid(String qitahxid) {
		this.qitahxid = qitahxid;
	}

	public String getQitaimg() {
		return qitaimg;
	}

	public void setQitaimg(String qitaimg) {
		this.qitaimg = qitaimg;
	}

	public String getQitapicid() {
		return qitapicid;
	}

	public void setQitapicid(String qitapicid) {
		this.qitapicid = qitapicid;
	}

	public String getQitaimg_taonum() {
		return qitaimg_taonum;
	}

	public void setQitaimg_taonum(String qitaimg_taonum) {
		this.qitaimg_taonum = qitaimg_taonum;
	}

	public String getQitaimg_detail() {
		return qitaimg_detail;
	}

	public void setQitaimg_detail(String qitaimg_detail) {
		this.qitaimg_detail = qitaimg_detail;
	}

	public String getQitaimg_detail_mianji() {
		return qitaimg_detail_mianji;
	}

	public void setQitaimg_detail_mianji(String qitaimg_detail_mianji) {
		this.qitaimg_detail_mianji = qitaimg_detail_mianji;
	}

	public String getQitaimg_title() {
		return qitaimg_title;
	}

	public void setQitaimg_title(String qitaimg_title) {
		this.qitaimg_title = qitaimg_title;
	}

	public String getQitajuimg_price() {
		return qitajuimg_price;
	}

	public void setQitajuimg_price(String qitajuimg_price) {
		this.qitajuimg_price = qitajuimg_price;
	}

	public String getWaijingimg() {
		return waijingimg;
	}

	public void setWaijingimg(String waijingimg) {
		this.waijingimg = waijingimg;
	}

	public String getJiaotongimg() {
		return jiaotongimg;
	}

	public void setJiaotongimg(String jiaotongimg) {
		this.jiaotongimg = jiaotongimg;
	}

	public String getPeitaoimg() {
		return peitaoimg;
	}

	public void setPeitaoimg(String peitaoimg) {
		this.peitaoimg = peitaoimg;
	}

	public String getYangbanimg() {
		return yangbanimg;
	}

	public void setYangbanimg(String yangbanimg) {
		this.yangbanimg = yangbanimg;
	}

	public String getXiaoguoimg() {
		return xiaoguoimg;
	}

	public void setXiaoguoimg(String xiaoguoimg) {
		this.xiaoguoimg = xiaoguoimg;
	}

	public String getXianchangimg() {
		return xianchangimg;
	}

	public void setXianchangimg(String xianchangimg) {
		this.xianchangimg = xianchangimg;
	}

	public String getTitleimg() {
		return titleimg;
	}

	public void setTitleimg(String titleimg) {
		this.titleimg = titleimg;
	}

	public String getZhulihuxingindex() {
		return zhulihuxingindex;
	}

	public void setZhulihuxingindex(String zhulihuxingindex) {
		this.zhulihuxingindex = zhulihuxingindex;
	}

	public String getPriceint() {
		return priceint;
	}

	public void setPriceint(String priceint) {
		this.priceint = priceint;
	}

	public String getHouse_feature() {
		return house_feature;
	}

	public void setHouse_feature(String house_feature) {
		this.house_feature = house_feature;
	}

	public BbsPostList getBbspostlist() {
		return bbspostlist;
	}

	public void setBbspostlist(BbsPostList bbspostlist) {
		this.bbspostlist = bbspostlist;
	}

	public Lookhouse getLookhouse() {
		return lookhouse;
	}

	public void setLookhouse(Lookhouse lookhouse) {
		this.lookhouse = lookhouse;
	}

	public Videos getVideos() {
		return videos;
	}

	public void setVideos(Videos videos) {
		this.videos = videos;
	}

	public String getVideocount() {
		return videocount;
	}

	public void setVideocount(String videocount) {
		this.videocount = videocount;
	}

	public String getAllcountimg() {
		return allcountimg;
	}

	public void setAllcountimg(String allcountimg) {
		this.allcountimg = allcountimg;
	}

	public Districtinfo_match getDistrictinfo_match() {
		return districtinfo_match;
	}

	public void setDistrictinfo_match(Districtinfo_match districtinfo_match) {
		this.districtinfo_match = districtinfo_match;
	}

	public Taglist getTaglist() {
		return taglist;
	}

	public void setTaglist(Taglist taglist) {
		this.taglist = taglist;
	}

	public ChannelProjByNewcode getChannelProjByNewcode() {
		return ChannelProjByNewcode;
	}

	public void setChannelProjByNewcode(ChannelProjByNewcode channelProjByNewcode) {
		ChannelProjByNewcode = channelProjByNewcode;
	}

	public String getXuexiao() {
		return xuexiao;
	}

	public void setXuexiao(String xuexiao) {
		this.xuexiao = xuexiao;
	}

	public String getXuexiao_new() {
		return xuexiao_new;
	}

	public void setXuexiao_new(String xuexiao_new) {
		this.xuexiao_new = xuexiao_new;
	}

	public String getKeshou() {
		return keshou;
	}

	public void setKeshou(String keshou) {
		this.keshou = keshou;
	}

	public String getIsOrdinaryLoupan() {
		return isOrdinaryLoupan;
	}

	public void setIsOrdinaryLoupan(String isOrdinaryLoupan) {
		this.isOrdinaryLoupan = isOrdinaryLoupan;
	}

	public String getNewstyle() {
		return newstyle;
	}

	public void setNewstyle(String newstyle) {
		this.newstyle = newstyle;
	}

	public String getAreatype() {
		return areatype;
	}

	public void setAreatype(String areatype) {
		this.areatype = areatype;
	}

	public String getAreadescription() {
		return areadescription;
	}

	public void setAreadescription(String areadescription) {
		this.areadescription = areadescription;
	}

	@Override
	public String toString() {
		return "SaleHouse [house_id=" + house_id + ", projname=" + projname + ", district=" + district + ", comarea="
				+ comarea + ", park=" + park + ", right_year=" + right_year + ", priceaverage=" + priceaverage
				+ ", pricetype=" + pricetype + ", purpose=" + purpose + ", district_price=" + district_price
				+ ", has_pinggu=" + has_pinggu + ", yearadd=" + yearadd + ", zhulihuxing=" + zhulihuxing
				+ ", bookhouseCount=" + bookhouseCount + ", privilege=" + privilege + ", bbspost=" + bbspost
				+ ", bbsurl=" + bbsurl + ", bbsid=" + bbsid + ", Tuan_Discount=" + Tuan_Discount.toString() + ", Kuang_Discount="
				+ Kuang_Discount.toString() + ", Pai_Discount=" + Pai_Discount.toString() + ", dongtai_num=" + dongtai_num + ", dongtai_one="
				+ dongtai_one.toString() + ", saling=" + saling + ", outdoor_pic=" + outdoor_pic + ", picture_count="
				+ picture_count + ", proj_desc=" + proj_desc + ", address=" + address + ", round_station="
				+ round_station + ", build_category=" + build_category + ", sale_date=" + sale_date + ", live_date="
				+ live_date + ", fix_status=" + fix_status + ", dimension=" + dimension + ", virescence_rate="
				+ virescence_rate + ", total_door=" + total_door + ", sale_card=" + sale_card + ", property_fee="
				+ property_fee + ", manager=" + manager + ", developer=" + developer + ", proj_certitype="
				+ proj_certitype + ", sale_address=" + sale_address + ", map_coord_x=" + map_coord_x + ", map_coord_y="
				+ map_coord_y + ", baidu_coord_x=" + baidu_coord_x + ", baidu_coord_y=" + baidu_coord_y
				+ ", around_service=" + around_service + ", traffic=" + traffic + ", telephone=" + telephone
				+ ", teleclient=" + teleclient + ", linkurl=" + linkurl + ", shijingcount=" + shijingcount
				+ ", yijucount=" + yijucount + ", erjucount=" + erjucount + ", sanjucount=" + sanjucount
				+ ", sijucount=" + sijucount + ", wujucount=" + wujucount + ", qitacount=" + qitacount
				+ ", waijingcount=" + waijingcount + ", jiaotongcount=" + jiaotongcount + ", peitaocount=" + peitaocount
				+ ", yangbancount=" + yangbancount + ", xiaoguocount=" + xiaoguocount + ", xianchangcount="
				+ xianchangcount + ", shijingimg=" + shijingimg + ", yijuhxid=" + yijuhxid + ", yijuimg=" + yijuimg
				+ ", yijupicid=" + yijupicid + ", yijuimg_taonum=" + yijuimg_taonum + ", yijuimg_detail="
				+ yijuimg_detail + ", yijuimg_detail_mianji=" + yijuimg_detail_mianji + ", yijuimg_title="
				+ yijuimg_title + ", yijuimg_price=" + yijuimg_price + ", erjuhxid=" + erjuhxid + ", erjuimg=" + erjuimg
				+ ", erjupicid=" + erjupicid + ", erjuimg_taonum=" + erjuimg_taonum + ", erjuimg_detail="
				+ erjuimg_detail + ", erjuimg_detail_mianji=" + erjuimg_detail_mianji + ", erjuimg_title="
				+ erjuimg_title + ", erjuimg_price=" + erjuimg_price + ", sanjuhxid=" + sanjuhxid + ", sanjuimg="
				+ sanjuimg + ", sanjupicid=" + sanjupicid + ", sanjuimg_taonum=" + sanjuimg_taonum
				+ ", sanjuimg_detail=" + sanjuimg_detail + ", sanjuimg_detail_mianji=" + sanjuimg_detail_mianji
				+ ", sanjuimg_title=" + sanjuimg_title + ", sanjuimg_price=" + sanjuimg_price + ", sijuhxid=" + sijuhxid
				+ ", sijuimg=" + sijuimg + ", sijupicid=" + sijupicid + ", sijuimg_taonum=" + sijuimg_taonum
				+ ", sijuimg_detail=" + sijuimg_detail + ", sijuimg_detail_mianji=" + sijuimg_detail_mianji
				+ ", sijuimg_title=" + sijuimg_title + ", sijuimg_price=" + sijuimg_price + ", wujuhxid=" + wujuhxid
				+ ", wujuimg=" + wujuimg + ", wujupicid=" + wujupicid + ", wujuimg_taonum=" + wujuimg_taonum
				+ ", wujuimg_detail=" + wujuimg_detail + ", wujuimg_detail_mianji=" + wujuimg_detail_mianji
				+ ", wujuimg_title=" + wujuimg_title + ", wujuimg_price=" + wujuimg_price + ", qitahxid=" + qitahxid
				+ ", qitaimg=" + qitaimg + ", qitapicid=" + qitapicid + ", qitaimg_taonum=" + qitaimg_taonum
				+ ", qitaimg_detail=" + qitaimg_detail + ", qitaimg_detail_mianji=" + qitaimg_detail_mianji
				+ ", qitaimg_title=" + qitaimg_title + ", qitajuimg_price=" + qitajuimg_price + ", waijingimg=" + waijingimg
				+ ", jiaotongimg=" + jiaotongimg + ", peitaoimg=" + peitaoimg + ", yangbanimg=" + yangbanimg
				+ ", xiaoguoimg=" + xiaoguoimg + ", xianchangimg=" + xianchangimg + ", titleimg=" + titleimg
				+ ", zhulihuxingindex=" + zhulihuxingindex + ", priceint=" + priceint + ", bbspostlist=" + bbspostlist.toString()
				+ ", lookhouse=" + lookhouse.toString() + ", videos=" + videos.toString() + ", videocount=" + videocount + ", allcountimg="
				+ allcountimg + ", districtinfo_match=" + districtinfo_match.toString() + ", taglist=" + taglist.toString()
				+ ", ChannelProjByNewcode=" + ChannelProjByNewcode.toString() + ", xuexiao=" + xuexiao + ", xuexiao_new="
				+ xuexiao_new + ", keshou=" + keshou + ", isOrdinaryLoupan=" + isOrdinaryLoupan + ", newstyle="
				+ newstyle + ", areatype=" + areatype + ", areadescription=" + areadescription + "]";
	}
	
	
	
}

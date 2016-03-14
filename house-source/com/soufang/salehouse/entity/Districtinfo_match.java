package com.soufang.salehouse.entity;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/** 
* @author  作者 E-mail: fmuhai@foxmail.com
* @date 创建时间：2016年3月15日 上午2:12:55 
* @version 1.0 
*/
@XStreamAlias("districtinfo_match")
public class Districtinfo_match {

	private String city;
	private String district;
	private String cityMatch;
	private String districtMatch;
	private String areaMatch;
	private String disType;
	
	public Districtinfo_match() {}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getCityMatch() {
		return cityMatch;
	}

	public void setCityMatch(String cityMatch) {
		this.cityMatch = cityMatch;
	}

	public String getDistrictMatch() {
		return districtMatch;
	}

	public void setDistrictMatch(String districtMatch) {
		this.districtMatch = districtMatch;
	}

	public String getAreaMatch() {
		return areaMatch;
	}

	public void setAreaMatch(String areaMatch) {
		this.areaMatch = areaMatch;
	}

	public String getDisType() {
		return disType;
	}

	public void setDisType(String disType) {
		this.disType = disType;
	}

	@Override
	public String toString() {
		return "Districtinfo_match [city=" + city + ", district=" + district + ", cityMatch=" + cityMatch
				+ ", districtMatch=" + districtMatch + ", areaMatch=" + areaMatch + ", disType=" + disType + "]";
	}
	
	
}

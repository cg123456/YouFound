package com.fmh.youfound.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

/** 
* @author  作者 E-mail: fmuhai@foxmail.com
* @date 创建时间：2016年3月13日 上午2:29:23 
* @version 1.0 
*/
@Entity
public class Address {
	
	private String id;
	private String city;
	private String district;		//城市的区：天河区，越秀区
	private String comArea;			//地段：如大学城，珠江新城
	private String street;			//xxxx路xxx号
	
	private String coordx;			//coordinate坐标，经度
	private String coordy;			//纬度
	
	public Address() {
		
	}

	@Id
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

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

	public String getComArea() {
		return comArea;
	}

	public void setComArea(String comArea) {
		this.comArea = comArea;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
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

}

package com.fmh.youfound.entity;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/** 
* @author  作者 E-mail: fmuhai@foxmail.com
* @date 创建时间：2016年3月16日 下午10:03:52 
* @version 1.0 
*/
@Entity
public class HouseType {
	
	@Id
	@GeneratedValue
	private Long id;
	private int roomNum;	//房间数
	private int hallNum;	//厅数
	private int kitchen;	//厨房数
	private int toilet;		//卫生间数

	public HouseType() {
		
	}

	public HouseType(int roomNum, int hallNum, int kitchen, int toilet) {
		super();
		this.roomNum = roomNum;
		this.hallNum = hallNum;
		this.kitchen = kitchen;
		this.toilet = toilet;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getRoomNum() {
		return roomNum;
	}
	public void setRoomNum(int roomNum) {
		this.roomNum = roomNum;
	}
	public int getHallNum() {
		return hallNum;
	}
	public void setHallNum(int hallNum) {
		this.hallNum = hallNum;
	}
	public int getKitchen() {
		return kitchen;
	}
	public void setKitchen(int kitchen) {
		this.kitchen = kitchen;
	}
	public int getToilet() {
		return toilet;
	}
	public void setToilet(int toilet) {
		this.toilet = toilet;
	}
	

}

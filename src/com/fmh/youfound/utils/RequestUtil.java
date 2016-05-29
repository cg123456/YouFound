package com.fmh.youfound.utils;

import javax.servlet.http.HttpServletRequest;

import com.fmh.youfound.entity.Address;
import com.fmh.youfound.entity.HouseType;
import com.fmh.youfound.entity.PublishLeaseHouse;

/** 
* @author  作者 E-mail: fmuhai@foxmail.com
* @date 创建时间：2016年5月28日 下午4:32:34 
* @version 1.0 
*/
public class RequestUtil {
	
	public static String[] RENT_TYPE = {"alone","整租","share","合租","short","短租"};
	public static String[] FITMENT_TYPE = {"gorgeousness","豪华装修","perfect","精装修",
					"medium","中等装修","simpleness","简装修","rough","毛坯"};
	public static String[] FACE_TO = {"","南北","南","东南","东","东西","北","西","西南","东北","西北"};
	

	public static PublishLeaseHouse toPublishLeaseHouse(HttpServletRequest req) {
		
		Address address = new Address();
		address.setCity(req.getParameter("formCity"));
		address.setDistrict(req.getParameter("selectDistrict"));
		address.setComArea(req.getParameter("selectComArea"));
		address.setCommunity(req.getParameter("communityName"));
		address.setStreet(req.getParameter("communityAddress"));
		
		HouseType type = new HouseType();
		System.out.println(req.getParameter("roomNum"));
		type.setRoomNum(Integer.parseInt(req.getParameter("roomNum")));
		type.setHallNum(Integer.valueOf(req.getParameter("hallNum")));
		type.setToilet(Integer.valueOf(req.getParameter("toiletNum")));
		
		PublishLeaseHouse house = new PublishLeaseHouse();
		house.setLeaseType(getRentType(req.getParameter("rentType")));
		house.setHousingEstate(req.getParameter("communityName"));
		house.setAddress(address);
		house.setHouseType(type);
		house.setBuildArea(req.getParameter("buildingArea"));
		house.setFitment(getFitmentType(req.getParameter("fitmentType")));
		//house.setFaceTo(FACE_TO[Integer.parseInt(req.getParameter("direction"))]);
		house.setFaceTo(req.getParameter("direction"));

		house.setFloor(req.getParameter("floorLocation"));
		house.setTotalFloor(req.getParameter("floorTotal"));
		house.setBuildingNo(req.getParameter("buildNo")+"|"+
							req.getParameter("cellNo")+"|"+
							req.getParameter("roomNo"));
		house.setPrice(req.getParameter("price"));
		house.setPriceType("元/月");
		house.setPayDetail(req.getParameter("payType"));
		house.setEquipment(req.getParameter("equipmentValue"));
		house.setHouseTitle(req.getParameter("houseTitleContent"));
		house.setDescription(req.getParameter("comment"));
		house.setContactPerson(req.getParameter("houseOwnerName"));
		house.setContactNumber(req.getParameter("phoneNumberContent"));
		
		return house;
	}
	
	
	public static String getRentType(String type) {
		return type.equals(RENT_TYPE[0])? RENT_TYPE[1]:
			type.equals(RENT_TYPE[2])? RENT_TYPE[3]:RENT_TYPE[5];
	}
	
	public static String getFitmentType(String type) {
		for(int i=0;i<FITMENT_TYPE.length-1;i++) {
			if(type.equals(FITMENT_TYPE[i]))
				return FITMENT_TYPE[i+1];
		}
		return "";
	}
	
}

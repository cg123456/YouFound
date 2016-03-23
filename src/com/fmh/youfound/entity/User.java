package com.fmh.youfound.entity;
/** 
 * @author fengmuhai
 * @date 2016-3-23 下午4:35:01 
 * @version 1.0  
 */
public class User {
	
	public String id;
	
	/**
	 * 注册时需要的信息
	 */
	private String userName;
	private String passwprd;
	private String phoneNumber;
	private String email;
	
	
	/**
	 * 基本资料
	 */
	private String nickName;			//昵称
	private String avatar;				//头像
	private String gender;				//性别：0男；1女；3其他
	private String realName;			//真实姓名
	private String identityType;		//证件类型：0：身份证 ；1：学生在 2：军官证
	private String identityID;			//证件号号
	private String comefromArea;		//所在地区：省|市|县(区)，以"|"分隔；如："广东省|广州市|天河区"
	private String birthday;			//年月日，以|分隔：如， 1998|03|12
	private String educationStatus;		//教育程度
	private String career;				//职业
	
	
	
	
	/**
	 * 其他功能需要的信息
	 */
	

}

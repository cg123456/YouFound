package com.fmh.youfound.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

/** 
 * @author fengmuhai
 * @date 2016-3-23 下午4:35:01 
 * @version 1.0  
 */
@Entity
public class User {

	public Long id;
	
	/**
	 * 注册时需要的信息
	 */
	private String userName;
	private String passwprd;
	private String phoneNumber;
	private String email;
	
	public User(){}
	
	
	public User(String userName, String passwprd, String email, String phoneNumber) {
		super();
		this.userName = userName;
		this.passwprd = passwprd;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}
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


	@Id
	@GeneratedValue
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPasswprd() {
		return passwprd;
	}
	public void setPasswprd(String passwprd) {
		this.passwprd = passwprd;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getAvatar() {
		return avatar;
	}
	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getRealName() {
		return realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}
	public String getIdentityType() {
		return identityType;
	}
	public void setIdentityType(String identityType) {
		this.identityType = identityType;
	}
	public String getIdentityID() {
		return identityID;
	}
	public void setIdentityID(String identityID) {
		this.identityID = identityID;
	}
	public String getComefromArea() {
		return comefromArea;
	}
	public void setComefromArea(String comefromArea) {
		this.comefromArea = comefromArea;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getEducationStatus() {
		return educationStatus;
	}
	public void setEducationStatus(String educationStatus) {
		this.educationStatus = educationStatus;
	}
	public String getCareer() {
		return career;
	}
	public void setCareer(String career) {
		this.career = career;
	}
	
	
	
	
	/**
	 * 其他功能需要的信息
	 */
	

}

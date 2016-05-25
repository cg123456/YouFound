package com.fmh.youfound.dao;

import com.fmh.youfound.entity.User;

/** 
 * @author fengmuhai
 * @date 2016-5-24 上午9:50:59 
 * @version 1.0  
 */
public interface UserDaoNew {

	/**
	 * 根据用户名查找User
	 * @param userName
	 */
	User findByUserName(String userName);
	
	/**
	 * 通过Email查找用户
	 * @param email
	 */
	User findByEmail(String email);

	/**
	 * 通过phoneNumber查找用户
	 * @param email
	 */
	User findByPhone(String phoneNumber);
}

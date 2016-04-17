package com.fmh.youfound.dao;

import java.util.List;

import com.fmh.youfound.entity.User;

/** 
 * @author fengmuhai
 * @date 2016-3-24 上午10:22:43 
 * @version 1.0  
 */
public interface UserDao {

	/**
	 * 根据id加载user实例对象
	 */
	User get(Long id);
	
	/**
	 * 持久化user对象
	 */
	Integer save(User user);
	
	/**
	 * 删除一个user对象
	 */
	void delete(User user);
	
	/**
	 * 修改实例对象
	 * @param user
	 */
	void update(User user);
	
	/**
	 * 加载全部的user对象
	 */
	List<User> findAll();
	
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

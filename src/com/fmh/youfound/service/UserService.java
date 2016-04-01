package com.fmh.youfound.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.fmh.youfound.dao.UserDao;
import com.fmh.youfound.entity.User;


/**
 * @author fengmuhai
 * @Verson 创建时间：2015年9月14日上午11:39:31
 * @Comment 
 */
@Component("userService")
public class UserService {
	
	private UserDao userDao;
	
	public void addUser(User user){
		
		userDao.save(user);
	}
	
	public User getUser() {
		return userDao.get((long) 10);
	}
	

	public UserDao getUserDao() {
		return userDao;
	}
	@Resource(name="userDaoHTImpl")
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

}
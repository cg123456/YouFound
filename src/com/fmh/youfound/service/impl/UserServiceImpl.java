package com.fmh.youfound.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fmh.youfound.dao.UserDao;
import com.fmh.youfound.entity.User;
import com.fmh.youfound.service.UserService;

/** 
* @author  作者 E-mail: fmuhai@foxmail.com
* @date 创建时间：2016年4月3日 下午3:27:06 
* @version 1.0 
*/

//@Component("userService")
@Service("userServiceImpl")
@Transactional
public class UserServiceImpl implements UserService{

	private UserDao userDao;
	
	public UserDao getUserDao() {
		return userDao;
	}

	@Resource(name="userDaoSFImpl")
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	/**
	 * 添加用户
	 */
	@Override
	public void addUser(User user) {
		userDao.save(user);
	}

	@Override
	public boolean exsitPhone(String phoneNumber) {
		if(userDao.findByPhone(phoneNumber)==null) {
			return false;
		}
		return true;
	}

	@Override
	public boolean exsitEmail(String email) {
		if(userDao.findByEmail(email)==null)
			return false;
		return true;
	}

	@Override
	public User getUserByPhone(String phoneNumber) {
		return userDao.findByPhone(phoneNumber);
	}

	@Override
	public User getUserByEmail(String email) {
		return userDao.findByEmail(email);
	}

	@Override
	public User getUserByUsername(String username) {
		return userDao.findByUserName(username);
	}



}

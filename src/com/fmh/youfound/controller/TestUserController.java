package com.fmh.youfound.controller;

import java.util.Iterator;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fmh.youfound.dao.UserDao;
import com.fmh.youfound.entity.User;
import com.fmh.youfound.service.UserService;

/** 
* @author  作者 E-mail: fmuhai@foxmail.com
* @date 创建时间：2016年4月2日 下午11:07:26 
* @version 1.0 
*/
//@Controller
@RequestMapping("/test.do")
public class TestUserController {
	
	private UserService userService;
	private UserDao userDao;
	
	@RequestMapping(params="method=findAllUser")
	public String testFindAllUser() {
		List<User> list = userDao.findAll();
		Iterator<User> it = list.iterator();
		while(it.hasNext()) {
			User u = it.next();
			System.out.println("username:"+u.getUserName());
		}
		return "success";
	}
	
	@RequestMapping(params="method=findUserByEmail")
	public String testFindUserByEmail(String email) {
		User u = userDao.findByEmail(email);
		System.out.println("username:"+u.getUserName());
		return "success";
	}
	
	@RequestMapping(params="method=findUserByUser")
	public String testFindUserByUser(String user) {
		User u = userDao.findByEmail(user);
		System.out.println("username:"+u.getUserName());
		return "success";
	}

	
	
	public UserService getUserService() {
		return userService;
	}

	@Resource
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	public UserDao getUserDao() {
		return userDao;
	}

	@Resource(name="userDaoHTImpl")
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

}

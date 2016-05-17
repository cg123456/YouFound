package com.fmh.youfound.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.fmh.youfound.dao.UserDao;
import com.fmh.youfound.entity.User;
import com.fmh.youfound.service.LeaseHouseService;
import com.fmh.youfound.service.UserService;

/** 
 * @author fengmuhai
 * @date 2016-5-17 下午2:59:02 
 * @version 1.0  
 */

@RequestMapping("/leaseHouse")
@Controller
public class LeaseHouseController {

	@Resource(name="leaseHouseService")
	private LeaseHouseService leaseHouseService;

	public LeaseHouseService getLeaseHouseService() {
		return leaseHouseService;
	}

	public void setLeaseHouseService(LeaseHouseService leaseHouseService) {
		this.leaseHouseService = leaseHouseService;
	}

	
	private UserDao userDao;

	public UserDao getUserDao() {
		return userDao;
	}

	@Resource(name="userDaoImpl")
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
	public String showUsers(ModelMap map) {
		List<User> list = userDao.findAll();
		map.addAllAttributes(list);
		return "/showUserTest";
	}
	
	
}

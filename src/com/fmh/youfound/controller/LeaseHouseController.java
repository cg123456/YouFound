package com.fmh.youfound.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

@Controller
@RequestMapping("/leaseHouse/*")
public class LeaseHouseController {

	@Resource(name="leaseHouseServiceImpl")
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

	@Resource(name="userDaoHTImpl")
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
	@RequestMapping(params="method=test")
	public String showUsers(ModelMap map) {
		List<User> list = userDao.findAll();
		map.addAllAttributes(list);
		return "/showUserTest";
	}
	
	@RequestMapping(value="/show.do")
	public ModelAndView show(HttpServletRequest req) {
		System.out.println("执行了此方法！！！！！！！！！");
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/showUserTest");
		List<User> list = userDao.findAll();
		Map<String, User> map = new HashMap<String, User>();
		for(int i=0;i<list.size();i++) {
			map.put("user"+i, list.get(i));
			System.out.println("Username"+i+list.get(i).getUserName());
		}
		mv.addAllObjects(map);
		return mv;
	}
	
	
}

package com.fmh.youfound.controller;

import java.io.UnsupportedEncodingException;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.junit.runner.Request;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.fmh.youfound.dao.impl.PublishHouseDaoImpl;
import com.fmh.youfound.entity.PublishLeaseHouse;
import com.fmh.youfound.utils.RequestUtil;

/** 
* @author  作者 E-mail: fmuhai@foxmail.com
* @date 创建时间：2016年5月28日 下午4:03:10 
* @version 1.0 
*/
@Controller
@RequestMapping
public class PublishController {

	@Resource(name="publishHouseDaoImpl")
	private PublishHouseDaoImpl publishHouseDao;
	
	@RequestMapping(value="/publish.do", method={RequestMethod.POST})
	public String publish(HttpServletRequest req) throws UnsupportedEncodingException {
		req.setCharacterEncoding("UTF-8");//客户端网页我们控制为UTF-8
		PublishLeaseHouse house = RequestUtil.toPublishLeaseHouse(req);
		System.out.println("执行了后台的发布publish()方法！！");
		System.out.println(house);
		publishHouseDao.save(house);
		//return "/publishResult.html";
		return "/success.jsp";
	}
	
	public void uploadPicture() {
		
	}

	public PublishHouseDaoImpl getPublishHouseDao() {
		return publishHouseDao;
	}

	public void setPublishHouseDao(PublishHouseDaoImpl publishHouseDao) {
		this.publishHouseDao = publishHouseDao;
	}
	
	
	
}

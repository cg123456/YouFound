package com.fmh.youfound.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fmh.youfound.dao.UserDao;
import com.fmh.youfound.entity.User;


/**
 * @author fengmuhai
 * @Verson 创建时间：2015年9月14日上午11:39:31
 * @Comment 
 */
public interface UserService {

	void addUser(User user);

	/**
	 * 判断是否存在该手机号
	 * @return
	 */
	boolean exsitPhone(String phoneNumber);

	/**
	 * 判断是否存在邮箱
	 * @param email
	 * @return
	 */
	boolean exsitEmail(String email);


}

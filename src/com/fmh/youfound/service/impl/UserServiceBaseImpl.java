package com.fmh.youfound.service.impl;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fmh.youfound.dao.UserDaoNew;
import com.fmh.youfound.entity.User;
import com.fmh.youfound.service.UserService;
import com.youfound.base.dao.BaseDao;
import com.youfound.base.service.BaseServiceImpl;

/** 
 * @author fengmuhai
 * @date 2016-5-24 上午10:06:37 
 * @version 1.0  
 */
@Transactional
@Service(value="userServiceBaseImpl")
public class UserServiceBaseImpl extends BaseServiceImpl<User> implements UserService {
	
	@Resource(name="userDaoBaseImpl")
	private UserDaoNew userDaoNew;

	@Autowired(required = true)
	public UserServiceBaseImpl(@Qualifier(value="userDaoBaseImpl") BaseDao<User> userDao) {
		super(userDao);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void addUser(User user) {
		this.save(user);
	}

	@Override
	public boolean exsitPhone(String phoneNumber) {
		return userDaoNew.findByPhone(phoneNumber)==null?
				false:true;
	}

	@Override
	public boolean exsitEmail(String email) {
		return userDaoNew.findByPhone(email)==null?
				false:true;
	}

	@Override
	public User getUserByPhone(String phoneNumber) {
		return userDaoNew.findByPhone(phoneNumber);
	}

	@Override
	public User getUserByEmail(String email) {
		return userDaoNew.findByEmail(email);
	}

	@Override
	public User getUserByUsername(String username) {
		return userDaoNew.findByUserName(username);
	}

}

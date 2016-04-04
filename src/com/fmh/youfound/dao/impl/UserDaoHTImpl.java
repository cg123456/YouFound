package com.fmh.youfound.dao.impl;

import java.util.Iterator;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import com.fmh.youfound.dao.UserDao;
import com.fmh.youfound.entity.User;

/** 
 * 使用HibernateTemplate的实现
 * @author fengmuhai
 * @date 2016-4-1 下午3:31:35 
 * @version 1.0  
 */
//@Component("userDaoHTImpl")
@Controller("userDaoHTImpl")
public class UserDaoHTImpl implements UserDao {
	
	private HibernateTemplate hibernateTemplate;	

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	@Resource//(name="hibernateTemplate")  
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	/**
	 * 根据id加载user实例对象
	 */
	@Override
	public User get(Long id) {
		return (User) hibernateTemplate.get(User.class, id);
	}
	
	/**
	 * 持久化user对象
	 */
	@Override
	public Integer save(User user) {
		this.getHibernateTemplate().save(user);
		//hibernateTemplate.save(user);
		return 0;
	}
	
	/**
	 * 删除一个user对象
	 */
	@Override
	public void delete(User user) {
		hibernateTemplate.delete(user);
	}
	
	/**
	 * 修改实例对象
	 * @param user
	 */
	@Override
	public void update(User user) {
		hibernateTemplate.update(user);
	}
	
	/**
	 * 加载全部的user对象
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<User> findAll() {
		return (List<User>) hibernateTemplate.find("from User");
	}
	
	/**
	 * 根据用户名查找User
	 * @param userName
	 */
	@Override
	public User findByUserName(String userName) {
		@SuppressWarnings("unchecked")
		List<User> list = (List<User>) hibernateTemplate
				.find("from User as u where u.userName=?", userName);
		if(list.isEmpty())
			return null;
		return list.get(0);

	}
	
	/**
	 * 通过Email查找用户
	 * @param email
	 */
	@Override
	public User findByEmail(String email) {
		@SuppressWarnings("unchecked")
		List<User> list = (List<User>) hibernateTemplate
				.find("from User as u where u.email=?", email);
		if(list.isEmpty())
			return null;
		return list.get(0);	
	}
	
	/**
	 * 通过PhoneNumber查找用户
	 * @param email
	 */
	@Override
	public User findByPhone(String phoneNumber) {
		@SuppressWarnings("unchecked")
		List<User> list = (List<User>) hibernateTemplate
				.find("from User as u where u.phoneNumber=?", phoneNumber);
		if(list.isEmpty())
			return null;
		return list.get(0);
			
	}
	
}

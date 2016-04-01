package com.fmh.youfound.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.fmh.youfound.dao.UserDao;
import com.fmh.youfound.entity.User;

/** 
 * 使用HibernateTemplate的实现
 * @author fengmuhai
 * @date 2016-4-1 下午3:31:35 
 * @version 1.0  
 */
@Component("userDaoHTImpl")
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
		System.out.println("调用UserDaoHTImpl的save()方法");
		System.out.println("user:"+user.getUserName());
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
	@Override
	public List<User> findAll() {
		List<User> list = (List<User>) hibernateTemplate.find("from User");
		return list;
	}
	
	/**
	 * 根据用户名查找User
	 * @param userName
	 */
	@Override
	public User findByUserName(String userName) {
		return (User) hibernateTemplate.find("from User as u where u.userName=?", userName);
	}
	
	/**
	 * 通过Email查找用户
	 * @param email
	 */
	@Override
	public User findByEmail(String email) {
		return (User) hibernateTemplate.find("from User ad u where u.email=?", email);
			
	}
	
}

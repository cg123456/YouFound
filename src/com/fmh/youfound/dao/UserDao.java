package com.fmh.youfound.dao;

import javax.annotation.Resource;

import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.fmh.youfound.entity.User;

/** 
 * @author fengmuhai
 * @date 2016-3-24 上午10:22:43 
 * @version 1.0  
 */
@Component
public class UserDao {

	private HibernateTemplate hibernateTemplate;
	
	public void save(User user) {
		hibernateTemplate.save(user);
	}

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	@Resource  
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
}

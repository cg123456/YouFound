package com.fmh.youfound.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.fmh.youfound.dao.UserDaoNew;
import com.fmh.youfound.entity.User;
import com.youfound.base.dao.BaseDaoImpl;
import com.youfound.base.util.query.CriteriaQuery;

/** 
 * @author fengmuhai
 * @date 2016-5-24 上午9:42:28 
 * @version 1.0  
 */
@Repository(value="userDaoBaseImpl")
public class UserDaoBaseImpl<O> extends BaseDaoImpl<User>{


	/*@Override
	public User findByUserName(String userName) {
		CriteriaQuery cq = new CriteriaQuery(User.class, this.getSessionFactory().getCurrentSession());
		cq.eq("userName", userName);	//字段名要和声明的类的属性名一样
		List<User> list = this.search(cq);
		if(list==null || list.size()==0){
			return null;
		}
		return (User)list.get(0);
	}

	@Override
	public User findByEmail(String email) {
		CriteriaQuery cq = new CriteriaQuery(User.class, this.getSessionFactory().getCurrentSession());
		cq.eq("email", email);	//字段名要和声明的类的属性名一样
		List<User> list = this.search(cq);
		if(list==null || list.size()==0){
			return null;
		}
		return (User)list.get(0);
	}

	@Override
	public User findByPhone(String phoneNumber) {
		CriteriaQuery cq = new CriteriaQuery(User.class, this.getSessionFactory().getCurrentSession());
		cq.eq("phoneNumber", phoneNumber);	//字段名要和声明的类的属性名一样
		List<User> list = this.search(cq);
		if(list==null || list.size()==0){
			return null;
		}
		return (User)list.get(0);
	}*/

}

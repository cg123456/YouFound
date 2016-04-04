package com.fmh.youfound.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.fmh.youfound.dao.UserDao;
import com.fmh.youfound.entity.User;

/** 
 * 使用HinernateTemplate的sessionFactory实现
 * @author fengmuhai
 * @date 2016-4-1 下午3:58:51 
 * @version 1.0  
 * 
 * 
 * 使用@Repository,@Service,@Controller会有更好的针对性，便于切面编程
 * but by annotating them with @Repository, @Service, or @Controller instead, 
 * your classes are more properly suited for processing by tools or associating with aspects.
 */ 


//@Component("userDaoSFImpl")
@Repository("userDaoSFImpl")
public class UserDaoSFImpl implements UserDao{
	
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	@Resource(name="sessionFactory")
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public User get(Long id) {
		//Session session = sessionFactory.getCurrentSession();
		return (User) sessionFactory.getCurrentSession().get(User.class, id);
	}

	@Override
	public Integer save(User user) {
		sessionFactory.getCurrentSession().save(user);
		return 0;
	}

	@Override
	public void delete(User user) {
		sessionFactory.getCurrentSession().delete(user);		
	}

	@Override
	public void update(User user) {
		sessionFactory.getCurrentSession().update(user);		
	}

	
	@Override
	@SuppressWarnings("unchecked")
	public List<User> findAll() {
		return (List<User>) sessionFactory.getCurrentSession()
				.createQuery("from User").list();
	}

	@Override
	public User findByUserName(String userName) {
		//return sessionFactory.getCurrentSession().createCriteria("form User as u where u.username=?",userName);
		/*Query query = this.session.createQuery("from User as u where u.userName=?").setParameter(0, userName);
		return (User) query.list().get(0);*/
		return (User) sessionFactory.getCurrentSession()
				.createQuery("from User as u where u.userName=?")
				.setParameter(0,userName)
				.list().get(0);
	}

	@Override
	public User findByEmail(String email) {
		/*return sessionFactory.getCurrentSession()
		.createCriteria("form User as u where u.email=?",email);*/
		
		return (User) sessionFactory.getCurrentSession()
				.createQuery("from User as u where u.email=?")
				.setParameter(0, email)
				.list().get(0);
	}

	@Override
	public User findByPhone(String phoneNumber) {
		// TODO Auto-generated method stub
		return null;
	}


	
	

}

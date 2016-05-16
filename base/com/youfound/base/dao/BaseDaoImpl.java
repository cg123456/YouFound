package com.youfound.base.dao;

import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

import com.fmh.youfound.entity.User;
import com.youfound.base.entity.BaseObject;
import com.youfound.base.util.GenericsUtil;
import com.youfound.base.util.query.CriteriaQuery;

/** 
 * @author fengmuhai
 * @date 2016-5-16 下午4:56:22 
 * @version 1.0  
 */
public class BaseDaoImpl<O extends BaseObject> implements BaseDao<O> {

	protected Class<O> oType;
	private Logger logger;
	
	private SessionFactory sessionFactory;
	
	public BaseDaoImpl(Class<O> oType) {
		this.oType = oType;
		logger = Logger.getLogger(oType.getSimpleName()+"DAOImpl");
	}
	
	@SuppressWarnings("unchecked")
	public BaseDaoImpl() {
		//使用反射获取定义时的类型
		this.oType = GenericsUtil.getSuperClassGenricType(oType);
		this.logger = Logger.getLogger(oType);
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	@Resource(name="sessionFactory")
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public void log(long startTime) {
		long useTime = (System.currentTimeMillis() - startTime);
		if(useTime > 5000){
			logger.error("sqlend " + useTime / 1000 + " " + useTime);
		} else if(useTime > 1000){
			logger.warn("sqlend " + useTime / 1000 + " " + useTime);
		} else {
			logger.info("sqlend " + useTime / 1000 + " " + useTime);
		}
	}
	
	

	@Override
	public Object get(Class<O> c, long id) {
		// TODO Auto-generated method stub
		
		return null;
	}

	@Override
	public boolean save(Object obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Object obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Object obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<O> findAll() {
		// TODO Auto-generated method stub
		String cls = this.oType.getSimpleName();
		return (List<O>) sessionFactory.getCurrentSession()
				.createQuery("from "+cls).list();
	}
	

	@Override
	public List<O> search(CriteriaQuery cq) {
		// TODO Auto-generated method stub
		Criteria crit = sessionFactory.getCurrentSession().createCriteria(oType);
		crit.setMaxResults(50);
		List cats = crit.list();
		//cats.add(Restrictions.eq(propertyName, value));
		return null;
	}


	public Logger getLogger() {
		return logger;
	}


	public void setLogger(Logger logger) {
		this.logger = logger;
	}

}

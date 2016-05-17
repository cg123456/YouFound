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
	public Object get(Class<O> cls, long id) {
		return sessionFactory.getCurrentSession().get(cls, id);
	}

	@Override
	public void save(Object obj) {
		sessionFactory.getCurrentSession().save(obj);
	}

	@Override
	public void delete(Object obj) {
		sessionFactory.getCurrentSession().delete(obj);
	}

	@Override
	public void update(Object obj) {
		sessionFactory.getCurrentSession().update(obj);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<O> findAll() {
		String cls = this.oType.getSimpleName();
		return (List<O>) sessionFactory.getCurrentSession()
				.createQuery("from "+cls).list();
	}
	

	@SuppressWarnings("unchecked")
	@Override
	public List<O> search(CriteriaQuery cq) {
		logger.info("search:" + cq.getCriteria().toString());
		Criteria crit = cq.getCriteria();
		return crit.list();
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<O> search(CriteriaQuery cq, int page, int pageSize) {
		logger.info("search:" + cq.getCriteria().toString());
		Criteria crit = cq.getCriteria();
		crit.setFirstResult(page * pageSize);
        crit.setMaxResults(pageSize);
		return crit.list();
	}


	public Logger getLogger() {
		return logger;
	}


	public void setLogger(Logger logger) {
		this.logger = logger;
	}

}

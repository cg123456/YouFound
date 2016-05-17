package com.youfound.base.util.query;

import org.apache.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

/** 
 * @author fengmuhai
 * @date 2016-5-16 下午5:52:32 
 * @version 1.0  
 */
public class CriteriaQuery {


	private Logger logger = Logger.getLogger(CriteriaQuery.class);
	private Criteria criteria;
	private Class cls;
	
	public CriteriaQuery(Class cls, Session session) {
		this.cls = cls;
		this.criteria = session.createCriteria(cls);
	}
	
	public CriteriaQuery eq(String propertyName, Object value) {
		criteria.add(Restrictions.eq(propertyName, value));
		return this;
	}
	
	public CriteriaQuery ge(String propertyName, Object value) {
		criteria.add(Restrictions.ge(propertyName, value));
		return this;
	}
	
	public CriteriaQuery gt(String propertyName, Object value) {
		criteria.add(Restrictions.gt(propertyName, value));
		return this;
	}
	
	public CriteriaQuery le(String propertyName, Object value) {
		criteria.add(Restrictions.le(propertyName, value));
		return this;
	}
	
	public CriteriaQuery lt(String propertyName, Object value) {
		criteria.add(Restrictions.lt(propertyName, value));
		return this;
	}

	public Logger getLogger() {
		return logger;
	}

	public void setLogger(Logger logger) {
		this.logger = logger;
	}

	public Criteria getCriteria() {
		return criteria;
	}

	public void setCriteria(Criteria criteria) {
		this.criteria = criteria;
	}

	public Class getCls() {
		return cls;
	}

	public void setCls(Class cls) {
		this.cls = cls;
	}
	
}

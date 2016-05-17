package com.youfound.base.dao;

import java.util.List;

import org.hibernate.ejb.criteria.CriteriaQueryImpl;

import com.fmh.youfound.entity.User;
import com.youfound.base.util.query.CriteriaQuery;

/** 
 * @author fengmuhai
 * @date 2016-5-16 下午4:17:57 
 * @version 1.0  
 */
public interface BaseDao<O> {

	/**
	 * 根据id加载Object实例对象
	 */
	Object get(Class<O> c, long id);
	
	/**
	 * 持久化Object对象
	 */
	void save(Object obj);
	
	/**
	 * 删除一个Object对象
	 */
	void delete(Object obj);
	
	/**
	 * 修改实例对象
	 * @param obj
	 */
	void update(Object obj);
	
	/**
	 * 加载全部的Object对象
	 */
	List<O> findAll();
	
	/**
	 * 通用搜索
	 */
	List<O> search(CriteriaQuery cq);

	//分页查询
	List<O> search(CriteriaQuery cq, int page, int pageSize);
	
}

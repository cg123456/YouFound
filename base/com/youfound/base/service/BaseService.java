package com.youfound.base.service;

import java.util.List;

import com.youfound.base.entity.BaseObject;
import com.youfound.base.util.query.CriteriaQuery;

/** 
 * @author fengmuhai
 * @date 2016-5-17 上午10:55:08 
 * @version 1.0  
 */
public interface BaseService<O extends BaseObject> {
	
	Object findById(Class<O> cls, Long id);
	void save(Object object);
	void update(Object object);
	void delete(Object object);
	List<O> search(CriteriaQuery qc);
	List<O> search(CriteriaQuery qc, Integer pageSize, Integer page);
	
}

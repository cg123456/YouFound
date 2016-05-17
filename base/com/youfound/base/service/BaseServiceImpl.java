package com.youfound.base.service;

import java.util.List;

import org.apache.log4j.Logger;

import com.youfound.base.dao.BaseDao;
import com.youfound.base.entity.BaseObject;
import com.youfound.base.util.GenericsUtil;
import com.youfound.base.util.query.CriteriaQuery;

/** 
 * @author fengmuhai
 * @date 2016-5-17 上午11:14:41 
 * @version 1.0  
 */
public class BaseServiceImpl<O extends BaseObject> implements BaseService<O> {
	
	private BaseDao<O> dao;
	private Logger logger;
	public BaseServiceImpl(BaseDao<O> dao){
		this.setDao(dao);
		Class<O> oType = GenericsUtil.getSuperClassGenricType(getClass());
		logger = Logger.getLogger(oType.getSimpleName()+"ServiceImpl");
	}
	
	public Logger getLogger(){
		return this.logger;
	}

	@Override
	public Object findById(Class<O> cls, Long id) {
		return dao.get(cls, id);
	}

	@Override
	public void save(Object object) {
		this.dao.save(object);
	}

	@Override
	public void update(Object object) {
		this.dao.update(object);
	}

	@Override
	public void delete(Object object) {
		this.dao.delete(object);
	}

	@Override
	public List<O> search(CriteriaQuery cq) {
		return dao.search(cq);
	}

	@Override
	public List<O> search(CriteriaQuery cq, Integer pageSize, Integer page) {
		// TODO Auto-generated method stub
		return dao.search(cq, page, pageSize);
	}

	public BaseDao<O> getDao() {
		return dao;
	}

	public void setDao(BaseDao<O> dao) {
		this.dao = dao;
	}

	
}

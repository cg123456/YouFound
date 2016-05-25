package com.fmh.youfound.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.fmh.youfound.entity.LeaseHouse;
import com.fmh.youfound.service.LeaseHouseService;
import com.youfound.base.dao.BaseDao;
import com.youfound.base.service.BaseServiceImpl;

/** 
 * @author fengmuhai
 * @date 2016-5-17 上午11:26:12 
 * @version 1.0  
 */
@Service(value="leaseHouseServiceImpl")
public class LeaseHouseServiceImpl extends BaseServiceImpl<LeaseHouse> 
		implements LeaseHouseService {
	
	@Autowired(required = true)
	public LeaseHouseServiceImpl(@Qualifier(value="leaseHouseDao")BaseDao<LeaseHouse> dao) {
		super(dao);
	}

}

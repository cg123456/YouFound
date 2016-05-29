package com.fmh.youfound.dao.impl;

import org.springframework.stereotype.Repository;

import com.fmh.youfound.dao.LeaseHouseDao;
import com.fmh.youfound.entity.LeaseHouse;
import com.youfound.base.dao.BaseDao;
import com.youfound.base.dao.BaseDaoImpl;

/** 
 * @author fengmuhai
 * @date 2016-5-24 上午11:15:21 
 * @version 1.0  
 */
@Repository(value="leaseHouseDaoImpl")
public class LeaseHouseDaoImpl extends BaseDaoImpl<LeaseHouse> implements LeaseHouseDao {

}

package com.fmh.youfound.dao.impl;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.fmh.youfound.dao.PublishHouseDao;
import com.fmh.youfound.entity.PublishLeaseHouse;
import com.youfound.base.dao.BaseDaoImpl;

/** 
* @author  作者 E-mail: fmuhai@foxmail.com
* @date 创建时间：2016年5月28日 下午4:07:43 
* @version 1.0 
*/
@Repository(value="publishHouseDaoImpl")
public class PublishHouseDaoImpl<O> extends BaseDaoImpl<PublishLeaseHouse>
			implements PublishHouseDao {

	
}

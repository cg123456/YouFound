package com.fmh.youfound.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fmh.youfound.entity.PublishLeaseHouse;
import com.fmh.youfound.service.PublishHouseService;
import com.youfound.base.dao.BaseDao;
import com.youfound.base.service.BaseServiceImpl;

/** 
* @author  作者 E-mail: fmuhai@foxmail.com
* @date 创建时间：2016年5月28日 下午4:22:24 
* @version 1.0 
*/
@Transactional
@Service(value="publishHouseServiceImpl")
public class PublishHouseServiceImpl extends BaseServiceImpl<PublishLeaseHouse> 
				implements PublishHouseService {

	@Autowired(required=true)
	public PublishHouseServiceImpl(@Qualifier(value="publishHouseDaoImpl") BaseDao<PublishLeaseHouse> dao) {
		super(dao);
		// TODO Auto-generated constructor stub
	}
	
	

}

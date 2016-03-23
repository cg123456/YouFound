package com.fmh.youfound.entity;

import com.soufang.leasehouse.entity.AgentIDList;
import com.soufang.leasehouse.entity.CommentList;
import com.soufang.leasehouse.entity.CommentListNew;

/** 
* @author  作者 E-mail: fmuhai@foxmail.com
* @date 创建时间：2016年3月13日 上午2:23:05 
* @version 1.0 
*/

public class YFLeaseHouse {

	private String id;
	private String sourceId;
	
	private String titleImage;		//标题图片路径
	private String houseTitle;		//显示标题
	private String houseStatus;		//房屋状态
	private String insertTime;		//发布时间
	private String updateTime;		//更新时间

	private String price;			//租金
	private String priceType;		//租金类型
	private String payDetail;		//房租支付细节，如：押一付二
	private String leaseType;		//出租类型，整租，月租，合租，短租等
	
	private String purpose;			//用途，住宅，商业等
	private Address address;		//地址：哪个城市，哪个区，路，具体地址，以及经度和纬度
	
	private String projectCode;		//工程代号
	private String projectName;
	
	private HouseType hourseType;	//三房一厅两卫一厨等
	
	//location
	private String floor;			//楼层
	private String totalFloor;		//总楼层
	private String floorPosition;	//低层/13
	private String faceTo;			//朝向
	
	
	private String buildArea;		//房屋面积
	private String fitment;			//装修类型
	private String equipment;		//配套设施
	
	//图片
	private String photoCount;		//图片数量
	private String phtotUrl;
	private String shinImgs;		//不知道是什么图片
	private String xqImgs;			//以"|"分隔
	private String hxImgs;
	private String qjImgs;
	
	private String phone400;		//4008903341转196082
	private String ownerName;		//户主姓名
	private String ownerPhone400;
	private AgentIDList agentIDList;
	
	private String isFiredHouse;	//是否解除租赁？
	private String linkurl;
	
	private String aroundService;	//周边服务设施
	private String traffic_other;	//其他交通（公交）
	private String subline;			//地铁线
	private String subwayStation;	//地铁站
	private String subwayDistance;	//距离
	
	private CommentList commentList;
	private CommentListNew commentListNew;
	
	
}

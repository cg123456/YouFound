package com.soufang.salehouse.entity;

import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

/** 
* @author  作者 E-mail: fmuhai@foxmail.com
* @date 创建时间：2016年3月15日 上午12:05:49 
* @version 1.0 
*/
@XStreamAlias("bbspostlist")
public class BbsPostList {

	@XStreamImplicit(itemFieldName="singlepost")
	private List<SinglePost> singlepost;

	public List<SinglePost> getSinglepost() {
		return singlepost;
	}

	public void setSinglepost(List<SinglePost> singlepost) {
		this.singlepost = singlepost;
	}

	@Override
	public String toString() {
		StringBuilder bbspostlist = new StringBuilder("BbsPostList [");
		if(singlepost != null){
			for(int i=0;i<singlepost.size();i++) {
				bbspostlist.append(singlepost.get(i).toString());
			}
		}
		bbspostlist.append("]");
		return bbspostlist.toString();
	}
}

package com.soufang.zufang.entity;

import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamImplicit;

/** 
* @author  作者 E-mail: fmuhai@foxmail.com
* @date 创建时间：2016年3月13日 下午9:04:54 
* @version 1.0 
*/
public class CommentList {

	@XStreamImplicit(itemFieldName="LeaseHouseCommentDetailDto")
	private List<LeaseHouseCommentDetailDto> LeaseHouseCommentDetailDto;

	public List<LeaseHouseCommentDetailDto> getLeaseHouseCommentDetailDto() {
		return LeaseHouseCommentDetailDto;
	}

	public void setLeaseHouseCommentDetailDto(List<LeaseHouseCommentDetailDto> leaseHouseCommentDetailDto) {
		LeaseHouseCommentDetailDto = leaseHouseCommentDetailDto;
	}
	
	@Override
	public String toString() {
		if(LeaseHouseCommentDetailDto==null || LeaseHouseCommentDetailDto.size()==0) {
			return "";
		}
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<LeaseHouseCommentDetailDto.size();i++) {
			sb.append(LeaseHouseCommentDetailDto.get(i).toString());
		}
		return sb.toString();
	}
}
package com.soufang.zufang.entity;

import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

/** 
* @author  作者 E-mail: fmuhai@foxmail.com
* @date 创建时间：2016年3月13日 下午9:11:17 
* @version 1.0 
*/
@XStreamAlias("CommentListNew")
public class CommentListNew {
	
	@XStreamImplicit(itemFieldName="CommentDetailApiDTO")
	private List<CommentDetailApiDTO> CommentDetailApiDTO;

	public List<CommentDetailApiDTO> getCommentListNew() {
		return CommentDetailApiDTO;
	}

	public void setCommentListNew(List<CommentDetailApiDTO> CommentDetailApiDTO) {
		this.CommentDetailApiDTO = CommentDetailApiDTO;
	}
	
	@Override
	public String toString() {
		if(CommentDetailApiDTO==null) {
			return "";
		}
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<CommentDetailApiDTO.size();i++) {
			sb.append(CommentDetailApiDTO.get(i).toString());
		}
		return sb.toString();
	}
}

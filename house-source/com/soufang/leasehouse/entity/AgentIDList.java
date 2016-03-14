package com.soufang.leasehouse.entity;

import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamImplicit;

/** 
* @author  作者 E-mail: fmuhai@foxmail.com
* @date 创建时间：2016年3月13日 下午9:08:47 
* @version 1.0 
*/
public class AgentIDList {
	@XStreamImplicit(itemFieldName="AgentID")	//加上这个注解表示指明List下的标签是“AgentID”，否则会报错
	private List<String> AgentID;

	public List<String> getAgentID() {
		return AgentID;
	}

	public void setAgentID(List<String> agentID) {
		AgentID = agentID;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		if(AgentID != null) {
			for(int i=0;i<AgentID.size();i++) {
				sb.append(AgentID.get(i));
				sb.append('|');
			}
		}
		return sb.toString();
	}
}

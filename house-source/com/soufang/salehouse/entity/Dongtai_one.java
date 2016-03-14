package com.soufang.salehouse.entity;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/** 
* @author  作者 E-mail: fmuhai@foxmail.com
* @date 创建时间：2016年3月15日 上午2:06:14 
* @version 1.0 
*/
@XStreamAlias("dongtai_one")
public class Dongtai_one {

	private String title;
	private String content;
	private String registdate;

	public Dongtai_one() {}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getRegistdate() {
		return registdate;
	}

	public void setRegistdate(String registdate) {
		this.registdate = registdate;
	}

	@Override
	public String toString() {
		return "Dongtai_one [title=" + title + ", content=" + content + ", registdate=" + registdate + "]";
	}
	
	
}

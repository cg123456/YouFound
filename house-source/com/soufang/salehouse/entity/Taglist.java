package com.soufang.salehouse.entity;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/** 
* @author  作者 E-mail: fmuhai@foxmail.com
* @date 创建时间：2016年3月15日 上午2:15:10 
* @version 1.0 
*/
@XStreamAlias("taglist")
public class Taglist {

	private String tag_0;
	private String tag_1;
	private String tag_2;
	private String tag_3;
	
	public Taglist() {}

	public String getTag_0() {
		return tag_0;
	}

	public void setTag_0(String tag_0) {
		this.tag_0 = tag_0;
	}

	public String getTag_1() {
		return tag_1;
	}

	public void setTag_1(String tag_1) {
		this.tag_1 = tag_1;
	}

	public String getTag_2() {
		return tag_2;
	}

	public void setTag_2(String tag_2) {
		this.tag_2 = tag_2;
	}

	public String getTag_3() {
		return tag_3;
	}

	public void setTag_3(String tag_3) {
		this.tag_3 = tag_3;
	}

	@Override
	public String toString() {
		return "Taglist [tag_0=" + tag_0 + ", tag_1=" + tag_1 + ", tag_2=" + tag_2 + ", tag_3=" + tag_3 + "]";
	}
	
}

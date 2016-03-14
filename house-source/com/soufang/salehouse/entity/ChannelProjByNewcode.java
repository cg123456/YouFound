package com.soufang.salehouse.entity;
/** 
* @author  作者 E-mail: fmuhai@foxmail.com
* @date 创建时间：2016年3月15日 上午2:17:03 
* @version 1.0 
*/
public class ChannelProjByNewcode {

	private String resultCode;
	private String resultMsg;
	
	
	public String getResultCode() {
		return resultCode;
	}
	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}
	public String getResultMsg() {
		return resultMsg;
	}
	public void setResultMsg(String resultMsg) {
		this.resultMsg = resultMsg;
	}
	
	@Override
	public String toString() {
		return "ChannelProjByNewcode [resultCode=" + resultCode + ", resultMsg=" + resultMsg + "]";
	}
	
	
}

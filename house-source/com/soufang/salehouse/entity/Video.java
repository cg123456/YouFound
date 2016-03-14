package com.soufang.salehouse.entity;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/** 
* @author  作者 E-mail: fmuhai@foxmail.com
* @date 创建时间：2016年3月15日 上午12:25:59 
* @version 1.0 
*/
@XStreamAlias("video")
public class Video {

	private String vid;
	private String newcode;
	private String title;
	private String pic_url;
	private String video_url;
	private String video_url_mp4;
	private String time_len;
	private String play_num;
	private String registdate;
	
	
	public String getVid() {
		return vid;
	}
	public void setVid(String vid) {
		this.vid = vid;
	}
	public String getNewcode() {
		return newcode;
	}
	public void setNewcode(String newcode) {
		this.newcode = newcode;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getPic_url() {
		return pic_url;
	}
	public void setPic_url(String pic_url) {
		this.pic_url = pic_url;
	}
	public String getVideo_url() {
		return video_url;
	}
	public void setVideo_url(String video_url) {
		this.video_url = video_url;
	}
	public String getVideo_url_mp4() {
		return video_url_mp4;
	}
	public void setVideo_url_mp4(String video_url_mp4) {
		this.video_url_mp4 = video_url_mp4;
	}
	public String getTime_len() {
		return time_len;
	}
	public void setTime_len(String time_len) {
		this.time_len = time_len;
	}
	public String getPlay_num() {
		return play_num;
	}
	public void setPlay_num(String play_num) {
		this.play_num = play_num;
	}
	public String getRegistdate() {
		return registdate;
	}
	public void setRegistdate(String registdate) {
		this.registdate = registdate;
	}
	
	@Override
	public String toString() {
		return "Video [vid=" + vid + ", newcode=" + newcode + ", title=" + title + ", pic_url=" + pic_url
				+ ", video_url=" + video_url + ", video_url_mp4=" + video_url_mp4 + ", time_len=" + time_len
				+ ", play_num=" + play_num + ", registdate=" + registdate + "]";
	}
	
}

package com.soufang.salehouse.entity;

import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

/** 
* @author  作者 E-mail: fmuhai@foxmail.com
* @date 创建时间：2016年3月15日 上午12:24:40 
* @version 1.0 
*/
@XStreamAlias("videos")
public class Videos {

	@XStreamImplicit(itemFieldName="video")
	private List<Video> video;

	public List<Video> getVideo() {
		return video;
	}

	public void setVideo(List<Video> video) {
		this.video = video;
	}

	@Override
	public String toString() {
		StringBuilder videos = new StringBuilder("BbsPostList [");
		if(video!=null){
			for(int i=0;i<video.size();i++) {
				videos.append(video.get(i).toString());
			}
		}
		videos.append("]");
		return videos.toString();
	}
}

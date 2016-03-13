package com.fmh.youfound.utils;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import com.fmh.youfound.source.entity.LeaseHouseSource;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

/** 
* @author  作者 E-mail: fmuhai@foxmail.com
* @date 创建时间：2016年3月13日 下午6:19:01 
* @version 1.0 
*/
public class XmlUtils {
	
	public static void main(String[] args) {
		//String str = xmlFileToString("src/com/fmh/youfound/source/xml/leasehouse-zufang.com-2.xml");
		LeaseHouseSource lhs = (LeaseHouseSource) toBean(new File("src/com/fmh/youfound/source/xml/搜房网租房1.xml"),LeaseHouseSource.class);
		//LeaseHouseSource lhs = (LeaseHouseSource) toBean(str,LeaseHouseSource.class);

		System.out.println(lhs.toString());
	}
	
	/**
	 * xml字符串转对象
	 * @param xmlStr	xml字符串
	 * @param cls		要转成的类
	 * @return			该类的尸体对象
	 */
	public static <T> T toBean(String xmlStr, Class<T> cls) {
		XStream xstream = new XStream(new DomDriver());
		xstream.processAnnotations(cls);
		@SuppressWarnings("unchecked")
		T t = (T) xstream.fromXML(xmlStr);
		return t;
	}
	
	/**
	 * xml文件转对象
	 * @param xmlFile	xml文件
	 * @param cls		要转成的类
	 * @return			该类的尸体对象
	 */
	public static <T> T toBean(File xmlFile, Class<T> cls) {
		XStream xstream = new XStream(new DomDriver());
		xstream.processAnnotations(cls);
		@SuppressWarnings("unchecked")
		T t = (T) xstream.fromXML(xmlFile);
		return t;
	}

	/**
	 * 将xml文件读取转化成String
	 * @param path
	 * @return
	 */
	public static String xmlFileToString(String path) {
		if(path==null || path.equals("")) {
			return "";
		}
		FileReader reader = null;
		StringBuilder sb = new StringBuilder();
		try {
			reader = new FileReader(path);
			int ch = 0;
			while((ch=reader.read())!=-1) {
				sb.append((char)ch);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		return sb.toString();
	}
}
 
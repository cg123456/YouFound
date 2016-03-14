package com.fmh.youfound.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;


/** 
* @author fengmuhai
* @date 2016年1月22日 上午10:22:22 
* @version 1.0  
*/
public class XmlUtil {
	
	public static void main(String[] args) {
		String src = xmlFileToString("src/com/fmh/youfound/source/xml/leasehouse-zufang.com-2.xml");
		System.out.println(src);
	}

	/**
	 * xml字符串转对象
	 * @param xmlStr
	 * @param cls
	 * @return
	 */
	/*public static <T> T toBean(String xmlStr, Class<T> cls) {
		XStream xstream = new XStream(new DomDriver());
		xstream.processAnnotations(cls);
		@SuppressWarnings("unchecked")
		T t = (T) xstream.toXML(xmlStr);
		return t;
		
	}*/
	
	public static <T> T toBean(String xmlStr, Class<T> cls) {
        XStream xstream = new XStream(new DomDriver());
        xstream.processAnnotations(cls);
        @SuppressWarnings("unchecked")
        T t = (T) xstream.fromXML(xmlStr);
        return t;
    }
	
	public static String toXml(Object obj) {
		XStream xstream = new XStream(new DomDriver("utf8"));
        xstream.processAnnotations(obj.getClass()); // 识别obj类中的注解
        /*
         // 以压缩的方式输出XML
         StringWriter sw = new StringWriter();
         xstream.marshal(obj, new CompactWriter(sw));
         return sw.toString();
         */
        // 以格式化的方式输出XML
        return xstream.toXML(obj);
	}
	
	/**
	 * 将类中的列表对象转化为xml字符串，指定reference属性
	 * @param obj  XStream.NO_REFERENCES
	 * @param mode
	 * @return
	 */
	public static String toXml(Object obj, int mode) {
		XStream xstream = new XStream(new DomDriver("utf-8"));
		xstream.processAnnotations(obj.getClass());		//识别obj泪的注解，不加这行代码会用包名和类名作为标签
		xstream.setMode(mode);		//设置reference模型
		return xstream.toXML(obj);
	}
	
	/**
	 * 将类中的列表对象转化为xml字符串，指定reference属性
	 * 给类中某个属性（List，Set）装载的类设置新的标签
	 * @param <T>
	 * @param obj  XStream.NO_REFERENCES
	 * @param mode
	 * @return
	 */
	public static <T> String toXml(Object obj, int mode, String new_label, Class<T> className) {
		XStream xstream = new XStream(new DomDriver("utf-8"));
		xstream.processAnnotations(obj.getClass());		//识别obj泪的注解，不加这行代码会用包名和类名作为标签
		xstream.setMode(mode);		//设置reference模型
		xstream.alias(new_label, className);	//修改标签
		return xstream.toXML(obj);
	}
	
	/**
	 * 改进的方法，使用InputStreamReader将FileInputStream读取到的字节转化为字符
	 * @param path
	 * @return
	 */
	public static String xmlFileToString2(String path) {
		FileInputStream in = null;
		InputStreamReader reader = null;
		StringBuilder sb = new StringBuilder();

		char[] buf = new char[1024];
		try {
			in = new FileInputStream((new File(path)));
			reader = new InputStreamReader(in, "UTF-8");
			int ch = 0;
			while((ch=reader.read(buf))!=-1) {
				//将数组转化为字符串打印,后面参数的意思是
	            //如果字符数组未满，转化成字符串打印后尾部也许会出现其他字符
	            //因此，读取的字符有多少个，就转化多少为字符串
				sb.append(String.valueOf(buf,0,ch));
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				in.close();
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return sb.toString();
	}
	
	/**
	 * 改进的方法，直接使用FileReader以字符形式读取文本，
	 * 它的实现应该类似于xmlFileToString2()方法
	 * @param path
	 * @return
	 */
	public static String xmlFileToString(String path) {
		FileReader reader = null;
		StringBuilder sb = new StringBuilder();

		char[] buf = new char[1024];
		try {
			reader = new FileReader(path);
			int ch = 0;
			while((ch=reader.read(buf))!=-1) {
				//将数组转化为字符串打印,后面参数的意思是
	            //如果字符数组未满，转化成字符串打印后尾部也许会出现其他字符
	            //因此，读取的字符有多少个，就转化多少为字符串
				sb.append(String.valueOf(buf,0,ch));
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
	
	
	//有问题的方法
	public static String xmlFileToString_Problem(String path) {
		FileInputStream in = null;
		StringBuilder sb = new StringBuilder();

		
		byte[] buf = new byte[1];
		try {
			in = new FileInputStream((new File(path)));
			while(in.read(buf)!=-1){
				sb.append(readBuffer_Problem(buf));
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return sb.toString();
	}
	
	//有问题的方法
	public static String readBuffer_Problem(byte[] buffer){
		if(buffer==null)
			return null;
		if(buffer.length==0){
			return "";
		}
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<buffer.length;i++){
			sb.append((char)buffer[i]);		//转换成字符拼接成字符串
		}
		try {
			return new String(sb.toString().getBytes(), "GB2312");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return "";
	}
	

	
}


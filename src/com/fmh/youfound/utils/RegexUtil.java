package com.fmh.youfound.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/** 
* @author  作者 E-mail: fmuhai@foxmail.com
* @date 创建时间：2016年4月16日 下午6:22:31 
* @version 1.0 
*/
public class RegexUtil {
	
	//private Pattern pattern;
	
	public static final String phoneNumberRegex = "^1[0-9]{10}";
	public static final String phoneNumberRegex2 = "^((13[0-9])|(15[^4,\\D])|(18[0,5-9]))\\d{8}$";
	public static final String emailRegex = "^([a-z0-9A-Z]+[-|_|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$";
	public static final String emailRegex2 = "^([a-z0-9A-Z]+[-|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$";
	
	public static boolean isCellPhoneNumber(String param) {
		/*Pattern p = Pattern.compile(phoneNumberRegex);
		Matcher m = p.matcher(param);
		return m.matches();*/
		return Pattern.compile(phoneNumberRegex2).matcher(param).find();
	}
	
	public static boolean isEmail(String email) {
		return Pattern.compile(emailRegex).matcher(email).matches();
	}
	
	public static void main(String[] args) {
		System.out.println(isCellPhoneNumber("12345678900"));

	}

}

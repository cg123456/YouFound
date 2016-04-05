package com.fmh.youfound.utils;

import java.util.concurrent.ConcurrentHashMap;

import org.apache.commons.mail.SimpleEmail;

/** 
 * @author fengmuhai
 * @date 2016-3-30 下午1:00:29 
 * @version 1.0  
 */
public class EmailUtil {
	
	public static ConcurrentHashMap<String, String> verifyCodeRecord = new ConcurrentHashMap<String, String>();
	
	public static void main(String[] args) {
		
		System.out.println(send("1007682823@qq.com","欢迎注册新用户，点击链接完成激活账户...","请点击以下链接完成激活：http://localhost:8080/YouFound/index.html \n激活账号，24小时生效，否则重新验证，请尽快激活!"));
	}
	
	public static boolean send(String toAddr, String subject, String content){  
        String result = null;  
        SimpleEmail email = new SimpleEmail();  
        //设置主机名称  
        email.setHostName("smtp.163.com");  
        //设置用户名，密码  
        email.setAuthentication("m15626174987@163.com", "123456fmh");  
        //设置字符编码方式  
        email.setCharset("GB2312");  
        try {  
            //设置发送源地址  
            email.setFrom("m15626174987@163.com", "YouFound 房屋租赁销售平台");  
            //设置目标地址  
            email.addTo(toAddr);  
            //设置主题  
            email.setSubject(subject);  
            //设置邮件内容  
            email.setMsg(content);  
            //发送邮件  
            email.send();
            
            //记录邮件信息
            verifyCodeRecord.put(toAddr, content+'|'+System.currentTimeMillis());
            
            return true;  
        } catch (Exception e) {  
            e.printStackTrace(); 
        }  
           
        return false;
    }  
	
}


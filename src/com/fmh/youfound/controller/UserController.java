package com.fmh.youfound.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.fmh.youfound.entity.User;
import com.fmh.youfound.service.UserService;
import com.fmh.youfound.utils.EmailUtil;
import com.fmh.youfound.utils.RegexUtil;

/** 
 * @author fengmuhai
 * @date 2016-3-24 上午10:48:01 
 * @version 1.0  
 */
//@Component
@Controller
@RequestMapping("/user/*")
public class UserController {
	
	private UserService userService;

	public UserService getUserService() {
		return userService;
	}

	@Resource(name="userServiceImpl")
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	
	
	/*@RequestMapping(params="method=reg")*/
	@RequestMapping(value="register.do")
	public String register(HttpServletRequest req) {
		System.out.println("invoke method register()");
		//req.setAttribute("user", req.getParameter("username"));
		
		if(req.getParameter("email")!=null){	//邮箱注册
			String email = req.getParameter("email");
			String password = req.getParameter("password");
			String username = email;
			userService.addUser(new User(username, password, "", email));
			
		} else {	//手机注册
			String phoneNumber = req.getParameter("phoneNumber");
			String password = req.getParameter("password");
			String username = phoneNumber;
			userService.addUser(new User(username, password, phoneNumber, ""));
		}
		
		System.out.println("新增用户成功！");
		return "../success";
	}
	
	@RequestMapping(value="/login.do")
	public @ResponseBody Map<String,Object> login(HttpServletRequest req) {
		System.out.println("invoke method login()");
		String[] params = req.getParameter("username_password").split("\\|");
		String username = params[0];
		String password = params[1];
		/*String username = req.getParameter("username");
		String password = req.getParameter("password");*/
		Map<String,Object> map = new HashMap<String, Object>();
		User user;
		if(RegexUtil.isCellPhoneNumber(username)){	//判断是否为手机号
			user = userService.getUserByPhone(username);
		} else if(RegexUtil.isEmail(username)) {
			user = userService.getUserByEmail(username);
		} else {	//用户名
			user = userService.getUserByUsername(username);
		}
		if(null != user && user.getPasswprd().equals(password)) {
			map.put("msg","OK");
			//mv.setViewName("../success");
		} else {	//手机号不存在或密码错误
			//mv.setViewName("../signin");
			map.put("msg","账号或密码错误");
		}
		return map;
	}
	
	/**
	 * ajax验证手机号码是否已存在数据库
	 */
	@RequestMapping(value="vaildatePhone.do")  
    public @ResponseBody Map<String,Object> vaildatePhone(HttpServletRequest request) throws IOException{  
        //System.out.println(request.getParameter("telphone"));
		String phoneNumber = request.getParameter("telphone");
        Map<String,Object> map = new HashMap<String,Object>();  
        if(phoneNumber==null || phoneNumber.equals("")) 
        	map.put("msg", "");
        else if(userService.exsitPhone(phoneNumber)) 
        	map.put("msg", "手机号已被注册");
        else 
        	map.put("msg", "手机号可注册");
        	
        return map;  
    }  
	
	/**
	 * ajax验证邮箱是否已存在数据库
	 */
	@RequestMapping(value="vaildateEmail.do")  
    public @ResponseBody Map<String,Object> vaildateEmail(HttpServletRequest request, 
    		HttpServletResponse response) throws IOException{  
        //System.out.println(request.getParameter("email"));
		String email = request.getParameter("email");
        Map<String,Object> map = new HashMap<String,Object>();  
        if(email==null || email.equals(""))
        	map.put("msg", "");
        else if(userService.exsitEmail(email)) 
        	map.put("msg", "邮箱已被注册");
        else 
        	map.put("msg", "邮箱可注册");
        	
        return map;  
    }  
	
	@RequestMapping(value="vaildateUser.do")  
    public @ResponseBody Map<String,Object> login(HttpServletRequest request,HttpServletResponse response) throws IOException{  
        System.out.println(request.getParameter("username"));  
        Map<String,Object> map = new HashMap<String,Object>();  
          
        if(request.getParameter("username").equals("123")){  
            System.out.println("成功");  
            map.put("msg", "成功");  
        }else{  
            System.out.println("失败");  
            map.put("msg", "失败");  
        }  
        return map;  
    } 
	
	@RequestMapping(value="checkVerifyCode.do")
	public @ResponseBody Map<String,Object> vaildateCode(HttpServletRequest request) throws IOException{  
        //System.out.println(request.getParameter("email"));
		
		String[] params = request.getParameter("email_verifyCode").split("\\|");
		String email = params[0];
		String verify_code = params[1];
		System.out.println("email:"+email+"\nverify_code:"+verify_code);
        Map<String,Object> map = new HashMap<String,Object>();  
        if(verify_code==null || verify_code.equals("")) {
        	map.put("msg", "nomatch");
        } else if(EmailUtil.verifyCodeRecord.get(email).split("\\|")[0].equals(verify_code)) {
        	map.put("msg", "match");
        } else {
        	map.put("msg", "nomatch");
        }
        return map;  
    }  
	
	@RequestMapping(value="sendEmail.do")
	public @ResponseBody Map<String,Object> sendEmail(HttpServletRequest request) throws IOException{  
        //System.out.println(request.getParameter("email"));
		
		String email = request.getParameter("email");
        Map<String,Object> map = new HashMap<String,Object>();  
        if(EmailUtil.send(email, "欢迎注册新用户", "123456")) {
        	map.put("msg", "success");
        } else {
        	map.put("msg", "fail");
        }
        	
        return map;  
    }  
	
	//@RequestMapping(value="sendEmail.do")
	public @ResponseBody Map<String,Object> sendEmailNone(HttpServletRequest request) throws IOException{  
        Map<String,Object> map = new HashMap<String,Object>();  
        map.put("msg", "success");
        return map;  
    }  
	

}

package com.fmh.youfound.action;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.fmh.youfound.entity.User;
import com.fmh.youfound.service.UserService;

/** 
 * @author fengmuhai
 * @date 2016-3-24 上午10:48:01 
 * @version 1.0  
 */
//@Component
@org.springframework.stereotype.Controller
@RequestMapping("/test/*")
public class TestController implements Controller {
	
	private UserService userService;

	public UserService getUserService() {
		return userService;
	}

	@Resource(name="userServiceImpl")
	public void setUserService(UserService userService) {
		this.userService = userService;
	}


	@Override
	public ModelAndView handleRequest(HttpServletRequest req,
			HttpServletResponse resp) throws Exception {

		System.out.println("Hello User Controller.Requeset()!");
		req.setAttribute("user", req.getParameter("username"));

		String username = req.getParameter("username");
		String password = req.getParameter("password");
		String email = req.getParameter("email");
		
		userService.addUser(new User(username, password, email,""));
		System.out.println("新增用户成功！");
		return new ModelAndView("success");
	}

	/*@RequestMapping(params="method=reg")*/
	@RequestMapping(value="reg.do")
	public String reg(HttpServletRequest req) {
		System.out.println("Hello User Controller.Requeset()!");
		req.setAttribute("user", req.getParameter("username"));

		String username = req.getParameter("username");
		String password = req.getParameter("password");
		String email = req.getParameter("email");
		
		userService.addUser(new User(username, password, email,""));
		System.out.println("新增用户成功！");
		
		/*if(email.equals(userService.getUser().getEmail())) {
			System.out.println("用户已经存在!!!!");
		} else {

			userService.addUser(new User(username, password, email));
			System.out.println("新增用户成功！");
		}*/
		
		return "../success";
	}
	
	@RequestMapping(value="vaildatePhone.do")  
    public @ResponseBody Map<String,Object> vaildatePhone(HttpServletRequest request) throws IOException{  
        System.out.println(request.getParameter("telphone"));  
        Map<String,Object> map = new HashMap<String,Object>();  
        if(request.getParameter("telphone")==null || request.getParameter("telphone").equals("")) {
        	map.put("msg", "");
        	
        }else {
        	/*if(UserService.exsitUser()){
        		map.put("msg", "手机号已被注册");
        	} else {
        		map.put("msg", "手机号可注册");
        	}*/
        	if(request.getParameter("telphone").equals("15626174987")){  
                System.out.println("手机号可注册");  
                map.put("msg", "手机号可注册");  
            }else{  
                System.out.println("手机号已被注册");  
                map.put("msg", "手机号已被注册");  
            }  
        }
        	
        return map;  
    }  
	
	@RequestMapping(value="vaildateEmail.do")  
    public @ResponseBody Map<String,Object> vaildateEmail(HttpServletRequest request,HttpServletResponse response) throws IOException{  
        System.out.println(request.getParameter("telphone"));  
        Map<String,Object> map = new HashMap<String,Object>();  
          
        if(request.getParameter("email")==null) {
        	map.put("msg", "");
        } else if(request.getParameter("email").equals("1007682823@qq.com")){  
            System.out.println("邮箱可注册");  
            map.put("msg", "邮箱可注册");  
        }else{  
            System.out.println("邮箱已被注册");  
            map.put("msg", "邮箱已被注册");  
        }  
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
	

}

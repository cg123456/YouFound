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
@Component
@RequestMapping("/user/*")
public class UserController implements Controller {
	
	private UserService userService;

	@Override
	public ModelAndView handleRequest(HttpServletRequest req,
			HttpServletResponse resp) throws Exception {

		System.out.println("Hello User Controller.Requeset()!");
		req.setAttribute("user", req.getParameter("username"));

		String username = req.getParameter("username");
		String password = req.getParameter("password");
		String email = req.getParameter("email");
		
		userService.addUser(new User(username, password, email));
		System.out.println("新增用户成功！");
		return new ModelAndView("success");
	}

	@RequestMapping(params="method=reg")
	public String reg(HttpServletRequest req) {
		System.out.println("Hello User Controller.Requeset()!");
		req.setAttribute("user", req.getParameter("username"));

		String username = req.getParameter("username");
		String password = req.getParameter("password");
		String email = req.getParameter("email");
		
		userService.addUser(new User(username, password, email));
		System.out.println("新增用户成功！");
		return "success";
	}
	
	
	@RequestMapping(value="login.do")  
    public @ResponseBody Map<String,Object> login(HttpServletRequest request,HttpServletResponse response) throws IOException{  
        System.out.println(request.getParameter("name"));  
        Map<String,Object> map = new HashMap<String,Object>();  
          
        if(request.getParameter("name").equals("123")){  
            System.out.println("成功");  
            map.put("msg", "成功");  
        }else{  
            System.out.println("失败");  
            map.put("msg", "失败");  
        }  
        return map;  
    }  
	

	public UserService getUserService() {
		return userService;
	}

	@Resource
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

}

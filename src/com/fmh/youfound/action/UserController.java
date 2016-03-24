package com.fmh.youfound.action;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
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

	public UserService getUserService() {
		return userService;
	}

	@Resource
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

}

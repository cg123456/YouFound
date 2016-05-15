package com.fmh.youfound.interceptor;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author fengmuhai
 * @Verson 创建时间：2015年9月18日上午11:22:37
 * @Comment 
 */
@Component
public class MyInterceptor implements HandlerInterceptor{


	@Override
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		System.out.println("最后执行！！！一般用于释放资源！");
		
	}


	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {
		System.out.println("Action执行之后，生成视图之前执行！！！");
		
	}
	

	@Override
	public boolean preHandle(HttpServletRequest req, HttpServletResponse arg1, Object arg2) throws Exception {

		System.out.println("在Action之前执行！！！");
		//根据Request的session和cookie判断是否在登入状态
		if(logined(req.getSession(), req.getCookies())) {
			autoLogin(req.getCookies());
		}
		/**
		 * return false;停止执行
		 * return true;继续执行
		 */
		return true;
		
	}


	private void autoLogin(Cookie[] cookies) {
		// TODO Auto-generated method stub
		
	}


	private boolean logined(HttpSession session, Cookie[] cookies) {
		// TODO Auto-generated method stub
		return false;
	}

	
}

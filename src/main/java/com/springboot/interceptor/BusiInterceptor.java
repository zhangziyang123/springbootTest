package com.springboot.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import com.springboot.controller.HelloController;
@Component
public class BusiInterceptor implements HandlerInterceptor {
	private static final Logger logger = LoggerFactory.getLogger(BusiInterceptor.class);


	 @Override
	 public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
	             throws Exception {
		 	logger.error("拦截器执行");
		 	String userSession = request.getParameter("session");
	        if(userSession == null){
	        	return false;
	        }
	        return true;
	      }
	  
	 
}

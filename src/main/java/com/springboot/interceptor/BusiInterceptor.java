package com.springboot.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
@Component
public class BusiInterceptor implements HandlerInterceptor {

	 @Override
	      public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
	             throws Exception {
	          // TODO Auto-generated method stub
	          System.out.println("interceptor 执行preHandle");
	          return true;
	      }
	  
	 
}

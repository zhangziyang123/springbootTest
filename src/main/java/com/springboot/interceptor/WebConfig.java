package com.springboot.interceptor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@Configuration
public class WebConfig extends WebMvcConfigurationSupport {

	 @Autowired
	 private BusiInterceptor busiInterceptor;
	     
	     @Override
	     public void addInterceptors(InterceptorRegistry registry) {
	         // TODO Auto-generated method stub
	         registry.addInterceptor(busiInterceptor);
	     }
}

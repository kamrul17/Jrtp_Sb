package com.domorecode.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.domorecode.interceptor.AuthLoggingInterceptor;
import com.domorecode.interceptor.RequestLogInterceptor;

@Configuration
public class AppConfig implements WebMvcConfigurer{
@Autowired
	private AuthLoggingInterceptor logInterceptor;
	
	
	
	/*
	 * @Override public void addInterceptors(InterceptorRegistry registry) {
	 * registry.addInterceptor(logInterceptor); }
	 */
@Override
public void addInterceptors(InterceptorRegistry registry) {
	registry.addInterceptor(logInterceptor);
}


}

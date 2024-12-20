package com.domorecode.interceptor;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@Component
public class RequestLogInterceptor implements HandlerInterceptor {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		System.out.println("preHandle");
		
		long startTime=System.currentTimeMillis();
		request.setAttribute("startTime", startTime);
		String uname=request.getParameter("uname");
		if ("jon".equals(uname)) {
			return true;
		} 
		response.getWriter().print("invalid name");
		return false;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		System.out.println("postHandle");

		long endTime=System.currentTimeMillis();
		long startTime=(long)request.getAttribute("startTime");
		long totalTime=endTime-startTime;
		System.out.println(totalTime);
		HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
	}
	
}

package com.domorecode.interceptor;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@Component
public class AuthLoggingInterceptor implements HandlerInterceptor{
	   private static final String API_KEY = "my-secure-api-key";
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		String apiKey=request.getHeader("api-key");
		System.out.println(apiKey);
		  // Log request details
        System.out.println("Incoming request: " + request.getMethod() + " " + request.getRequestURI());
        
        if (apiKey==null||!API_KEY.equals(apiKey)) {
			response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
			System.out.println("invalid key");
        	return false;
		}
        System.out.println("Authentication successful");
        return true; 
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		System.out.println("Completed request: " + response.getStatus());
		HandlerInterceptor.super.afterCompletion(request, response, handler, ex);
	}

}

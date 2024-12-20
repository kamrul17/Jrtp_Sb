package com.domorecode.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;
@ControllerAdvice
public class GlobalException {
	@ExceptionHandler(value=Exception.class)
	public ModelAndView handleExceptionMsg(Exception e) {
		ModelAndView mav=new ModelAndView();
		mav.setViewName("page");
		return mav;
	}
}

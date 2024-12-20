package com.domorecode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@ResponseBody
public class MsgController {
@GetMapping("/welcome")
	public String welcomeMsg() {
		String msg="welcome to my show";
	
			int x=10/0;
		
		
		return msg;
		}
@GetMapping("/greet")
public String greetMsg() {
	String msg="morning!!";
	String s=null;
	s.length();
	return msg;
	}

//@ExceptionHandler(value=Exception.class)
//public ModelAndView handleExceptionMsg(Exception e) {
//	ModelAndView mav=new ModelAndView();
//	mav.setViewName("page");
//	return mav;
//}
}

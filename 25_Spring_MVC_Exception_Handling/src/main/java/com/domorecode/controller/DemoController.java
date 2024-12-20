package com.domorecode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@ResponseBody
public class DemoController {
@GetMapping("/demo")
	public String wwjkelcomeMsg() {
		String msg="welcome to my show";
	
			int x=10/0;
		
		
		return msg;
		}

}

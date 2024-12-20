package com.domorecode.controller;

import java.time.LocalDate;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class WelcomeController {

	@GetMapping("/welcome")//acts as a default url
	public ModelAndView getWelcomeMsg() {
		ModelAndView mav=new ModelAndView();
		mav.addObject("msg","Welcome to SPing MVC!!");
		mav.setViewName("index");
		return mav;
	}
	@GetMapping("/greet")
	public ModelAndView getGreetMsg() {
		ModelAndView mav=new ModelAndView();
		mav.addObject("msg","hellow there!!");
		mav.setViewName("index");
		return mav;
	}

//	---------------------
	@GetMapping("/greetWithNameAndCity")
	@ResponseBody
	public String greet(@RequestParam("name") String uname, @RequestParam("ucity") String ucity) {
	    String res = "hello: " + uname + " city: " + ucity;
	    return res;
	}
//	---------@RequestParams---------------
		@GetMapping("/greetWithName")
		public ModelAndView getgreetWithNameMsg(@RequestParam("name") String uname,  String ucity ) {
			ModelAndView mav=new ModelAndView();
			String res="hello : "+uname+" city: "+ucity;
			mav.addObject("msg",res);
			mav.setViewName("index");
			return mav;
		}
		@GetMapping("/greetWithNameWithModel")
		public String getgreetWithNameMsg1(@RequestParam("name") String uname,  String ucity ,Model model) {
			String res="hello : "+uname+" city: "+ucity;
		model.addAttribute("msg", res);
			return "index";
		}
//		----------------@RequestPath-------------
		@GetMapping("/greetWithNickName/{name}/{city}")
		public ModelAndView greetWithNickNameMsg(@PathVariable String name, @PathVariable String city) {
			ModelAndView mav=new ModelAndView();
			String res="hello : "+name+" :" +city;
			mav.addObject("msg",res);
			mav.setViewName("index");
			return mav;
		}
//		------@RequestBody----------
	
}

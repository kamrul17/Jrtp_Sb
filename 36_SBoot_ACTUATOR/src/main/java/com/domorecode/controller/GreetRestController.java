package com.domorecode.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
public class GreetRestController {

	@GetMapping("/greet")
	public String greetMsg() {
		return "hello ! ";
	}
	
}

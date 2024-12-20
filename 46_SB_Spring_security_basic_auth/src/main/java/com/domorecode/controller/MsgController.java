package com.domorecode.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgController {

	@GetMapping("/")
	public String greetMsg() {
		return "good morning";
	}
}

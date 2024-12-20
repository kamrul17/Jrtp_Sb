package com.domorecode.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MesgController {

	@GetMapping("/")
	public String sendMesg() {
		return "welcome to domorecode";
	}
}

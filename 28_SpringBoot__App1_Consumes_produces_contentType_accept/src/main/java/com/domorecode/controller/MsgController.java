package com.domorecode.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgController {

	private MsgController() {
		System.out.println("msg controller constructor created");
	}
@GetMapping("/")
public ResponseEntity<String>getWelcomeMsg(){
	String msg="welcome to my website";
	return new ResponseEntity<>(msg,HttpStatus.OK);
}


}

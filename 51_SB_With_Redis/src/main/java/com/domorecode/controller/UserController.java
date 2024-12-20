package com.domorecode.controller;

import java.util.Collection;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.domorecode.model.User;
import com.domorecode.service.UserService;

@RestController
public class UserController {

	private UserService userService;
	
	public UserController(UserService userService) {
		this.userService=userService;
	}
	
	
	@PostMapping("/addUser")
	public String addUser(@RequestBody User user) {
		return userService.addUsers(user);
	}
	
	@GetMapping("/user/{userId}")
	public User getUser(@PathVariable Integer userId) {
		return userService.getUser(userId);
	}
	@GetMapping("/users")
	public Collection<User> getAllUser() {
		return userService.getAllUser();
	}
}

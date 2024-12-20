package com.domorecode.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;

import java.util.ArrayList;
import java.util.List;

import com.domorecode.binding.User;

@RestController
public class UserController {
	private List<User>ulist=new ArrayList<>();
@GetMapping("/user")
	public ResponseEntity<User>getUser(){
		User u=new User(1,"jon","jajk@kx");
		u.add(linkTo(methodOn(UserController.class).getallUser()).withSelfRel());

		return new ResponseEntity<>(u,HttpStatus.OK);
	}
@GetMapping("/allUser")
public ResponseEntity<List<User>>getallUser(){
//	List<User>ulist=new ArrayList<>();
//	User u=new User(1,"jon","jajk@kx");
//	User u2=new User(2,"jon2","jajk@kx");
//	User u3=new User(3,"jon3","jajk@kx");
//	ulist.add(u);
//	ulist.add(u2);
//	ulist.add(u3);
//	u.add(linkTo(methodOn(UserController.class).getUser()).withSelfRel());

	return new ResponseEntity<>(ulist,HttpStatus.OK);
}

@GetMapping("/create")
public ResponseEntity<String>createUser(@RequestBody User u1){
ulist.add(u1);
//	u.add(linkTo(methodOn(UserController.class).getallUser()).withSelfRel());

	return new ResponseEntity<>("user created",HttpStatus.OK);
}


}

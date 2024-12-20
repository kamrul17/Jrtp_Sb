package com.domorecode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.domorecode.service.UserService;

@SpringBootApplication
public class Application {
//private UserService userService;
	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(Application.class, args);
UserService u=context.getBean(UserService.class);
String name=u.printNameById(100);
	System.out.println(name);
	}

}

package com.domorecode.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.domorecode.beans.Robot;

@Configuration
@ComponentScan(basePackages = {"com.domorecode","com.differentpackage"})
//@ComponentScan(basePackages = {"com.domorecode"})
public class AppConfig {

	public AppConfig() {
		System.out.println("AppConfig constructor");
	}
	@Bean
	public Robot buildObject() {
		Robot r=new Robot();
		return r;
	}
//	even outside package @bean can create object
//	@Bean 
//	public Diff buildObject1() {
//		Diff r=new Diff();
//		return r;
//	}

}

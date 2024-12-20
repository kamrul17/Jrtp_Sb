package com.domorecode.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.domorecode"})
public class AppConfig {
	public AppConfig() {
		System.out.println("AppConfig constructor");
	}
}

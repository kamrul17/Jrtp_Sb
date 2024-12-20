package com.domorecode.engineforbeanlifecycle;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class Engine {
	@PostConstruct
public void init() {
	System.out.println("engine started");
}
public void doWork() {
	System.out.println("engine working");
}
@PreDestroy
public void stop() {
	System.out.println("engine Stopped");
}
}

package com.dormorecode.beans;

//import org.springframework.beans.factory.DisposableBean;
//import org.springframework.beans.factory.InitializingBean;

////Bean life cycle using Annotation  approach 
/*
public class Motor  {
	public Motor() {
		System.out.println("Motor Constructor");
	}
@PostConstruct
	 public void start() {
		System.out.println("Motor started");
	}

	public void dowork() {
		System.out.println("Motor working");
	}
@PreDestroy
	public void end() {
		System.out.println("Motor stopped");
	}
	


	
}
*/
//// Bean life cycle using programmatic  approach 
/*public class Motor implements InitializingBean,DisposableBean {
	public Motor() {
		System.out.println("Motor Constructor");
	}
	 


	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Motor started");
		
	}

	public void dowork() {
		System.out.println("Motor working");
	}

	
	@Override
	public void destroy() throws Exception {
		System.out.println("Motor Stopped");
	}


	
}*/
//Bean life cycle using XML approach 

public class Motor {
	public Motor() {
		System.out.println("Motor Constructor");
	}

	 public void start() {
		System.out.println("Motor started");
	}

	public void dowork() {
		System.out.println("Motor working");
	}

	public void end() {
		System.out.println("Motor stopped");
	}
	

	
}
 
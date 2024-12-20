package com.domorecode.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dormorecode.beans.Motor;

//import com.dormorecode.beans.Motor;



public class Main {
	public static void main(String[] args) {

		System.out.println("-----------");
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Motor motor=context.getBean(Motor.class);
		motor.dowork();
//		to destroy object
		ConfigurableApplicationContext cac=(ConfigurableApplicationContext)context;
		cac.registerShutdownHook();// when jvm going to stop then it will going to stop
//		cac.close();//here we manually close
	}
}

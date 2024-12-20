package com.domorecode.main;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.domorecode.beans.Car;


public class Main {
public static void main(String[] args) {
	

	System.out.println("-----------");
	ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
	//for prototype scope:when we request  for object then only object is created
Car c=context.getBean(Car.class);
c.drive();

}
}

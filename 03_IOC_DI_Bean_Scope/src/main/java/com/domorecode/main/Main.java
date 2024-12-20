package com.domorecode.main;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.domorecode.beans.Car;


public class Main {
public static void main(String[] args) {
	

	System.out.println("-----------");
	ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
	//for prototype scope:when we request  for object then only object is created
/*	
//	when Scope="singleton": only one object will be created ; by default
Car c=context.getBean(Car.class);
System.out.println(c.hashCode());//1955920234
Car c1=context.getBean(Car.class);
System.out.println(c1.hashCode());//1955920234
*/
	/*
//	when Scope="prototype" : everytime new  object will be created ; 
Car c=context.getBean(Car.class);
System.out.println(c.hashCode());//1955920234
Car c1=context.getBean(Car.class);
System.out.println(c1.hashCode());//1444635922
*/

}
}

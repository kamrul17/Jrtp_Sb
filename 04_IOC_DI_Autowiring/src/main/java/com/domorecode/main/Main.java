package com.domorecode.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.domorecode.beans.Car;

public class Main {
	public static void main(String[] args) {

		System.out.println("-----------");
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Car car = context.getBean(Car.class);
		car.drive();
	}
}

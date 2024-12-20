package com.domorecode.beans;

public class Car {
	private IEngine iEngine;
	public void setIEngine(IEngine iEngine) {
		System.out.println(" Setter injection");
		this.iEngine=iEngine;
	}
	public Car(IEngine iEngine) {
		System.out.println(" constructor injection");
		this.iEngine = iEngine;
	}

	public Car() {
		System.out.println("default constructor");
	}
	public void drive() {
		int start = iEngine.start();
		if (start == 1) {
			System.out.println("journey started");
		} else {
			System.out.println("failed to started");
		}
	}
}

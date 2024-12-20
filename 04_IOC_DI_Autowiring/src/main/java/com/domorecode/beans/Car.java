package com.domorecode.beans;

public class Car {
	private IEngine iEngine;
//	for autowire="byName "or "byType"
//	public void setiEngine(IEngine iEngine) {
//		this.iEngine = iEngine;
//	}
//	for autowire="constructor"
	public Car(IEngine iEngine) {
		super();
		this.iEngine = iEngine;
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

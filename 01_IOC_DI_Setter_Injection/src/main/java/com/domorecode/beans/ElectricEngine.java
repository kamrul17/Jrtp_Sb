package com.domorecode.beans;

public class ElectricEngine implements IEngine {

	public ElectricEngine() {
	System.out.println("ElectricEngine constructor");
	}

	@Override
	public int start() {
		System.out.println("ElectricEngine started");
		return 1;
	}

}


package com.domorecode.beans;

public class DieselEngine implements IEngine {

	public DieselEngine() {
		System.out.println("DieselEngine constructor");
	}

	@Override
	public int start() {
		System.out.println("DieselEngine started");
		return 1;
	}

}

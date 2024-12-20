package com.domorecode.beans;

public class PetrolEngine implements IEngine {
	

	public PetrolEngine() {
	System.out.println("petrolEngine constructor");
	}

	@Override
	public int start() {
		System.out.println("PetrolEngine started");
		return 1;
	}

}

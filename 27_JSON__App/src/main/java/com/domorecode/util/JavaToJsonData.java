package com.domorecode.util;

import java.io.File;

import com.domorecode.binding.Address;
import com.domorecode.binding.Passenger;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JavaToJsonData {
public static void main(String[] args) throws Exception{
	Address a=new Address();
	a.setCity("dhanbad");
	a.setState("jharkhand");
	a.setCountry("India");
	Passenger p=new Passenger();
	p.setName("jon");
	p.setFrom("dhanbad");
	p.setTo("jamshedpur");
	p.setGender("male");
	p.setAddress(a);
	ObjectMapper obm=new ObjectMapper();
	obm.writeValue(new File("passenger.json"), p);
}
}

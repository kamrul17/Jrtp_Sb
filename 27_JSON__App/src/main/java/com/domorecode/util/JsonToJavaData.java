package com.domorecode.util;

import java.io.File;

import com.domorecode.binding.Passenger;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonToJavaData {
public static void main(String[] args) throws Exception{

	ObjectMapper obm=new ObjectMapper();
Passenger p=obm.readValue(new File("passenger.json"), Passenger.class);
System.out.println(p);
}
}

package com.domorecode.util;

import java.io.File;

import com.domorecode.binding.Address;
import com.domorecode.binding.Person;

import jakarta.xml.bind.JAXBContext;

import jakarta.xml.bind.Marshaller;

public class MarshalDemo {
public static void main(String[] args) throws Exception {
	
	Address a=new Address();
	a.setCity("dhanbad");
	a.setState("jharkhand");
	a.setCountry("India");
	
	Person p=new Person();
	p.setId(1);
	p.setName("jon");
	p.setGender("male");
	p.setEmail("jon@j");
	p.setAddress(a);
	JAXBContext context=JAXBContext.newInstance(Person.class);
     Marshaller marshaller=context.createMarshaller();
     marshaller.marshal(p, new File("person.xml"));

}
}

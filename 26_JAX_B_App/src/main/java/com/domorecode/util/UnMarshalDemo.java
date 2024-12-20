package com.domorecode.util;

import java.io.File;

import com.domorecode.binding.Person;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.Unmarshaller;

public class UnMarshalDemo {
public static void main(String[] args) throws Exception {

	
	JAXBContext context=JAXBContext.newInstance(Person.class);
     Unmarshaller unmarshaller=context.createUnmarshaller();
    Person p= (Person)unmarshaller.unmarshal(new File("person.xml"));
  System.out.println(p);
}
}

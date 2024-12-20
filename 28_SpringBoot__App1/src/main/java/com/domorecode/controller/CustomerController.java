package com.domorecode.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.domorecode.binding.Customer;

@RestController
public class CustomerController {

	private CustomerController() {
		System.out.println("customer controller constructor created");
	}
//@GetMapping("/customer")
//public ResponseEntity<Customer>getCustomer(){
//	Customer c=new Customer();
//	c.setEmail("wns@js");
//	c.setGender("male");
//	c.setName("jon");
//	return new ResponseEntity<>(c,HttpStatus.OK);
//}
//	for sending data to client in XML format
	@GetMapping(	
		value="/customer",
		produces= {"application/xml","application/json"}
		)
	public  ResponseEntity<Customer> getCustomer(){
		Customer c=new Customer();
		c.setEmail("wns@js");
		c.setGender("male");
		c.setName("jon");
	return	new ResponseEntity<>(c,HttpStatus.OK);
	}
//	for getting data from client 
	@PostMapping(	
		value="/customer",
		consumes= {"application/xml","application/json"},
		produces={"text/plain"}
		)
	public  ResponseEntity<String> postCustomer(@RequestBody Customer c){
	System.out.println(c);
	return	new ResponseEntity<>("data save ",HttpStatus.CREATED);
	}

}

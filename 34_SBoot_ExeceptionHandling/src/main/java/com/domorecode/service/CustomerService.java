package com.domorecode.service;

import org.springframework.stereotype.Service;


import com.domorecode.exception.CustomerNotFoundException;

@Service
public class CustomerService {

	 public String  getCustomerNameById( Integer id) {
		
		if(id>=100) {
			return "John";
		}else {
			throw new CustomerNotFoundException("customer not found");
		}
		
	}
}

package com.domorecode.controller;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.domorecode.service.CustomerService;

@RestController
public class CustomerController {
private CustomerService customerService;

	public CustomerController(CustomerService customerService) {
	super();
	this.customerService = customerService;
}

	@GetMapping("/customer/{id}")
	public String getCustomerNameById(@PathVariable Integer id) throws Exception{
		return customerService.getCustomerNameById(id);

	}
//	LOCAL EXCEPTION HANDLING----------
//	@ExceptionHandler(value=CustomerNotFoundException.class)
//	public ResponseEntity<ExceptionInfo>handleCnfe(CustomerNotFoundException cnfe){
//		ExceptionInfo ef=new ExceptionInfo();
//		ef.setCode("EX01");
//		ef.setMessage(cnfe.getMessage());
//		ef.setDate(LocalDateTime.now());
//		return new ResponseEntity<>(ef, HttpStatus.BAD_REQUEST);
//	}
}

package com.domorecode.batchconfig;

import org.springframework.batch.item.ItemProcessor;

import com.domorecode.entity.Customer;


public class CustomerProcessor implements ItemProcessor<Customer, Customer> {

	@Override
	public Customer process(Customer item) throws Exception {

		// logic

		return item;
	}

}
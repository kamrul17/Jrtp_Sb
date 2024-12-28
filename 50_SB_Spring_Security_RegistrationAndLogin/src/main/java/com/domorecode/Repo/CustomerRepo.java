package com.domorecode.Repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.domorecode.entity.Customer;


@Repository
public interface CustomerRepo extends CrudRepository<Customer, Integer> {

	public Customer findByUname(String cuname);
	  boolean existsByUname(String cuname); 

}
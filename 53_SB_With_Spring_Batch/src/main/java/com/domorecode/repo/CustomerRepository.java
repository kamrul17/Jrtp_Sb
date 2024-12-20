package com.domorecode.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.domorecode.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Serializable>{

}

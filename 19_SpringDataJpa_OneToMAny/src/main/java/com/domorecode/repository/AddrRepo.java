package com.domorecode.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.domorecode.entity.Address;


public interface AddrRepo extends JpaRepository<Address, Integer> {

}

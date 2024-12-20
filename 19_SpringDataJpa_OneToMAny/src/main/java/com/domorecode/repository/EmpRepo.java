package com.domorecode.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.domorecode.entity.Employee;

public interface EmpRepo extends JpaRepository<Employee, Integer> {

}

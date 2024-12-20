package com.domorecode.empservice;

import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.domorecode.entity.Employee;
import com.domorecode.repository.EmpRepo;

import jakarta.transaction.Transactional;

@Service
public class EmployeeService {

    @Autowired
    private EmpRepo empRepo;

    @Transactional
    public Employee getEmployeeWithInitializedAddresses(int empId) {
        Employee emp = empRepo.findById(empId).orElse(null);
        if (emp != null) {
            Hibernate.initialize(emp.getAddresses()); // Initialize lazy-loaded collection
        }
        return emp;
    }
}


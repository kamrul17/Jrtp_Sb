package com.domorecode.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.domorecode.entity.Department;
import com.domorecode.entity.User;
@RepositoryRestResource(path = "departments")
public interface DepartmentRepo extends JpaRepository<Department, Integer>{
public List<Department>findByNameContaining(@Param ("name")String name);
}

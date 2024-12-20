package com.domorecode.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.domorecode.entity.User;
@RepositoryRestResource(path = "users")
public interface UserRepo extends JpaRepository<User, Integer>{
public List<User>findByNameContaining(@Param ("name")String name);
}

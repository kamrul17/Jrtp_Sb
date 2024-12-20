package com.domorecode.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.domorecode.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Integer> {
	  UserEntity findByUEmailAndUPassword(String uEmail, String uPassword);
}

package com.domorecode.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.domorecode.entity.Person;

public interface PersonRepo extends JpaRepository<Person, Integer> {

}

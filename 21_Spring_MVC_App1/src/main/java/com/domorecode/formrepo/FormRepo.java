package com.domorecode.formrepo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.domorecode.forms.User;

public interface FormRepo extends JpaRepository<User, String> {

	Boolean existsByName(String string);

	User findByName(String name);

}

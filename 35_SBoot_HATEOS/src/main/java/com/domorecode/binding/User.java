package com.domorecode.binding;

import org.springframework.hateoas.RepresentationModel;

public class User extends RepresentationModel<User>{
private Integer id;
private String name;
private String email;
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public User(Integer id, String name, String email) {
	super();
	this.id = id;
	this.name = name;
	this.email = email;
}
public User() {
	super();
}

}

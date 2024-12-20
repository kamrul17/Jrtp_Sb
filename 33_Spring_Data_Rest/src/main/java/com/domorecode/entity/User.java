package com.domorecode.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;

import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;


@Entity
@Table(name="user_table")

public class User {
	@Id
private Integer id;
private String name;
private Double price;
@OneToOne(cascade = CascadeType.ALL)
@JoinColumn(name="department_id",referencedColumnName = "id")
private Department department;
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
public Double getPrice() {
	return price;
}
public void setPrice(Double price) {
	this.price = price;
}
public User() {
	super();
}

}

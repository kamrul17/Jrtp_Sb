package com.domorecode.entity;

import java.util.Objects;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.OneToOne;

@Entity
public class Person {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer pId;
private String pName;
private String pGender;
@OneToOne(mappedBy = "person",cascade = CascadeType.ALL,orphanRemoval=true)
private Passport passport;
public Integer getpId() {
	return pId;
}
public void setpId(Integer pId) {
	this.pId = pId;
}
public String getpName() {
	return pName;
}
public void setpName(String pName) {
	this.pName = pName;
}
public String getpGender() {
	return pGender;
}
public void setpGender(String pGender) {
	this.pGender = pGender;
}
public Passport getPassport() {
	return passport;
}
public void setPassport(Passport passport) {
	this.passport = passport;
}
@Override
public String toString() {
	return "Person [pId=" + pId + ", pName=" + pName + ", pGender=" + pGender + ", passport=" + passport + "]";
}


}

package com.domorecode.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer pId;
private String pName;
private Double pPrice;



public Product() {
	super();
}
public Product(Integer pId, String pName, Double pPrice) {
	this.pId=pId;
	this.pName = pName;
	this.pPrice = pPrice;
}
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
public Double getpPrice() {
	return pPrice;
}
public void setpPrice(Double pPrice) {
	this.pPrice = pPrice;
}
@Override
public String toString() {
	return "Product [pId=" + pId + ", pName=" + pName + ", pPrice=" + pPrice + "]";
}


}

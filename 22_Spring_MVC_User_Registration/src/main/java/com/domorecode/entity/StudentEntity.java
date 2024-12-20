package com.domorecode.entity;

import java.util.List;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class StudentEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
private Integer sId;
private String sName;
private  String sGender;
private String course;
@ElementCollection
private List<String> timings;


private StudentEntity() {
	super();
}
public Integer getsId() {
	return sId;
}
public void setsId(Integer sId) {
	this.sId = sId;
}
public String getsName() {
	return sName;
}
public void setsName(String sName) {
	this.sName = sName;
}
public String getsGender() {
	return sGender;
}
public void setsGender(String sGender) {
	this.sGender = sGender;
}
public String getCourse() {
	return course;
}
public void setCourse(String course) {
	this.course = course;
}

public List<String> getTimings() {
	return timings;
}
public void setTimings(List<String> timings) {
	this.timings = timings;
}


}

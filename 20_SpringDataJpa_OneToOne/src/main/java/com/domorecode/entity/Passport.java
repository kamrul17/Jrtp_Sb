package com.domorecode.entity;

import java.time.LocalDate;
import java.util.Objects;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
@Entity
public class Passport {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer ppId;
	private String ppNum;
	private LocalDate ppIssueDate;
	private LocalDate ppExpiryDate;
	@OneToOne(optional = false)
@JoinColumn(name="person_id")
	private Person person;
	
	
	
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	public Integer getPpId() {
		return ppId;
	}
	public void setPpId(Integer ppId) {
		this.ppId = ppId;
	}
	public String getPpNum() {
		return ppNum;
	}
	public void setPpNum(String ppNum) {
		this.ppNum = ppNum;
	}
	public LocalDate getPpIssueDate() {
		return ppIssueDate;
	}
	public void setPpIssueDate(LocalDate ppIssueDate) {
		this.ppIssueDate = ppIssueDate;
	}
	public LocalDate getPpExpiryDate() {
		return ppExpiryDate;
	}
	public void setPpExpiryDate(LocalDate ppExpiryDate) {
		this.ppExpiryDate = ppExpiryDate;
	}
	@Override
	public String toString() {
		return "Passport [ppId=" + ppId + ", ppNum=" + ppNum + ", ppIssueDate=" + ppIssueDate + ", ppExpiryDate="
				+ ppExpiryDate + ", person=" + person + "]";
	}
	
	
}

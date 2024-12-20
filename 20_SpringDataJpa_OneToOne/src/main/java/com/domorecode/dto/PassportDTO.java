package com.domorecode.dto;

import java.time.LocalDate;
import java.util.Objects;



public class PassportDTO {
	private Integer ppId;
	private String ppNum;
	private LocalDate ppIssueDate;
	private LocalDate ppExpiryDate;
	private PersonDTO personDTO;
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
	public PersonDTO getPersonDTO() {
		return personDTO;
	}
	public void setPersonDTO(PersonDTO personDTO) {
		this.personDTO = personDTO;
	}
	
	
//	findAll for particular field toString()

	/*
	 * @Override public String toString() { return "Passport [ ppNum=" + ppNum +
	 * ", ppIssueDate=" + ppIssueDate + ", ppExpiryDate=" + ppExpiryDate + "]"; }
	 */
	//	@Override
	public String toString() {
		
		if (Objects.isNull(personDTO)) {
		
			return "Passport [ppId=" + ppId + ", ppNum=" + ppNum + ", ppIssueDate=" + ppIssueDate + ", ppExpiryDate="
					+ ppExpiryDate ;
		} 
		
		else {
			return "Passport [ppId=" + ppId + ", ppNum=" + ppNum + ", ppIssueDate=" + ppIssueDate + ", ppExpiryDate="
					+ ppExpiryDate + ", personDTO=" + personDTO + "]";
		}
	
	}
	
	
}

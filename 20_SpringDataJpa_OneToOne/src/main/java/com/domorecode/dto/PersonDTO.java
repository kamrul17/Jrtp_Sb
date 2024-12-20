package com.domorecode.dto;

import java.util.Objects;

public class PersonDTO {
	private Integer pId;
	private String pName;
	private String pGender;
	private PassportDTO passportDTO;
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
	public PassportDTO getPassportDTO() {
		return passportDTO;
	}
	public void setPassportDTO(PassportDTO passportDTO) {
		this.passportDTO = passportDTO;
	}
	@Override
	public String toString() {

		if (Objects.isNull(passportDTO)) {
		
			return "Person [pId=" + pId + ", pName=" + pName + ", pGender=" + pGender +"]";
		}else if (passportDTO.getPpId()==null) {  ////	findAll for particular field toString()
			System.out.println("secondline");
			return "Person [ pName=" + pName + ", pGender=" + pGender +  "PassportDTO=" + passportDTO + "]";
		} 
		else {
			return "Person [pId=" + pId + ", pName=" + pName + ", pGender=" + pGender + ", PassportDTO=" + passportDTO + "]";
		}
		
	}
	
}

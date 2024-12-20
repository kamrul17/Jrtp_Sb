package com.domorecode.utility;



import java.util.List;

import com.domorecode.dto.PassportDTO;
import com.domorecode.dto.PersonDTO;
import com.domorecode.entity.Passport;
import com.domorecode.entity.Person;


public class Mapperutil {

	private Mapperutil() {
		
	}


//	FindAll
	public static PersonDTO convertAllPersonEntityToAllPersonDTOWithPassport(Person p) {
	PersonDTO pDTo=new PersonDTO();
	pDTo.setpName(p.getpName());
	pDTo.setpGender(p.getpGender());
	pDTo.setPassportDTO(convertAllPassportEntityToAllPassportDTOWithOutPerson(p.getPassport()));
	return pDTo;
		
	}
//	FindALl
	public static PassportDTO convertAllPassportEntityToAllPassportDTOWithOutPerson(Passport pp) {
		PassportDTO ppdto=new PassportDTO();

		ppdto.setPpNum(pp.getPpNum());
		ppdto.setPpIssueDate(pp.getPpIssueDate());
		ppdto.setPpExpiryDate(pp.getPpExpiryDate());
		return ppdto;
		
		
	}
	
	public static PersonDTO convertPersonEntityToPersonDTOWithPassport(Person p) {
	PersonDTO pDTo=new PersonDTO();
	pDTo.setpId(p.getpId());
	pDTo.setpName(p.getpName());
	pDTo.setpGender(p.getpGender());
	pDTo.setPassportDTO(convertPassportEntityToPassportDTOWithOutPerson(p.getPassport()));
	return pDTo;
		
	}
	public static PersonDTO convertPersonEntityToPersonDTOWithOutPassport(Person p) {
		PersonDTO pDTo=new PersonDTO();
		pDTo.setpId(p.getpId());
		pDTo.setpName(p.getpName());
		pDTo.setpGender(p.getpGender());

		return pDTo;
			
		}
	public static PassportDTO convertPassportEntityToPassportDTOWithOutPerson(Passport pp) {
		PassportDTO ppdto=new PassportDTO();
		ppdto.setPpId(pp.getPpId());
		ppdto.setPpNum(pp.getPpNum());
		ppdto.setPpIssueDate(pp.getPpIssueDate());
		ppdto.setPpExpiryDate(pp.getPpExpiryDate());
		return ppdto;
		
		
	}
	public static PassportDTO convertPassportEntityToPassportDTOWithPerson(Passport pp) {
		PassportDTO ppdto=new PassportDTO();
		ppdto.setPpId(pp.getPpId());
		ppdto.setPpNum(pp.getPpNum());
		ppdto.setPpIssueDate(pp.getPpIssueDate());
		ppdto.setPpExpiryDate(pp.getPpExpiryDate());
		PersonDTO personDTO=convertPersonEntityToPersonDTOWithOutPassport(pp.getPerson());
		ppdto.setPersonDTO(personDTO);
		return ppdto;
		
		
	}

}

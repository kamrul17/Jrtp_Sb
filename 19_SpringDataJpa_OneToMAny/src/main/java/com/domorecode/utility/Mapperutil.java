package com.domorecode.utility;



import java.util.List;

import com.domorecode.dto.AddrDTO;
import com.domorecode.dto.EmpDTO;
import com.domorecode.entity.Address;
import com.domorecode.entity.Employee;

public class Mapperutil {

	private Mapperutil() {
		
	}
	public static EmpDTO convertEmpToEmpDTOWithAddress(Employee emp) {
		EmpDTO empDTO=new EmpDTO();
		empDTO.setEmpId(emp.getEmpId());
		empDTO.setEmpName(emp.getEmpName());
		empDTO.setEmpSalary(emp.getEmpSalary());
		List<AddrDTO>addrtolist=emp.getAddresses().stream().map(addr->convertAddrToAddrDTOWithoutEmp(addr)).toList();
		empDTO.setAddresses(addrtolist);
		
		return empDTO;
		
	}
	public static EmpDTO convertEmpToEmpDTOWithoutAddress(Employee emp) {
		EmpDTO empDTO=new EmpDTO();
		empDTO.setEmpId(emp.getEmpId());
		empDTO.setEmpName(emp.getEmpName());
		empDTO.setEmpSalary(emp.getEmpSalary());
		return empDTO;
		
	}
	public static AddrDTO convertAddrToAddrDTOWithoutEmp(Address adr) {
		
		AddrDTO addrDTO=new AddrDTO();
		addrDTO.setAddrId(adr.getAddrId());
		addrDTO.setCity(adr.getCity());
		addrDTO.setState(adr.getState());
		addrDTO.setCountry(adr.getCountry());
		
		
		
		return addrDTO;
		
	}
	public static AddrDTO convertAddrToAddrDTOWithEmp(Address adr) {
		
		AddrDTO addrDTO=new AddrDTO();
		addrDTO.setAddrId(adr.getAddrId());
		addrDTO.setCity(adr.getCity());
		addrDTO.setState(adr.getState());
		addrDTO.setCountry(adr.getCountry());
		
EmpDTO empDTO=convertEmpToEmpDTOWithoutAddress(adr.getEmployee());
		addrDTO.setEmployee(empDTO);
		
		
		
		return addrDTO;
		
	}
}

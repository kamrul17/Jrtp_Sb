package com.domorecode.dto;

import java.util.List;
import java.util.Objects;



public class EmpDTO {
	private Integer empId;
	private String empName;
	private Double empSalary;
	private List<AddrDTO>addresses;
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Double getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(Double empSalary) {
		this.empSalary = empSalary;
	}

	public List<AddrDTO> getAddresses() {
		return addresses;
	}
	public void setAddresses(List<AddrDTO> addresses) {
		this.addresses = addresses;
	}

	
	@Override
	public String toString() {
		if (Objects.isNull(addresses)) {
			return "EmpDTO [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary ;
		} else {
			return "EmpDTO [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + ", addresses="
					+ addresses + "]";
		}
		
	}
	
}

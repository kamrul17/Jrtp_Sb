package com.domorecode.dto;


import java.util.Objects;


import com.domorecode.entity.Employee;

public class AddrDTO {
	private Integer addrId;
	private String city;
	private String state;
    private String country;
    private EmpDTO employee;
	public Integer getAddrId() {
		return addrId;
	}
	public void setAddrId(Integer addrId) {
		this.addrId = addrId;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}

	public EmpDTO getEmployee() {
		return employee;
	}
	public void setEmployee(EmpDTO employee) {
		this.employee = employee;
	}
	@Override
	public String toString() {
		if (Objects.isNull(employee)) {
			return "AddrDTO [addrId=" + addrId + ", city=" + city + ", state=" + state + ", country=" + country;
		} else {
			return "AddrDTO [addrId=" + addrId + ", city=" + city + ", state=" + state + ", country=" + country
					+ ", employee=" + employee + "]";
		}
		
	}
    
}

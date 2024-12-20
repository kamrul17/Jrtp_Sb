package com.domorecode;

import java.util.Objects;

import org.hibernate.Hibernate;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.domorecode.dto.EmpDTO;
import com.domorecode.empservice.EmployeeService;
import com.domorecode.entity.Address;
import com.domorecode.entity.Employee;
import com.domorecode.repository.AddrRepo;
import com.domorecode.repository.EmpRepo;
import com.domorecode.utility.Mapperutil;


@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		EmpRepo empRepo = context.getBean(EmpRepo.class);
		AddrRepo addrRepo = context.getBean(AddrRepo.class);
		
		EmployeeService empService = context.getBean(EmployeeService.class);
		
//		Employee emp=empRepo.findById(3).orElse(null);
		
//		Address address=addrRepo.findById(5).orElse(null);
		
		
		   // Fetch employee with addresses initialized
	    Employee emp1 = empService.getEmployeeWithInitializedAddresses(3);
//		Emp+address (require @transaction to get both emp+address when using LAzy loader 
	    if (emp1 != null) {
	        EmpDTO empDto = Mapperutil.convertEmpToEmpDTOWithAddress(emp1);
	        System.out.println(empDto);
	    }
		

		

//		only Emp
//		if (Objects.nonNull(emp)) {
//			
//			EmpDTO empDto=Mapperutil.convertEmpToEmpDTOWithoutAddress(emp);
//			System.out.println(empDto);
//		}

		
//		ONLY ADDRESS
//		if (Objects.nonNull(emp)) {
//			AddrDTO addrDTO=Mapperutil.convertAddrToAddrDTOWithoutEmp(address);
//			System.out.println(addrDTO);
//		}
		
//		 ADDRESS WITH EMP
//		if (Objects.nonNull(emp)) {
//			AddrDTO addrDTO=Mapperutil.convertAddrToAddrDTOWithEmp(address);
//			System.out.println(addrDTO);
//		}
		
		
		
		
		
		
		/*
		 * 
		 * 
		 * Address addr = new Address(); addr.setCity("bangalore");
		 * addr.setState("karntaka"); addr.setCountry("India");
		 * 
		 * Address addr1 = new Address(); addr1.setCity("bangalore");
		 * addr1.setState("karntaka"); addr1.setCountry("India"); List<Address> adrList
		 * = new ArrayList<>(); adrList.add(addr); adrList.add(addr1); Employee e = new
		 * Employee(); e.setEmpName("john"); e.setAddresses(adrList);
		 * e.setEmpSalary(1000d);
		 * 
		 * addr.setEmployee(e); addr1.setEmployee(e);
		 */
//		empRepo.save(e);

//  if(empRepo.existsById(2)) {
//	  empRepo.deleteById(2);
//  }
//	  if(addrRepo.existsById(3)) {
//		  addrRepo.deleteById(3);
//	  }
		
	

	}
}
package com.domorecode;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.domorecode.dto.PassportDTO;
import com.domorecode.dto.PersonDTO;
import com.domorecode.entity.Passport;
import com.domorecode.entity.Person;
import com.domorecode.repo.PassPortRepo;
import com.domorecode.repo.PersonRepo;
import com.domorecode.utility.Mapperutil;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		 PersonRepo pRepo = context.getBean(PersonRepo.class);
	        PassPortRepo ppRepo = context.getBean(PassPortRepo.class);
	        // Fetch all persons
		      List<Person>p=pRepo.findAll(); 
		     List<PersonDTO>allPerson=p.stream().map(person-> Mapperutil.convertAllPersonEntityToAllPersonDTOWithPassport(person)).toList();
		     allPerson.forEach(System.out::println);
		      
	       
	    
	        

	        // Create Person
//	        Person person = new Person();
//	        person.setpName("yohnW2");
//	        person.setpGender("male");

	        // Save Person first
//	        pRepo.save(person);

	        // Create Passport
//	        Passport pp = new Passport();
//	        pp.setPpIssueDate(LocalDate.now());
//	        pp.setPpExpiryDate(LocalDate.now().plusYears(10));
//	        pp.setPpNum("yohd23");
//	        pp.setPerson(person);

	        // Save Passport
//	        ppRepo.save(pp);
//
//	        Delete
//	        if (pRepo.existsById(3)) {
//	        	pRepo.deleteById(3);;
//			}
	        
	        
//	        person +passport
			/*
			 * Person p=pRepo.findById(1).orElse(null); PersonDTO personDTO=
			 * Mapperutil.convertPersonEntityToPersonDTOWithPassport(p);
			 * System.out.println(personDTO);
			 */
//	        only person 
			/*
			 * Person p=pRepo.findById(1).orElse(null); PersonDTO personDTO=
			 * Mapperutil.convertPersonEntityToPersonDTOWithOutPassport(p);
			 * System.out.println(personDTO);
			 */
	        // only Passport
	        /*
			 *  Passport p=ppRepo.findById(1).orElse(null); PassportDTO
			 * passportDTO= Mapperutil.convertPassportEntityToPassportDTOWithOutPerson(p);
			 * System.out.println(passportDTO);
			 */
		        
//	         Passport +Person
			/*
			 * Passport p=ppRepo.findById(1).orElse(null); PassportDTO passportDTO=
			 * Mapperutil.convertPassportEntityToPassportDTOWithPerson(p);
			 * System.out.println(passportDTO);
			 */
//update person
			/*
			 * Optional<Person> p=pRepo.findById(1); if(p.isPresent()) { Person
			 * person=p.get(); person.setpName("spider-man"); pRepo.save(person);
			 * System.out.println("done"); }
			 */
	    //update passport
		/*
		 * Optional<Passport> p=ppRepo.findById(1); if(p.isPresent()) { Passport
		 * pass=p.get(); pass.setPpNum("dlipa0090"); ppRepo.save(pass);
		 * System.out.println("done"); }
		 */
	        
		      

	}
}
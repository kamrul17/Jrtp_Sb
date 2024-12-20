package com.domorecode;



import java.util.List;

//import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.domorecode.entity.Account;
import com.domorecode.repository.AccountRepo;

//import com.domorecode.entity.Account;
//import com.domorecode.entity.Product;
//import com.domorecode.entity.Student;
//import com.domorecode.repository.AccountRepo;
////import com.domorecode.repository.ProductRepo;
//import com.domorecode.repository.StudentRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
	ConfigurableApplicationContext context	=SpringApplication.run(Application.class, args);
	//DEV ENV -USING  --ashok_it_sprind_data_jpa_store_procedure.product
	
	
	/*
	 * ProductRepo productRepo=context.getBean(ProductRepo.class);
	 * List<Product>allprods= productRepo.getAllProduct();
	 * allprods.forEach(System.out::println);
	 */
//	------------------------
//PILOT ENV-USING --ashok_it_sprind_data_jpa.student_table;
	
	
	/*
	 * StudentRepository studentRepository=context.getBean(StudentRepository.class);
	 * Iterable<Student>allprods= studentRepository.findAll();
	 * allprods.forEach(System.out::println)
	 */;
	 
	
	//UAT ENV-USING --ashok_it_sprind_data_jpa_composite_key.account;
	
	  AccountRepo accountRepo=context.getBean(AccountRepo.class);
	  List<Account>alldata=accountRepo.findAll();
	  alldata.forEach(System.out::println);
	 
}
}
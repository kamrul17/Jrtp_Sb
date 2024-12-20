package com.domorecode;



import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.domorecode.entity.Product;
import com.domorecode.repository.ProductRepo;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
	ConfigurableApplicationContext context	=SpringApplication.run(Application.class, args);

	ProductRepo productRepo=context.getBean(ProductRepo.class);
//	Product p=new Product();
//	p.setProductId(3);
//	p.setProductName("swosqnle");
//	p.setProductPrice(100d);
//	productRepo.save(p);
	
	List<Product>allprods=	productRepo.getAllProduct();
	allprods.forEach(System.out::println);
//
	
	}
	

}

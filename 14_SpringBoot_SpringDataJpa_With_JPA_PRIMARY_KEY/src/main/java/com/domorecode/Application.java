package com.domorecode;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.domorecode.entity.Product;
import com.domorecode.repository.ProductRepo;




@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(Application.class, args);
		ProductRepo productRepo=context.getBean(ProductRepo.class);
		System.out.println(productRepo.getClass().getName());
		Product p=new Product();
	p.setpName("joneey");
	p.setpPrice(2882d);
	productRepo.save(p);
		


	}

}

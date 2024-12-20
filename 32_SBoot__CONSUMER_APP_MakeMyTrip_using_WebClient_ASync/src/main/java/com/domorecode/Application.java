package com.domorecode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.domorecode.service.MakeMyTripService;


@SpringBootApplication
public class Application {

	public static void main(String[] args) {
//		SpringApplication.run(Application.class, args);
		ConfigurableApplicationContext context=SpringApplication.run(Application.class, args);
	MakeMyTripService mmts=context.getBean(MakeMyTripService.class);
//	mmts.getTicketByIdSync(1);
 mmts.getTicketByIdAsync(1);
	
	
	}

}

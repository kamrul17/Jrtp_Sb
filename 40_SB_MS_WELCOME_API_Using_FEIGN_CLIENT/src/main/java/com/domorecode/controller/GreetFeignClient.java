package com.domorecode.controller;

//import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

//import com.domorecode.binding.request.Ticket;

@FeignClient(name="GREET-API") //require serviceRegistry
//@FeignClient(url="http://localhost:9091" ,name="dummyname")  //not recommended
//@FeignClient(url="http://localhost:8082" ,name="dummyname") //IRCTC which is not inside serviceREgistry
public interface GreetFeignClient {

	@GetMapping("/greet")
	public String invokeGreetApi();
//	IRCTC
	/*
	 * @GetMapping("/bookTicket") public String erailService1();
	 * 
	 * @GetMapping("/findallTicket") public List<Ticket> erailService2();
	 * 
	 * @GetMapping("/getTicket/{ticketId}") public String erailService3();
	 */}


package com.domorecode.controller;

//import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//import com.domorecode.binding.request.Ticket;

@RestController
public class WelcomeRestApi {
@Autowired
	private GreetFeignClient client;
@Autowired
private Environment env;
	
//	@GetMapping("/welcome")
//	public String getWelcomeMesg() {
//		String welcomemsg= "welcome to domorecode";
//		String greetmsg=client.invokeGreetApi();
//		return greetmsg+" -- "+welcomemsg;
//	}
@GetMapping("/welcome")
public String getWelcomeMesg() {
	String port=env.getProperty("server.port");
	String welcomemsg= "welcome to domorecode ("+port+")";
	String greetmsg=client.invokeGreetApi();
	return greetmsg+" -- "+welcomemsg;
}
//	@GetMapping("/welcome")
//	public List<Ticket> getWelcomeMesg1() {
//		
//		List<Ticket> tickets=client.erailService2();
//		return  tickets;
//	}
}

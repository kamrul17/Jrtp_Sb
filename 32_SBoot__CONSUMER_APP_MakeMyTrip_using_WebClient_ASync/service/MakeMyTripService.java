package com.domorecode.service;

import java.awt.PageAttributes.MediaType;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;

import org.springframework.stereotype.Service;

import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;

import com.domorecode.binding.request.Ticket;
import com.domorecode.binding.response.Passenger;

@Service
public class MakeMyTripService {
	@Value("${irctc_endpoint_book_ticket}")
	private String IRCTC_ENDPOINT_BOOK_TICKET;
	@Value("${irctc_endpoint_get_ticket}")
	private String IRCTC_ENDPOINT_GET_TICKET;
	@Value("${irctc_endpoint_findall_ticket}")
	private String IRCTC_ENDPOINT_FINDALL_TICKET;

	public Ticket bookTicket(Passenger p) {
		WebClient webClient=WebClient.create();
		Ticket ticket =	webClient.post()
	.uri(IRCTC_ENDPOINT_BOOK_TICKET)
	.body(BodyInserters.fromValue(p))
	.header("Content-Type", "Application/json")
	.accept(org.springframework.http.MediaType.APPLICATION_JSON)
	.retrieve()
	.bodyToMono(Ticket.class)
	.block();
		if (ticket != null) {
			return ticket;
		}
		return null;

	}

	public Ticket getTicketById(Integer tId) {
		WebClient webClient = WebClient.create();//get webClient Instance
		
		Ticket ticket = webClient.get()//represent http GET request
				.uri(IRCTC_ENDPOINT_GET_TICKET, tId)//endpoint url
				.accept(org.springframework.http.MediaType.APPLICATION_JSON)//expecting json data from restapi
				.retrieve()//take response from response body
				.bodyToMono(Ticket.class)//bind response body data from to java obj
				.block();//make syn call	
		if (ticket != null) {
			return ticket;
		}
		return null;

	}

	public List<Ticket> findAllTicket() {
	    WebClient webClient = WebClient.create();

	    try {
	        // Make a GET request to the provider API expecting XML response
	        List<Ticket> tickets = webClient.get()
	                .uri(IRCTC_ENDPOINT_FINDALL_TICKET) // Set the endpoint URI
	                .accept(org.springframework.http.MediaType.APPLICATION_JSON) // Expecting XML response
	                .retrieve() // Trigger the request and retrieve the response
	                .bodyToFlux(Ticket.class) // Convert the response body to a flux of Ticket
	                .collectList() // Collect the Flux into a List
	                .block(); // Block to get the result synchronously

	        return tickets != null ? tickets : Collections.emptyList(); // Return the tickets or an empty list
	    } catch (Exception e) {
	        System.err.println("Error fetching tickets: " + e.getMessage());
	    }

	    // Return an empty list if fetching fails
	    return Collections.emptyList();
	}


}

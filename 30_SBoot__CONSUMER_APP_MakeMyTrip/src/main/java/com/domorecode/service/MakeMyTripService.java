package com.domorecode.service;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.domorecode.binding.request.Ticket;
import com.domorecode.binding.response.Passenger;

@Service
public class MakeMyTripService {
	@Value("${irctc_endpoint_book_ticket}")
private   String IRCTC_ENDPOINT_BOOK_TICKET;
	@Value("${irctc_endpoint_get_ticket}")
private   String IRCTC_ENDPOINT_GET_TICKET;
@Value("${irctc_endpoint_findall_ticket}")
private   String IRCTC_ENDPOINT_FINDALL_TICKET;

	public Ticket bookTicket(Passenger p) {
		
		RestTemplate rt=new RestTemplate();
		   try {
	            // Make a POST request to the provider API
	            ResponseEntity<Ticket> responseEntity = rt.postForEntity(IRCTC_ENDPOINT_BOOK_TICKET, p, Ticket.class);

		 // Check response status
        if (responseEntity.getStatusCode() == HttpStatus.OK) { // Adjusted to match provider
            return responseEntity.getBody(); // Return the ticket details
        }
    } catch (Exception e) {
        System.err.println("Error booking ticket: " + e.getMessage());
    }

		
		    // Return null if the ticket booking fails
	        return null;
		
	}



	public Ticket getTicketById(Integer tId) {
		RestTemplate rt=new RestTemplate();
		   try {
	            // Make a POST request to the provider API
			   ResponseEntity<Ticket> responseEntity=   rt.getForEntity(IRCTC_ENDPOINT_GET_TICKET, Ticket.class, tId);

		 // Check response status
     if (responseEntity.getStatusCode() == HttpStatus.OK) { // Adjusted to match provider
         return responseEntity.getBody(); // Return the ticket details
     }
 } catch (Exception e) {
     System.err.println("Error booking ticket: " + e.getMessage());
 }

		
		    // Return null if the ticket booking fails
	        return null;
		
	}



	public List<Ticket> findAllTicket() {
		  RestTemplate restTemplate = new RestTemplate();

		    try {
		        // Make a GET request to the provider API
		        ResponseEntity<List<Ticket>> responseEntity = restTemplate.exchange(
		        		IRCTC_ENDPOINT_FINDALL_TICKET,
		            HttpMethod.GET,
		            null,
		            new ParameterizedTypeReference<List<Ticket>>() {}
		        );

		        // Check response status
		        if (responseEntity.getStatusCode() == HttpStatus.OK) {
		            return responseEntity.getBody(); // Return the list of tickets
		        }
		    } catch (Exception e) {
		        System.err.println("Error fetching tickets: " + e.getMessage());
		    }

		    // Return an empty list if fetching fails
		    return Collections.emptyList();
		
	}

}

package com.domorecode.controller;


import java.util.List;
import java.util.Objects;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.domorecode.binding.request.Ticket;
import com.domorecode.binding.response.Passenger;
import com.domorecode.service.ErailService;
@RestController
public class ErailController {
   private ErailService erailService;

	public ErailController(ErailService erailService) {
	super();
	this.erailService = erailService;
}


	@PostMapping(
			value="/bookTicket",
			consumes= {"application/xml","application/json"},
			produces= {"application/xml","application/json"}
			)
	public ResponseEntity<Ticket>bookTicket(@RequestBody Passenger passengerdetails){
		System.out.println(passengerdetails);
		Ticket isBooked=erailService.bookTicket(passengerdetails);
		if (Objects.nonNull(isBooked)) {
			return new ResponseEntity<>(isBooked,HttpStatus.OK);
		}
		return new ResponseEntity<>(HttpStatus.NOT_ACCEPTABLE);
		
	}
	
	@GetMapping(value="/getTicket/{ticketId}",
			produces= {"application/xml","application/json"}
			)
	public ResponseEntity<Ticket>getTicketById(@PathVariable Integer ticketId){
		Ticket ticket=erailService.getTicketById(ticketId);
		if (Objects.nonNull(ticket)) 
		{
			return new ResponseEntity<>(ticket,HttpStatus.OK);
		}
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}
	@GetMapping(value="/findallTicket",
			produces= {"application/xml","application/json"}
			)
	public ResponseEntity<List<Ticket>> findAllTickets() {
	    List<Ticket> tickets = erailService.findallTicket(); // Fetch all tickets
	    if (tickets != null && !tickets.isEmpty()) {
	        return new ResponseEntity<>(tickets, HttpStatus.OK); // Return tickets with 200 OK
	    }
	    return new ResponseEntity<>(HttpStatus.NO_CONTENT); // Return 204 No Content if no tickets found
	}

	
}

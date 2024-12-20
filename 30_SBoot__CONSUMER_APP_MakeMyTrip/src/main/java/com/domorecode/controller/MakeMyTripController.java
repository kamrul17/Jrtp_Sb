package com.domorecode.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.domorecode.binding.request.Ticket;
import com.domorecode.binding.response.Passenger;
import com.domorecode.service.MakeMyTripService;

@Controller
public class MakeMyTripController {
private MakeMyTripService mmtService;

	private MakeMyTripController(MakeMyTripService mmtService) {
	super();
	this.mmtService = mmtService;
}
	@GetMapping("/")
	public String index() {
		return "index";
	}
	@GetMapping("/gobackToIndex")
	public String index1() {
		return "index";
	}
	@GetMapping("/search")
	public String searchPage() {
		return "search";
	}
	@GetMapping("/searchResult")
	public String searchResult(@RequestParam("ticketId") Integer ticketId,Model model) {
		System.out.println(ticketId);
		Ticket ticketdetail=mmtService.getTicketById(ticketId);
		if (ticketdetail!=null) {
			model.addAttribute("ticket", ticketdetail);
			return "success";
		} else {
			return "error";
		}
		
		
	}
	
	@PostMapping("/submitPassenger")
	public String bookTicket( Passenger p,Model model){
		System.out.println(p);
	
		Ticket ticketdetails=mmtService.bookTicket(p);
		if (ticketdetails!=null) {
			model.addAttribute("ticket", ticketdetails);
			return "success";
		} else {
			return "error";
		}
//		
	}
	@GetMapping("/getTicketById/{tId}")
	public String getTicketById(@PathVariable Integer tId,Model model){
		
		Ticket ticketdetails=mmtService.getTicketById(tId);
		if (ticketdetails!=null) {
			model.addAttribute("ticket", ticketdetails);
			return "success";
		} else {
			return "error";
		}
		
		
	}
	@GetMapping("/findAllTicket")
	public String findAllTicket(Model model){
		
		List<Ticket> ticketdetails=mmtService.findAllTicket();
		if (ticketdetails!=null&&!ticketdetails.isEmpty()) {
			model.addAttribute("tickets", ticketdetails);
			return "successAll";
		} else {
			return "error";
		}
		
		
	}
}

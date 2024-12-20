package com.domorecode.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.domorecode.binding.request.Ticket;
import com.domorecode.binding.response.Passenger;
@Service
public class ErailService {

	public Map<Integer, Ticket>ticket=new HashMap<>();
	private int id=1;
	public Ticket bookTicket(Passenger pd) {

		Ticket t=new Ticket();
	t.setTicketId(id);
	t.setTicketCost("100");
	t.setTicketFrom(pd.getFrom());
t.setTicketTo(pd.getTo());
t.setTrainNum(pd.getTrainNum());
t.setTicketStatus("confirm");
t.setTicketCost("500");
ticket.put(id, t);
id++;
		return t;
		
	}
	
	public Ticket getTicketById(Integer id) {
		for (Map.Entry<Integer, Ticket> entry : ticket.entrySet()) {
		   if (ticket.containsKey(id)) {
			return ticket.get(id);
		}
		}
		return null;
		
	}

	public List<Ticket> findallTicket() {
	    return new ArrayList<>(ticket.values());
	}


}

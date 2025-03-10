package cts.ems.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cts.ems.entity.Ticket;
import cts.ems.service.TicketService;


@RestController
@RequestMapping("/ticket-api")
public class TicketController {
	
	@Autowired
	TicketService ticketService;
	
	@PostMapping("/bookticket")
	public Ticket bookTicket(@RequestBody Ticket ticket) { 
		Ticket ticket1 = ticketService.bookTicket(ticket);
		return ticket1;	
	}
	
	@GetMapping("/viewtickets")
	public List<Ticket> viewTickets() {
		List<Ticket> ticket = ticketService.viewTickets();
		return ticket;
	}
	
	@DeleteMapping("/cencelticket/{ticketID}")
	public String cencelTicket(@PathVariable int ticketID) {
		String msg = ticketService.cencelTicket(ticketID);
		return msg;
	}

}









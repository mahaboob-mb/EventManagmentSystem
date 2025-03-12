package cts.ems.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import cts.ems.dto.Event;
import cts.ems.dto.Ticket;
import cts.ems.service.TicketService;


@RestController
@RequestMapping("/ticket-api")
public class TicketController {
	
	@Autowired
	TicketService ticketService;
	
	@PostMapping("/book")
	public Ticket bookTicket(@RequestBody Ticket ticket) { 
		Ticket ticket1 = ticketService.bookTicket(ticket);
		return ticket1;	
	}
	
	@GetMapping("/view")
	public List<Ticket> viewTickets() {
		List<Ticket> ticket = ticketService.viewTickets();
		return ticket;
	}
	
	@DeleteMapping("/cencel/{ticketID}")
	public String cencelTicket(@PathVariable int ticketID) {
		String msg = ticketService.cencelTicket(ticketID);
		return msg;
	}
	
	@GetMapping("/getallby/{eventID}")
	public ResponseEntity<Ticket> getAllByEventID(@PathVariable int eventID){
		List<Ticket> tickets = ticketService.getAllByEventID(eventID);
		ResponseEntity<Ticket> responseEntity = new ResponseEntity(tickets, HttpStatus.NOT_FOUND);
		return responseEntity;
	}
	
	@GetMapping("/getallby/{userID}")
	public List<Ticket> getAllByUserID(@PathVariable int userID){
		return ticketService.getAllByEventID(userID);
	}

}









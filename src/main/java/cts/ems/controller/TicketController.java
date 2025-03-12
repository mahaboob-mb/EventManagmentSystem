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
        return ticketService.bookTicket(ticket);    
    }
    
    @GetMapping("/view")
    public List<Ticket> viewTickets() {
        return ticketService.viewTickets();
    }
    
    @DeleteMapping("/cancel/{ticketID}")  // Corrected spelling from cencel to cancel
    public String cancelTicket(@PathVariable long ticketID) {
        return ticketService.cancelTicket(ticketID);
    }
    
    @GetMapping("/getallby/event/{eventID}")
    public ResponseEntity<List<Ticket>> getAllByEventID(@PathVariable long eventID) {
        List<Ticket> tickets = ticketService.getAllByEventID(eventID);
        return new ResponseEntity<>(tickets, HttpStatus.OK);
    }
    
    @GetMapping("/getallby/user/{userID}")
    public ResponseEntity<List<Ticket>> getAllByUserID(@PathVariable long userID) {
        List<Ticket> tickets = ticketService.getAllByUserID(userID);
        return new ResponseEntity<>(tickets, HttpStatus.OK);
    }
    
    @GetMapping("/view/cancelled")
    public List<Ticket> viewCancelledTickets() {
        return ticketService.viewCancelledTickets();
    }
}









package cts.ems.service;

import java.util.List;

import cts.ems.dto.Ticket;

public interface TicketService {
	
	Ticket bookTicket(Ticket ticket);
    List<Ticket> viewTickets();
    String cancelTicket(long ticketID);  
    List<Ticket> getAllByEventID(long eventID);
    List<Ticket> getAllByUserID(long userID);
    public List<Ticket> viewCancelledTickets() ;
}

package cts.ems.service;

import java.util.List;

import cts.ems.entity.Ticket;

public interface TicketService {
	
	public Ticket bookTicket( Ticket ticket);
	public List<Ticket> viewTickets();
	public String cencelTicket(int ticketID);
}

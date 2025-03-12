package cts.ems.service;

import java.util.List;

import cts.ems.dto.Ticket;

public interface TicketService {
	
	public Ticket bookTicket( Ticket ticket);
	public List<Ticket> viewTickets();
	public String cencelTicket(int ticketID);
	public List<Ticket> getAllByEventID(int eventID);
	public List<Ticket> getAllByUserID(int userID);
}

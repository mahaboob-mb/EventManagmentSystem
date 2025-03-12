package cts.ems.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import org.springframework.web.bind.annotation.PathVariable;
//import cts.ems.dto.Event;
import cts.ems.dto.Ticket;
import cts.ems.repository.TicketRepository;


@Service
public class TicketServiceImpt implements TicketService {
	
	@Autowired
	TicketRepository ticketRepository;
	
	public Ticket bookTicket(Ticket ticket) {
		Ticket ticket1 = ticketRepository.save(ticket);
		return ticket1;
	}
	
	public List<Ticket> viewTickets(){
		List<Ticket> ticket = ticketRepository.findAll();
		return ticket;
	}
	
	public String cencelTicket(int ticketID) {
		ticketRepository.deleteById(ticketID);
		return "Deleted Successfully";
	}
	
	public List<Ticket> getAllByEventID(int eventID){
		return ticketRepository.findAllByEventID(eventID);
	}
	
	public List<Ticket> getAllByUserID(int userID){
		return ticketRepository.findAllByUserID(userID);
	}
}

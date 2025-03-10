package cts.ems.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import cts.ems.entity.Ticket;
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
}

package cts.ems.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import org.springframework.web.bind.annotation.PathVariable;
//import cts.ems.dto.Event;
import cts.ems.dto.Ticket;
import cts.ems.repository.TicketRepository;
import jakarta.transaction.Transactional;


@Service
public class TicketServiceImpt implements TicketService {
	
	
	@Autowired
    TicketRepository ticketRepository;
    
    public Ticket bookTicket(Ticket ticket) {
        return ticketRepository.save(ticket);
    }
    
    public List<Ticket> viewTickets() {
        return ticketRepository.findByStatus("Booked");
    }
    
    @Transactional  
    public String cancelTicket(long ticketID) {
        Ticket ticket = ticketRepository.findById(ticketID).orElseThrow(() -> new RuntimeException("Ticket not found"));
        ticket.setStatus("Cancelled");
        ticketRepository.save(ticket);
        return "Cancelled Successfully";
    }
    
    public List<Ticket> getAllByEventID(long eventid) {
        return ticketRepository.findAllByEventid(eventid);
    }
    
    public List<Ticket> getAllByUserID(long userid) {
        return ticketRepository.findAllByUserid(userid);
    }
    
    public List<Ticket> viewCancelledTickets() {
        return ticketRepository.findByStatus("Cancelled");
    }
}

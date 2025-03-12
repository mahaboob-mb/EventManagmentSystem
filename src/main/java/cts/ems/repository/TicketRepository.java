package cts.ems.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cts.ems.dto.Ticket;

@Repository
public interface TicketRepository extends JpaRepository<Ticket, Long> {  // Change Integer to Long
	// Ensure the field name matches
    //void deleteByTicketID(long ticketID);
    List<Ticket> findAllByEventid(long eventid);
    List<Ticket> findAllByUserid(long userid);
    List<Ticket> findByStatus(String status); 
}

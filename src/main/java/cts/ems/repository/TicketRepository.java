package cts.ems.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cts.ems.dto.Ticket;

@Repository
public interface TicketRepository extends JpaRepository<Ticket, Integer> {
	
	List<Ticket> findAllByEventID(int eventID);
	List<Ticket> findAllByUserID(int userID);
}

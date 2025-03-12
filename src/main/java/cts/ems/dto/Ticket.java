package cts.ems.dto;

import java.time.LocalDate;
//import java.time.LocalDateTime;
//import java.time.LocalDateTime;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Ticket {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ticketID;
	
	@ManyToOne
	private Event event;
	
	@ManyToOne
	private User user;
	
	@NotNull
	private LocalDate bookingDate;
	
	@NotNull
	private String status;
	
}

package cts.ems.dto;


import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Event {
	@Id
	private Long eventID;
	private String eventName;
	private String category;
	private String location;
	@NotNull
	private LocalDateTime date;
	private String organizerID;
	
}

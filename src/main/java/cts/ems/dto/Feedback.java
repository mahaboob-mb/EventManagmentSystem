package cts.ems.dto;

import java.security.Timestamp;
//import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
//import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Feedback {
	@Id
	private int feedbackID;
	private int eventID;
	private int userID;
	private int rating;
	private String comments;
	private Timestamp submittedTimestamp; 

}

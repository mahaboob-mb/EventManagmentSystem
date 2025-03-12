package cts.ems.dto;


import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
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
	private LocalDateTime date;
	private String organizerID;
	
//	@Override
//	public String toString() {
//		return "Event [eventID=" + eventID + ", eventName=" + eventName + ", category=" + category + ", date=" + date
//				+ ", organizerID=" + organizerID + "]";
//	}
//	public int getEventID() {
//		return eventID;
//	}
//	public void setEventID(int eventID) {
//		this.eventID = eventID;
//	}
//	public String getEventName() {
//		return eventName;
//	}
//	public void setEventName(String eventName) {
//		this.eventName = eventName;
//	}
//	public String getCategory() {
//		return category;
//	}
//	public void setCategory(String category) {
//		this.category = category;
//	}
//	public String getDate() {
//		return date;
//	}
//	public void setDate(String date) {
//		this.date = date;
//	}
//	public String getOrganizerID() {
//		return organizerID;
//	}
//	public void setOrganizerID(String organizerID) {
//		this.organizerID = organizerID;
//	}
	
}

package cts.ems.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Ticket {
	@Id
	private int ticketID;
	private int eventID;
	private int userID;
	private String bookingDate;
	private String status;
	
//	public Ticket(int ticketID, int eventID, int userID, String bookingDate, String status) {
//		super();
//		this.ticketID = ticketID;
//		this.eventID = eventID;
//		this.userID = userID;
//		this.bookingDate = bookingDate;
//		this.status = status;
//	}
//	
	
	@Override
	public String toString() {
		return "Ticket [ticketID=" + ticketID + ", eventID=" + eventID + ", userID=" + userID + ", bookingDate="
				+ bookingDate + ", status=" + status + "]";
	}
	
	public int getTicketID() {
		return ticketID;
	}
	public void setTicketID(int ticketID) {
		this.ticketID = ticketID;
	}
	public int getEventID() {
		return eventID;
	}
	public void setEventID(int eventID) {
		this.eventID = eventID;
	}
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
	public String getBookingDate() {
		return bookingDate;
	}
	public void setBookingDate(String bookingDate) {
		this.bookingDate = bookingDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
}

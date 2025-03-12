package cts.ems.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cts.ems.dto.Event;
import cts.ems.repository.EventRepository;


@Service
public class EventServiceImpt implements EventService{
	
	@Autowired
	EventRepository eventrepo;
	
	public Event addEvent(Event event) {
	
		return eventrepo.save(event);
		
	}
	
	public List<Event> getAllEvent() {
		return eventrepo.findAll();
	}
	
	public Event updateEvent(Event event) {
		System.out.println("Service layer - updateevent - method");
		Event event1 = eventrepo.save(event);
		return event1;
	}
	public Event findById(int eventID) {
		Optional<Event> event = eventrepo.findById(eventID);
		if(event.isPresent()) {
			return event.get();
		}
		return null;
	}
	
	public String deleteById(int eventID) {
		Optional<Event> event = eventrepo.findById(eventID);
		if(event.isPresent()) {
			eventrepo.deleteById(eventID);
			return "Successfully Deleted";
		}
		return "Wrong eventID";
		
	}
}



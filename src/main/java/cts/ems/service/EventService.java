package cts.ems.service;

import java.util.List;
import cts.ems.entity.Event;
 

public interface EventService {
	public Event addEvent(Event event);
	public List<Event> getAllEvent();
	public Event updateEvent(Event event);
	public Event findById(int eventID);
	public String deleteById(int eventID);
}

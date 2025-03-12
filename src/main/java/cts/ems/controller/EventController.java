package cts.ems.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import cts.ems.dto.Event;
import cts.ems.service.EventService;

@RestController
@RequestMapping("/event-api")
public class EventController {
	
	@Autowired
	EventService eventService;
	
	@PostMapping("/create")
	public Event addEvent(@RequestBody Event event) {		
		return eventService.addEvent(event);
	}
	
	@GetMapping("/displayall")
	public List<Event> getAllEvent(){
		List<Event> events = eventService.getAllEvent();
		return events;
	}
	
	@PostMapping("/update")
	public Event updateEvent(@RequestBody Event event) {
		System.out.println("Event");
		Event event1 = eventService.addEvent(event);
		return event1;
	}
	
	@GetMapping("/findbyid/{eventID}")
	public Event findById(@PathVariable int eventID) {
		Event event = eventService.findById(eventID);
		return event;	
	}
	
	@DeleteMapping("/deletebyid/{eventID}")
	public String deleteById(@PathVariable int eventID) {
		String msg = eventService.deleteById(eventID);
		return msg;
	}
	
	
}

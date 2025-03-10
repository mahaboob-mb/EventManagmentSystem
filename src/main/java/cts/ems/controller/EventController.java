package cts.ems.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import cts.ems.entity.Event;
import cts.ems.service.EventService;

@RestController
public class EventController {
	
	@Autowired
	EventService eventService;
	
//	@GetMapping("/openform")
//	@ResponseBody
//	public String openForm() {
//		return "openform";
//	}
	
	@PostMapping("/addevent")
	public Event addEvent(@RequestBody Event event) {
		System.out.println("Event");
		Event event1 = eventService.addEvent(event);
		return event1;
	}
	
	@GetMapping("/allevents")
	public List<Event> getAllEvent(){
		List<Event> events = eventService.getAllEvent();
		return events;
	}
	
	@PostMapping("/updateevent")
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

package cts.ems.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cts.ems.dto.Event;

public interface EventRepository extends JpaRepository<Event, Integer>{

}

package com.project2.cinema.repositories;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project2.cinema.entities.Event;
import com.project2.cinema.repositories.interfaces.EventRepositoryInt;


public interface EventRepository extends JpaRepository<Event, Integer>, EventRepositoryInt {

	//TODO	
	
	public default boolean addEvent(Event event) {
		save(event);
		return false;
	}
	
	public default boolean updateEvent(Event event) {
		save(event);
		return false;
	}
	
	public default boolean deleteEvent(int id) {
		deleteById(id);
		return false;
	}
	
	public default Event getEvent(int id) {
		getById(id);
		return null;
	}
	
	public default List<Event> getAllEvents() {
		//TODO
		return null;
	}
	
	public default List<Event> getEventsByDay(LocalDate date) {
		//TODO
		return null;
	}
	
	
}

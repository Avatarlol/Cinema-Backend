package com.project2.cinema.repositories;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project2.cinema.entities.Event;
import com.project2.cinema.entities.Movie;
import com.project2.cinema.repositories.interfaces.EventRepositoryInt;


public interface EventRepository extends JpaRepository<Event, Integer>, EventRepositoryInt {

	//TODO	
	
	public default Event addEvent(Event event) {
		event = save(event);
		return event;
	}
	
	public default Event updateEvent(Event event) {
		event = save(event);
		return event;
	}
	
	public default void deleteEvent(int id) {
			deleteById(id);
		}
		
	
	public default Event getEvent(int id) {
		Event event = findById(id).get();
		return event;
	}
	
	public default List<Event> getAllEvents() {
		List<Event> events = findAll();
		return events;
	}
	
	public default List<Event> getEventsByDay(LocalDateTime date) {
		List<Event> events = findByStartTimeBetween(date, date.plusDays(1));
		return events;
	}
	
	public List<Event> findByStartTimeBetween(LocalDateTime after, LocalDateTime before);
	
	public default List<Event> getEventsByMovie(Movie movie) {
		List<Event> events = findByMovie(movie);
		return events;
	}
	
	public List<Event> findByMovie(Movie movie);
}

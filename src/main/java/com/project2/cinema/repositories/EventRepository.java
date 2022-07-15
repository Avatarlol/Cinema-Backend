package com.project2.cinema.repositories;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project2.cinema.entities.Event;
import com.project2.cinema.entities.Movie;
import com.project2.cinema.repositories.interfaces.EventRepositoryInt;

public interface EventRepository extends JpaRepository<Event, Integer>, EventRepositoryInt {
	
	public default Event addEvent(Event event) {
		return save(event);
	}
	
	public default Event updateEvent(Event event) {
		return save(event);
	}
	
	public default void deleteEvent(int id) {
		deleteById(id);
	}
		
	
	public default Event getEvent(int id) {
		return findById(id).get();
	}
	
	public default List<Event> getAllEvents() {
		return findAll();
	}
	
	public default List<Event> getEventsByDay(LocalDateTime date) {
		return findByStartTimeBetween(date, date.plusDays(1));
	}
	
	public List<Event> findByStartTimeBetween(LocalDateTime after, LocalDateTime before);
	
	public default List<Event> getEventsByMovie(Movie movie) {
		return findByMovie(movie);
	}
	
	public List<Event> findByMovie(Movie movie);
}

package com.project2.cinema.repositories.interfaces;

import java.time.LocalDateTime;
import java.util.List;

import com.project2.cinema.entities.Event;
import com.project2.cinema.entities.Movie;

public abstract interface EventRepositoryInt{

	public Event addEvent(Event event);
	
	public Event updateEvent(Event event);
	
	public void deleteEvent(int id);
	
	public Event getEvent(int id);
	
	public List<Event> getAllEvents();
	
	public List<Event> getEventsByDate(LocalDateTime date);
	
	public List<Event> getEventsByMovie(Movie movie);
	
	public List<Event> findByMovieNameContaining(String name);
	
	public List<Event> getEventsByDateAndName(LocalDateTime date, String name);
	
}

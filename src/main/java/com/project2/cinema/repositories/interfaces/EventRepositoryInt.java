package com.project2.cinema.repositories.interfaces;

import java.time.LocalDate;
import java.util.List;

import com.project2.cinema.entities.Event;

public abstract interface EventRepositoryInt{

	public boolean addEvent(Event event);
	
	public boolean updateEvent(Event event);
	
	public boolean deleteEvent(int id);
	
	public Event getEvent(int id);
	
	public List<Event> getAllEvents();
	
	public List<Event> getEventsByDay(LocalDate date);
	
}

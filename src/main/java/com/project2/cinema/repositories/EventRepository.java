package com.project2.cinema.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project2.cinema.entities.Event;
import com.project2.cinema.repositories.interfaces.EventRepositoryInt;

public interface EventRepository extends JpaRepository<Event, Integer>, EventRepositoryInt {

	public void addEvent(Event event);
	
	public void deleteEvent(int id);
}

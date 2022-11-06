package com.project2.cinema.repositories;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

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
	
	public default List<Event> getEventsByDate(LocalDateTime date) {
		return findByStartTimeBetween(date, date.plusDays(1));
	}
	
	public default List<Event> getEventsByDateAndName(LocalDateTime date, String name){
		return findByStartTimeBetweenAndMovieNameContaining(date, date.plusDays(1), name);
	}
	
	public List<Event> findByStartTimeBetweenAndMovieNameContaining(LocalDateTime date, LocalDateTime dayAfter, String name);
	
	public List<Event> findByStartTimeBetween(LocalDateTime after, LocalDateTime before);
	
	public default List<Event> getEventsByMovie(Movie movie) {
		return findByMovie(movie);
	}
	
	public List<Event> findByMovie(Movie movie);
	
	public List<Event> findByStartTimeBeforeAndEndTimeAfter(LocalDateTime startTime, LocalDateTime endTime);
	
	@Query(nativeQuery = true, value = "select * from cinema.events where theater_id = :theaterId  and (:startTime < end_time and :endTime > start_time)")
	public List<Event> isAnyOverlaps(@Param("startTime") LocalDateTime startTime, @Param("endTime")LocalDateTime endTime, @Param("theaterId") int theaterId);
	
	
}

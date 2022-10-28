package com.project2.cinema.services;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.project2.cinema.entities.Event;
import com.project2.cinema.entities.Movie;
import com.project2.cinema.entities.Theater;
import com.project2.cinema.exceptions.ConditionsNotMet;
import com.project2.cinema.repositories.EventRepository;
import com.project2.cinema.repositories.MovieRepository;
import com.project2.cinema.repositories.TheaterRepository;
import com.project2.cinema.repositories.TicketRepository;

@Component
public class Conditions {

	@Autowired
	protected EventRepository eventRepository;
	@Autowired
	protected MovieRepository movieRepository;
	@Autowired
	protected TheaterRepository theaterRepository;
	@Autowired
	protected TicketRepository ticketRepository;
	
	//TODO
	
	//THEATER CONDITIONS
	
	public boolean newTheaterCondition(Theater theater) throws ConditionsNotMet {
		
		boolean isTheaterNumExists = theaterRepository.existsByTheaterNumber(theater.getTheaterNumber());
		
		if(!isTheaterNumExists)
			return true;
		throw new ConditionsNotMet();
	}
	
	public boolean updateTheaterCondition(Theater theater) throws ConditionsNotMet {
		
		boolean isIdExists = theaterRepository.existsById(theater.getId());
		
		if(isIdExists)
			return true;
		throw new ConditionsNotMet();
	}
	
	public boolean deleteTheaterCondition(Theater theater) throws ConditionsNotMet {
		
		boolean isIdExists = theaterRepository.existsByTheaterNumber(theater.getId());
		
		if(isIdExists)
			return true;
		throw new ConditionsNotMet();
	}
	
	//MOVIE CONDITIONS
	
	public boolean newMovieCondition(Movie movie) throws ConditionsNotMet {
		
		boolean isNameExists = movieRepository.existsByName(movie.getName());
		
		if(!isNameExists)
			return true;
		throw new ConditionsNotMet();
	}
	
	public boolean updateMovieCondition(Movie movie) throws ConditionsNotMet {
		
		boolean isIdExists = movieRepository.existsById(movie.getId());
		
		if(isIdExists)
			return true;
		throw new ConditionsNotMet();
	}
	
	public boolean deleteMovieCondition(Movie movie) throws ConditionsNotMet {
		
		boolean isIdExists = movieRepository.existsById(movie.getId());
		
		if(isIdExists)
			return true;
		throw new ConditionsNotMet();
	}
	
	//EVENT CONDITIONS
	
	public boolean newEventCondition(Event e) throws ConditionsNotMet {
		
//		LocalDateTime start = LocalDateTime.of(LocalDate.of(2022, 7, 13), LocalTime.of(22, 59, 59));
//		LocalDateTime end = LocalDateTime.of(LocalDate.of(2022, 7, 17), LocalTime.of(23, 0, 1));
		
		System.out.println(e.getStartTime() + " | > | " + e.getEndTime());
		List<Event> list =  eventRepository.isAnyOverlaps(e.getStartTime(), e.getEndTime(), e.getTheater().getId());
		System.out.println("FOUND:");
		list.forEach(System.out::println);
		
		boolean isNotOverlaps = false;
		
		if(isNotOverlaps)
			return true;
		throw new ConditionsNotMet();
	}
	
	public boolean updateEventCondition(Event event) throws ConditionsNotMet {
		return true;
	}
	
	public boolean deleteEventCondition(Event event) throws ConditionsNotMet {
		return true;
	}
	
	//TICKET CONDITIONS
	
	public boolean newTicketCondition() throws ConditionsNotMet {
		return true;
	}
	
	public boolean updateTicketCondition() throws ConditionsNotMet {
		return true;
	}
	
	public boolean deleteTicketCondition() throws ConditionsNotMet {
		return true;
	}
}

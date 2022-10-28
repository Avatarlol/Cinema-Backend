package com.project2.cinema.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.project2.cinema.entities.Event;
import com.project2.cinema.entities.Movie;
import com.project2.cinema.entities.Theater;
import com.project2.cinema.exceptions.ConditionsNotMet;
import com.project2.cinema.exceptions.IncorrectCredentials;

@Service
public class AdminService extends ClientService{
	
	@Value("${admin.username}")
	private String ADMIN_USERNAME;
	@Value("${admin.password}")
	private String ADMIN_PASSWORD;
	
	public AdminService() {
		super();
	}
	
	public AdminService login(String username, String password) throws IncorrectCredentials {
		if(ADMIN_USERNAME.equalsIgnoreCase(username) &&
		   ADMIN_PASSWORD.equals(password))
			return this;
		throw new IncorrectCredentials();
	}
	
	//THEATERS
	
	public void addTheater(Theater theater) throws ConditionsNotMet {
		if(condition.newTheaterCondition(theater)) {
			theaterRepository.addTheater(theater);
			return;
		}
		throw new ConditionsNotMet();
	}
	
	public void updateTheater(Theater theater) throws ConditionsNotMet {
		if(condition.updateTheaterCondition(theater)) {
			theaterRepository.updateTheater(theater);
			return;
		}
		throw new ConditionsNotMet();
	}
	
	public void deleteTheater(Theater theater) throws ConditionsNotMet {
		if(condition.deleteTheaterCondition(theater)) {
			theaterRepository.deleteTheater(theater.getId());
			return;
		}
		throw new ConditionsNotMet();
	}
	
	public Theater getTheater(int id) {
		return theaterRepository.getTheater(id);
	}
	
	public List<Theater> getAllTheaters() {
		return theaterRepository.getAllTheaters();
	}
	
	
	//EVENTS
	
	public void addEvent(Event event) throws ConditionsNotMet {
		if(condition.newEventCondition(event)) {
//			eventRepository.addEvent(event);
			//TODO generate tickets 
			return;
		}
		throw new ConditionsNotMet();
	}
	
	public void updateEvent(Event event) throws ConditionsNotMet {
		if(condition.updateEventCondition(event)) {
			eventRepository.updateEvent(event);
			return;
		}
		throw new ConditionsNotMet();
	}
	
	public void deleteEvent(Event event) throws ConditionsNotMet {
		if(condition.deleteEventCondition(event)) {
			eventRepository.deleteEvent(event.getId());
			//TODO TEST - spring deletes related tickets?
			return;
		}
		throw new ConditionsNotMet();
	}
	
	//MOVIES
	
	public void addMovie(Movie movie) throws ConditionsNotMet {
		if(condition.newMovieCondition(movie)) {
			movieRepository.addMovie(movie);
			return;
		}
		throw new ConditionsNotMet();
	}
	
	public void updateMovie(Movie movie) throws ConditionsNotMet {
		if(condition.updateMovieCondition(movie)) {
			movieRepository.updateMovie(movie);
			return;
		}
		throw new ConditionsNotMet();
	}
	
	public void deleteMovie(Movie movie) throws ConditionsNotMet {
		if(condition.deleteMovieCondition(movie)) {
			movieRepository.deleteMovie(movie.getId());
			return;
		}
		throw new ConditionsNotMet();
	}
	
}

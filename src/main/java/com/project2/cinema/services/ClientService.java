package com.project2.cinema.services;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.project2.cinema.entities.Event;
import com.project2.cinema.entities.Movie;
import com.project2.cinema.entities.Movie.Genre;
import com.project2.cinema.entities.Theater;
import com.project2.cinema.repositories.interfaces.EventRepositoryInt;
import com.project2.cinema.repositories.interfaces.MovieRepositoryInt;
import com.project2.cinema.repositories.interfaces.TheaterRepositoryInt;
import com.project2.cinema.repositories.interfaces.TicketRepositoryInt;

public abstract class ClientService {
	
	@Autowired
	protected EventRepositoryInt eventRepository;
	@Autowired
	protected MovieRepositoryInt movieRepository;
	@Autowired
	protected TheaterRepositoryInt theaterRepository;
	@Autowired
	protected TicketRepositoryInt ticketRepository;
	@Autowired
	protected Conditions condition;
	
	//EVENTS
	
	public Event getEvent(int id) {
		return eventRepository.getEvent(id);
	}
	
	public List<Event> getAllEvents() {
		return eventRepository.getAllEvents();
	}
	
	public List<Event> getEventsByDate(LocalDateTime day) {
		return eventRepository.getEventsByDate(day);
	}
	
	public List<Event> getEventsByMovie(Movie movie) {
		return eventRepository.getEventsByMovie(movie);
	}
	
	public List<Event> getEventsByMovieName(String name){
		return eventRepository.findByMovieNameContaining(name);
	}
	
	public List<Event> getEventByDateAndMovieName(LocalDateTime date, String name){
		return eventRepository.getEventsByDateAndName(date, name);
	}
	
	//MOVIES
	
	public Movie getMovie(int id){
		return movieRepository.getMovie(id);
	}
	
	public List<Movie> getAllMovies() {
		return movieRepository.getAllMovies();
	}
	
	public List<Movie> getMoviesByGenre(Genre genre){
		return movieRepository.findByGenre(genre);
	}
	
	public List<Movie> getMoviesByName(String name){
		return movieRepository.findByNameContaining(name);
	}
	

	
}

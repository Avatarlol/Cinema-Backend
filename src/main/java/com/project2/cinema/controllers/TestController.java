package com.project2.cinema.controllers;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project2.cinema.entities.Event;
import com.project2.cinema.entities.Movie;
import com.project2.cinema.entities.Movie.Genre;
import com.project2.cinema.services.AdminService;
import com.project2.cinema.services.GuestService;
import com.project2.cinema.util.Filter;

@RestController
@RequestMapping("/")
public class TestController {
	
	@Autowired
	AdminService adminService;
	@Autowired
	GuestService guestService;
	
	@PostMapping("test")
	public ResponseEntity<?> test(@RequestBody Movie movie) {
		try {
			System.out.println(movie);
//			Movie movie = Movie.builder().desc("E1S1").genre(Genre.HORROR).name("Stranger Things").length(Duration.ofHours(1)).build();
			adminService.addMovie(movie);
			return new ResponseEntity<Boolean>(true,HttpStatus.OK);
		}catch (Exception e) {
			return new ResponseEntity<String>(e.getMessage(),HttpStatus.BAD_REQUEST);
		}

	}
	
	@GetMapping("getGenres")
	public ResponseEntity<?> getGenres() {
		return new ResponseEntity<Genre[]>(Movie.Genre.values(), HttpStatus.OK); 
	}
	
	@GetMapping("movie/all")
	public ResponseEntity<?> getAllMovies() {
		return new ResponseEntity<List<Movie>>(guestService.getAllMovies(), HttpStatus.OK); 
	}
	
	@GetMapping("event/all")
	public ResponseEntity<?> getAllEvents() {
		return new ResponseEntity<List<Event>>(guestService.getAllEvents(), HttpStatus.OK); 
	}
	
	@PostMapping("movie/filter")
	public ResponseEntity<?> getFilteredMovies(@RequestBody Filter filter) {
		if(filter.getName() == null) { // <-- if name is null, movie genre is the filter
			System.out.println("genre filter:" + filter);
			return new ResponseEntity<List<Movie>>(guestService.getMoviesByGenre(filter.getGenre()), HttpStatus.OK);
		}
		System.out.println("name filter: " + filter);
		return new ResponseEntity<List<Movie>>(guestService.getMoviesByName(filter.getName()), HttpStatus.OK);
	}
	
	@PostMapping("event/filter")
	public ResponseEntity<?> getFilteredEvents(@RequestBody Filter filter) {
		System.out.println("filters: " + filter);
		if(filter.getDate()==null)
			return new ResponseEntity<List<Event>>(guestService.getEventsByMovieName(filter.getName()), HttpStatus.OK);
		return new ResponseEntity<List<Event>>(guestService.getEventByDateAndMovieName(filter.getDate().atStartOfDay(), filter.getName()), HttpStatus.OK);
	}
	
}

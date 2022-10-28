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

import com.project2.cinema.entities.Movie;
import com.project2.cinema.entities.Movie.Genre;
import com.project2.cinema.services.AdminService;
import com.project2.cinema.services.GuestService;

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
	
	@PostMapping("test1")
	public ResponseEntity<?> test1(@RequestBody Map<String,String> map) {
		return new ResponseEntity<List<Movie>>(guestService.getAllMovies(), HttpStatus.OK); 
	}
}

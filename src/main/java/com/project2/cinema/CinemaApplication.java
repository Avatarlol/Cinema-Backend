package com.project2.cinema;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.project2.cinema.entities.Event;
import com.project2.cinema.entities.Movie;
import com.project2.cinema.entities.Movie.Genre;
import com.project2.cinema.entities.Theater;
import com.project2.cinema.repositories.EventRepository;
import com.project2.cinema.repositories.MovieRepository;
import com.project2.cinema.repositories.TheaterRepository;
import com.project2.cinema.repositories.TicketRepository;
import com.project2.cinema.repositories.interfaces.EventRepositoryInt;
import com.project2.cinema.repositories.interfaces.MovieRepositoryInt;
import com.project2.cinema.repositories.interfaces.TheaterRepositoryInt;
import com.project2.cinema.repositories.interfaces.TicketRepositoryInt;

@SpringBootApplication
public class CinemaApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(CinemaApplication.class, args);
		
		MovieRepositoryInt movieRep = ctx.getBean(MovieRepository.class);
		TheaterRepositoryInt theaterRep = ctx.getBean(TheaterRepository.class);
		TicketRepositoryInt ticketRep = ctx.getBean(TicketRepository.class);
		EventRepositoryInt eventRep = ctx.getBean(EventRepository.class);
		
//		Theater t = Theater.builder()
//				.id(8)
//				.seats(20)
//				.theaterNumber(1)
//				.build();
		
//		e.getMovie().setLength(Duration.ofMinutes(131));
//		eventRep.updateEvent(e);
		
//		
//		Movie m = Movie.builder()
//				.id(3)
//				.desc("description")
//				.genre(Genre.ADVENTURE)
//				.name("movie name")
//				.build();
//		
//		
//		Event e = Event.builder()
//				.id(0)
//				.startTime(LocalDateTime.of(2022,7,15,10,00))
//				.movie(null)
//				.theater(null)
//				.build();
//
//		eventRep.addEvent(e);
	
		Movie m = movieRep.getMovie(1);
		System.out.println(m + "\n");
		
		System.out.println(eventRep.getEventsByMovie(m));
		
	}

}

package com.project2.cinema;

import java.time.LocalDateTime;
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
		
		Theater t = Theater.builder()
				.id(8)
				.seats(10)
				.theaterNumber(1)
				.build();
		
		Movie m = Movie.builder()
				.id(3)
				.desc("description")
				.genre(Genre.ADVENTURE)
				.name("movie name")
				.build();
		
		Event e = ctx.getBean(Event.class);
		
		e.setMovie(movieRep.getMovie(3));
		e.setStart_time(LocalDateTime.of(2022,10,1,20,30));
		e.setTheater(theaterRep.getTheater(8));
		
//		Event e = Event.builder()
//				.id(0)
//				.start_time(LocalDateTime.of(2022,10,1,20,30))
//				.movie(movieRep.getById(3))
//				.theater(theaterRep.getById(8))
//				.build();
		
		System.out.println(e);
		
		eventRep.addEvent(e);
		
//		Movie movie1 = Movie.builder()
//				.name("Harry Potter")
//				.desc("harry potter movie stuff")
//				.genre(Genre.ADVENTURE)
//				.build();
//		
//		System.out.println(movie1);
//		movieRep.save(movie1);
//		
//		
//		Theater th = Theater.builder()
//				.seats(50)
//				.build();
//		
//		System.out.println(th);
//		
//		theaterRep.save(th);
		
	}

}

package com.project2.cinema;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.project2.cinema.entities.Movie;
import com.project2.cinema.entities.Movie.Genre;
import com.project2.cinema.entities.Theater;
import com.project2.cinema.repositories.EventRepository;
import com.project2.cinema.repositories.MovieRepository;
import com.project2.cinema.repositories.TheaterRepository;
import com.project2.cinema.repositories.TicketRepository;

@SpringBootApplication
public class CinemaApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(CinemaApplication.class, args);
		
		MovieRepository movieRep = ctx.getBean(MovieRepository.class);
		TheaterRepository theaterRep = ctx.getBean(TheaterRepository.class);
		TicketRepository ticketRep = ctx.getBean(TicketRepository.class);
		EventRepository eventRep = ctx.getBean(EventRepository.class);
		
//		Movie movie1 = Movie.builder()
//				.name("Harry ter")
//				.desc("harry potter movie stuff")
//				.genre(Genre.ADVENTURE)
//				.build();
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

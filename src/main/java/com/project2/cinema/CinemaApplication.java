package com.project2.cinema;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.project2.cinema.entities.Event;
import com.project2.cinema.entities.Movie;
import com.project2.cinema.entities.Movie.Genre;
import com.project2.cinema.entities.Theater;
import com.project2.cinema.entities.Ticket;
import com.project2.cinema.exceptions.ConditionsNotMet;
import com.project2.cinema.repositories.EventRepository;
import com.project2.cinema.repositories.MovieRepository;
import com.project2.cinema.repositories.TheaterRepository;
import com.project2.cinema.repositories.TicketRepository;
import com.project2.cinema.repositories.interfaces.EventRepositoryInt;
import com.project2.cinema.repositories.interfaces.MovieRepositoryInt;
import com.project2.cinema.repositories.interfaces.TheaterRepositoryInt;
import com.project2.cinema.repositories.interfaces.TicketRepositoryInt;
import com.project2.cinema.services.AdminService;
import com.project2.cinema.services.GuestService;
import com.project2.cinema.util.DateUtil;
import com.project2.cinema.util.Random;

@SpringBootApplication
public class CinemaApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(CinemaApplication.class, args);
		
//		MovieRepositoryInt movieRep = ctx.getBean(MovieRepository.class);
//		TheaterRepositoryInt theaterRep = ctx.getBean(TheaterRepository.class);
//		TicketRepositoryInt ticketRep = ctx.getBean(TicketRepository.class);
		EventRepositoryInt eventRep = ctx.getBean(EventRepository.class);
		
		
		AdminService admin = ctx.getBean(AdminService.class);
		GuestService guest = ctx.getBean(GuestService.class);

		Event ev;
		try {
			for (int i = 0; i < 100; i++) {
				Movie m = admin.getMovie(Random.RandomBetween(2, 15));
				Theater t = admin.getTheater(Random.RandomBetween(200, 201));
				LocalDateTime start = LocalDateTime.of(2022, 11, Random.RandomBetween(7, 15), Random.RandomBetween(10, 23), Random.RandomBetween(0, 1)*30);
				System.out.println("iteration: "+i);
				ev = new Event(0, m, t, start);	
				try {
					admin.addEvent(ev);
				}catch (Exception e) {
					e.printStackTrace();
				}
				
			}
			
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
//		Movie movie = new Movie(0, 
//				"Bullet Train",
//				Genre.ACTION, "some description",
//				Duration.ofHours(2).plusMinutes(6),
//				"https://encrypted-tbn2.gstatic.com/images?q=tbn:ANd9GcSa_XrN4EhTrkQgTNM9vlQbwZ5VqhVLh7rqWAJ6un2GZdhjgR6K");
		
		try {
//			admin.addMovie(movie);
//			admin.addEvent(ev);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
//		System.out.println("select count(1)\r\n"
//				+ "from cinema.events\r\n"
//				+ "where (:startTime < end_time and :endtime > start_time)");
		
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
	
//		Movie m = movieRep.getMovie(1);
//		System.out.println(m + "\n");
//		
//		System.out.println(eventRep.getEventsByMovie(m));
//		Event event = eventRep.getEvent(20);
//		List<Integer> seats = List.of(13,14);
//		List<Ticket> tickets = ticketRep.getTicketsByEventAndSeat(event, seats);
//		System.out.println(tickets);
		
		
		
	}

}

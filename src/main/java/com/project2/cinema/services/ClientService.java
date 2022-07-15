package com.project2.cinema.services;

import org.springframework.beans.factory.annotation.Autowired;

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
}

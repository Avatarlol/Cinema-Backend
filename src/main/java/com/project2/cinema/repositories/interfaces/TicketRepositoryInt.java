package com.project2.cinema.repositories.interfaces;

import java.util.List;

import com.project2.cinema.entities.Event;
import com.project2.cinema.entities.Ticket;

public abstract interface TicketRepositoryInt {

	public Iterable<Ticket> addTickets(Iterable<Ticket> tickets);
	
	public Iterable<Ticket> updateTickets(Iterable<Ticket> tickets);
	
	public void deleteTickets(Iterable<Ticket> tickets);
	
	public List<Ticket> getTicketsBySeat(Iterable<Integer> seats);
	
	public  List<Ticket> getTicketsByEventAndSeat(Event event, Iterable<Integer> seats);
	
}

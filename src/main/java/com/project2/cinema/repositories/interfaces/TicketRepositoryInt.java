package com.project2.cinema.repositories.interfaces;

import java.util.List;

import com.project2.cinema.entities.Ticket;

public abstract interface TicketRepositoryInt {

	public Ticket addTickets(Iterable<Ticket> tickets);
	
	public Ticket updateTickets(Iterable<Ticket> tickets);
	
	public void deleteTickets(Iterable<Ticket> tickets);
	
	public List<Ticket> getTicketsBySeat(Iterable<Integer> seatNums);
	
}

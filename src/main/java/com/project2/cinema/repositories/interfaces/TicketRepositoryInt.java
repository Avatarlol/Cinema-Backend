package com.project2.cinema.repositories.interfaces;

import java.util.List;

import com.project2.cinema.entities.Ticket;

public abstract interface TicketRepositoryInt {

	public boolean addTickets(Iterable<Ticket> tickets);
	
	public boolean updateTickets(Iterable<Ticket> tickets);
	
	public boolean deleteTickets(Iterable<Ticket> tickets);
	
	public List<Ticket> getTicketsBySeat(Iterable<Integer> seatNums);
	
}

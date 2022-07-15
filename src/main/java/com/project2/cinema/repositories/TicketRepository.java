package com.project2.cinema.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project2.cinema.entities.Event;
import com.project2.cinema.entities.Ticket;
import com.project2.cinema.repositories.interfaces.TicketRepositoryInt;

public interface TicketRepository extends JpaRepository<Ticket, Integer>, TicketRepositoryInt {
	
	public default Iterable<Ticket> addTickets(Iterable<Ticket> tickets) {
		return saveAll(tickets);
	}
	
	public default Iterable<Ticket> updateTickets(Iterable<Ticket> tickets) {
		return saveAll(tickets);
	}
	
	public default void deleteTickets(Iterable<Ticket> tickets) {
		deleteAll(tickets);
	}
	
	public default List<Ticket> getTicketsBySeat(Iterable<Integer> seats) {
		return findBySeatIn(seats);
	}
	
	public default List<Ticket> getTicketsByEventAndSeat(Event event, Iterable<Integer> seats) {
		return findByEventAndSeatIn(event, seats);
	}
	
	public List<Ticket> findBySeatIn(Iterable<Integer> seats);
	public List<Ticket> findByEventAndSeatIn(Event event, Iterable<Integer> seats);
	
}

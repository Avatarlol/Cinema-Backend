package com.project2.cinema.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.project2.cinema.entities.Ticket;
import com.project2.cinema.repositories.interfaces.TicketRepositoryInt;

@Service
public interface TicketRepository extends JpaRepository<Ticket, Integer>, TicketRepositoryInt {

	//TODO
	
	public default Ticket addTickets(Iterable<Ticket> tickets) {
		return null;
	}
	
	public default Ticket updateTickets(Iterable<Ticket> tickets) {
		return null;
	}
	
	public default void deleteTickets(Iterable<Ticket> tickets) {
	}
	
	public default List<Ticket> getTicketsBySeat(Iterable<Integer> seatNums) {
		return null;
	}
	
}

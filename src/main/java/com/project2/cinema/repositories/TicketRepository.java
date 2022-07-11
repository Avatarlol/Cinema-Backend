package com.project2.cinema.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.project2.cinema.entities.Ticket;
import com.project2.cinema.repositories.interfaces.TicketRepositoryInt;

@Service
public interface TicketRepository extends JpaRepository<Ticket, Integer>, TicketRepositoryInt {

	//TODO
	
	public default boolean addTickets(Iterable<Ticket> tickets) {
		return false;
	}
	
	public default boolean updateTickets(Iterable<Ticket> tickets) {
		return false;
	}
	
	public default boolean deleteTickets(Iterable<Ticket> tickets) {
		return false;
	}
	
	public default List<Ticket> getTicketsBySeat(Iterable<Integer> seatNums) {
		return null;
	}
	
}

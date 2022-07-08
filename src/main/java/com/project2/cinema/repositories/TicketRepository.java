package com.project2.cinema.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.project2.cinema.entities.Ticket;

@Service
public interface TicketRepository extends JpaRepository<Ticket, Integer> {

}

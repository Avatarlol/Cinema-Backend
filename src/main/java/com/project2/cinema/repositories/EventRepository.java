package com.project2.cinema.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project2.cinema.entities.Event;

public interface EventRepository extends JpaRepository<Event, Integer> {

}

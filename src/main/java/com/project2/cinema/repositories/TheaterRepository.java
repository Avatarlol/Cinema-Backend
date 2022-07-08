package com.project2.cinema.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.project2.cinema.entities.Theater;

@Service
public interface TheaterRepository extends JpaRepository<Theater, Integer> {

}

package com.project2.cinema.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.project2.cinema.entities.Theater;
import com.project2.cinema.repositories.interfaces.TheaterRepositoryInt;

@Service
public interface TheaterRepository extends JpaRepository<Theater, Integer>, TheaterRepositoryInt {
	
	public default Theater addTheater(Theater theater) {
		return save(theater);
	}
	
	public default Theater updateTheater(Theater theater) {
		return save(theater);
	}
	
	public default void deleteTheater(int id) {
		deleteById(id);
	}
	
	public default Theater getTheater(int id) {
		return findById(id).get();
	}
	
	public default List<Theater> getAllTheaters() {
		return findAll();
	}
	
}

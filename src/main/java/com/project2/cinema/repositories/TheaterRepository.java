package com.project2.cinema.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.project2.cinema.entities.Theater;
import com.project2.cinema.repositories.interfaces.TheaterRepositoryInt;

@Service
public interface TheaterRepository extends JpaRepository<Theater, Integer>, TheaterRepositoryInt {

	//TODO
	
	public default boolean addTheater(Theater theater) {
		return false;
	}
	
	public default boolean updateTheater(Theater theater) {
		return false;
	}
	
	public default boolean deleteTheater(int id) {
		return false;
	}
	
	public default Theater getTheater(int id) {
		return null;
	}
	
	public default List<Theater> getAllTheaters() {
		return null;
	}
	
}

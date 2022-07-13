package com.project2.cinema.repositories.interfaces;

import java.util.List;

import com.project2.cinema.entities.Theater;

public abstract interface TheaterRepositoryInt {

	public Theater addTheater(Theater theater);
	
	public Theater updateTheater(Theater theater);
	
	public void deleteTheater(int id);
	
	public Theater getTheater(int id);
	
	public List<Theater> getAllTheaters();
	
}

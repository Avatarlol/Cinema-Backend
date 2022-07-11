package com.project2.cinema.repositories.interfaces;

import java.util.List;

import com.project2.cinema.entities.Theater;

public abstract interface TheaterRepositoryInt {

	public boolean addTheater(Theater theater);
	
	public boolean updateTheater(Theater theater);
	
	public boolean deleteTheater(int id);
	
	public Theater getTheater(int id);
	
	public List<Theater> getAllTheaters();
	
}

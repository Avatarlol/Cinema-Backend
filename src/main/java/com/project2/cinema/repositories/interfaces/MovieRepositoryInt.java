package com.project2.cinema.repositories.interfaces;

import java.util.List;

import com.project2.cinema.entities.Movie;

public abstract interface MovieRepositoryInt {

	public boolean addMovie(Movie movie);
	
	public boolean updateMovie(Movie movie);
	
	public boolean deleteMovie(int id);
	
	public Movie getMovie(int id);
	
	public List<Movie> getAllMovies();
	
	public List<Movie> getMoviesByDay();
	
}

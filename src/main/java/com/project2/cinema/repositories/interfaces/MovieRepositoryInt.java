package com.project2.cinema.repositories.interfaces;

import java.util.List;

import com.project2.cinema.entities.Movie;
import com.project2.cinema.entities.Movie.Genre;

public abstract interface MovieRepositoryInt {

	public Movie addMovie(Movie movie);
	
	public Movie updateMovie(Movie movie);
	
	public void deleteMovie(int id);
	
	public Movie getMovie(int id);
	
	public List<Movie> getAllMovies();
	
	public List<Movie> findByGenre(Genre genre);
	
	public List<Movie> findByNameContaining(String name);
	
}

package com.project2.cinema.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.project2.cinema.entities.Movie;
import com.project2.cinema.repositories.interfaces.MovieRepositoryInt;

@Service
public interface MovieRepository extends JpaRepository<Movie, Integer>, MovieRepositoryInt{

	//TODO
	
	public default boolean addMovie(Movie movie) {
		return false;
	}
	
	public default boolean updateMovie(Movie movie) {
		return false;
	}
	
	public default boolean deleteMovie(int id) {
		return false;
	}
	
	public default Movie getMovie(int id) {
		return null;
	}
	
	public default List<Movie> getAllMovies(){
		return null;
	}
	
	public default List<Movie> getMoviesByDay(){
		return null;
	}
	
}

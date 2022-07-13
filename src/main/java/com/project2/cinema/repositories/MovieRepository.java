package com.project2.cinema.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.project2.cinema.entities.Movie;
import com.project2.cinema.repositories.interfaces.MovieRepositoryInt;

@Service
public interface MovieRepository extends JpaRepository<Movie, Integer>, MovieRepositoryInt{

	//TODO
	
	public default Movie addMovie(Movie movie) {
		return null;
	}
	
	public default Movie updateMovie(Movie movie) {
		return null;
	}
	
	public default void deleteMovie(int id) {
	}
	
	public default Movie getMovie(int id) {
		Movie movie = findById(id).get();
		return movie;
	}
	
	public default List<Movie> getAllMovies(){
		return null;
	}
	
	public default List<Movie> getMoviesByDay(){
		return null;
	}
	
}

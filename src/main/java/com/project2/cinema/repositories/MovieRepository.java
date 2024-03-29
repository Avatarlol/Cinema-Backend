package com.project2.cinema.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project2.cinema.entities.Movie;
import com.project2.cinema.repositories.interfaces.MovieRepositoryInt;

public interface MovieRepository extends JpaRepository<Movie, Integer>, MovieRepositoryInt{
	
	public default Movie addMovie(Movie movie) {
		return save(movie);
	}
	
	public default Movie updateMovie(Movie movie) {
		return save(movie);
	}
	
	public default void deleteMovie(int id) {
		deleteById(id);
	}
	
	public default Movie getMovie(int id) {
		return findById(id).get();
	}
	
	public default List<Movie> getAllMovies(){
		return findAll();
	}

	public boolean existsByName(String name);
	
}

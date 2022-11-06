package com.project2.cinema.util;

import java.time.LocalDate;

import com.project2.cinema.entities.Movie.Genre;


public class Filter {

	private String name;
	private LocalDate date;
	private Genre genre;
	
	
	public Filter(String name, LocalDate date, Genre genre) {
		super();
		this.name = name;
		this.date = date;
		this.genre = genre;
	}

	
	public String getName() {
		return name;
	}

	public LocalDate getDate() {
		return date;
	}

	public Genre getGenre() {
		return genre;
	}


	@Override
	public String toString() {
		return "Filter [name=" + name + ", date=" + date + ", genre=" + genre + "]";
	}
	
}

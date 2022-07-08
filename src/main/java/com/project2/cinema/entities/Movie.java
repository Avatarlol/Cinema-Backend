package com.project2.cinema.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import lombok.Builder;
import lombok.Data;

@Entity
@Component
@Table(name = "movies")
@Scope("prototype")
@Data
@Builder
public class Movie {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "movie_name")
	private String name;
	@Enumerated(EnumType.ORDINAL)
	private Genre genre;
	@Column(name = "movie_desc")
	private String desc;
	
	public enum Genre {
		HORROR,
		COMEDY,
		SCI_FI,
		ACTION,
		ADVENTURE
	}
		
}

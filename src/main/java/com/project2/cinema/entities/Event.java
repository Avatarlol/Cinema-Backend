package com.project2.cinema.entities;

import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.project2.cinema.util.DateUtil;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Component
@Scope("prototype")
@Table(name = "events")
@Data
@NoArgsConstructor
public class Event {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@ManyToOne(cascade = CascadeType.MERGE,fetch = FetchType.EAGER)
	private Movie movie;
	@ManyToOne(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
	private Theater theater;
	@Column(name = "start_time")
	private LocalDateTime startTime;
	@Column(name = "end_time")
	private LocalDateTime endTime;
	@Column(name = "tickets_sold")
	private int tickets_sold;
	
	public Event(int id, Movie movie, Theater theater, LocalDateTime startTime) {
		super();
		this.id = id;
		this.movie = movie;
		this.theater = theater;
		this.startTime = startTime;
		this.endTime = DateUtil.roundCeiling(startTime.plusSeconds(movie.getLength().getSeconds()));
	}
	
	

}

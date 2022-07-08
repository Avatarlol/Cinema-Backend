package com.project2.cinema.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import lombok.Builder;
import lombok.Data;

@Entity
@Component
@Scope("prototype")
@Table(name = "theater")
@Data
@Builder
public class Theater {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name = "theater_num")
	private int theaterNumber;
	@Column
	private int seats;
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "theater")
	@Column
	private List<Event> events;
	

}

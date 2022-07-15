package com.project2.cinema.services;

import org.springframework.stereotype.Component;

@Component
public class Conditions extends ClientService{

	//TODO
	
	//THEATER CONDITIONS
	
	public boolean newTheaterCondition() {
		return false;
	}
	
	public boolean updateTheaterCondition() {
		return false;
	}
	
	public boolean deleteTheaterCondition() {
		return false;
	}
	
	//MOVIE CONDITIONS
	
	public boolean newMovieCondition() {
		return false;
	}
	
	public boolean updateMovieCondition() {
		return false;
	}
	
	public boolean deleteMovieCondition() {
		return false;
	}
	
	//EVENT CONDITIONS
	
	public boolean newEventCondition() {
		return false;
	}
	
	public boolean updateEventCondition() {
		return false;
	}
	
	public boolean deleteEventCondition() {
		return false;
	}
	
	//TICKET CONDITIONS
	
	public boolean newTicketCondition() {
		return true;
	}
	
	public boolean updateTicketCondition() {
		return true;
	}
	
	public boolean deleteTicketCondition() {
		return true;
	}
}

package com.project2.cinema.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.project2.cinema.entities.Theater;
import com.project2.cinema.exceptions.IncorrectCredentials;

@Service
public class AdminService extends ClientService{
	
	@Value("${admin.username}")
	private String ADMIN_USERNAME;
	@Value("${admin.password}")
	private String ADMIN_PASSWORD;
	
	public AdminService() {
		super();
	}
	
	public AdminService login(String username, String password) throws IncorrectCredentials {
		if(ADMIN_USERNAME.equalsIgnoreCase(username) &&
		   ADMIN_PASSWORD.equals(password))
			return this;
		throw new IncorrectCredentials();
	}
	
	public void addTheater(Theater theater) {
		theaterRepository.addTheater(theater);
	}
}

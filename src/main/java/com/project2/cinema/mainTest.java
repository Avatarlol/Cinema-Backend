package com.project2.cinema;

import java.lang.reflect.Field;

import com.project2.cinema.entities.Movie;

public class mainTest {

	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException {
		
		Movie o = Movie.builder().build();
		System.out.println(o);
		
		Class<?> objClass = o.getClass();
		
		Field savedField = null;
		for (Field field : objClass.getDeclaredFields()) {
			field.setAccessible(true);
			if(savedField==null) {
				savedField = field;
			}else {
				field.set(o, savedField);;
			}
			
		}
		
		System.out.println(o);
		
	}

}

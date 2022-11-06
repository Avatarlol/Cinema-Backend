package com.project2.cinema.util;


public class Random{

	public static java.util.Random random = new java.util.Random();
	
	public static int RandomBetween(int start, int end) {
			int rng = random.nextInt(end-start+1)+start;
		return rng;
	}
	
}

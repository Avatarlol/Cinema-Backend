package com.project2.cinema.util;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
	
public class DateUtil {
	
	static final int ROUNDED_MINUTES = 30;
	
	public static LocalDateTime roundCeiling(LocalDateTime dateTime) {
		dateTime = dateTime.truncatedTo(ChronoUnit.MINUTES).plusMinutes(ROUNDED_MINUTES);
		return dateTime;
	}
	
}

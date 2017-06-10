package com.nadeem.springdemo;

import org.springframework.stereotype.Component;

// Default Bean id
// @Component - bean id = tennisCoach

// Explicit Bean id
//@Component("thatSillyCoach")

@Component
public class TennisCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		
		return "Practice your backhand volley.";
	}

}

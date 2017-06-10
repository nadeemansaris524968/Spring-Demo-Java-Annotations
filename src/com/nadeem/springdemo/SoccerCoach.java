package com.nadeem.springdemo;

import org.springframework.stereotype.Component;

@Component
public class SoccerCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		
		return "Practice your goal kicks for an hour everyday.";
	}

}

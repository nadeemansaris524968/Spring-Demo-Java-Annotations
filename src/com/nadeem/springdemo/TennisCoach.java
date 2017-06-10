package com.nadeem.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

// Default Bean id
// @Component - bean id = tennisCoach

// Explicit Bean id
//@Component("thatSillyCoach")

@Component
public class TennisCoach implements Coach {
	
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
		
	public TennisCoach(){
		
		System.out.println(">> TennisCoach: inside no-arg constructor.");
	}

//	@Autowired
//	public void setFortuneService(FortuneService theFortuneService) {
//		
//		System.out.println(">> TennisCoach: inside setter method setFortuneService.");
//		fortuneService = theFortuneService;
//	}

	@Override
	public String getDailyWorkout() {
		
		return "Practice your backhand volley.";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getDailyFortune();
	}

//	@Autowired
//	public TennisCoach(FortuneService theFortuneService){
//		
//		fortuneService = theFortuneService;
//	}
}

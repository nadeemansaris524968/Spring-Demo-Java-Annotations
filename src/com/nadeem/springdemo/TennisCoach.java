package com.nadeem.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

// Explicit Bean id
//@Component("thatSillyCoach")

@Component
public class TennisCoach implements Coach {
	
	// init
	@PostConstruct
	public void doMyStartUpStuff(){
		
		System.out.println(">> TennisCoach: inside doMyStartUpStuff");
	}
	
	// destroy
	@PreDestroy
	public void cleanUp(){
		
		System.out.println(">> TennisCoach: inside cleanUp");
	}
	
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

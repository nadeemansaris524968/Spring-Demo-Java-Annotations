package com.nadeem.springdemo;

public class WeirdCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public WeirdCoach(FortuneService theFortuneService){
		fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		
		return "Practice your weird pick up lines.";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getDailyFortune();
	}

}

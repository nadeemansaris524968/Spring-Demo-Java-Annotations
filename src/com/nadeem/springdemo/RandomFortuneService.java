package com.nadeem.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {
	
	// create an array of strings
	private String[] data = {
			"Beware of the wolf in sheep's clothing",
			"Diligence is the mother for good luck",
			"The journey is the reward"
	};
	
	@Override
	public String getDailyFortune() {
		Random myRandom = new Random();
		
		return data[myRandom.nextInt(data.length)];
	}

}

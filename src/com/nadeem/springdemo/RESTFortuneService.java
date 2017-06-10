package com.nadeem.springdemo;

import org.springframework.stereotype.Component;

@Component
public class RESTFortuneService implements FortuneService {

	@Override
	public String getDailyFortune() {
		
		return "Rest today, work tomorrow";
	}

}

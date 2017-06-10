package com.nadeem.springdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SpookyFortuneService implements FortuneService {

	@Value("${spooky.name}")
	private String name;
	
	@Value("${spooky.saying}")
	private String saying;
	
	@Value("${spooky.note}")
	private String note;
	
	@Override
	public String getDailyFortune() {
		
		return "You woke the monster: "+this.name+" and now he says: "+this.saying+" with a side note: "+this.note;
	}

}

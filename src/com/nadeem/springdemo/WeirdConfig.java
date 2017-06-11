package com.nadeem.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WeirdConfig {
	
	@Bean
	public FortuneService weirdFortuneService(){
		return new WeirdFortuneService();
	}
	
	@Bean
	public Coach weirdCoach(){
		return new WeirdCoach(weirdFortuneService());
	}

}

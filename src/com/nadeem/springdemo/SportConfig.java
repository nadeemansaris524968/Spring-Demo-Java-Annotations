package com.nadeem.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.nadeem.springdemo")
public class SportConfig {
	
	// define bean for our sad fortuneService
	@Bean
	public FortuneService sadFortuneService(){
		return new SadFortuneService();
	}
	
	// define bean for our swim coach and inject dependency
	@Bean
	//swimCoach is the bean ID, use this to retrieve the bean from spring container
	public Coach swimCoach(){
		return new SwimCoach(sadFortuneService());
	}
}

package com.nadeem.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RunSoccerCoach {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach theCoach = context.getBean("soccerCoach", Coach.class);
		
		System.out.println(theCoach.getDailyWorkout());
		
		context.close();
	}

}

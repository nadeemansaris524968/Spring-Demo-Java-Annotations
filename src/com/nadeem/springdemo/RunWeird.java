package com.nadeem.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class RunWeird {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(WeirdConfig.class);
		
		Coach theCoach = context.getBean("weirdCoach", Coach.class);
		
		System.out.println(theCoach.getDailyWorkout());
		
		System.out.println(theCoach.getDailyFortune());
		
		context.close();
	}

}

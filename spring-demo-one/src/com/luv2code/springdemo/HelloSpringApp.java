package com.luv2code.springdemo;

public class HelloSpringApp {

	public static void main(String[] args) {
//		load the spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//		retrieve the bean from the container
//		getBean method parameters -> 1 bean id / 2 interface.class
		Coach theCoach = context.getBean("myCoach", Coach.class);
//		call the method on the bean
		System.out.println(theCoach.getDailyWorkout());
//		close context
		context.close();
	}

}

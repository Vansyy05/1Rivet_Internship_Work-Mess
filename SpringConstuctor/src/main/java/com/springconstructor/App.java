package com.springconstructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		System.out.println("Student Details:");
		ApplicationContext context=new ClassPathXmlApplicationContext("/com/configuration/config.xml");
		Student student1=(Student) context.getBean("student");
		System.out.println(student1);
		
	}

}

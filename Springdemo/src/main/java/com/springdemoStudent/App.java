package com.springdemoStudent;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//Setter injection
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Student Detail mention above:");
        ApplicationContext context=new ClassPathXmlApplicationContext("/comconfiguration/config.xml");
        Student student1=(Student) context.getBean("std");
        System.out.println(student1);
    }
}

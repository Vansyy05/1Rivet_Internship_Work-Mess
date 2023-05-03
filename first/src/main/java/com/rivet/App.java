package com.rivet;

import java.lang.module.Configuration;

public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		
		Configuration cfg = new Configuration();
		
		
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		
		
		
	}
}

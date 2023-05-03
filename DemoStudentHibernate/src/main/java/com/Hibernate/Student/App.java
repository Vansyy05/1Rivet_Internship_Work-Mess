package com.Hibernate.Student;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
		System.out.println("Hello World");
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();

		System.out.println(factory);
		
		
		StudentDetail st = new StudentDetail();
		st.setId(1);
		st.setName("vansy");
		
		Session session = factory.openSession();
		 Transaction tr = session.beginTransaction();

		session.save(st);
		tr.commit();
		session.close();
	}
}

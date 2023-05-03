package com.hibernate_annotation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	System.out.println("Hello World");
		
    	Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();

		Student st=new Student();
		st.setName("Vansyy");
		st.setAddress("Valsad");
		st.setAge("12");
		
		System.out.println(st);
		Session session=factory.openSession();
		Transaction tr=session.beginTransaction();
		session.save(st);
		tr.commit();
		
		session.close();

    }
}

package hibernate_student;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Student_Dao {
	
	public  static SessionFactory config() {
	Configuration cfg=new Configuration();
	cfg.configure("hibernate.cfg.xml");
	SessionFactory factory=cfg.buildSessionFactory();
	
	return factory;
	}
	
	public static void stdsave(Student sd) {
		Session session=Student_Dao.config().openSession();
		Transaction tr = session.beginTransaction();
		
		session.save(sd);
		tr.commit();
		session.close();
		
	}
	
	public static List<Student> getAllStudent(){
		List<Student> std=new ArrayList<Student>();
		Session session=Student_Dao.config().openSession();
		Transaction tr=session.beginTransaction();
		std=session.createQuery("from Student").getResultList();
		tr.commit();
		session.close();
		return std;
	}
	
	public static Student getById(int id) {
		Student std;
		Session session=Student_Dao.config().openSession();
		Transaction tr=session.beginTransaction();
		std=session.get(Student.class, id);
		
		tr.commit();
		session.close();
		return std;
		
	}
	
	
	public static void stdupdate(Student sd) {
		Session session=Student_Dao.config().openSession();
		Transaction tr=session.beginTransaction();
		
		session.update(sd);
		tr.commit();
		session.close();
		
	}
	
	
	public static void stddelete(Student sd) {
		Session session=Student_Dao.config().openSession();
		Transaction tr=session.beginTransaction();
		
		session.delete(sd);
		tr.commit();
		session.close();
	}

	
	

	

	

	
}
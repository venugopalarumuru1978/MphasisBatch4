package com.apps;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entities.Course;
import com.entities.Student;

public class CourseAdd {

	public static void main(String[] args) {
		Configuration  cfg= new Configuration();
		cfg.configure("hibernate.cfg.xml");

		SessionFactory sf = cfg.buildSessionFactory();
		
		Session session = sf.openSession();
		Transaction trans = session.beginTransaction();

		Course cur1 = new Course();
		cur1.setCurid(121);
		cur1.setCurname("Java");
		cur1.setDuration(5);
		cur1.setFees(20000.00f);
		
	
		Student std = new Student();
		std.setRollno(1001);
		std.setSname("Devika");
		std.setCurs(cur1);
		
		Student std1 = new Student();
		std1.setRollno(1002);
		std1.setSname("Monika");
		std1.setCurs(cur1);
		
		Student	std2 = new Student();
		std2.setRollno(1003);
		std2.setSname("Pravallika");
		std2.setCurs(cur1);
	
		session.persist(std);
		session.persist(std1);
		session.persist(std2);
		
		trans.commit();
		
		sf.close();
		session.close();
		
		System.out.println("Data Saved....");
	}

}

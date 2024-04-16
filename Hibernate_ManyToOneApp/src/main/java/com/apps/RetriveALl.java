package com.apps;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.entities.Student;

import jakarta.persistence.TypedQuery;

public class RetriveALl {

	public static void main(String[] args) {
		Configuration  cfg= new Configuration();
		cfg.configure("hibernate.cfg.xml");

		SessionFactory sf = cfg.buildSessionFactory();
		
		Session session = sf.openSession();
		TypedQuery  qry = session.createQuery("from Student") ;
		List<Student>  stdall = qry.getResultList();
		
		for(Student s : stdall)
		{
			System.out.println(s.getRollno() + "\t" + s.getSname());
			System.out.println("Course Details ");
			System.out.println(s.getCurs().getCurname() + "\t" + s.getCurs().getDuration() + " Months\t" + s.getCurs().getFees());
		}
		sf.close();
		session.close();
	}
}

package com.apps;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entities.Employee;

public class EmpApp1 {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction trans = session.beginTransaction();
		
		Employee emp = new Employee();
		emp.setEmpno(1002);
		emp.setEname("Pravasthi");
		emp.setJob("Manager");
		emp.setSal(15000.00f);
		
		session.persist(emp);
		trans.commit();

		System.out.println("Emp Data Saved....");
	}
}

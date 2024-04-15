package com.apps;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entities.Address;
import com.entities.Employee;

public class EmpAdd {

	public static void main(String[] args) {
		
		Address adrs = new Address();
		adrs.setHouseno("Dno: 143-A");
		adrs.setLocation("Hyderabad");
		
		Employee emp =new Employee();
		emp.setEname("Lava Kumar");
		emp.setAdrs(adrs);
		
		adrs.setEmp(emp);
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session session =  sf.openSession();
		Transaction trans = session.beginTransaction();
		
		session.persist(emp);
		trans.commit();
		
		System.out.println("Emp Added....");
	}
}

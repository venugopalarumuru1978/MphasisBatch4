package com.apps;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entities.Employee;

import jakarta.persistence.TypedQuery;

public class EmpApp3 {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		
		// TypedQuery is used to specify query and allows to get data from db.
		//sql : SELECT * FROM tablename
		// HQL :-  from <classname>

		TypedQuery qry = session.createQuery("from Employee");
		List<Employee> empall = qry.getResultList();
		
		for(Employee e : empall)
		{
			System.out.println(e.getEmpno() + "\t" + e.getEname() + "\t" + e.getJob() + "\t" + e.getSal());
		}
	}
}

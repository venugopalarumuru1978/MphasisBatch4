package com.apps;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entities.Employee;
import com.entities.Projects;

public class EmpProjAdd {


	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		
		Session session = sf.openSession();
		Transaction trans = session.beginTransaction();
		
		Employee emp1 = new Employee();
		emp1.setEname("Ravi Kiran");
		
		Employee emp2 = new Employee();
		emp2.setEname("Kiran Kumar");

		Employee emp3 = new Employee();
		emp3.setEname("Kalyan Kumar");

		List<Employee>  emplist = new ArrayList<Employee>();
		emplist.add(emp1);
		emplist.add(emp2);
		emplist.add(emp3);
		
		Projects prj1 = new Projects();
		prj1.setPrjName("Library Management System");
		
		Projects prj2 = new Projects();
		prj2.setPrjName("Employee Management System");

		List<Projects>  prjlist = new ArrayList<Projects>();
		prjlist.add(prj1);
		prjlist.add(prj2);
		
		emp1.setPrjinfo(prjlist);
		emp2.setPrjinfo(prjlist);
		emp3.setPrjinfo(prjlist);
		
		prj1.setEmpinfo(emplist);
		prj2.setEmpinfo(emplist);
		
		session.persist(emp1);
		session.persist(emp2);
		session.persist(emp3);
		
		trans.commit();
		
		System.out.println("Success");
	}

}

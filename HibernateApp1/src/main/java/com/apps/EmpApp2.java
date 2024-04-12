package com.apps;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entities.Employee;

public class EmpApp2 {

	public static void main(String[] args) {
		Employee emp = new Employee();
		Scanner sc = new Scanner(System.in);
		System.out.println("Employee Number ");
		emp.setEmpno(sc.nextInt());
		
		System.out.println("Employee Name ");
		emp.setEname(sc.next());

		System.out.println("Employee JOb ");
		emp.setJob(sc.next());

		System.out.println("Employee Salary ");
		emp.setSal(sc.nextFloat());

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction trans = session.beginTransaction();
		
		session.persist(emp);
		trans.commit();

		System.out.println("Emp Data Saved....");
	}
}

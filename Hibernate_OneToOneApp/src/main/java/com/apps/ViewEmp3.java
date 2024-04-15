package com.apps;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.entities.Address;
import com.entities.Employee;

import jakarta.persistence.TypedQuery;

public class ViewEmp3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Employee Number : ");
		int eno = sc.nextInt();
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session session =  sf.openSession();
		
		TypedQuery qry = session.createQuery("from Employee where empno=:eno");
		qry.setParameter("eno", eno);
		List<Employee>  emplist = qry.getResultList();
		
		if(emplist.isEmpty())
			System.out.println("Employee Not Exist");
		else
		{
				Employee e = emplist.get(0);
				System.out.println("Employee Number : " + e.getEmpno());
				System.out.println("Employee Name : " + e.getEname());
				Address ad = e.getAdrs();
				System.out.println("Door Number : " + ad.getHouseno());
				System.out.println("Location : " + ad.getLocation());
		}
	}
}

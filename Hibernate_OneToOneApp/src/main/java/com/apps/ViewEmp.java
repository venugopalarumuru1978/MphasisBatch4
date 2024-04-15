package com.apps;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entities.Address;
import com.entities.Employee;

import jakarta.persistence.TypedQuery;

public class ViewEmp {

	public static void main(String[] args) {
	
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session session =  sf.openSession();
		
		TypedQuery qry = session.createQuery("from Employee");
		List<Employee>  emplist = qry.getResultList();
		
		for(Employee e : emplist)
		{
			System.out.println("Employee Number : " + e.getEmpno());
			System.out.println("Employee Name : " + e.getEname());
			Address ad = e.getAdrs();
			System.out.println("Door Number : " + ad.getHouseno());
			System.out.println("Location : " + ad.getLocation());
			System.out.println("---------");
		}
	}
}

package com.apps;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entities.Person;

import jakarta.persistence.TypedQuery;

public class ShowAllPersons {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		
		TypedQuery qry = session.createQuery("from Person");
		List<Person>  personLst = qry.getResultList();
		
		for(Person p : personLst)
		{
			System.out.println("Person ID : " + p.getPid());
			System.out.println("Person Name : " + p.getPname());
			System.out.println("Person Email : " + p.getEmail());
			System.out.println("Person Phone : " + p.getPhone());
			System.out.println("-----------");
		}
	}
}

package com.apps;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entities.Person;

import jakarta.persistence.TypedQuery;

public class SearchPerson {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Person ID : ");
		int pno = sc.nextInt();
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		
		TypedQuery qry = session.createQuery("from Person where pid=:psrnid");
		qry.setParameter("psrnid", pno);
		List<Person>  personLst = qry.getResultList();
		
		
		if(personLst.isEmpty())
			System.out.println("Person Details are not found");
		else
		{
			Person p = personLst.get(0);
			System.out.println("Person ID : " + p.getPid());
			System.out.println("Person Name : " + p.getPname());
			System.out.println("Person Email : " + p.getEmail());
			System.out.println("Person Phone : " + p.getPhone());
		}
	}
}

package com.apps;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entities.Person;

public class PersonApp1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Person person = new Person();
		
		System.out.println("Person Name : ");
		person.setPname(sc.next());
		System.out.println("Person Email : ");
		person.setEmail(sc.next());
		System.out.println("Person Phone Number : ");
		person.setPhone(sc.next());
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction trans = session.beginTransaction();
		
		session.persist(person);
		trans.commit();
		
		System.out.println("Person Details are Added....");
	}
}

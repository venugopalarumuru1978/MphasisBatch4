package com.apps;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entities.Person;

import jakarta.persistence.TypedQuery;

public class UpdatePerson {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Person Name to Modify : ");
		String pname = sc.next();
		
		System.out.println("Person ID : ");
		int pno = sc.nextInt();
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction trans = session.beginTransaction();
		
		TypedQuery qry = session.createQuery("Update Person set pname=:pname where pid=:pid");
		qry.setParameter("pname", pname);
		qry.setParameter("pid", pno);
		int res = qry.executeUpdate();
		
		if(res>=1)
		{
			trans.commit();
			System.out.println("Person Details are Updated....");
		}
		else
		{
			trans.rollback();
			System.out.println("Not Updated");
		}
	}
}

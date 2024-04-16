package com.apps;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entities.Customers;
import com.entities.Dishes;

public class CustAdd {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		
		Session session = sf.openSession();
		Transaction trans = session.beginTransaction();
		
		Customers cust1 = new Customers();
		cust1.setCusname("Pavan Kumar");
		Customers cust2 = new Customers();
		cust2.setCusname("Praveen Kumar");

		Dishes dish1 = new Dishes();
		dish1.setDishname("Fish Curry");
		Dishes dish2 = new Dishes();
		dish2.setDishname("Veg Curry");
		
		List<Customers> lcust = new ArrayList<Customers>();
		lcust.add(cust1);
		lcust.add(cust2);
		
		List<Dishes> ldish = new ArrayList<Dishes>();
		ldish.add(dish1);
		ldish.add(dish2);
		
		cust1.setDish(ldish);
		cust2.setDish(ldish);
		
		dish1.setCustomer(lcust);
		dish2.setCustomer(lcust);
		
		session.persist(cust1);
		session.persist(cust2);
		
		trans.commit();
		
		System.out.println("Success");
	}

}

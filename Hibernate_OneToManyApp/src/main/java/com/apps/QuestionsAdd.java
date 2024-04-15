package com.apps;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entities.Answers;
import com.entities.Questions;

public class QuestionsAdd {

	public static void main(String[] args) {
		
		Questions q1 = new Questions();
		q1.setQuestion("What is a Java?");
		
		Questions q2 = new Questions();
		q2.setQuestion("What is a Hibernate?");
		
		Answers  ans = null;
		
		List<Answers>  lstQ1 = new ArrayList<Answers>();
		ans = new Answers();
		ans.setAnswer("It is a Prog Lang");
		ans.setGivenby("Pavani");
		lstQ1.add(ans);
		
		ans = new Answers();
		ans.setAnswer("It is a Pure Object Oriented Prog Lang");
		ans.setGivenby("Kiran");
		lstQ1.add(ans);

		q1.setAns_info(lstQ1);
		
		List<Answers>  lstQ2 = new ArrayList<Answers>();
		ans = new Answers();
		ans.setAnswer("it is a framework for interacting with db");
		ans.setGivenby("Kamal");
		lstQ2.add(ans);
		
		ans = new Answers();
		ans.setAnswer("it is a ORM Tool for interacting with db");
		ans.setGivenby("Naresh");
		lstQ2.add(ans);
		
		ans = new Answers();
		ans.setAnswer("ORM Tool for interacting with any db");
		ans.setGivenby("Mahesh");
		lstQ2.add(ans);
		
		q2.setAns_info(lstQ2);
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session session =  sf.openSession();
		Transaction trans = session.beginTransaction();
		
		session.persist(q1);
		session.persist(q2);
		
		trans.commit();
		
		System.out.println("Qestions are Added....");
	}
}

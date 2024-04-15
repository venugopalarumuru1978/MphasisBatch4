package com.apps;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.entities.Answers;
import com.entities.Questions;

import jakarta.persistence.TypedQuery;

public class ViewQuestions {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session session =  sf.openSession();

		TypedQuery  qry = session.createQuery("from Questions");
		List<Questions>  ques_list = qry.getResultList();
		
		for(Questions q : ques_list)
		{
			System.out.println(q.getQuestion());
			List<Answers>  ansinfo = q.getAns_info();
			for(Answers a : ansinfo)
			{
				System.out.println(a.getAnswer() + "\tGiven By : " + a.getGivenby());
			}
			System.out.println("------------");
		}
	}
}
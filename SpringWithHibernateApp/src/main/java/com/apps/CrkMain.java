package com.apps;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.DAO.CricketDAOImpl;

public class CrkMain {

	public static void main(String[] args) {
		ApplicationContext  fact = new ClassPathXmlApplicationContext("hiberdbconfig.xml");
		
		CricketDAOImpl  crkinfo = (CricketDAOImpl)fact.getBean("crkObj"); 
	}

}

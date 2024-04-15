package com.connections;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DbConnection {

	public static SessionFactory getConnection()
	{
		SessionFactory sf = null;
		try {
			Configuration cfg = new Configuration();
			cfg.configure("hibernate.cfg.xml");
			sf = cfg.buildSessionFactory();			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		return sf;
	}
	
}

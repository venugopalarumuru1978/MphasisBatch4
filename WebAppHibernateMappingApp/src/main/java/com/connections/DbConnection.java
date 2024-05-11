package com.connections;

//import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
//import org.hibernate.cfg.Environment;

//import com.entities.Employee;

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
	
/*	
	public static SessionFactory getConnection()
	{
		Configuration configuration=new Configuration();
		Properties properties=new Properties();

		properties.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
		properties.put(Environment.URL, "jdbc:mysql://localhost:3306/mphasisdb4");
		properties.put(Environment.DIALECT, "org.hibernate.dialect.MySQL8Dialect");
		properties.put(Environment.USER, "root");
		properties.put(Environment.PASS, "root");
		properties.put(Environment.HBM2DDL_AUTO, "update");
		properties.put(Environment.SHOW_SQL, true);
		
		//properties.put(Environment.FORMAT_SQL, true);
		configuration.setProperties(properties);
		configuration.addAnnotatedClass(Employee.class);
		SessionFactory sessionFactory=configuration.buildSessionFactory();
		return sessionFactory;
	}
*/
}

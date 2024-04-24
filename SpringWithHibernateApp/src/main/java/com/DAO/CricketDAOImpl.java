package com.DAO;

import org.springframework.orm.hibernate5.HibernateTemplate;

public class CricketDAOImpl {

	HibernateTemplate template;

	public HibernateTemplate getTemplate() {
		return template;
	}

	public void setTemplate(HibernateTemplate template) {
		this.template = template;
		System.out.println("Connected...");
	}
	
}

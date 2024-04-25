package com.DAO;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.beans.Cricket;

public class CricketDAOImpl implements CricketDAO{
	
	HibernateTemplate template;

	public HibernateTemplate getTemplate() {
		return template;
	}

	public void setTemplate(HibernateTemplate template) {
		this.template = template;
		System.out.println("Connected...");
	}

	@Override
	@Transactional
	public void AddCricker(Cricket crk) {
		template.persist(crk);
		System.out.println("Cricketer Info Saved...");
	}

	@Override
	@Transactional
	public List<Cricket> ShowAll() {
		List<Cricket>  crklist = template.loadAll(Cricket.class);
		return crklist;
	}

	@Override
	@Transactional
	public Cricket Search(int cid) {
		Cricket crk = template.get(Cricket.class, cid);
		if(crk!=null)
			return crk;
		return null;
	}

	@Override
	@Transactional
	public void DelCricketer(Cricket crk) {
		template.delete(crk);
		System.out.println("Cricketer is Deleted");
	}

	@Override
	@Transactional
	public void UpdateCricketer(Cricket crk) {
		template.update(crk);
		System.out.println("Cricketer is Updated");
	}
}

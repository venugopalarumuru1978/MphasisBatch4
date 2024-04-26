package com.services;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Service;

import com.connections.HiberConfig;
import com.models.Employee;

@Service
public class EmpServiceImpl implements EmpService {

	SessionFactory sfact = null;
	public EmpServiceImpl()
	{
		sfact = HiberConfig.GetConnection();
	}
	
	@Override
	public void AddEmployee(Employee emp) {
		Session session = sfact.openSession();
		Transaction trans =  session.beginTransaction();
		session.save(emp);
		trans.commit();
	}

	@Override
	public List<Employee> ShowAll() {
		Session session = sfact.openSession();
		return session.createQuery("from Employee").getResultList();
	}

	@Override
	public Employee SearchEmployee(int eno) {
		// TODO Auto-generated method stub
		Session session = sfact.openSession();
		Employee emp = session.get(Employee.class, eno);
		return emp;
	}

	@Override
	public void DelEmployee(int eno) {
		Session session = sfact.openSession();
		Transaction trans =  session.beginTransaction();
		Employee emp = session.get(Employee.class, eno);
		session.delete(emp);
		trans.commit();
	}

	@Override
	public void UpdateEmployee(Employee emp) {
		Session session = sfact.openSession();
		Transaction trans =  session.beginTransaction();
		session.update(emp);
		trans.commit();
	}
}

package com.operations;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.connections.DbConnection;
import com.entities.Employee;

import jakarta.persistence.TypedQuery;

public class EmpOperations {

	private SessionFactory sf = null;
	
	public EmpOperations()
	{
		sf = DbConnection.getConnection();
		System.out.println("Cons" + sf);
	}
	
	public void AddEmployee(Employee emp)
	{
		Session session = sf.openSession();
		Transaction ts = session.beginTransaction();
		session.persist(emp);
		ts.commit();
	}
	
	public List<Employee> ViewAll()
	{
		List<Employee> emplist = null;
		Session session = sf.openSession();
		try {
			TypedQuery qry = session.createQuery("from Employee");
			emplist = qry.getResultList();
			System.out.println(emplist);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("View Emp Info : " + e);
		}
		return emplist;
	}	
}

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
		try {
			Session session = sf.openSession();
			Transaction trans = session.beginTransaction();
			session.persist(emp);
			trans.commit();			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Add Emp Error :\n" + e);
		}
	}
	
	public List<Employee> ViewAll()
	{
		List<Employee> emplist = null;
		Session session = sf.openSession();
		try {
			TypedQuery qry = session.createQuery("from Employee");
			emplist = qry.getResultList();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("View Emp Info : " + e);
		}
		return emplist;
	}
	
	public Employee SearchEmployee(int eno)
	{
		List<Employee> emplist = null;
		Employee emp = null;
		Session session = sf.openSession();
		try {
			TypedQuery qry = session.createQuery("from Employee where empno=:eno");
			qry.setParameter("eno", eno);
			emplist = qry.getResultList();
			if(!emplist.isEmpty())
				emp = emplist.get(0);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Search Emp Info : " + e);
		}
		return emp;
	}
	
	public int DeleteEmp(int eno)
	{
		Session session = sf.openSession();
		Transaction trans = session.beginTransaction();
		int res=-1;
		try {
			TypedQuery qry = session.createQuery("Delete from Employee where empno=:eno");
			qry.setParameter("eno", eno);
			res = qry.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Delete : " + e);
		}
		return res;
	}

	public void UpdateEmp(Employee emp)
	{
		Session session = sf.openSession();
		Transaction trans = session.beginTransaction();
		try {
			session.saveOrUpdate(emp);
			trans.commit();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Update : " + e);
		}
	}
}

package com.emp_pack;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class empApp {

	public static void main(String[] args) {
		ApplicationContext  fact = new ClassPathXmlApplicationContext("dbconfig.xml");
		EmpImpl emps = (EmpImpl)fact.getBean("dbConObj3");
		
		List<empinfo>  elist = emps.ShowAllEmps();
		
		for(empinfo e : elist)
		{
			System.out.println(e.getEmpno() + "\t" + e.getEname() + "\t" + e.getJob() + "\t" + e.getSal() + "\t" + e.getDeptno() + "\t" + e.getDname() + "\t" + e.getLoc());
		}
	}

}

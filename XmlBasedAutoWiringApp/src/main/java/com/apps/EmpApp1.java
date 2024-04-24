package com.apps;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.beans.Employee;


public class EmpApp1 {

	public static void main(String[] args) {
		ApplicationContext  fact = new ClassPathXmlApplicationContext("config3.xml");
		
		Employee emp = (Employee)fact.getBean("empObj");
		emp.printEmpInfo();
	}
}

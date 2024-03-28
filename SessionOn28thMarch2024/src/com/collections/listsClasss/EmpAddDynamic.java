package com.collections.listsClasss;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmpAddDynamic {

	public static void main(String[] args) {
		
		List<Employee>  emplist = new ArrayList<Employee>();
		Employee emp = null;
		Scanner sc = new Scanner(System.in);
		String ch = null;
		do
		{
			emp = new Employee();
			System.out.println("Employee Number : ");
			emp.setEmpno(sc.nextInt());

			System.out.println("Employee Name : ");
			emp.setEname(sc.next());

			System.out.println("Employee Job : ");
			emp.setJob(sc.next());

			System.out.println("Employee Salary : ");
			emp.setSalary(sc.nextFloat());

			emplist.add(emp);
			System.out.println("1 more emp(Y/N)");
			ch = sc.next();
		}
		while(ch.equalsIgnoreCase("Y"));
		
		System.out.println("Emp Info : ");
		for(Employee e : emplist)
		{
			System.out.println("Employee No : " + e.getEmpno());
			System.out.println("Employee Name : "+  e.getEname());
			System.out.println("Employee Job : " + e.getJob());
			System.out.println("Employee Salary : " + e.getSalary());
			System.out.println("------------");
		}
	}

}

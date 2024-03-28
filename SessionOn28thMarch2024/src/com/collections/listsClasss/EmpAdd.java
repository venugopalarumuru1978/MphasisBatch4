package com.collections.listsClasss;
import java.util.*;
public class EmpAdd {

	public static void main(String[] args) {
		
		List<Employee>  emplist = new ArrayList<Employee>();
		Employee emp = null;
		
		emp = new Employee(101, "Praveen","Developer", 10000.00f);
		emplist.add(emp);

		emp = new Employee(102, "Pavani","Developer", 10000.00f);
		emplist.add(emp);
		
		emp = new Employee(103, "Paramesh","Tester", 9000.00f);
		emplist.add(emp);

		emp = new Employee(104, "Pavithra","HR-Manager", 20000.00f);
		emplist.add(emp);

		emp = new Employee(105, "Pravasthi","Developer", 10000.00f);
		emplist.add(emp);

		for(Employee e : emplist)
		{
			System.out.println("Employee No : " + e.getEmpno());
			System.out.println("Employee Name : "+  e.getEname());
			System.out.println("Employee Job : " + e.getJob());
			System.out.println("Employee Salary : " + e.getSalary());
			System.out.println("------------");
		}
		
		System.out.println("-----------");
		
		Iterator itr = emplist.iterator();
		
		while(itr.hasNext())
		{
			Employee e = (Employee)itr.next();
			System.out.println("Employee No : " + e.getEmpno());
			System.out.println("Employee Name : "+  e.getEname());
			System.out.println("Employee Job : " + e.getJob());
			System.out.println("Employee Salary : " + e.getSalary());
			System.out.println("------------");			
		}
		
	}
}

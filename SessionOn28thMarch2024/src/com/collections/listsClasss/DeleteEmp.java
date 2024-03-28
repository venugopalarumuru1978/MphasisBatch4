package com.collections.listsClasss;
import java.util.*;
public class DeleteEmp {

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

		System.out.println(emplist);
		
		System.out.println("-----------");

		Scanner sc = new Scanner(System.in);
		System.out.println("Employee Number : ");
		int eno = sc.nextInt();
		
		boolean empchk = false;
		for(Employee e : emplist)
		{
			if(e.getEmpno()==eno)
			{
				emplist.remove(e);
				empchk = true;
				break;
			}
		}
		
		if(empchk==false)
			System.out.println("Employee Not exist ");
		else
			System.out.println("Emp Info after delete \n " + emplist);
	}
}

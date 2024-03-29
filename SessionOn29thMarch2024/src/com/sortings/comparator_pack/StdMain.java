package com.sortings.comparator_pack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class StdMain {

	public static void main(String[] args) {
		List<Student>  stdlist = new ArrayList<Student>();
		Student std = null;
		
		std = new Student(1001, "Ravi", 25);
		stdlist.add(std);

		std = new Student(1004, "Kavi", 22);
		stdlist.add(std);

		std = new Student(1005, "Bavi", 21);
		stdlist.add(std);

		std = new Student(1002, "Lavi", 20);
		stdlist.add(std);

		std = new Student(1003, "Kovi", 24);
		stdlist.add(std);
		
		System.out.println("ACtual Data");
		for(Student st : stdlist)
		{
			System.out.println(st.getRollno() + "\t" + st.getSname() + "\t" + st.getAge());
		}
		
		SortingBasedOnRollNo  sbr = new SortingBasedOnRollNo();
		Collections.sort(stdlist, sbr);
		
		System.out.println("Sorted Data Based On Roll Number");
		for(Student st : stdlist)
		{
			System.out.println(st.getRollno() + "\t" + st.getSname() + "\t" + st.getAge());
		}
		
		SortingBasedOnAge sba = new SortingBasedOnAge();
		Collections.sort(stdlist, sba);
		
		System.out.println("Sorted Data Based On Age");
		for(Student st : stdlist)
		{
			System.out.println(st.getRollno() + "\t" + st.getSname() + "\t" + st.getAge());
		}
	}
}

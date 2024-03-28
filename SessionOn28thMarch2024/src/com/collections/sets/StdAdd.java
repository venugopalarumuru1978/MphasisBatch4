package com.collections.sets;
import java.util.*;
public class StdAdd {

	public static void main(String[] args) {
		Set<Student>  stdSet = new LinkedHashSet<Student>();
		Student std = null;
		
		std = new Student(1001, "Pavan", "Java");
		stdSet.add(std);
		
		std = new Student(1002, "Karan", "Java");
		stdSet.add(std);
		
		std = new Student(1003, "Lavan", "Java");
		stdSet.add(std);

		
		for(Student s : stdSet)
		{
			System.out.println(s.getRollno() + "\t" + s.getStdname() + "\t" + s.getCourse());
		}
		
	}

}

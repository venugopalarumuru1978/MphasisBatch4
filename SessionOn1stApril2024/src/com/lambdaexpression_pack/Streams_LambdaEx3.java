package com.lambdaexpression_pack;
import java.util.*;
import java.util.stream.Collectors;
public class Streams_LambdaEx3 {

	public static void main(String[] args) {

		List<Persons> personList = new ArrayList<Persons>();
		Persons person = null;
		
		person = new Persons(101, "Ramana", 23);
		personList.add(person);

		person = new Persons(102, "Pavan", 21);
		personList.add(person);

		person = new Persons(105, "Murali", 25);
		personList.add(person);

		person = new Persons(104, "Mohan Kumar", 23);
		personList.add(person);

		person = new Persons(103, "Praveen", 20);
		personList.add(person);

		System.out.println("Persons Info :");
		
		personList.forEach(p-> System.out.println(p.getPid() + "\t" + p.getPname() + "\t" + p.getAge()));
		
		// Show all persons who's age is above 21
		System.out.println("----Persons who's age having above 21------");
		personList.stream().filter(p->p.getAge()>21).forEach(pt->System.out.println(pt.getPname() + "\t" + pt.getAge()));
		
		System.out.println("----Persons who's age having above 21------");
		List<Persons>  age21AbovePersons = personList.stream().filter(p->p.getAge()>21).collect(Collectors.toList());	
		age21AbovePersons.forEach(p-> System.out.println(p.getPid() + "\t" + p.getPname() + "\t" + p.getAge()));
	}
}

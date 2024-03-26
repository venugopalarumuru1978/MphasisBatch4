package com.inheritancepack;

class Student
{
	protected String sname, course;
	
	public void getStdinfo(String sname, String course)
	{
		this.sname = sname;
		this.course = course;
	}
}

class Marks extends Student
{
	protected int sub1, sub2;
	
	public void getMarks(int s1, int s2)
	{
		this.sub1 = s1;
		this.sub2 = s2;
	}
}

class Results extends Marks
{
	public void printResult()
	{
		System.out.println("Student Name : " + sname);
		System.out.println("Student Course : " + course);
		System.out.println("Subject 1 Marks : " + sub1);
		System.out.println("Subject 2 Marks : " + sub2);
		System.out.println("Total Marks : " + (sub1+sub2));
	}
}

public class MultiLevelMain {

	public static void main(String[] args) 
	{
		Results result = new Results();
		result.getStdinfo("Pavan", "Java");
		result.getMarks(56, 60);
		result.printResult();
	}
}

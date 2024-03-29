package com.sortings.comparator_pack;

public class Student {
	private int rollno;
	private String sname;
	private int age;
	
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public Student(int rollno, String sname, int age) {
		super();
		this.rollno = rollno;
		this.sname = sname;
		this.age = age;
	}
}

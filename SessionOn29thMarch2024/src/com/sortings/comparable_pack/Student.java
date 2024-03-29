package com.sortings.comparable_pack;

public class Student implements Comparable<Student> {
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
	
	@Override
	public int compareTo(Student s1) {
		// TODO Auto-generated method stub
		return Integer.compare(getRollno(), s1.getRollno());
	}
}

/*
 * 	1001	Ravi	25
	1004	Kavi	22
	1005	Bavi	21
	1002	Lavi	20
	1003	Kovi	24
 * x =10
 * y = 5
 * 
 * x.compareTo(y)  = if x>y = return +ve val
 * x.compareTo(y)  = if x<y = return -ve val
 * x.compareTo(y)  = if x==y = return 0
 * 
 * 
 * 
 */

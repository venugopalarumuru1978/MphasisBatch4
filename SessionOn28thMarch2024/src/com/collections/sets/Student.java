package com.collections.sets;


public class Student {

	private int rollno;
	private String stdname;
	private String course;
	
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getStdname() {
		return stdname;
	}
	public void setStdname(String stdname) {
		this.stdname = stdname;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	
	public Student(int rollno, String stdname, String course) {
		super();
		this.rollno = rollno;
		this.stdname = stdname;
		this.course = course;
	}
	
	
}

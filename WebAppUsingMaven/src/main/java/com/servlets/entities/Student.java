package com.servlets.entities;

/*
 * CREATE TABLE STUDENT(ROLLNO INT PRIMARY KEY, 
STDNAME VARCHAR(20) NOT NULL, 
COURSE VARCHAR(10), FEES FLOAT);
 */

public class Student {
	private int rollno;
	private String stdname;
	private String course;
	private float fees;
	
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
	public float getFees() {
		return fees;
	}
	public void setFees(float fees) {
		this.fees = fees;
	}
}

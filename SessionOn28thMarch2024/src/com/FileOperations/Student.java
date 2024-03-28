package com.FileOperations;
/*
 * Perform Student Details in Files
 * 1. Add New Students
 * 2. View All Students
 * 3. Search Student Based On Rollno
 */

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
	
	
}

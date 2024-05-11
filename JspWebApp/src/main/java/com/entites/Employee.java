package com.entites;

public class Employee {

	private int empno;
	private String ename;
	
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
		System.out.println("setter of empno");
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
		System.out.println("setter of ename");
	}
}

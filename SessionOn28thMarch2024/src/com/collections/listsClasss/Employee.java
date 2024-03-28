package com.collections.listsClasss;

public class Employee {

	private int empno;
	private String ename;
	private String job;
	private float salary;
	
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	
	
	public Employee() {
		super();
	}
	
	public Employee(int empno, String ename, String job, float salary) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.job = job;
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "empno=" + empno + ", ename=" + ename + ", job=" + job + ", salary=" + salary + "\n";
	}
	
	
}

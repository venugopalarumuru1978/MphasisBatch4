package com.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {

	private int empno;
	private String ename;
	
	private Address adrs;

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

	public Address getAdrs() {
		return adrs;
	}

	@Autowired(required=true)
	@Qualifier("adrsObj2")
	public void setAdrs(Address adrs) {
		this.adrs = adrs;
	}
	
	public void printEmpInfo()
	{
		System.out.println("Employee Number : " + this.getEmpno());
		System.out.println("Employee Number : " + this.getEname());
		System.out.println("Door No : " + this.getAdrs().getDno());
		System.out.println("Location : " + this.getAdrs().getLoc());
		System.out.println("Phone Number : " + this.getAdrs().getPhone());
	}
}

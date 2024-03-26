package com.abstraction.assignment2;

public class Account {

	protected String accno;
	protected String custname;
	protected double balance;
	public String getAccno() {
		return accno;
	}
	public void setAccno(String accno) {
		this.accno = accno;
	}
	public String getCustname() {
		return custname;
	}
	public void setCustname(String custname) {
		this.custname = custname;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public Account(String accno, String custname, double balance) {
		super();
		this.accno = accno;
		this.custname = custname;
		this.balance = balance;
	}
	
	
}

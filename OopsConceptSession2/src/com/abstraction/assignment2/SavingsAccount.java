package com.abstraction.assignment2;

public class SavingsAccount extends Account implements MaintenanceCharge {

	public SavingsAccount(String accno, String custname, double balance) {
		super(accno, custname, balance);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculateMaintenanceCharge(float noOfYears) {
		double charges = (noOfYears*50)+50;
		return charges;
	}
	
}

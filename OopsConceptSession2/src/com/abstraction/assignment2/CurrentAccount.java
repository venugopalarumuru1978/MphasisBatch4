package com.abstraction.assignment2;

public class CurrentAccount extends Account implements MaintenanceCharge {

	public CurrentAccount(String accno, String custname, double balance) {
		super(accno, custname, balance);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculateMaintenanceCharge(float noOfYears) {
		double charges = (noOfYears*100)+200;
		return charges;
	}
	
}

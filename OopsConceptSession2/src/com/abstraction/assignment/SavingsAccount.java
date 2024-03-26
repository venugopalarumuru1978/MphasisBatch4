package com.abstraction.assignment;

public class SavingsAccount extends Account {

	private double minimumBalance;
	
	public SavingsAccount(int accountNumber, Customer customerObj, double balance, double minbal) {
		super(accountNumber, customerObj, balance);
		this.minimumBalance = minbal;
	}

	@Override
	public boolean withdraw(double amount) {
		if((balance-amount)>minimumBalance)
		{
			System.out.println(amount + " is withdrawn Successfully");
			balance = balance-amount;
			System.out.println("Present balance :  " + balance);
			return true;
		}
		return false;
	}
}

package com.abstraction;

abstract class Bank
{
	public void BankInfo()
	{
		System.out.println("Bank providing both house and vechicle loans ");
	}
	
	public abstract void rateofInterest();
}

class HDFC extends Bank
{
	@Override
	public void rateofInterest() {
		System.out.println("HDFC bank rate of Interest for Housing Loans is : 8.50%");
	}
}

class SBI extends Bank
{
	@Override
	public void rateofInterest() {
		System.out.println("SBI bank rate of Interest for Housing Loans is : 9.50%");		
	}
}

public class AbsMain {

	public static void main(String[] args) {
		Bank hdfc = new HDFC();
		hdfc.BankInfo();
		hdfc.rateofInterest();
		
		System.out.println("---------------");
		
		Bank sbi = new SBI();
		sbi.BankInfo();
		sbi.rateofInterest();
	}
}

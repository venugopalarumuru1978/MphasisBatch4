package com.staticpack;

public class Customer 
{
	private String custName;
	private int accbal;
	private static int  amt_in_bank;
	
	public void getCustDetails(String cname, int bal)
	{
		custName = cname;
		accbal = bal;
		
		amt_in_bank = amt_in_bank+accbal;
	}
	
	public void printCustomer()
	{
		System.out.println("Customer Name : " + custName);
		System.out.println("Amount in Customer Account : " + accbal);
	}
	
	public static void getAmtinBank()
	{
		System.out.println("Amount In Bank : " + amt_in_bank);
	}
}

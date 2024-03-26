package com.abstraction.assignment2;
import java.util.*;
public class UserInterface {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1. Savings Account\n2. Current Account");
		System.out.println("Pick ur Choice : ");
		int ch = sc.nextInt();
		
		System.out.println("Account Number : ");
		String accno = sc.next();
		
		System.out.println("Customer Name : ");
		String cname = sc.next();
		
		System.out.println("Balance Amount : ");
		double bal = sc.nextDouble();
		
		System.out.println("No of years for an Account" );
		int noy = sc.nextInt();
		
		if(ch==1)
		{
			SavingsAccount acc = new SavingsAccount(accno, cname, bal);
			System.out.println("Maintaince Charges for Locker Per Annum of Savings Account : " + acc.calculateMaintenanceCharge(noy));
		}
	
		if(ch==2)
		{
			CurrentAccount  cacc = new CurrentAccount(accno, cname, bal);
			System.out.println("Maintaince Charges for Locker Per Annum of Current Account : " + cacc.calculateMaintenanceCharge(noy));
		}	
	}
}

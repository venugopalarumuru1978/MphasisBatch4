package com.abstraction.assignment;
import java.util.*;
public class CustomerMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Customer ID : ");
		int cid = sc.nextInt();
		System.out.println("Customer Name : ");
		String cname = sc.next();
		System.out.println("Customer Email : ");
		String email = sc.next();
		
		Customer cust = new Customer(cid, cname, email);
		System.out.println("Account No : ");
		int accno = sc.nextInt();
		System.out.println("Amount to Deposit : ");
		double bal = sc.nextDouble();
		
		Account  acc = new SavingsAccount(accno, cust, bal, 1000.00);
		
		System.out.println("Customer Name : " + acc.customerObj.getCustomerName());
		System.out.println("Customer Email  : " + acc.customerObj.getEmailId());
		System.out.println("Amount in Account : " + acc.getBalance());
		System.out.println("Account Min Balance : 1000.00");
		System.out.println("-----------------------");
		
		String ch = "";
		do
		{
		System.out.println("Enter amount to WithDraw : ");
		double wamt = sc.nextDouble();
		
		if(acc.withdraw(wamt)==true)
			System.out.println("Transaction is Success");
		else
			System.out.println("Transaction is Failed");
		System.out.println("Do u have 1 more transaction(Y/N)");
		ch = sc.next();
		}
		while(ch.equalsIgnoreCase("Y"));
	}
}
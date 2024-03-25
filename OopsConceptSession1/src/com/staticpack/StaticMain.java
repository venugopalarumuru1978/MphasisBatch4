package com.staticpack;

public class StaticMain {

	public static void main(String[] args) {
		
		DemoStatic.getdata(100, 200);
		DemoStatic.putdata();
		System.out.println("-----------------");
		Customer cust1 = new Customer();
		cust1.getCustDetails("Praveen", 10000);

		Customer cust2 = new Customer();
		cust2.getCustDetails("Pavan", 30000);
		
		Customer cust3 = new Customer();
		cust3.getCustDetails("Pavani", 20000);

		cust1.printCustomer();
		System.out.println("-----------------");
		
		cust2.printCustomer();
		System.out.println("-----------------");

		cust3.printCustomer();
		System.out.println("-----------------");

		Customer.getAmtinBank();
	}
}
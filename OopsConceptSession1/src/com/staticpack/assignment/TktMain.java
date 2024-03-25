package com.staticpack.assignment;

import java.util.Scanner;

public class TktMain {

	public static void main(String[] args) {
		String ch = null;
		Ticket tkt =new Ticket();
		Ticket.setAvailableTickets(25);
		
		Scanner sc = new Scanner(System.in);
		do
		{
			System.out.println("------------------");
			System.out.println("Available Tickets : " + Ticket.getAvailableTickets());
			System.out.println("------------------");
			System.out.println("Enter Ticket ID : ");
			tkt.setTicketid(sc.nextInt());
			
			System.out.println("Enter Ticket Price : ");
			tkt.setPrice(sc.nextInt());
			
			System.out.println("No of Tickets : ");
			int ntkt = sc.nextInt();
			
			int tktamt = tkt.calculateTicketCost(ntkt);
			if(tktamt!=-1)
				System.out.println("Total Amount : " + tktamt);
			else
				System.out.println("Tickets are not avaiable");
			System.out.println("Do u have another booking(y/n)");
			ch = sc.next();
		}
		while(ch.equalsIgnoreCase("y"));		
	}

}

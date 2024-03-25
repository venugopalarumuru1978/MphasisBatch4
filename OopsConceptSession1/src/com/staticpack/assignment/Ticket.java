package com.staticpack.assignment;

public class Ticket {

	private int ticketid;
	private int price;
	private static int availableTickets;
	
	public int getTicketid() {
		return ticketid;
	}
	public void setTicketid(int ticketid) {
		this.ticketid = ticketid;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public static int getAvailableTickets() {
		return availableTickets;
	}
	
	public static void setAvailableTickets(int availableTickets) {
		Ticket.availableTickets = availableTickets;
	}

	public int calculateTicketCost(int nooftickets)
	{
		int totalamt = -1;
		if(getAvailableTickets()>nooftickets)
		{
			int availtkts =getAvailableTickets()-nooftickets;
			setAvailableTickets(availtkts);
			totalamt = nooftickets*this.getPrice();
		}
		return totalamt;
	}
}

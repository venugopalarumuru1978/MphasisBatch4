package com.ds.linkedlist_pack;

public class CircularMain {

	public static void main(String[] args) {
		CircularLinkedList  clist = new CircularLinkedList();
		clist.AddNode("Pavan");
		clist.AddNode("Murali");
		clist.AddNode("Kamal");
		clist.AddNode("Varun");
		clist.AddNode("Vedika");
		
		clist.TraverseValues();
		
		
	}

}

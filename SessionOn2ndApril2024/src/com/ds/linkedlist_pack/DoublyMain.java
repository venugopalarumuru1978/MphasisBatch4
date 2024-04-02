package com.ds.linkedlist_pack;

public class DoublyMain {

	public static void main(String[] args) {
		DoublyLinkedList  dlist = new DoublyLinkedList();
		
		dlist.AddNode("Pavan");
		dlist.AddNode("Murali");
		dlist.AddNode("Kamal");
		dlist.AddNode("Varun");
		dlist.AddNode("Vedika");
		
		System.out.println("-------------");
		dlist.TraverseForwardFeature();
		System.out.println("-------------");
		dlist.TraverseBackwardFeature();
	}
}

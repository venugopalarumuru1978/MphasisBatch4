package com.ds.linkedlist_pack;

public class DoublyLinkedList {

	// node creation
	class Node
	{
		String data;
		Node prvs;
		Node next;
		
		public Node(String data)
		{
			this.data = data;
			this.prvs = null;
			this.next = null;
		}
	}
	
	private Node head, tail = null;
	
	public void AddNode(String data)
	{
		Node newNode = new Node(data);
		
		if(head==null)
		{
			head = tail = newNode;  // data storing
			head.prvs =  null;
			head.next =  null;
			System.out.println("First Node is Created....");
		}
		else
		{
			// newNode will be added after tail such that tail's next will point to newNode
			tail.next = newNode;
			// newNode previous will point to the tail
			newNode.prvs = tail;
			// newNode becomes as tail
			tail = newNode;
			// next will be null
			tail.next = null;
			System.out.println("Node created...");
		}
	}
	
	public void TraverseForwardFeature()
	{
		Node getNode = head;
		if(head==null)
		{
			System.out.println("List is Empty");
		}
		else
		{
			while(getNode!=null)
			{
				System.out.println(getNode.data);
				getNode = getNode.next;
			}
		}
	}
	
	public void TraverseBackwardFeature()
	{
		Node getNode = tail;
		if(tail==null)
		{
			System.out.println("List is Empty");
		}
		else
		{
			while(getNode!=null)
			{
				System.out.println(getNode.data);
				getNode = getNode.prvs;
			}
		}
	}

}

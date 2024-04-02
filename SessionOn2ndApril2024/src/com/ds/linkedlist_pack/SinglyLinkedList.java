package com.ds.linkedlist_pack;

public class SinglyLinkedList {

	// Node Creation
	class Node
	{
		String data;
		Node next;
		
		public Node(String data)
		{
			this.data = data;
			this.next = null;
		}
	}
	
	private Node head = null;
	private Node tail = null;
	
	public void AddNode(String data)
	{
		Node newNode = new Node(data);
		
		if(head==null)
		{
			//if list is empty, both  head and tail will point to new node.
			head = newNode;
			tail = newNode;
			System.out.println("First Node is Created");
		}
		else
		{
			tail.next = newNode; // address will be stored
			tail = newNode; // value will be stored
			
			System.out.println("Node is Created...");
		}
	}
	
	public void TraverseList()
	{
		Node getNode = head;
		if(head==null)
			System.out.println("List is Empty");
		else
		{
			while(getNode!=null)
			{
				System.out.println(getNode.data );
				getNode = getNode.next;
			}
		}
	}

	public void SearchValueInList(String str)
	{
		Node getNode = head;
		if(head==null)
			System.out.println("List is Empty");
		else
		{
			boolean flag = false;
			while(getNode!=null)
			{
				if(getNode.data.equals(str))
				{
					System.out.println("Value Found....");
					flag = true;
				}
				getNode = getNode.next;
			}
			
			if(flag==false)
				System.out.println("Value Not Found....");
		}
	}
	
}

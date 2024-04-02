package com.ds.linkedlist_pack;

public class CircularLinkedList {

	// node creation
			class Node
			{
				String  data;
				Node next;
				
				public Node(String data)
				{
					this.data = data;
					this.next = null;
				}
			}
			

			private Node head, tail = null;
			
			public void AddNode(String data)
			{
				Node newNode = new Node(data);
				
				if(head==null)
				{
					head = newNode;
					tail = newNode;
					newNode.next = head;
					System.out.println("First Node Created");
				}
				else
				{
					tail.next = newNode;
					tail = newNode;
					tail.next = head; // circular linkedlist
					System.out.println("Node Created...");
				}
			}
			
			public void TraverseValues()
			{
				Node getNode = head;
				if(head==null)
				{
					System.out.println("List is Empty");
				}
				else
				{
					do
					{
						System.out.println(getNode.data);
						getNode = getNode.next;
					}
					while(getNode!=head);
				}
			}
}

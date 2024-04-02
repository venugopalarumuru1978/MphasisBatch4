package com.ds.linkedlist_pack;

import java.util.Scanner;

public class SinglyMain {

	public static void main(String[] args) {
		SinglyLinkedList  slist = new SinglyLinkedList();
		
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
			System.out.println("1. Create a Node(data)\n2. View All\n3. Search\n4. Exit");
			System.out.println("Pick ur choice : ");
			int ch = sc.nextInt();
			
			switch(ch)
			{
			case 1:
				System.out.println("Enter a value : ");
				String str = sc.next();
				slist.AddNode(str);
				break;
			case 2:
				slist.TraverseList();
				break;
			case 3:
				System.out.println("Enter a string to search");
				String st = sc.next();
				slist.SearchValueInList(st);
				break;
			case 4:
				System.out.println("Thanks for using app");
				System.exit(0);
			}
		}
	}

}

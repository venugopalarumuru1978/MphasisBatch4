package com.datastructures_pack;

public class Stack {

	private int x[];
	private int top; // for indexing purpose
	private int capacity;
	
	public Stack(int size)
	{
		x = new int[size];
		top = -1;
		capacity = size;
	}
	
	public void isEmpty()
	{
		if(top==-1)
		{
			System.out.println("Stack is Empty");
			System.exit(0);
		}
	}
	
	public void isFull()
	{
		if(top==capacity-1)
		{
			System.out.println("Stack is Full");
			System.exit(0);
		}
	}
	
	public void push(int val)
	{
		this.isFull();
		
		System.out.println("Inserting Value : " + val);
		x[++top] = val;
	}
	
	public int pop()
	{
		this.isEmpty();
		
		return x[top--];
	}
	
	public void ShowValues()
	{
		System.out.println();
		for(int i=0;i<=top;i++)
		{
			System.out.print(x[i] + "\t");
			this.isEmpty();
		}
	}
	
	public int Size()
	{
		return top+1;
	}

}

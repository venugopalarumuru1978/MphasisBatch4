package com.ds;

public class Stack {

	private int data[];
	private int top;
	private int capacity;
	
	public Stack(int size)
	{
		data = new int[size];
		capacity = size;
		top = -1;
	}
	
	public boolean isEmpty()
	{
		if(top==-1)
			return true;
		else 
			return false;
	}
	
	public boolean isFull()
	{
		if(top==capacity-1)
			return true;
		else
			return false;
	}
	
	public void Push(int n)
	{
		if(this.isFull())
		{
			System.out.println("Stack is Full, Overflow");
			System.exit(0);
		}
		data[++top] = n;
		System.out.println(n + " Value Inserted..");
	}
	
	public int Pop()
	{
		if(this.isEmpty())
		{
			System.out.println("Stack is Empty");
			System.exit(0);
		}
		return data[top--];
	}
	
	public void PrintValues()
	{
		System.out.println();
		if(this.isEmpty())
			System.out.println("Stack is Empty, No Values to show");
		else
		{
			for(int i=0;i<=top;i++)
			{
			System.out.print(data[i] + "\t");	
			}
		}
	}
	
	public int Size()
	{
		return top+1;
	}
}

package com.ds;

public class Queue {
	
	private String data[];
	private int front,rear;
	private int capacity;
	
	public Queue(int size)
	{
		data = new String[size];
		capacity = size;
		front = -1;
		rear = -1;
	}
	
	
	public boolean isFull()
	{
		if(front==0 && rear == capacity-1)
			return true;
		else
			return false;
	}
	
	public boolean isEmpty()
	{
		if(front==-1)
			return true;
		else
			return false;
	}


	public void Enqueue(String str)
	{
		if(this.isFull())
			System.out.println("Queue is Full..");
		else
		{
			if(front==-1)
				front = 0;
			rear++;
			data[rear] = str;
				// or
			//data[++rear] = str;
			System.out.println(str + " Value is Inserted...");
		}
	}
	
	public String Dequeue()
	{
		if(this.isEmpty())
		{
			System.out.println("Queue is Empty");
			return null;
		}
		else
		{
			String val = data[front];
			if(front>=rear)
			{
				front = -1;
				rear = -1;
			}
			else
				front++;
			//System.out.println(val + " is Removed....");
			return val;
		}
	}
	
	public void Display()
	{
		if(this.isEmpty())
			System.out.println("Queue is Empty");
		else
		{
			for(int i=front;i<=rear;i++)
			{
				System.out.println(data[i]);
			}
		}
	}
}

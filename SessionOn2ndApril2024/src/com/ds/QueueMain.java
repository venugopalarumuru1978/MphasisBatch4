package com.ds;

public class QueueMain {

	public static void main(String[] args) {
		Queue  qu= new Queue(5);
		qu.Enqueue("Praveen");
		qu.Enqueue("Pavan");
		qu.Enqueue("Pavani");
		qu.Enqueue("Paramesh");
		qu.Enqueue("Pravasthi");
		System.out.println("--------------");
		qu.Display();
		
		qu.Dequeue();
		System.out.println("--------------");
		qu.Display();
		
		qu.Dequeue();
		System.out.println("--------------");
		qu.Display();
		
		qu.Dequeue();
		System.out.println("--------------");
		qu.Display();
		
		qu.Dequeue();
		System.out.println("--------------");
		qu.Display();
		
		qu.Dequeue();
		System.out.println("--------------");
		qu.Display();
	}

}

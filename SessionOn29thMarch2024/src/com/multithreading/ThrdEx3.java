package com.multithreading;

class DemoPriority1 extends Thread
{
	public void run()
	{
		System.out.println("This is thread A");
	}
}

class DemoPriority2 extends Thread
{
	public void run()
	{
		System.out.println("This is thread B ");
	}
}

public class ThrdEx3 {

	public static void main(String[] args) {
		DemoPriority1  dp1 = new DemoPriority1();
		DemoPriority2  dp2 = new DemoPriority2();
		
		System.out.println("Thread A Priority : " + dp1.getPriority());
		System.out.println("Thread B Priority : " + dp2.getPriority());
		
		dp1.setPriority(Thread.MAX_PRIORITY);
		dp2.setPriority(Thread.MIN_PRIORITY);
		
		System.out.println("Thread A Priority : " + dp1.getPriority());
		System.out.println("Thread B Priority : " + dp2.getPriority());
		
		dp1.run();
		dp2.run();

		System.out.println("Main() Proiority : " + Thread.currentThread().getPriority());
	}
}

package com.multithreading;

class TestThread1 extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Thread A : " + i);
			try {
				Thread.sleep(1000); // 1000 milli second - 1 second	
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}

class TestThread2 extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Thread B : " + i);
			try {
				Thread.sleep(2000); // 1000 milli second - 1 second	
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}

public class ThrdEx2 {

	public static void main(String[] args) {

		TestThread1 ttA = new TestThread1();
		TestThread2 ttB = new TestThread2();
		System.out.println("Thread A Name : " + ttA.getName());
		System.out.println("Thread B Name : " + ttB.getName());
		System.out.println("Name of Main Thread : " + Thread.currentThread().getName());
		
		ttA.setName("Venugopal");
		ttB.setName("SimpliLearn");
		Thread.currentThread().setName("Mphasis");
		
		System.out.println("Thread A Name : " + ttA.getName());
		System.out.println("Thread B Name : " + ttB.getName());
		System.out.println("Name of Main Thread : " + Thread.currentThread().getName());
		
		ttA.start();
		ttB.start();
	}

}

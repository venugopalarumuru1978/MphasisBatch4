package com.multithreading;

class DemoThread extends Thread
{
	public void run()
	{
		System.out.println("This is thread method run()");
	}
}

class DemoInterface implements Runnable
{
	@Override
	public void run() {
		System.out.println("This is run() from Runnable Interface");
	}	
}
public class ThrdEx1 {

	public static void main(String[] args) {
		
		DemoThread dt1 = new DemoThread();
		dt1.start();
		
		Thread th1 = new Thread(new DemoInterface());
		th1.start();
		
		System.out.println("This is Main() method");	
	}

}

package com.syncpack;
// static level sync
class SharedResource3
{
	public synchronized static void Wish(String name)
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Good Morning : " + name);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}

class ThreadSync3 extends Thread
{
	private String name;
	
	public ThreadSync3(String name) {
			this.name =name;
	}
	
	public void run()
	{
		SharedResource3.Wish(name);
	}
}

public class Sync3 {

	public static void main(String[] args) {
		
		ThreadSync3 ths1 = new ThreadSync3("Murali");
		ThreadSync3 ths2 = new ThreadSync3("Kiran");
		
		ths1.start();
		ths2.start();
	}
}

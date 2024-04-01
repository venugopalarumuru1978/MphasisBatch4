package com.syncpack;
// block level sync
class SharedResource2
{
	public void Wish(String name)
	{
		System.out.println("Method Started....");
		synchronized(this)
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
		System.out.println("Method Ended...");
	}
}

class ThreadSync2 extends Thread
{
	private SharedResource2 sr;
	private String name;
	
	public ThreadSync2(String name, SharedResource2 sr) {
			this.sr = sr;
			this.name =name;
	}
	
	public void run()
	{
		sr.Wish(name);
	}
}

public class Sync2 {

	public static void main(String[] args) {
		SharedResource2 sr = new SharedResource2();
		
		ThreadSync2 ths1 = new ThreadSync2("Murali", sr);
		ThreadSync2 ths2 = new ThreadSync2("Kiran", sr);
		
		ths1.start();
		ths2.start();
	}
}

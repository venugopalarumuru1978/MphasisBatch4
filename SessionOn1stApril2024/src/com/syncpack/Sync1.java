package com.syncpack;
// method level sync
class SharedResource
{
	public synchronized void Wish(String name)
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

class ThreadSync1 extends Thread
{
	private SharedResource sr;
	private String name;
	
	public ThreadSync1(String name, SharedResource sr) {
			this.sr = sr;
			this.name =name;
	}
	
	public void run()
	{
		sr.Wish(name);
	}
}

public class Sync1 {

	public static void main(String[] args) {
		SharedResource sr = new SharedResource();
		
		ThreadSync1 ths1 = new ThreadSync1("Murali", sr);
		ThreadSync1 ths2 = new ThreadSync1("Kiran", sr);
		
		ths1.start();
		ths2.start();
	}
}

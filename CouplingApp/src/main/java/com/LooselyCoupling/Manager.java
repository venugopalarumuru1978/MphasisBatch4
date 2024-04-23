package com.LooselyCoupling;

public class Manager {

	IWorker iw;
	
	public Manager(IWorker iw)
	{
		this.iw = iw;
	}
	
	public void ManageWork()
	{
		iw.Work();
	}	
}

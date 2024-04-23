package com.LooselyCoupling;

public class WorkerApp {

	public static void main(String[] args) {
		Manager man = null;
		IWorker wrk = null;
		
		wrk = new SmartWorker();
		man = new Manager(wrk);
		man.ManageWork();
		
		wrk = new LazyWorker();
		man = new Manager(wrk);
		man.ManageWork();
	
		wrk = new ExtraSmartWorker();
		man = new Manager(wrk);
		man.ManageWork();
	}
}

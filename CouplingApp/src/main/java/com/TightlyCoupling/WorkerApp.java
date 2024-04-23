package com.TightlyCoupling;

public class WorkerApp {

	public static void main(String[] args) {
		//Manager man = new Manager(new SmartWorker(), new LazyWorker(), new ExtraSmartWorker());
		Manager man = new Manager(new SmartWorker(),  new ExtraSmartWorker());
		man.ManageWorker();
	}
}

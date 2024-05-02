package com.test;

import org.junit.Test;

import com.dev.SimpleOperations;

public class PerformanceTestClass {

	SimpleOperations sim = new SimpleOperations();
	
	@Test(timeout=3000)
	public void PerformaceTest()
	{
		sim.PerformanceMethod();
	}
	
}

package com.test;

import org.junit.Test;

import com.dev.SimpleOperations;

public class ExceptionTestClass {

	SimpleOperations sim = new SimpleOperations();
	
	@Test(expected= ArithmeticException.class)
	public void testDivision()
	{
		sim.Division(10);
	}
}

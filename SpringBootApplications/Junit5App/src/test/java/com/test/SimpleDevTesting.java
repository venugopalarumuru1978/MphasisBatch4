package com.test;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.dev.SimpleOperations;

public class SimpleDevTesting {

	static	SimpleOperations  sim = null;
	
	@BeforeAll
	public static void initprocess()
	{
		System.out.println("Before Class Annotation");
		sim = new SimpleOperations();
	}
	
	@AfterAll
	public static void endprocess()
	{
		System.out.println("After Class Annotation");
		sim = null;
	}
	
	@Test
	public void testPosAddition()
	{
		System.out.println("TestPOS");
		int actual = sim.Addition(1, 2);
		int expected = 3;
		Assertions.assertEquals(expected, actual);
	}
	
	@Test
	public void testNosAddition()
	{
		System.out.println("TestNOS");
		int actual = sim.Addition(-11, -22);
		int expected = -33;
		Assertions.assertEquals(expected, actual);
	}
	
	@Test
	public void testPosNosAddition()
	{
		System.out.println("TestPOSNOS");
		int actual = sim.Addition(10, -2);
		int expected = 8;
		Assertions.assertEquals(expected, actual);
	}
	
}

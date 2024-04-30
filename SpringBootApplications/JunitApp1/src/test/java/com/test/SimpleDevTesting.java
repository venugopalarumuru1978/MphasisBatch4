package com.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.dev.SimpleOperations;

import junit.framework.Assert;

public class SimpleDevTesting {

	static	SimpleOperations  sim = null;
	
	@BeforeClass
	public static void initprocess()
	{
		System.out.println("Before Class Annotation");
		sim = new SimpleOperations();
	}
	
	@AfterClass
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
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testNosAddition()
	{
		System.out.println("TestNOS");
		int actual = sim.Addition(-11, -22);
		int expected = -33;
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testPosNosAddition()
	{
		System.out.println("TestPOSNOS");
		int actual = sim.Addition(10, -2);
		int expected = 8;
		Assert.assertEquals(expected, actual);
	}
	
}

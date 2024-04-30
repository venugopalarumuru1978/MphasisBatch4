package com.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.dev.SimpleOperations;

import junit.framework.Assert;

public class ArrayDevTesting {

	SimpleOperations  sim = null;
	
	@Before
	public void initprocess()
	{
		System.out.println("Before Annotation");
		sim = new SimpleOperations();
	}
	
	@After
	public void endprocess()
	{
		System.out.println("After Annotation");
		sim = null;
	}
	
	@Test
	public void testSmallValFromArray()
	{
		System.out.println("TestArray");
		int actual = sim.SmallValFromArray(new int[] {10,2,8,4});
		int exp = 2;
		Assert.assertEquals(exp, actual);
	}
}

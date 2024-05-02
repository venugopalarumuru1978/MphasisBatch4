package com.test;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.dev.SimpleOperations;

public class ArrayDevTesting {

	SimpleOperations  sim = null;
	
	@BeforeEach
	public void initprocess()
	{
		System.out.println("Before Annotation");
		sim = new SimpleOperations();
	}
	
	@AfterEach
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
		Assertions.assertEquals(exp, actual);
	}
}

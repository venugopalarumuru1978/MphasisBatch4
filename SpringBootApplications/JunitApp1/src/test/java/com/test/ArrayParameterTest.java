package com.test;

import java.util.Arrays;
import java.util.Collection;

import org.junit.After;

import org.junit.Before;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.dev.SimpleOperations;

import junit.framework.Assert;

@RunWith(Parameterized.class)
public class ArrayParameterTest {

	private int x[], expected;
	
	private SimpleOperations  sim = null;
	
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


	public ArrayParameterTest(int[] x, int expected) {
		super();
		this.x = x;
		this.expected = expected;
	}

	@Parameterized.Parameters
	public static Collection input()
	{
		
		return Arrays.asList(
				new Object[][] {{new int[] {10,20,3,-7,3}, -7},
					{new int[] {3,4,5,7,1}, 1},
					{new int[] {90,30, 50},30}});
	}
	
	@Test
	public void testSmallValFromArray()
	{
		int actual = sim.SmallValFromArray(x);
		int exp = expected;
		Assert.assertEquals(exp, actual);
	}
}

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
public class AddParameterizedTest {

	private int fNumber, sNumber, expected;
	
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
	
	public AddParameterizedTest(int fNumber, int sNumber, int expected) {
		super();
		this.fNumber = fNumber;
		this.sNumber = sNumber;
		this.expected = expected;
	}
	
	@Parameterized.Parameters
	public static Collection input()
	{
		return Arrays.asList(new Object[][] {{10,20, 30},{-10,-20,-30},{10, -5, 5}});
	}
	
	@Test
	public void testAddition()
	{
		
		int actual = sim.Addition(fNumber, sNumber);
		int exp = expected;
		Assert.assertEquals(exp, actual);
	}
}

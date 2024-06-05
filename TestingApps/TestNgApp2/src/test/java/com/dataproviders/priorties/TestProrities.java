package com.dataproviders.priorties;

import org.testng.annotations.Test;

public class TestProrities {

	@Test(priority = 0)
	public void  TestXyz()
	{
		System.out.println("XYZ method");
	}
	
	@Test(priority = 1)
	public void  TestAbc()
	{
		System.out.println("ABC method");
	}
	
	@Test(priority = 2)
	public void  TestPqr()
	{
		System.out.println("PQR method");
	}
}

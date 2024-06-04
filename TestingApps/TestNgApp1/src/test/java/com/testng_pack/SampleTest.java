package com.testng_pack;


import org.testng.annotations.Test;

public class SampleTest extends BaseTest {


	@Test
	public void TestXyz()
	{
		System.out.println("This is first method");
	}
	
	@Test
	public void TestAbc()
	{
		System.out.println("This is Second method");
	}
	
	@Test
	public void TestBca()
	{
		System.out.println("This is Third method");
	}
}

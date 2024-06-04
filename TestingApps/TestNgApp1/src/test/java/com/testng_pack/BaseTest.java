package com.testng_pack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseTest {

	WebDriver driver = null;
	
	@BeforeSuite
	public void  suiteB()
	{
		System.out.println("Before Suite");
	}

	@AfterSuite
	public void  suiteA()
	{
		System.out.println("After Suite");
	}
	
	@BeforeClass
	public void  ClassB()
	{
		System.out.println("Before Class");
	}

	@AfterClass
	public void   ClassA()
	{
		System.out.println("After Class");
	}

	@BeforeTest
	public void init()
	{
		System.out.println("Before Test");
	}
	
	@AfterTest
	public void end()
	{
		System.out.println("After Test");
	}

	@BeforeMethod
	public void   MethodB()
	{
		//driver = new ChromeDriver();
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		System.out.println("Before Method");
	}
	
	@AfterMethod
	public void   MethodA()
	{
		driver.quit();
		System.out.println("After Method");
	}
	
}

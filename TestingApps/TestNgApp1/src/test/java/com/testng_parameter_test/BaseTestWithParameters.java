package com.testng_parameter_test;

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
import org.testng.annotations.Parameters;

import com.beust.jcommander.Parameter;

public class BaseTestWithParameters {

	WebDriver driver = null;
	
	@BeforeMethod
	@Parameters("browser")
	public void  suiteB(String bname)
	{
		System.out.println("Before Suite");
		System.out.println("Browser Name : " + bname);
		if(bname.equals("edge"))
		{
			driver = new EdgeDriver();
		}
		if(bname.equals("chrome"))
		{
			driver = new ChromeDriver();
		}
		driver.manage().window().maximize();
	}

	@AfterMethod
	public void  suiteA()
	{
		System.out.println("After Suite");
		driver.quit();
	}
	
/*
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
	*/
}

package com.dataproviders;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

public class BaseTest {

	public WebDriver driver = null;
	
	@BeforeMethod
	public void init()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@AfterMethod
	public void end()
	{
		driver.quit();
	}
	
	@DataProvider
	public Object[][]  GetUserDetails()
	{
		//Object[][] userinfo = {{"venugopal", "v@123"}, {"pavan", "p@123"}, {"sahasra", "s@123"},{"pravasthi", "p@123"}};
		
		// or
		
		Object[][] userinfo = new Object[4][2];
		
		userinfo[0][0] = "venugopal";
		userinfo[0][1] = "v@123";
		
		userinfo[1][0] = "sahasra";
		userinfo[1][1] = "s@123";
		
		userinfo[2][0] = "pavan";
		userinfo[2][1] = "p@123";
		
		userinfo[3][0] = "pravasthi";
		userinfo[3][1] = "p@123";
		
		return userinfo;
	}
}

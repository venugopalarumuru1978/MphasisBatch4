package com.testings;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class DateEx {

	public static void main(String[] args) {
	
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Tricon/MyHtmlRepo/Reg.html");
		
		try {
			Thread.sleep(3000);
			WebElement dateex = driver.findElement(By.name("txtbDate"));
			dateex.sendKeys("04062024");
			Thread.sleep(3000);
			System.out.println("Given Date is : " + dateex.getAttribute("value"));
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		finally
		{
			//driver.quit();
		}

	}

}

package com.testings;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class CheckBoxEx1 {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Tricon/MyHtmlRepo/Reg.html");
		
		try {
			
			WebElement  chk1 = driver.findElement(By.name("chk1"));
			Thread.sleep(3000);
			chk1.click();
			if(chk1.isSelected())
			{
				System.out.println(chk1.getAttribute("value") + " is Selected");
			}
			Thread.sleep(3000);
			chk1.click();
			if(!chk1.isSelected())
			{
				System.out.println(chk1.getAttribute("value") + " is Not Selected");
			}

			
			WebElement  chk2 = driver.findElement(By.name("chk2"));
			Thread.sleep(3000);
			chk2.click();
			if(chk2.isSelected())
			{
				System.out.println(chk2.getAttribute("value") + " is Selected");
			}
			Thread.sleep(3000);
			chk2.click();
			if(!chk2.isSelected())
			{
				System.out.println(chk2.getAttribute("value") + " is Not Selected");
			}

			WebElement  chk3 = driver.findElement(By.name("chk3"));
			Thread.sleep(3000);
			chk3.click();
			if(chk3.isSelected())
			{
				System.out.println(chk3.getAttribute("value") + " is Selected");
			}
			Thread.sleep(3000);
			chk3.click();
			if(!chk3.isSelected())
			{
				System.out.println(chk3.getAttribute("value") + " is Not Selected");
			}
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		finally
		{
			driver.quit();
		}
	}
}

package com.testings;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class CheckBoxEx2 {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Tricon/MyHtmlRepo/Reg.html");
		
		try {
			
			List<WebElement> elements = driver.findElements(By.cssSelector("input[type='checkbox']"));
			
			for(WebElement chk : elements)
			{
				Thread.sleep(3000);
				
				chk.click();
				if(chk.isSelected())
				{
					System.out.println(chk.getAttribute("value") + " is Selected");
				}
				
				Thread.sleep(3000);
				chk.click();
				if(!chk.isSelected())
				{
					System.out.println(chk.getAttribute("value") + " is Not Selected");
				}

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

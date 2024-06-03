package com.testings;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
//radiobutton example2
public class RadioButtonEx2 {

	public static void main(String[] args) {

		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Tricon/MyHtmlRepo/js6.html");
		try {
			Thread.sleep(3000);
			
			List<WebElement> elements = driver.findElements(By.cssSelector("input[type='radio']"));
			
			for(WebElement rdo : elements)
			{
				Thread.sleep(3000);
				System.out.println(rdo.getAttribute("value"));
				rdo.click();
			}
				
		} catch (Exception e) {
				System.out.print(e.getMessage());
		}
		
		finally
		{
			driver.quit();
		}
	}

}

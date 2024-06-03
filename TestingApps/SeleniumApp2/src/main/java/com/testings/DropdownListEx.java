package com.testings;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
// dropdown with single option selection
public class DropdownListEx {

	public static void main(String[] args) {
	
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Tricon/MyHtmlRepo/Reg.html");
		
		try {
			Thread.sleep(3000);
			WebElement dropdown = driver.findElement(By.name("ddlLoc"));
			
			Select options = new Select(dropdown);
			List<WebElement>  locOptions = options.getOptions();
			
			for(WebElement e : locOptions)
				System.out.println(e.getText());
			
			System.out.println("-----------");
			Thread.sleep(3000);
			options.selectByValue("Pune");
			System.out.println("Selected Value is : " + options.getFirstSelectedOption().getText());
			
			System.out.println("-----------");
			Thread.sleep(3000);
			options.selectByIndex(1);
			System.out.println("Selected Value is : " + options.getFirstSelectedOption().getText());
				
			System.out.println("-----------");
			Thread.sleep(3000);
			options.selectByVisibleText("Bangalore");
			System.out.println("Selected Value is : " + options.getFirstSelectedOption().getText());
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		finally
		{
			driver.quit();
		}

	}

}

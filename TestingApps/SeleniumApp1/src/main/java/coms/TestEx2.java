package coms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class TestEx2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\Mphasis\\MphasisBatch4\\edgedriver_win64\\msedgedriver.exe");				
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com/");
		try
		{
			WebElement element = driver.findElement(By.name("q"));
			element.sendKeys("Seven wonders of the World");
			element.submit();
			
		if(element!=null)
			System.out.println("TextBox Found");		
		}
		catch(Exception ex)
		{
			System.out.println("TextBox Not Found");
		}
	}

}

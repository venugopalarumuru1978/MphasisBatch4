package coms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class TestEx6 {
// example of partiallinkText Locator
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\Mphasis\\MphasisBatch4\\edgedriver_win64\\msedgedriver.exe");				
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com/");
		try
		{
			WebElement element = driver.findElement(By.partialLinkText("new account"));			
			Thread.sleep(2000);
			element.click();
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
	}

}

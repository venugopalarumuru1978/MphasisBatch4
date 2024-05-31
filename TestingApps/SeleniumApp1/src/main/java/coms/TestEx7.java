package coms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class TestEx7 {
// example of tagname locator

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\Mphasis\\MphasisBatch4\\edgedriver_win64\\msedgedriver.exe");				
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com/");
		
		try
		{
			Thread.sleep(2000);

			List<WebElement>  elements = driver.findElements(By.tagName("input"));
			System.out.println("Size : " + elements.size());
			for(WebElement web : elements)
			{
				System.out.println(web.getTagName() + "---" + web.getAccessibleName());
				
				if(web.getAccessibleName().equals("Email address or phone number"))
					web.sendKeys("venugopal@gmail.com");

				if(web.getAccessibleName().equals("Password"))
					web.sendKeys("v@123");
				
					Thread.sleep(3000);
			}
			
			WebElement btnEle = driver.findElement(By.cssSelector("button[type='submit']"));
			btnEle.submit();
			//Thread.sleep(2000);
			//driver.quit(); // browser will close
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
	}

}

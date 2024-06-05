package com.dataproviders.reports;

import java.io.File;
import java.lang.reflect.Method;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseReportTest {

	public static WebDriver driver;
	public static String subfoldername;
	public static ExtentReports extendReport;
	public static ExtentTest extentTest;


	@Parameters("browserName")
	@BeforeTest
	public void Setup(String browserName, ITestContext context) 
	{
		if(browserName.equals("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver =new ChromeDriver();
		}
		
		if(browserName.equals("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		
		if(browserName.equals("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		Capabilities  capabilities = ((RemoteWebDriver) driver).getCapabilities();
		
		String device = capabilities.getBrowserName() + "<===>" + capabilities.getBrowserVersion();
		String author = context.getCurrentXmlTest().getParameter("author");
		
		extentTest = extendReport.createTest(context.getName());
		extentTest.assignAuthor(author);
		extentTest.assignDevice(device);
	}

	@AfterTest
	public void CloseProcess()
	{
		driver.quit();
	}
	
	@BeforeSuite
	public void InitializeReport()
	{
		ExtentSparkReporter sparkreport = new ExtentSparkReporter("AllTests.html");
		sparkreport.config().setReportName("All Test Report");
		
		ExtentSparkReporter  sparkreport_Failed = new ExtentSparkReporter("FailedTests.html");
		
		sparkreport_Failed.filter().statusFilter().as(new Status[] {Status.FAIL}).apply();
		
		sparkreport_Failed.config().setReportName("Failure Report");
		
		extendReport = new ExtentReports();
		extendReport.attachReporter(sparkreport, sparkreport_Failed);
		
		extendReport.setSystemInfo("OS", System.getProperty("os.name"));
		extendReport.setSystemInfo("Java Version", System.getProperty("java.version"));	
	}
	
	@AfterSuite
	public void generateReport()
	{
		extendReport.flush(); // add report info to the html report files
	}

	@AfterMethod
	public void checkStatus(Method m, ITestResult result)
	{
		if(result.getStatus()==ITestResult.FAILURE)
		{
			String fname = result.getTestContext().getName() + "_" + result.getMethod().getMethodName() + ".jpg";
			String screenshotpath = captureScreenShot(fname);
			extentTest.addScreenCaptureFromPath(screenshotpath);
			extentTest.fail(result.getThrowable());
		}
		else if(result.getStatus()==ITestResult.SUCCESS)
		{
			extentTest.pass(m.getName() + " is Passed");
		}
		
		extentTest.assignCategory(m.getAnnotation(Test.class).groups());
	}
	
	public String captureScreenShot(String fileName)
	{
		if(subfoldername==null)
		{
			LocalDateTime  myDateObj = LocalDateTime.now();
			DateTimeFormatter myFormat = DateTimeFormatter.ofPattern("ddMMyyyyHHmmss");
			subfoldername = myDateObj.format(myFormat);
		}
		
		TakesScreenshot  takesScreen = (TakesScreenshot) driver;
		File sourcefile = takesScreen.getScreenshotAs(OutputType.FILE);
		File destFile = new File("./ScreenShots/" +  subfoldername + "/" + fileName);
		try
		{
			FileUtils.copyFile(sourcefile, destFile);
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
		System.out.println("Screenshot Saved Successfully...");
		return destFile.getAbsolutePath();
	}

	@DataProvider
	public Object[][] UserInfo()
	{
		Object  data[][] = new Object[4][2];
		
		data[0][0] = "venugopal";
		data[0][1] = "v@123";
		
		data[1][0] = "pavankalyan";
		data[1][1] = "p@123";
		
		data[2][0] = "karan";
		data[2][1] = "k@123";
		
		data[3][0] = "pavan";
		data[3][1] = "p@123";
		return data;
	}

}

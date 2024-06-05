package com.dataproviders.excel;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

public class BaseTestExcel {

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
	
	@DataProvider(parallel = true)
	public Object[][]  GetUserDetailsFromExcel()
	{
		try {
			File excelFile = new File("./src/test/resources/LoginUserDetails.xlsx");
			
			FileInputStream fis = new FileInputStream(excelFile);
			XSSFWorkbook  workbook= new XSSFWorkbook(fis);
			XSSFSheet sheet = workbook.getSheet("Sheet1");
						
			int rows = sheet.getLastRowNum();
			int cols = sheet.getRow(0).getLastCellNum();
		
			Object[][] userinfo = new Object[rows][cols];
			
			for(int i=1;i<=rows;i++)
			{
				for(int j=0;j<cols;j++)
				{
					DataFormatter df = new DataFormatter(); 
					//System.out.print(df.formatCellValue(sheet.getRow(i).getCell(j)) + "  ");
					userinfo[i-1][j] = sheet.getRow(i).getCell(j).toString();
				}
			}
			
			workbook.close();
			fis.close();
			
			return userinfo;
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return null;
	}

}

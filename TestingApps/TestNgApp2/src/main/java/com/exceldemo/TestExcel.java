package com.exceldemo;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TestExcel {

	public static void main(String[] args) {
		try {
			File excelFile = new File("./src/test/resources/LoginUserDetails.xlsx");
			System.out.println(excelFile.exists());
			
			FileInputStream fis = new FileInputStream(excelFile);
			XSSFWorkbook  workbook= new XSSFWorkbook(fis);
			XSSFSheet sheet = workbook.getSheet("Sheet1");
			
			System.out.println("No of Rows Including Header Row " + sheet.getPhysicalNumberOfRows());  // calculates all the rows including header row
			System.out.println("No of Rows Excluding Header Row " + sheet.getLastRowNum()); // calculates all the rows excluding header row
			
			int rows = sheet.getLastRowNum();
			int cols = sheet.getRow(0).getLastCellNum();
			System.out.println("No of Columns : " + cols);
			
			for(int i=1;i<=rows;i++)
			{
				for(int j=0;j<cols;j++)
				{
					DataFormatter df = new DataFormatter(); 
					System.out.print(df.formatCellValue(sheet.getRow(i).getCell(j)) + "  ");
				}
				System.out.println();
			}
			
			workbook.close();
			fis.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}

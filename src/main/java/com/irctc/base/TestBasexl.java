package com.irctc.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;

import com.irctc.qa.pages.IrctcLaunch;

public class TestBasexl extends IrctcLaunch {
	HSSFSheet seventh;
	public TestBasexl() throws IOException{
		
			//Properties p = new Properties();
			File source = new File ("C:\\Users\\pvr23\\eclipse-workspace\\Irctctest\\src\\main\\java\\com\\irctc\\config\\properties\\ezmaap.xls");
			FileInputStream target = new FileInputStream(source);
			HSSFWorkbook wb = new HSSFWorkbook(target);
			seventh=wb.getSheet("irctc");
			
			int z = wb.getSheetAt(7).getLastRowNum();
			System.out.println(z);
			wb.close();
            target.close();

			}
	
	public void datadrivenfrom() {
		//int j = seventh.getFirstRowNum();
		//int k = seventh.getLastRowNum();
		//for(int i=j+1;i<=k;i++) {
			
			String fromStation=seventh.getRow(1).getCell(0).getStringCellValue();
			driver.findElement(By.xpath("//input[@placeholder='From*']")).sendKeys(fromStation);
			//String toStation=seventh.getRow(i).getCell(1).getStringCellValue();
			//driver.findElement(By.xpath("//input[@placeholder='To*']")).sendKeys(toStation);
			FindTrains();
			
		//}
		
	}
	public void datadrivento() {
		//int j = seventh.getFirstRowNum();
		//int k = seventh.getLastRowNum();
		//for(int i=j+1;i<=k;i++) {
		String toStation=seventh.getRow(1).getCell(1).getStringCellValue();
		driver.findElement(By.xpath("//input[@placeholder='To*']")).sendKeys(toStation);
	}
	
	
	}


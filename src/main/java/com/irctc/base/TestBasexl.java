package com.irctc.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;

public class TestBasexl extends TestBase {
	HSSFSheet irctc;
	public TestBasexl() throws IOException{
		
			//Properties p = new Properties();
			File source = new File ("C:\\Users\\pvr23\\eclipse-workspace\\Irctctest\\src\\main\\java\\com\\irctc\\config\\properties\\ezmaap.xls");
			FileInputStream target = new FileInputStream(source);
			HSSFWorkbook wb = new HSSFWorkbook(target);
			irctc=wb.getSheet("irctc");
			
			int z = wb.getSheetAt(7).getLastRowNum();
			System.out.println(z);
			wb.close();
            target.close();

			}
	
	public void datadrivenfrom() {
		String fromStation=irctc.getRow(1).getCell(0).getStringCellValue();
		driver.findElement(By.xpath("//input[@placeholder='From*']")).sendKeys(fromStation);
	}
	public void datadrivento() {
		String toStation=irctc.getRow(1).getCell(1).getStringCellValue();
		driver.findElement(By.xpath("//input[@placeholder='To*']")).sendKeys(toStation);
	}
	
	
	}


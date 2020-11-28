package com.irctc.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class sample {
	
	public sample() throws IOException{

	 File source = new File ("C:\\Users\\pvr23\\eclipse-workspace\\Irctctest\\src\\main\\java\\com\\irctc\\config\\properties\\ezmaap.xls");
	 FileInputStream target = new FileInputStream(source);
	 HSSFWorkbook wb = new HSSFWorkbook(target);
	 int i = wb.getSheetAt(1).getLastRowNum();
	System.out.println(i);
	}
}

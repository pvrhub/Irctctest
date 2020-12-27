package com.irctc.base;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestBasexl1 extends TestBase {
	
	public TestBasexl1() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	public static void travelDate() {
		
		String JourneyDate = (ppt.getProperty("startdate")) ;
		String date []= JourneyDate.split("-");
		String expday = date[0];
		String expmonth = date[1];
		String expyear = date [2];
		System.out.println(JourneyDate);
		System.out.println(expyear);
		
		String actmonth = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']/span[1]")).getText();
		String actyear = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']/span[2]")).getText();
		
		System.out.println(actyear);
		
		for (int i=0;i<100;i++) {
			
			if(actmonth.equals(expmonth)&&(actyear.equals(expyear))) {
				java.util.List<WebElement> dates = driver.findElements(By.xpath("//div/table/tbody/tr/td"));
				System.out.println(dates.size());
			
			       for(WebElement  d:dates) {
			    	   
			    		   if(d.getText().equals(expday)) {
			    			   d.click();
			    			   break;
			    	   }
			    		   	   
			       }
			       break;
			
			     //div/table/tbody/tr/td
			}
			
			
			else {
				
				//driver.findElement(By.xpath("//span[@class='fa fa-angle-right']")).click();
				driver.findElement(By.xpath("//a[@class='ui-datepicker-next ui-corner-all']/span[@class='fa fa-angle-right']")).click();
				actmonth = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']/span[1]")).getText();
				 actyear = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']/span[2]")).getText();
				
			}
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

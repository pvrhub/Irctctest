package com.irctc.base;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class JourneyDate extends TestBasexl {

	public JourneyDate() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	public static void startDate() {
		//03-12-2020
		//String journeyDate=seventh.getRow(1).getCell(2).getStringCellValue();
		//driver.findElement(By.xpath("//input[@placeholder ='Journey Date(dd-mm-yyyy)*']")).sendKeys(journeyDate);
		String Date = "03-12-2020";
		String DateSplitter[] = Date.split("-");
		String expdate =  DateSplitter[0];
		String expmonth =  DateSplitter[1];
		String expyear =  DateSplitter[2];
		System.out.println(expdate);
		//driver.findElement(By.xpath("//span[@class='ui-button-icon-left ui-clickable fa fa-fw fa-calendar']")).click();
		String Actmonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month ng-tns-c12-5 ng-star-inserted']")).getText();
		String Actyear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year ng-tns-c12-5 ng-star-inserted']")).getText();
		System.out.println(Actmonth);
		
	/*	for (int s=0;s<100;s++) {
			if (expmonth.equals(Actmonth)&& expyear.equals(Actyear)){
				
				
				java.util.List<WebElement> datelist = driver.findElements(By.xpath("//div/table/tbody/tr/td"));
				//<WebElement> totaldates1 = driver.findElements(By.xpath("//div/table/tbody/tr/td"));
				int display = datelist.size();
				System.out.println(display);
				for (WebElement d:datelist) {
					//String selectingdate = datelist.get(d).getText();
					//if(datelist.get(d).getText().equals(expdate)) {
					if(d.getText().equals(expdate)) {
						d.click();
						break;
					}
					
				}
				break;
				}
		else {
						//driver.findElement(By.xpath("//a[@class='ui-datepicker-next ui-corner-all']")).click();
			driver.findElement(By.xpath("//a[@class='ui-datepicker-next ui-corner-all']/span[@class='fa fa-angle-right']")).click();
						 Actmonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month ng-tns-c12-5 ng-star-inserted']")).getText();
						 Actyear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year ng-tns-c12-5 ng-star-inserted']")).getText();
					}
			
			
			
				}
	*/
		for(int j=0;j<100;j++)
			
		{
			if(expmonth.equals(Actmonth)&&expyear.equals(Actyear)){
				java.util.List<WebElement> totaldates1 = driver.findElements(By.xpath("//div/table/tbody/tr/td"));
				int Dateslist1 = totaldates1.size();
				System.out.println(Dateslist1);
				for(WebElement p:totaldates1){
					
					if(p.getText().equals(expdate)){
						p.click();;
						break;
					}}break;
					}
			else{
			driver.findElement(By.xpath("//a[@class='ui-datepicker-next ui-corner-all']/span[@class='fa fa-angle-right']")).click();

			Actmonth = driver.findElement(By.xpath(ppt.getProperty("getmonthxpath"))).getText();
			System.out.println(Actmonth);
			Actyear = driver.findElement(By.xpath(ppt.getProperty("getyearxpath"))).getText();
			System.out.println(Actyear);
			
				}
		
			}	
	
}
}


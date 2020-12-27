package com.irctc.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GenericTestSimple {
	static WebDriver driver;
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/Users/pvr23/Desktop/Selenium/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();
		JavascriptExecutor Scrolldown = (JavascriptExecutor) driver;
		Scrolldown.executeScript("window.scrollBy(0,300)", "");
		driver.findElement(By.xpath("//button[@class='btn btn-primary'and @type='submit']")).click();
		By dropdown = By.xpath("//a[contains(text(),'TRAINS')]");
		driver.findElement(dropdown);
	
		
		WebElement subdd = driver.findElement(By.xpath("//a[contains(text(),'Connecting Journey Booking')]")); 
		
		//abc(dropdown);
		//abc(subdd);
		
		
	List<WebElement> L=driver.findElements(By.xpath("//a"));
	System.out.println(L.size());
	for(int i=0;i<L.size();i++) {
		
		String s = L.get(i).getText();
		System.out.println(s);
		if(s.equals(subdd)) {
			L.get(i).click();
			break;
		}
	/*List<WebElement> subList	=driver.findElements(By.xpath("//a/span"));
	System.out.println(L.size());
	for(int j=0;j<subList.size();j++) {
		
		String st = subList.get(j).getText();
		System.out.println(s);
		if(st.equals("IRCTC TRAINS")) {
			subList.get(j).click();
			break;
		}*/
		
		//objectclassreference.clickThelink(TRAINS);
		//objectclassreference.clickThelink(iRCTC TRAINS);
		//objectclassreference.CLICKTHESUBLINK(iRCTC TRAINS, GROUP);
	}
	
	

	}


	}

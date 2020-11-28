package com.irctc.qa.pages;

import com.irctc.base.TestBase;
import com.irctc.base.TestBasexl;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class IrctcLaunch extends TestBase{

//page Factory
	
	
	public IrctcLaunch() throws IOException {
		super();
		PageFactory.initElements(driver, this);
		
	}

	//@FindBy(xpath="//button[@class='btn btn-primary'and @type='submit']")
	//WebElement okbutton;
	
	@FindBy(xpath="//button[@class='btn btn-primary'and @type='submit']")

	public WebElement okbtn;
	
	@FindBy(xpath="//input[@placeholder='From*']")
	WebElement fromfield;
	
	@FindBy(xpath="//input[@placeholder='To*']")
	WebElement tofield;
	
	@FindBy(xpath="//a[@href='http://contents.irctc.co.in/en/ListofTrainswithPantryCar.pdf']")
	public WebElement link;
	
	@FindBy(xpath="//button[@label='Find Trains']") WebElement FindTrainsButton;
	
	//public void driverWebElements() {
		//PageFactory.initElements(driver, this);
	//}
	
	
	
	public static void scroll(){
		JavascriptExecutor Scrolldown = (JavascriptExecutor) driver;
		Scrolldown.executeScript("window.scrollBy(0,300)", "");
	}
	

	public void from() {
		//fromfield.sendKeys("ONGOLE - OGL");
		fromfield.sendKeys();
	}
	
	public void to() {
		tofield.sendKeys("MGR CHENNAI CTL - MAS");
	}
	
	public void FindTrains() {
		FindTrainsButton.click();
	}
	
	
	public  void OkbuttonClick() {
	  okbtn.click();
    }
	
	public void clickLink() {
		link.click();
	}
	
public void getWindowHandles () {
//Set<String> s = driver.getWindowHandles();
//Iterator<String> i = s.iterator();
//i.next();
//i.next();
Set<String> s = driver.getWindowHandles();
System.out.println(s);
Iterator<String> i =s.iterator();
String promptWindowId=i.next();
System.out.println(promptWindowId);


}
	
	
}

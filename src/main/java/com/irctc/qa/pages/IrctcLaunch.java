package com.irctc.qa.pages;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.irctc.base.TestBase;
import com.irctc.base.TestBasexl;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
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

	public  WebElement okbtn;
	
	@FindBy(xpath="//input[@placeholder='From*']")
	WebElement fromfield;
	//[aria-controls='pr_id_1_list']
	
	@FindBy(xpath="//input[@placeholder='To*']")
	WebElement tofield;
	
	@FindBy(xpath="//a[@href='http://contents.irctc.co.in/en/ListofTrainswithPantryCar.pdf']")
	public WebElement link;
	
	@FindBy(xpath="//button[@label='Find Trains']") WebElement FindTrainsButton;
	
	//public By frominput = By.xpath(ppt.getProperty("from"));
	public By frominput = By.xpath(ppt.getProperty("from"));
	public By toinput = By.xpath(ppt.getProperty("to"));
	 
	private WebElement inputfield(By inputxpath) {
		return driver.findElement(inputxpath);
	}
	
	public void inputfieldEntry (By inputxpath, String value) {
		(inputfield(inputxpath)).sendKeys(value);
	}
	
	//public void driverWebElements() {
		//PageFactory.initElements(driver, this);
	//}
	
	
	
	public  void scroll(){
		JavascriptExecutor Scrolldown = (JavascriptExecutor) driver;
		Scrolldown.executeScript("window.scrollBy(0,300)", "");
	}
	
	public void extentreportmethod() {
		ExtentHtmlReporter extentreportpathdefine = new ExtentHtmlReporter("./extentReports/firsttestreport.html");
		ExtentReports getextentreport = new ExtentReports();
		getextentreport.attachReporter(extentreportpathdefine);
		ExtentTest testresults  =getextentreport.createTest("firsttest");
		testresults.log(Status.INFO, "information");
		testresults.log(Status.PASS, "title verified");
		testresults.log(Status.FAIL, "failed reason");
		//testresults.log(Status.ERROR, "failed reason");
	}

	public void from() {
		fromfield.sendKeys("DELHI - DLI");
		
	}
	
	public void to() {
		tofield.sendKeys("MUMBAI CENTRAL - BCT");
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

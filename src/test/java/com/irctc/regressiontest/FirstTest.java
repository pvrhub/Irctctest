package com.irctc.regressiontest;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import  com.irctc.base.TestBase;
import com.irctc.qa.pages.IrctcLaunch;


public class FirstTest extends IrctcLaunch {
	
	

	public FirstTest() throws IOException {
		super();
		//PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}



	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		IrctcLaunch t = new IrctcLaunch();
		//TestBase d = new TestBase();
		t.IrctcIntialize();
		//t.IrctcIntialize();
		t.pageLoad( );
		t.iWait();
		//String a = t.Title1();
		//ExtentHtmlReporter extentreport = new ExtentHtmlReporter("./Irctctest/extentReports");
		//extentreport.flush();
		
	}

	

	@Test
	//Lokesh first test case to check page title
/*public void getTitle() throws IOException{
		ExtentHtmlReporter extentreportpathdefine = new ExtentHtmlReporter("./extentReports/firsttestreport.html");
		ExtentReports getextentreport = new ExtentReports();
		getextentreport.attachReporter(extentreportpathdefine);
		ExtentTest testresults  =getextentreport.createTest("firsttest");
		//testresults.log(Status.INFO, "information");
		testresults.log(Status.PASS, "title verified");
		//testresults.log(Status.FAIL, "failed reason");
		//testresults.log(Status.ERROR, "failed reason");
*/		public void getTitle() throws IOException{
		IrctcLaunch t = new IrctcLaunch();
	
	//t.getWindowHandles ();
		
		t.scroll();
		//driver.findElement(By.xpath("//button[@class='btn btn-primary'and @type='submit']")).click();
		Okbutton();
		//new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(t.OkbuttonClick()));
iWait();
	  
		//t.clickLink();
		//t.OkbuttonClick();
		String expected =(ppt.getProperty("title"));
		
		//System.out.println(Title());
		Assert.assertEquals(expected, Title());
		
		//getextentreport.flush();
	
	
	}
	 
	
	
	
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		driverclose();
		
	}

}

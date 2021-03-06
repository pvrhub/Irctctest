package com.irctc.integrationtest;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.irctc.base.JourneyDate;
import  com.irctc.base.TestBase;
import com.irctc.base.TestBasexl;
import com.irctc.base.TestBasexl1;
import com.irctc.qa.pages.IrctcLaunch;


public class SecondTest extends IrctcLaunch {
	
	

	public SecondTest() throws IOException {
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
		
		
	}

	

/*	@Test
	//Lokesh first test case to check page title
public void getTitle() throws IOException{
		IrctcLaunch t = new IrctcLaunch();
	
	//t.getWindowHandles ();
	
		//t.scroll();
		//driver.findElement(By.xpath("//button[@class='btn btn-primary'and @type='submit']")).click();
		//Okbutton();
		//new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(t.OkbuttonClick()));
t.iWait();
	  
		//t.clickLink();
		//t.OkbuttonClick();
		String expected =(ppt.getProperty("title"));
		
		//System.out.println(Title());
		Assert.assertEquals(expected, Title());
	
	}*/
	 
	
/*	@Test
	
	public void getTitleMain() throws IOException{
		IrctcLaunch t = new IrctcLaunch();
	
	
		
		t.scroll();
		t.iWait();
	
		t.OkbuttonClick();
		String expected =(ppt.getProperty("title"));
		
		//from();
		//to();
		//FindTrains();
		
		//System.out.println(Title());
		Assert.assertEquals(expected, Title());
	}*/
	 
@Test
	
	public void datadriven() throws IOException{
		//TestBasexl xl = new TestBasexl();
	
	
	
		scroll();
		iWait();
	
		OkbuttonClick();
		//xl.datadrivenfrom();
		//xl.datadrivento();
		 inputfieldEntry (frominput,"DELHI - DLI");
		//driver.findElement(By.xpath("[aria-controls='pr_id_1_list']")).click();
		//driver.findElement(By.xpath("//input[@aria-controls='pr_id_1_list']")).sendKeys("DELHI - DLI");
		inputfieldEntry (toinput, "MUMBAI CENTRAL - BCT");
		//driver.findElement(By.xpath("//input[@placeholder='Journey Date(dd-mm-yyyy)*']")).click();
		//TestBasexl1.travelDate();
		//JourneyDate.startDate();
		//FindTrains();
		
		String expected =(ppt.getProperty("title"));
		
		//System.out.println(Title());
		Assert.assertEquals(expected, Title());
		//driver.close();
	}
	 
	
	@After
	public  void tearDownAftertest() throws Exception {
		driverclose();
		
	}

}

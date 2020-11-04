package com.irctc.qa.pages;

import com.irctc.base.TestBase;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IrctcLaunch extends TestBase{

//page Factory
	
	
	public IrctcLaunch() throws IOException {
		super();
		
	}

	@FindBy(xpath="//button[@class='btn btn-primary'and @type='submit']")
	WebElement okbutton;
	
	@FindBy(xpath="//input[@placeholder='From*']")
	WebElement fromfield;
	
	@FindBy(xpath="//input[@placeholder='To*']")
	WebElement tofield;
	

public  String  Title1(){
	
	String actual = driver.getTitle();
	
	return actual;
	
}

	
	public void driverWebElements() {
		PageFactory.initElements(driver, TestBase.class);
	}
	

	
	
}

package com.irctc.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.google.common.io.Files;
import com.irctc.testutils.TestUtils;

public  class TestBase {
public static Properties ppt ;
public static WebDriver driver;
static String actual;
//public static  String configBrowser;
	
public  TestBase() throws IOException {
	
	ppt = new Properties();
	FileInputStream fi= new FileInputStream("C:\\Users\\pvr23\\eclipse-workspace\\Irctctest\\src\\main\\java\\com\\irctc\\config\\properties\\config.properties");
		ppt.load(fi);
		ppt.getProperty("url");
		//configBrowser = ppt.getProperty("browser");
	}

public static   void IrctcIntialize() {
	
	//if(ppt.getProperty("browser").equals("chrome")){
	/*if (driver.equals(ppt.getProperty("browser"))) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\pvr23\\Desktop\\Selenium\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(TestUtils.pageLoadTimeout, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(TestUtils.implicitWait,TimeUnit.SECONDS);
	driver.get(ppt.getProperty("url"));

	}
    else if (driver.equals(ppt.getProperty("browser"))) {
	//else if(ppt.getProperty("browser").equals("firefox")) {
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\pvr23\\Desktop\\Selenium\\geckodriver.exe");
	driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(TestUtils.pageLoadTimeout, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(TestUtils.implicitWait,TimeUnit.SECONDS);
	driver.get(ppt.getProperty("url"));
}
		
	
	else {
		
		System.setProperty("webdriver.ie.driver", "C:\\Users\\pvr23\\Desktop\\Selenium\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(TestUtils.pageLoadTimeout, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtils.implicitWait,TimeUnit.SECONDS);
		driver.get(ppt.getProperty("url"));
	}*/
	try{
		
		
		if(ppt.getProperty("browser").equals("chrome")){
	
		System.setProperty("webdriver.chrome.driver", "C:/Users/pvr23/Desktop/Selenium/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//driver.get(url);
		driver.get(ppt.getProperty("url"));
	}
	
	else if(ppt.getProperty("browser").equals("firefox")){
	
		System.setProperty("webdriver.gecko.driver", "C:/Users/pvr23/Desktop/Selenium/geckodriver.exe");
		
		driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//driver.get(url);
		driver.get(ppt.getProperty("url"));
		
	}
	else{
		System.setProperty("webdriver.ie.driver","C:/Users/pvr23/Desktop/Selenium/IEDriverServer.exe");
		driver= new InternetExplorerDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//driver.get(url);
		driver.get(ppt.getProperty("url"));
		
		
	
	}}
	catch(Error e){
		
		e.printStackTrace();}
		
		
	}

public static   void pageLoad( ){
	driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
}
public static   void iWait(){
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}



public static String  Title(){
	
	actual = driver.getTitle();
	return actual;
	
	
}

public static   void driverclose() {
	driver.quit();
}

public static void getprintscreen() throws IOException {
	TakesScreenshot tscr = (TakesScreenshot) driver;
	File source = tscr.getScreenshotAs(OutputType.FILE);
	File target = new File ("C:\\Users\\pvr23\\eclipse-workspace\\Irctctest\\ScreenShots\\1.jpg");
	Files.copy(source, target);
}


public void Okbutton() {
	driver.findElement(By.xpath("//button[@class='btn btn-primary'and @type='submit']")).click();
}

}

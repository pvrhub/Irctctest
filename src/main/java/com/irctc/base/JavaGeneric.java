package com.irctc.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaGeneric {

	public static void main(String[] args) {
		//WebDriverManager.firefoxdriver().setup();
		System.setProperty("webdriver.chrome.driver", "C:/Users/pvr23/Desktop/Selenium/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.apsrtconline.in/oprs-web/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("/html/body/div[1]/div/div[4]/a[1]")).click();
		// cssSelector = a[href*='oprs-web/login/show.do'][class='user']
		// xpath = //a[contains(@href,'/oprs-web/login/show.do') and @class='user']
		// xpath = //a[contains(@href,'/oprs-web/login/show.do')]
		//a[contains(text(),'eTicket Login')]
		
		//@FindBy (xpath="//input[@name='userName']") WebElement username;
		//@FindBy (xpath="//input[@name='password']") WebElement password;
		
		By username = By.xpath("//input[@name='userName']");
		By password = By.xpath("//input[@name='password']");
		
		//driver.findElement(username).sendKeys("venkat");
		
		
		
		generic.userentry(username, "value");
		
		generic.userentry(password, "value");
		
		
		

	}

}

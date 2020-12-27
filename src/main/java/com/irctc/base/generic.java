package com.irctc.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class generic {

	static WebDriver driver = new ChromeDriver();
	public static void userentry(By locator, String value) {
		driver.findElement(locator).sendKeys(value);
	}
}

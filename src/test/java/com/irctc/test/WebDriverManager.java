package com.irctc.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class WebDriverManager {
   static WebDriver driver;
	public static void main(String[] args) {
	io.github.bonigarcia.wdm.WebDriverManager.iedriver().setup();
	driver = new InternetExplorerDriver();
		driver.get("https://www.google.com/");

	}

}

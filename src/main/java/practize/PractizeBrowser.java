package practize;

	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

	public class PractizeBrowser {
	static WebDriver driver;
		public static void main(String[] args) {
			
			//System.setProperty("webdriver.chrome.driver","C:/Users/pvr23/Desktop/Selenium/chromedriver.exe");
			 
			 WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();
			//driver = new FirefoxDriver();
			driver.get("https://www.google.com/");
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
			
			

		}

	}



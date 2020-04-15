package com.flipkart.mavem.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.ITestContext;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


public class TestBase {

	public static WebDriver driver;
	
	@BeforeTest
	public void setUp() {
		try {

			System.setProperty("webdriver.chrome.driver", "D:\\Workspace\\com.flipkart.mavem\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
				
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);



		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@AfterTest
	public void tearDown() {
		try {

			driver.quit();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

package com.flipkart.mavem.tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.flipkart.mavem.pages.Login;
import com.flipkart.mavem.pages.TestBase;



public class TS01_Login extends TestBase{

	Login lg;
	
	@Test(priority=0)
	public void intializePageFactory() {
		lg=PageFactory.initElements(driver, Login.class);
		
	}
	
	@Test(priority=1)
	public void login() throws Exception {
		try {
			lg.loginApplication();
		}catch (Exception e) {
			throw e;
		}
	}
}

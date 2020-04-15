package com.flipkart.mavem.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Login extends TestBase{
	
	@FindBy(how=How.XPATH,using="/html/body/div[2]/div/div/div/div") WebElement loginOPUP;
	@FindBy(how=How.XPATH,using="/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input") WebElement txtUsername;
	@FindBy(how=How.XPATH,using="/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input") WebElement txtpassword;
	@FindBy(how=How.XPATH,using="/html/body/div[2]/div/div/div/div/div[2]/div/form/div[3]/button") WebElement btnSubmit;
	
public void loginApplication() throws Exception {
		
		WebDriverWait wait=new WebDriverWait(driver, 25);
		Actions action=new Actions(driver);
		
		
		try {
			driver.get("https://www.flipkart.com/");
			Thread.sleep(3000);
			
			action.moveToElement(loginOPUP).build().perform();;
			txtUsername.sendKeys("nagawade.vrushali@gmail.com");
			txtpassword.sendKeys("vrushali8");
			btnSubmit.click();
		}catch (Exception e) {
			throw e;
		}
	}
}

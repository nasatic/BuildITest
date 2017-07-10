package com.autopageclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
public class UserAccountPage extends AutoPracticeLoginPage{
	
	
public UserAccountPage(WebDriver driver) {
		super(driver);
		
	}
	By addressButton = By.xpath("//span[contains(text(),'My addresses')]");
	By accoutPageText = By.xpath(".//*[@id='center_column']/h1");
	By signOutButton = By.xpath("//a[@class='logout']");
	
	
	public void asserPageAndLogout() throws InterruptedException {
	String text = driver.findElement(accoutPageText).getText();
	Assert.assertEquals(text,"MY ACCOUNT");
	System.out.println("Driver Instance used on user account Page is :" + driver);
	Thread.sleep(3000);
	driver.findElement(signOutButton).click();
	driver.close();
	driver.quit();

			
	
			
	}

}

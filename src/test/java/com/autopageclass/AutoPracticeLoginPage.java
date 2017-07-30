package com.autopageclass;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class AutoPracticeLoginPage {
	
	By signInButton = By.xpath("//a[contains(text(),'Sign in')]");
	By userName = By.xpath(".//*[@id='email']");
	By passWord = By.xpath(".//*[@id='passwd']");
	By loginButton = By.xpath(".//*[@id='SubmitLogin']");
	
	public static WebDriver driver;
	
	
	public AutoPracticeLoginPage(WebDriver driver){
		this.driver = driver;
	}
	
	public void asserLoginPage(){
		String actual = driver.getTitle();
		System.out.println("Driver Instance used on autopracticeLogin Page is :" + driver);
		System.out.println("Page title is: "+ actual);
		Assert.assertEquals(actual, "My account - My Store");
		
	}	
	
	public void enterUnameAndPswd(String uname, String passwd) throws Throwable{
		driver.findElement(signInButton).click();
		Thread.sleep(3000);
		System.out.println("Driver Instance used on AutoPracticeLogin Page is :" + driver);		
		driver.findElement(userName).sendKeys(uname);
		driver.findElement(passWord).sendKeys(passwd);
		Thread.sleep(3000);
		
	}
	public void clickonLogin() throws Throwable{
		driver.findElement(loginButton).click();
		System.out.println("Driver Instance used on AutoPracticeLogin Page is :" + driver);		
				
	}

}

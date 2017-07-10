package com.autopageclass;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AutoLoginPage {

	WebDriver driver;

	public AutoLoginPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH,using = "//a[contains(text(),'Sign in')]")
	WebElement HomeSignIn;
	
	@FindBy(how = How.ID,using = "email")
	WebElement emailAddress;
	
	@FindBy(how = How.ID,using = "passwd")
	WebElement password;
		
	@FindBy(how=How.XPATH, using="//a[contains(text(),'Forgot your password')]")
	WebElement forgotPassword;

	@FindBy(how = How.XPATH,using = "//button[@id='SubmitLogin']")
	WebElement subSignIn;

	@FindBy(how = How.XPATH, using = ".//*[@id='center_column']/h1")
	WebElement landingPageText;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'My personal information')]")
	WebElement personalInfo;

	@FindBy(how = How.XPATH, using = "//h1[contains(text(),'Your personal information')]")
	WebElement persInfoText;

	@FindBy(how = How.XPATH, using = "//a[@class='logout']")
	WebElement signOut;

	@FindBy(how = How.XPATH, using = "//li[contains(text(),'Authentication failed.')]")
	WebElement failedLoginText;

	public void validLogin(String email, String pswd) throws Throwable {
		HomeSignIn.click();
		Thread.sleep(3000);
		emailAddress.sendKeys(email);
		password.sendKeys(pswd);
		password.sendKeys(Keys.TAB);
		forgotPassword.sendKeys(Keys.TAB);
		subSignIn.sendKeys(Keys.ENTER);
//		Thread.sleep(3000);
//		subSignIn.click();
		Thread.sleep(3000);

	}

	public void navtoPersInfoPageAndAssert() throws Throwable {
		personalInfo.click();
		String persText = persInfoText.getText();
		String actual = new String("YOUR PERSONAL INFORMATION");
		if (actual.equals(persText)) {
			System.out.println(">>>>>>>>>>> Peronal Info assertion Passed >>>>>>>>>");
		} else
			throw new Exception("xxxxxxxxxxxxx personal Info assertion Failed xxxxxxxxxxxxxxxxxxxxxx ");

	}

	public void InvalidEmailLogin(String email, String pswd) throws Throwable {
		HomeSignIn.click();
		Thread.sleep(3000);
		emailAddress.sendKeys(email);
		password.sendKeys(pswd);
		password.sendKeys(Keys.TAB);
		forgotPassword.sendKeys(Keys.TAB);
		subSignIn.sendKeys(Keys.ENTER);
//		Thread.sleep(3000);
//		subSignIn.click();
		Thread.sleep(3000);
		String flogin = failedLoginText.getText();
		String actual = new String("Authentication failed.");
		if (actual.equals(flogin)) {
			System.out.println(">>>>>>>>>>> Invalid email assertion Passed >>>>>>>>>");
		} else
			throw new Exception("xxxxxxxxxxxxxxxxxxxx Invalid email assertion Failed xxxxxxxxxxxxxxxxxxxxxx ");
		emailAddress.clear();
		password.clear();
	}

	public void InvalidPswdLogin(String email, String pswd) throws Throwable {
		HomeSignIn.click();
		Thread.sleep(3000);
		emailAddress.sendKeys(email);
		password.sendKeys(pswd);
		password.sendKeys(Keys.TAB);
		forgotPassword.sendKeys(Keys.TAB);
		subSignIn.sendKeys(Keys.ENTER);;
//		Thread.sleep(3000);
//		subSignIn.click();
		Thread.sleep(3000);
		String passText = failedLoginText.getText();
		String actual = new String("Authentication failed.");
		if (actual.equals(passText)) {
			System.out.println(">>>>>>>>>>> Invalid password assertion Passed >>>>>>>>>");
		} else
			throw new Exception("xxxxxxxxxxxxxxxxxxxxx Invalid password assertion Failed xxxxxxxxxxxxxxxxxxxxxx ");

		emailAddress.clear();
		password.clear();

	}

	public void signOutAndQuitBrowser() throws Throwable {

		signOut.click();
		Thread.sleep(3000);
		driver.close();
		driver.quit();

	}

}

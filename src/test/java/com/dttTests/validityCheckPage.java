package com.dttTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class validityCheckPage extends dttLoginPage{
	
	public validityCheckPage(WebDriver driver) {
		super(driver);
		
	}


	By userID = By.id("txtEmail");
	By password = By.name("txtPassword");
	By login = By.id("btnLogin");
	By myAccount = By.xpath(".//*[@id='side-menu']/li[2]/a");
	By accAndPersonalInfo = By.xpath("//a[contains(text(),'Account & Personal Info')]");
	By customerID = By.id("pCustomerID"); // C000028221
	By addressDetailsLink = By.xpath("//a[contains(text(),'Address Details')]");
	By addressPage = By.xpath(".//*[@id='page-wrapper']/div[2]/div/div/div[2]/div[3]/div[1]/div[1]/label");
	By AddrPagePostCode = By.id("pPostCode");
	By AddrPagePhoneNo = By.id("pMobile");
	By logoutLink = By.xpath("//div[@id='wrapper']/nav/ul/li[2]/a");
	By signOut = By.id("lnkSignOut");
	By invalidEmailMsg = By.xpath(".//*[@id='txtEmail-error']");
	By invalidPasswordMsg = By.xpath(".//*[contains(text(),'Invalid user')]");	
	
	
	public void enterInvalidEmailValidPswd(String WrongEmail, String pswd){
		driver.findElement(userID).sendKeys(WrongEmail);
		driver.findElement(password).sendKeys(pswd);
		driver.findElement(login).click();
	}
	public void enterInvalidPswdValidEmail(String WrongPswd, String email){
		driver.findElement(userID).sendKeys(email);
		driver.findElement(password).sendKeys(WrongPswd);
		driver.findElement(login).click();
		
	}
	public void clearEmailAndPswd() throws Throwable{
		Thread.sleep(2000);
		driver.findElement(userID).clear();
		driver.findElement(password).clear();
		Thread.sleep(2000);
	}
	
	public void enterValidEmailAndPswd(String mail, String pswd){
		driver.findElement(userID).sendKeys(mail);
		driver.findElement(password).sendKeys(pswd);
		driver.findElement(login).click();
		
	}
	public void assertValidLogin() throws Exception {
		String homePageTitle = driver.getTitle();
		String actual = new String("DT & T");
		System.out.println("Home page title is : " + homePageTitle);
		if (homePageTitle.equals(actual)) {
			System.out.println("xxxxx Hurray!!!! Page Assertion PASSED xxxxxxxx");
		} else
			throw new Exception("<<<<<<<<<<<<<<<<<<<< Page Assertion Failed >>>>>>>>>>>>");
	}
	
	
	public void assertWrongEmailLogin() throws Exception {

		String email = driver.findElement(invalidEmailMsg).getText();
		String actual = new String("Enter email.");
		System.out.println("Wrong email Text : " + email);

		if (email.equals(actual)) {
			System.out.println("xxxxx Hurray!!!! Failed email Login Page Assertion PASSED xxxxxxxx");
		} else
			throw new Exception("<<<<<<<<<<<<<<<<<<<< Failed email Login Page Assertion Failed >>>>>>>>>>>>");

	}

	public void assertWrongPwdLogin() throws Exception {

		String pwd = driver.findElement(invalidPasswordMsg).getText();
		String actual = new String("Invalid user.");
		System.out.println("Wrong password Text : " + pwd);

		if (pwd.equals(actual)) {
			System.out.println("xxxxx Hurray!!!! Failed password Login Page Assertion PASSED xxxxxxxx");
		} else
			throw new Exception("<<<<<<<<<<<<<<<<<<<< Failed password Login Page Assertion Failed >>>>>>>>>>>>");
	}
	public void signOut() throws Throwable{
		driver.findElement(logoutLink).click();
		Thread.sleep(3000);
		driver.findElement(signOut).click();
		
	}
	public void closeAndQuit(){
		driver.close();
		driver.quit();
	}

}




package com.dttTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class dttLoginPage extends dttPOMDef {
	
	public dttLoginPage(WebDriver driver) {
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
	By invalidEmail = By.xpath(".//*[@id='txtEmail-error']");
	By invalidPassword = By.xpath(".//*[contains(text(),'Invalid user')]");

	
	

	public void sendEmailandPword(String id, String pswd) {
		driver.findElement(userID).sendKeys(id);
		driver.findElement(password).sendKeys(pswd);
	}

	public void clickOnLogin() {
		driver.findElement(login).click();
	}

	public void clickOnMyAccounts() {
		driver.findElement(myAccount).click();

	}

	public void clickOnPersonalInfo() {
		driver.findElement(accAndPersonalInfo).click();

	}

	public void AsserCustomerID() throws Exception {
		String cid = driver.findElement(customerID).getText();
		String actual = new String("C000028221");
		System.out.println("Customer ID : " + cid);

		if (cid.equals(actual)) {
			System.out.println("xxxxx Hurray!!!! CID Assertion PASSED xxxxxxxx");
		} else
			throw new Exception("<<<<<<<<<<<<<<<<<<<< CID Assertion Failed >>>>>>>>>>>>");

	}

	public void clickOnAddrDetails() throws Throwable {
		driver.findElement(addressDetailsLink).click();
		Thread.sleep(5000);

	}

	public void assertPcode() throws Exception {
		String pcode = driver.findElement(AddrPagePostCode).getText();
		String actual = new String("G53 5QY");
		System.out.println("PostCode is : " + pcode);

		if (pcode.equals(actual)) {
			System.out.println("xxxxx Hurray!!!! PostCode Assertion PASSED xxxxxxxx");
		} else
			throw new Exception("<<<<<<<<<<<<<<<<<<<< PostCode Assertion Failed >>>>>>>>>>>>");

	}

	public void assertMobileNo() throws Exception {
		String mobile = driver.findElement(AddrPagePhoneNo).getText();
		String actual = new String("(+44) 07859001102");
		System.out.println("Mobile no is : " + mobile);

		if (mobile.equals(actual)) {
			System.out.println("xxxxx Hurray!!!! Mobile No Assertion PASSED xxxxxxxx");
		} else
			throw new Exception("<<<<<<<<<<<<<<<<<<<< Mobile No Assertion Failed >>>>>>>>>>>>");

	}

	public void assertAddressPage() throws Exception {
		String addr = driver.findElement(addressPage).getText();
		String actual = new String("Address (Line 1)");
		System.out.println("Address Page Text : " + addr);

		if (addr.equals(actual)) {
			System.out.println("xxxxx Hurray!!!! Address Page Assertion PASSED xxxxxxxx");
		} else
			throw new Exception("<<<<<<<<<<<<<<<<<<<< Address Page Assertion Failed >>>>>>>>>>>>");

	}

	public void clickOnSignOut() throws InterruptedException {
		driver.findElement(logoutLink).click();
		Thread.sleep(3000);
		driver.findElement(signOut).click();
	}

	public void closeAndQuit() {
		driver.close();
		driver.quit();
	}
}

	


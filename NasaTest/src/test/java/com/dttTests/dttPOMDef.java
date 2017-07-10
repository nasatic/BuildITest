package com.dttTests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;

public class dttPOMDef {

   WebDriver driver;

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

	public dttPOMDef(WebDriver driver) {
		this.driver = driver;
	}

	

	public void gotoIEDriver() {
		driver = new InternetExplorerDriver();
		driver.manage().window().maximize();
		driver.get("https://www.dttmt.com/Login.aspx");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}
	public void gotoFOXDriver() {
		driver = new FirefoxDriver();
		driver.get("https://www.dttmt.com/Login.aspx");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);

	}
	public void gotoCHROMEDriver() {
        driver = new ChromeDriver();
		driver.get("https://www.dttmt.com/Login.aspx");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		
	}
	public void gotoOPERADriver() {
        driver = new OperaDriver();
		driver.get("https://www.dttmt.com/Login.aspx");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);

	}
	

	public void enterUserName() {

		driver.findElement(userID).sendKeys("ibeokoro@gmail.com");
	}

	public void enterInvalidUserName() {

		driver.findElement(userID).sendKeys("ibeokoro@gmail.com123");

	}

	public void enterPassword() {

		driver.findElement(password).sendKeys("mcas-7rs");
	}

	public void enterInvalidPassword() {

		driver.findElement(password).sendKeys("mcas-7rs123");

	}

	public void clickOnLogin() {
		driver.findElement(login).click();

	}

	public void clearPassword() {

		driver.findElement(password).clear();
	}

	public void clearUserID() {
		driver.findElement(userID).clear();

	}

	public void assertLoginPage() throws Exception {
		String homePageTitle = driver.getTitle();
		String actual = new String("DT & T");
		System.out.println("Home page title is : " + homePageTitle);
		if (homePageTitle.equals(actual)) {
			System.out.println("xxxxx Hurray!!!! Page Assertion PASSED xxxxxxxx");
		} else
			throw new Exception("<<<<<<<<<<<<<<<<<<<< Page Assertion Failed >>>>>>>>>>>>");
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

	public void assertWrongEmailLogin() throws Exception {

		String email = driver.findElement(invalidEmail).getText();
		String actual = new String("Enter valid email.");
		System.out.println("Wrong email Text : " + email);

		if (email.equals(actual)) {
			System.out.println("xxxxx Hurray!!!! Failed email Login Page Assertion PASSED xxxxxxxx");
		} else
			throw new Exception("<<<<<<<<<<<<<<<<<<<< Failed email Login Page Assertion Failed >>>>>>>>>>>>");

	}

	public void assertWrongPwdLogin() throws Exception {

		String pwd = driver.findElement(invalidPassword).getText();
		String actual = new String("Invalid user.");
		System.out.println("Wrong password Text : " + pwd);

		if (pwd.equals(actual)) {
			System.out.println("xxxxx Hurray!!!! Failed password Login Page Assertion PASSED xxxxxxxx");
		} else
			throw new Exception("<<<<<<<<<<<<<<<<<<<< Failed password Login Page Assertion Failed >>>>>>>>>>>>");
	}

	public void clickOnLogout() throws Throwable {
		driver.findElement(logoutLink).click();
		driver.findElement(signOut).click();
		Thread.sleep(3000);
		// driver.close();
		// driver.quit();
	}

	public void closeAndQuitDriver() {
		driver.close();
		driver.quit();
	}

}
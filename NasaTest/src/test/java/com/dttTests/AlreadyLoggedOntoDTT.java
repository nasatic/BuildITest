package com.dttTests;

import org.openqa.selenium.WebDriver;

public class AlreadyLoggedOntoDTT {

	static WebDriver driver;
	dttPOMDef dtt = new dttPOMDef(driver);

	public void CHROMEuserAlreadyLoggedOn() throws Throwable {
		dtt.gotoCHROMEDriver();
		dtt.enterUserName();
		dtt.enterPassword();
		dtt.clickOnLogin();
		Thread.sleep(3000);
		dtt.assertLoginPage();
		Thread.sleep(2000);
	}
	
	public void OPERAuserAlreadyLoggedOn() throws Throwable {
			dtt.gotoOPERADriver();
			dtt.enterUserName();
			dtt.enterPassword();
			dtt.clickOnLogin();
			Thread.sleep(3000);
			dtt.assertLoginPage();
			Thread.sleep(2000);
	}

	public void IEuserAlreadyLoggedOn() throws Throwable {
		dtt.gotoIEDriver();
		dtt.enterUserName();
		dtt.enterPassword();
		dtt.clickOnLogin();
		Thread.sleep(5000);
		dtt.assertLoginPage();
		Thread.sleep(2000);

	}

	public void FOXuserAlreadyLoggedOn() throws Throwable {
		dtt.gotoFOXDriver();
		dtt.enterUserName();
		dtt.enterPassword();
		dtt.clickOnLogin();
		Thread.sleep(3000);
		dtt.assertLoginPage();
		Thread.sleep(2000);
	}

}

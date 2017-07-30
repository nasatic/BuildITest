package com.autopageclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;


public class AddrPage extends UserAccountPage{
	
	public AddrPage(WebDriver driver) {
		super(driver);
	
	}
	By addressesButton = By.xpath("//div[@id='center_column']/div/div/ul/li[3]/a/span");
	By addressCaption = By.xpath("//h3[contains(text(),'Home Sweet Home')]");
	By addAddressButton = By.xpath(".//*[@id='center_column']/div[2]/a/span");
	By addNewAddressText = By.xpath("//h1[contains(text(),'Your addresses')]");
	By signOutLink = By.xpath("//a[contains(text(),'Sign out')]");

	public void gotoMyAddressPage() throws Throwable{
		driver.findElement(addressesButton).click();
		System.out.println("Driver Instance used on Address Page is :" + driver);
		Thread.sleep(3000);
	
	}
	public void assertMyAddressPage(){
		String text = driver.findElement(addressCaption).getText();
		Assert.assertEquals(text,"HOME SWEET HOME");
		System.out.println("Driver Instance used on Address Page is :" + driver);
	}
	
	public void gotoAddNewAddressPage() throws Throwable{
		driver.findElement(addAddressButton).click();
		System.out.println("Driver Instance used on Address Page is :" + driver);
		Thread.sleep(3000);
		
	}
	public void assertAddNewAddressPage(){
		String text = driver.findElement(addNewAddressText).getText();
		Assert.assertEquals(text, "YOUR ADDRESSES");
		
	}
   public  void SignOutAndClose() throws Throwable{
	   driver.findElement(signOutLink).click();
	   System.out.println("Driver Instance used on Address Page is :" + driver);
	   Thread.sleep(3000);
	   driver.close();
	   driver.quit();
	   
	  
  }
}

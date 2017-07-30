package com.autopageclass;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;

public class AutoPracticePOM {

static WebDriver driver;


By signInButton = By.xpath("//a[contains(text(),'Sign in')]");
By userName = By.xpath(".//*[@id='email']");
By passWord = By.xpath(".//*[@id='passwd']");
By loginButton = By.xpath(".//*[@id='SubmitLogin']");
By addressButton = By.xpath("//span[contains(text(),'My addresses')]");
By deleteAddress = By.xpath("//div[@id='center_column']/div/div/div[2]/ul/li[9]/a[2]/span");
By signOutButton = By.xpath("//a[@class='logout' and @title='Log me out']");
By addNewAddressButton = By.xpath(".//*[@id='center_column']/div[2]/a/span");


public AutoPracticePOM(WebDriver driver){
	this.driver = driver;
}


public void launchIEdriver() {
	driver = new InternetExplorerDriver();
	driver.get("   ");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

}
public void launchFOXdriver() {
	driver = new FirefoxDriver();
	driver.get("http://automationpractice.com/index.php");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

}
public void launchCHROMEdriver() {
	driver = new ChromeDriver();
	driver.get("http://automationpractice.com/index.php");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}

public void launchOPERAdriver() {
	driver = new OperaDriver();
	driver.get("http://automationpractice.com/index.php");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}


public void clickOnSignIn(){
	driver.findElement(signInButton).click();

}
public void enterUsername(String Username){
	driver.findElement(userName).sendKeys(Username);

}
public void enterPassword(String Password){
	driver.findElement(passWord).sendKeys(Password);
	
}
public void clickOnLogin(){
	driver.findElement(loginButton).click();

}
public void clickOnAddressButton() throws Throwable{
	driver.findElement(addressButton).click();
	Thread.sleep(3000);
	
}
public void addNewAddress(String Address1, String City, String State, String ZIPCode, String Country, String HomePhone, String Mobile,
		String AddInfo, String AddrAlias) throws Throwable{
	driver.findElement(By.xpath(".//*[@id='address1']")).sendKeys(Address1);
//	Thread.sleep(1000);
	driver.findElement(By.xpath(".//*[@id='city']")).sendKeys(City);
//	Thread.sleep(1000);
	driver.findElement(By.xpath(".//*[@id='id_state']")).sendKeys(State);
//	Thread.sleep(1000);
	driver.findElement(By.xpath(".//*[@id='postcode']")).sendKeys(ZIPCode);
//	Thread.sleep(1000);
	driver.findElement(By.xpath(".//*[@id='id_country']")).sendKeys(Country);
//	Thread.sleep(1000);
	driver.findElement(By.xpath(".//*[@id='other']")).sendKeys(AddInfo);
//	Thread.sleep(1000);
	driver.findElement(By.xpath(".//*[@id='phone']")).sendKeys(HomePhone);
//	Thread.sleep(1000);
	driver.findElement(By.xpath(".//*[@id='phone_mobile']")).sendKeys(Mobile);
//	Thread.sleep(1000);	
	driver.findElement(By.xpath(".//*[@id='alias']")).clear();
//	Thread.sleep(1000);	
	driver.findElement(By.xpath(".//*[@id='alias']")).sendKeys(AddrAlias);
//	Thread.sleep(1000);
	driver.findElement(By.xpath(".//*[@id='submitAddress']")).click();
	Thread.sleep(3000);

}
public void addNewAddress() throws Throwable{
	driver.findElement(addressButton).click();
	Thread.sleep(3000);
	driver.findElement(addNewAddressButton).click();
	Thread.sleep(3000);

}
public void delete2ndAddress() throws Throwable{
	
	driver.findElement(deleteAddress).click();
	Thread.sleep(2000);
	driver.switchTo().alert().accept();

}
public void signOut(){
	driver.findElement(signOutButton).click();
}

public void assertAddressPage() throws Exception{
	String addressPage = driver.findElement(By.xpath(".//*[@id='center_column']/div[1]/p[1]/strong")).getText();
	String actual = new String("Your addresses are listed below.");
	System.out.println("Address Page Should Read :"+ actual);
	if(addressPage.equals(actual)){
		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<< Add Address Page Assertion Passed >>>>>>>>>>>>>>>>>>>> ");
	}else throw new Exception ("xxxxxxxxxxxxxxxxxxxxxxxxxxxx Page Assertion Failed xXXXXXXXXXXXxxxxxxxxxxxxxxxxx");
}

public void closeAndQuitBrowser(){
	driver.close();
	driver.quit();
}

}

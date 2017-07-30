package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import WebDriver.DriverInstance;

public class loginPage{
	static WebDriver driver;
	
	public loginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	By signIn = By.xpath("//a[contains(text(),'Sign in')]");
	By uname = By.id("email");
	By pword = By.name("passwd");
	By login = By.id("SubmitLogin");
	

public void logonToHomePage(String uid, String pwd) throws Throwable{
	
	driver.findElement(signIn).click();
	Thread.sleep(3000);
	driver.findElement(uname).sendKeys(uid);
	driver.findElement(pword).sendKeys(pwd);
	Thread.sleep(4000);
	System.out.println("Driver Instance used on Login Page is :" + driver);
	driver.findElement(login).click();
	Thread.sleep(4000);

}
	
}
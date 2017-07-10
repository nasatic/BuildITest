package StepDef;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class DDTestStepDef {

	static WebDriver driver;

	@Given("^user is on website$")
	public void User_is_on_website() throws InterruptedException {
		driver = new FirefoxDriver();
		driver.get("https://www.rightstart.com/customer/account/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='closewelcomeRedirectPopupDialog']")).click();
		Thread.sleep(3000);

	}

	@When("^user enters correct \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_correct_UserID_and_AccessWord(String UserID, String AccessWord)
			throws InterruptedException {

		driver.findElement(By.xpath(".//*[@id='email']")).sendKeys(UserID);
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys(AccessWord);
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='send2']")).click();
		Thread.sleep(3000);

	}

	@Then("^user is logged on$")
	public void user_is_logged_on() {
		String loginText = driver.findElement(By.xpath("html/body/div[3]/div/div[1]/div[1]/div/div/div[1]/h2"))
				.getText();
		Assert.assertEquals("My Dashboard", loginText);
		System.out.println(loginText + " " + "Present on Page");
		driver.close();
		driver.quit();
	}

}

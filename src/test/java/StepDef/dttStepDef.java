package StepDef;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;


public class dttStepDef {
	static WebDriver driver;
	


	@Given("^user is on Login page$")
	public void user_is_on_Login_page() throws Throwable {

		driver = new ChromeDriver();
		driver.get("https://www.dttmt.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Thread.sleep(3000);
		String loginText = driver.getTitle();
		System.out.println("Tile for DTT login page is:" + loginText);

	}

	@When("^user enters valid username$")
	public void user_enters_valid_username() throws Throwable {

		driver.findElement(By.xpath(".//*[@id='txtEmail']")).sendKeys("ibeokoro@gmail.com");
		Thread.sleep(3000);
	}

	@And("^user enters valid password$")
	public void user_enters_valid_password() throws Throwable {
		driver.findElement(By.xpath(".//*[@id='txtPassword']")).sendKeys("mcas-7rs");
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='btnLogin']")).click();
		Thread.sleep(2000);

	}

	@And("^user is logged in$")
	public void user_is_logged_in() throws Throwable {
	String LogOnText = driver.findElement(By.xpath("//h1[@class='page-header']")).getText();
	Assert.assertEquals("DASHBOARD", LogOnText);
	driver.findElement(By.xpath("//div[@id='wrapper']/nav/ul/li[2]/a")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("lnkSignOut")).click();   
	Thread.sleep(2000);
	driver.close();
	driver.quit();

	}

//	@After
//	public void comeDown(Scenario scenario) {
//		if (scenario.isFailed()) {
//			final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
//			scenario.embed(screenshot, "image/png");
//
//			driver.close();
//			driver.quit();

		
	
}
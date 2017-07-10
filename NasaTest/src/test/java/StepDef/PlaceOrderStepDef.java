package StepDef;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.PendingException;
import cucumber.api.Scenario;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PlaceOrderStepDef {

	static WebDriver driver;

	@Given("^User is on logon page$")
	public void user_is_on_logon_page() throws InterruptedException {

		driver = new FirefoxDriver();
		driver.get("http://automationpractice.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='header']/div[2]/div/div/nav/div[1]/a")).click();
		Thread.sleep(3000);

	}

	@When("^User enteres valid email$")
	public void User_enteres_valid_email() throws InterruptedException {
		driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("test1@email.com");
		Thread.sleep(3000);

	}

	@And("^User enters valid password$")
	public void User_enters_valid_password() throws InterruptedException {
		driver.findElement(By.xpath(".//*[@id='passwd']")).sendKeys("password1");
		Thread.sleep(2000);
		driver.findElement(By.id("SubmitLogin")).click();
		Thread.sleep(3000);

	}

	@Then("^User should be logged in$")
	public void User_should_be_logged_in() throws InterruptedException {

		String homePageText = driver.findElement(By.xpath(".//*[@id='center_column']/h1")).getText();
		System.out.println("Key HomePage text :" + " " + homePageText);
		Thread.sleep(3000);
		System.out.println("Braaaaaaaaaaaaavvvvvvvvvvvvvvvvooooooooooooo: AmLogged on!!!!!!!!");
		Thread.sleep(3000);
	}

	@Given("^User is logged on$")
	public void User_is_logged_on() {

		System.out.println(
				"-----------------------------------------User is now logged in ---------------------------------------");

	}

	@When("^User performs a serach$")
	public void User_performs_a_serach() throws InterruptedException {

		driver.findElement(By.id("search_query_top")).sendKeys("DRESSES");
		// Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='searchbox']/button")).click();
		// Thread.sleep(2000);

	}

	@Then("^User is taken to the correct page$")
	public void User_is_taken_to_the_correct_page() {

		String sText = driver.findElement(By.xpath(".//*[@id='categories_block_left']/h2")).getText();
		String sText1 = driver.findElement(By.xpath(".//*[@id='informations_block_left_1']/p/a")).getText();
		String sText2 = driver.findElement(By.xpath(".//*[@id='manufacturers_block_left']/p/a")).getText();
		Assert.assertEquals("CATEGORIES", sText);
		Assert.assertEquals("INFORMATION", sText1);
		Assert.assertEquals("MANUFACTURERS", sText2);
		System.out.println("Key Page Texts are :" + ":" + sText + ":" + sText1 + ":" + sText2);

	}

	@And("^User Clicks on Orders Page$")
	public void Clicks_on_Orders_Page() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='left_column']/div[4]/div/ul/li[1]/a")).click();

	}

	@Then("^User should land on Order History Page$")
	public void User_should_land_on_Order_History_Page() throws InterruptedException {
		Thread.sleep(2000);
		String OrderPage = driver.findElement(By.xpath(".//*[@id='center_column']/h1")).getText();
		Assert.assertEquals("ORDER HISTORY", OrderPage);
		Thread.sleep(2000);

	}

	@Given("^User had completed search$")
	public void User_had_completed_search() throws InterruptedException {
		driver.findElement(By.xpath(".//*[@id='center_column']/ul/li[1]/a/span")).click();
		Thread.sleep(2000);
	}

	@When("^User Clicks on Sign Out$")
	public void User_Clicks_on_Sign_Out() throws InterruptedException {
		driver.findElement(By.xpath(".//*[@id='header']/div[2]/div/div/nav/div[2]/a")).click();
		Thread.sleep(6000);

	}

	@Then("^User is signed out of page$")
	public void User_is_signed_out_of_page() {
		String myPage = driver.findElement(By.xpath(".//*[@id='login_form']/h3")).getText();
		Assert.assertEquals("ALREADY REGISTERED?", myPage);
		System.out.println("Logout page should have: " + myPage);
	}

	@After
	public void tearDown123(Scenario scene, WebDriver driver) throws InterruptedException {
		if (!scene.isFailed()) {
			Thread.sleep(2000);
			final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			scene.embed(screenshot, "image/png");

			driver.close();
			driver.quit();
		}

	}
}
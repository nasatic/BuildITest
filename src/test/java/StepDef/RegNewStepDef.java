package StepDef;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RegNewStepDef {

	static WebDriver driver;

	@Given("^User is on register page$")
	public void User_is_on_register_page() throws InterruptedException {
		;
		driver = new FirefoxDriver();
		driver.get("http://automationpractice.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='header']/div[2]/div/div/nav/div[1]/a")).click();
		Thread.sleep(3000);

	}

	@When("^User enters initial \"([^\"]*)\"$")
	public void User_enters_initial_firstEmail(String firstEmail) throws InterruptedException {

		driver.findElement(By.xpath(".//*[@id='email_create']")).sendKeys(firstEmail);
		Thread.sleep(3000);

	}

	@And("^Users hits on register button$")
	public void User_hits_on_register_button() throws InterruptedException {

		driver.findElement(By.xpath(".//*[@id='SubmitCreate']")).click();
		Thread.sleep(3000);
	}

	@And("^User enters \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
	public void User_enters_FirstName_and_LastName_and_Email_and_Password_and_Day_and_Month_and_Year_and_Company_and_Address1_and_Address2_and_City_and_State_and_ZIPCode_and_Country_and_AddInfo_and_HomePhone_and_Mobile_and_AddrAlias(
			String FirstName, String LastName, String Email, String Password, String Day, String Month, String Year,
			String Company, String Address1, String Address2, String City, String State, String ZIPCode, String Country,
			String AddInfo, String HomePhone, String Mobile, String AddrAlias) throws InterruptedException {

		driver.findElement(By.xpath(".//*[@id='id_gender1']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='customer_firstname']")).sendKeys(FirstName);
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='customer_lastname']")).sendKeys(LastName);
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='email']")).sendKeys();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='passwd']")).sendKeys(Password);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//select[@id='days']")).sendKeys(Day);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//select[@id='months']")).sendKeys(Month);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//select[@id='years']")).sendKeys(Year);
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='company']")).sendKeys(Company);
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='address1']")).sendKeys(Address1);
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='address2']")).sendKeys(Address2);
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='city']")).sendKeys(City);
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='id_state']")).sendKeys(State);
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='postcode']")).sendKeys(ZIPCode);
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='id_country']")).sendKeys(Country);
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='other']")).sendKeys(AddInfo);
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='phone']")).sendKeys(HomePhone);
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='phone_mobile']")).sendKeys(Mobile);
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='alias']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='alias']")).sendKeys(AddrAlias);
		Thread.sleep(3000);
	}

	@And("^User Clicks on Register Button$")
	public void User_Clicks_on_Register_Button() throws InterruptedException {
		driver.findElement(By.xpath(".//*[@id='submitAccount']")).click();
		Thread.sleep(8000);
	}

	@Then("^User is successfully registered$")
	public void User_is_successfully_registered() {

		String RegisterText = driver.findElement(By.xpath(".//*[@id='center_column']/p")).getText();
		Assert.assertEquals("Welcome to your account. Here you can manage all of your personal information and orders.",
				RegisterText);

		System.out.println(
				"xxxxxxxxxxxxxxxxxxxxxxxxxxxxThis method ran successfullyxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
	}

	@After
	public void tdown(Scenario scenario) {
		if (scenario.isFailed()) {
			final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			scenario.embed(screenshot, "image/png");
		}
	}
}

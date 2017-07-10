

package StepDef;

import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.DataTable;
import cucumber.api.Scenario;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class RegisterStepDef {

	static WebDriver driver;

	@Given("^User is on registration page$")
	public void User_is_on_registration_page() throws InterruptedException {
		
		driver = new FirefoxDriver();
		driver.get("http://automationpractice.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='header']/div[2]/div/div/nav/div[1]/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='email_create']")).sendKeys("email@kobbyJones.com");
		Thread.sleep(3000);

	}

	@When("^User enters registration details$")
	public void User_enters_registration_details(DataTable table) throws InterruptedException {

		System.out.println(table);

		driver.findElement(By.xpath(".//*[@id='SubmitCreate']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='id_gender1']")).click();
		Thread.sleep(3000);

		List<List<String>> tableList = table.raw();

		System.out.println(tableList.get(1).get(1));

		driver.findElement(By.xpath(".//*[@id='customer_firstname']")).sendKeys(tableList.get(1).get(1));
		driver.findElement(By.xpath(".//*[@id='customer_lastname']")).sendKeys(tableList.get(2).get(1));

		driver.findElement(By.xpath(".//*[@id='passwd']")).sendKeys(tableList.get(4).get(1));

		driver.findElement(By.xpath("//select[@id='days']")).sendKeys(tableList.get(5).get(1));
		driver.findElement(By.xpath("//select[@id='months']")).sendKeys(tableList.get(6).get(1));
		driver.findElement(By.xpath("//select[@id='years']")).sendKeys(tableList.get(7).get(1));

		driver.findElement(By.xpath(".//*[@id='company']")).sendKeys(tableList.get(8).get(1));

		driver.findElement(By.xpath(".//*[@id='address1']")).sendKeys(tableList.get(9).get(1));

		driver.findElement(By.xpath(".//*[@id='address2']")).sendKeys(tableList.get(10).get(1));

		driver.findElement(By.xpath(".//*[@id='city']")).sendKeys(tableList.get(11).get(1));

		driver.findElement(By.xpath(".//*[@id='id_state']")).sendKeys(tableList.get(12).get(1));

		driver.findElement(By.xpath(".//*[@id='postcode']")).sendKeys(tableList.get(13).get(1));

		driver.findElement(By.xpath(".//*[@id='id_country']")).sendKeys(tableList.get(14).get(1));

		driver.findElement(By.xpath(".//*[@id='other']")).sendKeys(tableList.get(15).get(1));

		driver.findElement(By.xpath(".//*[@id='phone']")).sendKeys(tableList.get(16).get(1));

		driver.findElement(By.xpath(".//*[@id='phone_mobile']")).sendKeys(tableList.get(17).get(1));

		driver.findElement(By.xpath(".//*[@id='alias']")).sendKeys(tableList.get(18).get(1));

		Thread.sleep(3000);

	}

	@And("^Users clicks on Register Button$")
	public void Users_clicks_on_Register_Button() {

		driver.findElement(By.xpath(".//*[@id='submitAccount']")).click();

	}

	@Then("^User is successfully Registered$")
	public void User_is_successfully_Registered() {

		String loginText = driver.findElement(By.xpath(".//*[@id='center_column']/h1")).getText();
		Assert.assertEquals("MY ACCOUNT", loginText);
		
	}
	@After
	public void tearDown123(Scenario scene, WebDriver driver) throws InterruptedException {
		if (scene.isFailed()) {
			Thread.sleep(2000);
			final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			scene.embed(screenshot, "image/png");

		 driver.close();
		 driver.quit();

	}

}
}

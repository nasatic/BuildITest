package StepDefCH;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;

import com.autopageclass.AddrPage;
import com.autopageclass.AutoPracticeLoginPage;
import com.autopageclass.UserAccountPage;

import Utility.BrowserFactory;
import Utility.ScreenPrint;
import cucumber.api.PendingException;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AutoStepDefCHROME {

	static WebDriver driver;



	AutoPracticeLoginPage loginPage = new AutoPracticeLoginPage(driver);
	UserAccountPage userAccount = new UserAccountPage(driver);
	AddrPage addAddress = new AddrPage(driver);

	@Given("^User is on log on home page$")
	public void user_is_on_log_on_home_page() throws Throwable {
		driver = BrowserFactory.startBrowser("CHROME", "http://automationpractice.com/index.php");
	    loginPage = PageFactory.initElements(driver, AutoPracticeLoginPage.class);
	
	}
	@When("^User enter userid and passwod$")
	public void user_enter_userid_and_passwod() throws Throwable {
		loginPage.enterUnameAndPswd("testing01@mine.com", "billyjones");

	}

	@And("^Clicks on Login button$")
	public void clicks_on_Login_button() throws Throwable {
		loginPage.clickonLogin();
		Thread.sleep(3000);

	}

	@Then("^user is logged on successfully$")
	public void user_is_logged_on_successfully() throws Throwable {
		// userAccount.asserPageAndLogout();
		userAccount.asserLoginPage();

	}
	// >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<

	@Given("^that user is logged on$")
	public void that_user_is_logged_on() throws Throwable {
		System.out.println("Page Title for Logon page is :" + driver.getTitle());
	}

	@When("^user clicks on my address$")
	public void user_clicks_on_my_address() throws Throwable {

		addAddress.gotoMyAddressPage();

	}

	@Then("^user is taken to address page$")
	public void user_is_taken_to_address_page() throws Throwable {
		addAddress.assertMyAddressPage();

	}

	@And("^if user clicks on add new address button$")
	public void if_user_clicks_on_add_new_address_button() throws Throwable {
		addAddress.gotoAddNewAddressPage();

	}

	@Then("^user is taken to the page$")
	public void user_is_taken_to_the_page() throws Throwable {
		addAddress.assertAddNewAddressPage();
	}

	@And("^user can sign out and close browser$")
	public void user_can_sign_out_and_close_browser() throws Throwable {
		addAddress.SignOutAndClose();
	}
	
	@AfterMethod
	public void closeDown(ITestResult res){
		
		if(ITestResult.FAILURE == res.getStatus()){
			
			ScreenPrint.getScreenShot(driver, res.getName());
			
		}
		
	}

}

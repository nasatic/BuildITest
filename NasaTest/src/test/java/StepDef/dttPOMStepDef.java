package StepDef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.dttTests.dttLoginPage;
import com.dttTests.dttPOMDef;
import com.dttTests.validityCheckPage;

import Utility.BrowserFactory;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class dttPOMStepDef {

   WebDriver driver;

	dttPOMDef dtt = new dttPOMDef(driver);
	dttLoginPage dttLog = new dttLoginPage(driver);
	validityCheckPage vcheck = new validityCheckPage(driver);

	@Given("^User is on Logon Page of DTT site$")
	public void User_is_on_Logon_Page_of_DTT_site() throws Throwable {
		dtt.gotoCHROMEDriver();
		System.out.println("This is login Page");

	}

	@When("^User enters userID$")
	public void User_enters_userID() throws Throwable {
		dtt.enterUserName();
	}

	@And("^User enters password$")
	public void User_enters_password() throws Throwable {
		dtt.enterPassword();
	}

	@Then("^User logs on$")
	public void User_logs_on() throws Throwable {
		dtt.clickOnLogin();
		Thread.sleep(3000);
		dtt.assertLoginPage();
		Thread.sleep(2000);

	}

	@And("^if user clicks on logout button$")
	public void if_user_clicks_on_logout_button() throws Throwable {
		dtt.clickOnLogout();

	}

	@Then("^user can logout and close browser$")
	public void user_can_logout_and_close_browser() throws Throwable {
		Thread.sleep(2000);
		System.out.println("This is a logout page; do not close browser");
		dtt.closeAndQuitDriver();
	}

	// <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

	@Given("^user is still logged on$")
	public void user_is_still_logged_on() throws Throwable {
		driver = BrowserFactory.startBrowser("ie", "https://www.dttmt.com/Login.aspx");
		dttLog = PageFactory.initElements(driver, dttLoginPage.class);
		dttLog.sendEmailandPword("ibeokoro@gmail.com", "mcas-7rs");
		dttLog.clickOnLogin();
		dttLog.clickOnMyAccounts();
		System.out.println("Am logged still on page");

	}

	@When("^user navigates to Personal Information Page$")
	public void user_navigates_to_Personal_Information_Page() throws Throwable {
		Thread.sleep(3000);
		dttLog.clickOnPersonalInfo();
		Thread.sleep(3000);

	}

	@Then("^user can view thier customerID$")
	public void user_can_view_thier_customerID() throws Throwable {
		dttLog.AsserCustomerID();

	}

	@And("^if user clicks on Address details$")
	public void if_user_clicks_on_Address_details() throws Throwable {
		dttLog.clickOnAddrDetails();

	}

	@Then("^users address page is loaded$")
	public void users_address_page_is_loaded() throws Throwable {
		dttLog.assertAddressPage();

	}

	@And("^user can verify their address details$")
	public void user_can_verify_their_address_details() throws Throwable {
		dttLog.assertPcode();
		dttLog.assertMobileNo();

	}

	@And("^User can sign out and close browser$")
	public void User_can_sign_out_and_close_browser() throws Throwable {

		dttLog.clickOnSignOut();
		dttLog.closeAndQuit();

	}

	// <<<<<<<<<<<<<<<<<>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

	@Given("^User is onto DTT site$")
	public void User_is_onto_DTT_site() throws Throwable {
		driver = BrowserFactory.startBrowser("opera", "https://www.dttmt.com/Login.aspx");
		vcheck = PageFactory.initElements(driver, validityCheckPage.class);
	}

	@When("^User enters valid userID but invalid password$")
	public void User_enters_valid_userID_but_invalid_password() throws Throwable {
		vcheck.enterInvalidPswdValidEmail("mcas-7rs123", "ibeokoro@gmail.com");
		Thread.sleep(3000);

	}

	@Then("^User should not be logged on$")
	public void User_should_not_be_logged_on() throws Throwable {
		vcheck.assertWrongPwdLogin();
		vcheck.clearEmailAndPswd();

	}

	@And("^User enters Invalid userID but valid password$")
	public void User_enters_Invalid_userID_but_valid_password() throws Throwable {
		vcheck.enterInvalidEmailValidPswd("ibeokoro@gmail.com123", "mcas-7rs");
		Thread.sleep(3000);
		vcheck.clearEmailAndPswd();

	}

	@Then("^User is not logged on$")
	public void User_is_not_logged_on() throws Throwable {
		vcheck.assertWrongEmailLogin();
		Thread.sleep(3000);

	}

	@And("^if user enter correct password and UserID$")
	public void if_user_enter_correct_password_and_UserID() throws InterruptedException {
		vcheck.enterValidEmailAndPswd("ibeokoro@gmail.com", "mcas-7rs");
		Thread.sleep(3000);

	}

	@Then("^user is logged on without error$")
	public void user_is_logged_on_without_error() throws Throwable {
		vcheck.assertValidLogin();
		vcheck.signOut();

	}

	@And("^User Close and Quit Browser$")
	public void user_Close_and_Quit_Browser() throws Throwable {
		vcheck.closeAndQuit();

	}

}

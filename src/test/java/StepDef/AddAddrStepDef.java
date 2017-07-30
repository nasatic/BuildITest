package StepDef;

import java.awt.Dialog;
import java.awt.Window;
import java.io.File;
import java.util.concurrent.TimeUnit;

import Pages.loginPage;
import Utility.BrowserLists;
import org.junit.After;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.autopageclass.AutoPracticePOM;

import cucumber.api.Scenario;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.PageFactory;

public class AddAddrStepDef {

    static WebDriver driver;
    AutoPracticePOM auto = new AutoPracticePOM(driver);

    @Given("^User is logged in with valid \"([^\"]*)\" and \"([^\"]*)\"$")
    public void User_is_logged_in_with_valid_Username_and_Password(String Username, String Password)
            throws InterruptedException {

//        auto.launchOPERAdriver();
        driver = BrowserLists.startFOXdbrowser();
        PageFactory.initElements(driver, AutoPracticePOM.class);
        Thread.sleep(3000);
        auto.clickOnSignIn();
        Thread.sleep(3000);
        auto.enterUsername(Username);
        auto.enterPassword(Password);
        Thread.sleep(3000);
        auto.clickOnLogin();
    }

    @When("^User_Clicks On MyAddresses Link$")
    public void User_Clicks_On_MyAddresses_Link() throws Throwable {

        Thread.sleep(4000);
        auto.addNewAddress();
    }

    @And("^User Adds \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
    public void User_Adds_Address1_and_City_and_State_and_ZIPCode_and_Country_and_HomePhone_and_Mobile_and_AddInfo_and_AddrAlias(
            String Address1, String City, String State, String ZIPCode, String Country, String HomePhone, String Mobile,
            String AddInfo, String AddrAlias) throws Throwable {
        auto.addNewAddress(Address1, City, State, ZIPCode, Country, HomePhone, Mobile, AddInfo, AddrAlias);
        Thread.sleep(3000);
    }

    @Then("^New Address is added To Addresses Grid$")
    public void New_Address_is_added_To_Addresses_Grid() throws Exception {
        auto.assertAddressPage();
    }

    @And("^User Can delete added addresses and logout$")
    public void And_User_Can_delete_added_addresses_and_logout() throws InterruptedException {
        Thread.sleep(3000);
        auto.signOut();
        Thread.sleep(5000);
        auto.closeAndQuitBrowser();
    }

    // >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

    @Given("^user is logged in with \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_is_logged_in_with(String Username, String Password) throws InterruptedException {
//        auto.launchOPERAdriver();
        driver = BrowserLists.startOPERAbrowser();
        PageFactory.initElements(driver, AutoPracticePOM.class);
        auto.clickOnSignIn();
        Thread.sleep(3000);
        auto.enterUsername(Username);
        auto.enterPassword(Password);
        auto.clickOnLogin();
        Thread.sleep(3000);

    }

    @When("^user opens address page$")
    public void user_opens_address_page() throws Throwable {
        Thread.sleep(3000);
        auto.clickOnAddressButton();
        Thread.sleep(3000);
    }

    @And("^clicks on Delete button$")
    public void clicks_on_Delete_button() throws Throwable {
        auto.delete2ndAddress();

    }

    @Then("^Second address is deleted$")
    public void Second_address_is_deleted() throws Throwable {
        System.out.println("2nd address deleted");
    }

    @And("^user signs out$")
    public void user_signs_out() throws Throwable {
        auto.signOut();
        Thread.sleep(3000);
        auto.closeAndQuitBrowser();
    }

    @After
    public void tearDown(Scenario scenario) {
        if (!scenario.isFailed()) {
            final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshot, "image/png");

        }
    }
}

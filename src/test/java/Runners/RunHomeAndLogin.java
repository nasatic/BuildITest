package Runners;

import Pages.AddressPage;
import Pages.HomePage;
import Pages.OrderHistoryPage;
import Pages.loginPage;
import Utility.BrowserLists;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import Utility.ScreenPrint;
import WebDriver.DriverInstance;

public class RunHomeAndLogin {

    static WebDriver driver;
    loginPage log = new loginPage(driver);
    HomePage home = new HomePage(driver);
    OrderHistoryPage order = new OrderHistoryPage(driver);
    AddressPage address = new AddressPage(driver);

    @Test(priority = 1)

    public void loginPage() throws Throwable {
//		driver = DriverInstance.startBrowser("opera","http://automationpractice.com/index.php");
        driver = BrowserLists.startFOXdbrowser();
        PageFactory.initElements(driver, loginPage.class);
        log.logonToHomePage("testing01@mine.com", "billyjones");
		System.out.println("BrowserList Class Contains :" + BrowserLists.class);

    }

    @Test(priority = 2)
    public void homePage() throws Throwable {
        home.searchAnItem("DRESSES");
        if ("Search - My Store".equals(driver.getTitle())) {
            System.out.println("Page Title Assertion Passed");
        } else
            throw new Exception("Search Page title is wrong !!!!!!");
        System.out.println("Search Page Title is :" + driver.getTitle());
        System.out.println("This page title is :" + driver.getTitle());
        home.gotoOrderPage();
        Thread.sleep(3000);
    }

    @Test(priority = 3)
    public void orderPage() throws Throwable {
        order.assertOrderPage();
        order.goBackHome();
    }

    @Test(priority = 4)
    public void addressPage() throws Throwable {
        address.addSecondAddress();
        address.deleteAddedAddress();
        address.logoutOfPage();
        address.shutdown();

    }

    @AfterMethod
    public void closeDown(ITestResult res) {

        if (ITestResult.FAILURE == res.getStatus()) {

            ScreenPrint.getScreenShot(driver, res.getName());

        }
    }

}

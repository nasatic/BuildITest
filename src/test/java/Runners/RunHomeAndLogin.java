package Runners;

import Pages.AddressPage;
import Pages.HomePage;
import Pages.OrderHistoryPage;
import Pages.loginPage;
import Utility.BaseClass;
import Utility.BrowserLists;
import Utility.ScreenPrint;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.logging.Logger;

public class RunHomeAndLogin{

    static WebDriver driver;
    loginPage log = new loginPage(driver);
    HomePage home = new HomePage(driver);
    OrderHistoryPage order = new OrderHistoryPage(driver);
    AddressPage address = new AddressPage(driver);
    Logger logger = Logger.getLogger("RunHomeAndLogin");


    @Test(priority = 1)
   public void logonToHomePage() throws Throwable {
        driver = BaseClass.startBrowser("chrome",  "http://automationpractice.com/index.php");
        log.logonToHomePage("testing01@mine.com", "billyjones");
        logger.info("This page title is :" + driver.getTitle());
        logger.info("BrowserList Class Contains :" + BrowserLists.class);
    }

    @Test(priority = 2)
    public void goToHomePage() throws Throwable {
        home.searchAnItem("DRESSES");
        if ("Search - My Store".equals(driver.getTitle())) {
            logger.info("Page Title Assertion Passed");
        } else
            throw new Exception("Search Page title is wrong !!!!!!");
        logger.info("Search Page Title is :" + driver.getTitle());
        logger.info("This page title is :" + driver.getTitle());
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

}

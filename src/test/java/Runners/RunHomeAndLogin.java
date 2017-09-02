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

public class RunHomeAndLogin {

    static WebDriver driver;
    loginPage log = new loginPage(driver);
    HomePage home = new HomePage(driver);
    OrderHistoryPage order = new OrderHistoryPage(driver);
    AddressPage address = new AddressPage(driver);
    Logger logger = Logger.getLogger("RunHomeAndLogin");


    @Test(priority = 1)

<<<<<<< HEAD
    public void loginPage() throws Throwable {
        driver = BaseClass.startBrowser("CHROME", "http://automationpractice.com/index.php");
//        PageFactory.initElements(driver, loginPage.class);
=======
    public void logonToHomePageFox() throws Throwable {
        driver = BaseClass.startBrowser("chrome", "http://automationpractice.com/index.php");
>>>>>>> b1537a18ac14bf4b1621b942cf7b1c180112ba88
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

    @AfterMethod
    public void tearDown(ITestResult res) {
        if (ITestResult.FAILURE == res.getStatus()) {
            ScreenPrint.getScreenShot(driver, res.getName());
            driver.close();
            driver.quit();

        }
    }

}

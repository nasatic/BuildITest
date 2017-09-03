package Utility;

import Pages.loginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

public class ParaTestBaseClass {

     static WebDriver driver;

    @BeforeMethod
    @Parameters("browserName")
    public  WebDriver setup(String browserName) throws InterruptedException {

        if (browserName.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();

        } else if (browserName.equalsIgnoreCase("IE")) {
            driver = new InternetExplorerDriver();

        } else if (browserName.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();

        } else if (browserName.equalsIgnoreCase("Opera")) {
            driver = new OperaDriver();
        }
        PageFactory.initElements(driver, loginPage.class);
        driver.get("http://automationpractice.com/index.php");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().deleteAllCookies();
        Thread.sleep(5000);
        return driver;
    }


    @AfterMethod
    public void closeDown(ITestResult res) {
        if (ITestResult.SUCCESS == res.getStatus()) {
            ScreenPrint.getScreenShot(BrowserFactory.driver, res.getName());
            BrowserFactory.driver.close();
            BrowserFactory.driver.quit();
        }
    }
}

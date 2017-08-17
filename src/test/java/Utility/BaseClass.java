package Utility;

import Pages.loginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static Utility.BrowserFactory.capabilities;
import static Utility.BrowserFactory.driver;

public class BaseClass {


    @BeforeMethod
    public static WebDriver startBrowser(String browserName, String url) {

        if (browserName.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();

        } else if (browserName.equalsIgnoreCase("IE")) {
            driver = new InternetExplorerDriver(capabilities);

        } else if (browserName.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();

        } else if (browserName.equalsIgnoreCase("Opera")) {
            driver = new OperaDriver();

        }
        PageFactory.initElements(driver, loginPage.class);
        driver.manage().window().maximize();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        driver.manage().deleteAllCookies();
        return driver;

    }

    @AfterMethod
    public void closeDown(ITestResult res) {
        if (ITestResult.SUCCESS == res.getStatus()) {
            ScreenPrint.getScreenShot(driver, res.getName());
            driver.close();
            driver.quit();
        }
    }
}
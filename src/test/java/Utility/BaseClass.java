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
    public static WebDriver startBrowser(String browserName, String url) throws InterruptedException {


        if (browserName.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();

        } else if (browserName.equalsIgnoreCase("IE")) {
            driver = new InternetExplorerDriver();
            driver.manage().window().maximize();


        } else if (browserName.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
            driver.manage().window().maximize();


        } else if (browserName.equalsIgnoreCase("Opera")) {
            driver = new OperaDriver();
            driver.manage().window().maximize();



        }
        PageFactory.initElements(driver, loginPage.class);
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().deleteAllCookies();
        Thread.sleep(5000);
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
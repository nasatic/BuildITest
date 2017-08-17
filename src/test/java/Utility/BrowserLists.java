package Utility;

import Pages.loginPage;
import com.autopageclass.AutoPracticePOM;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;


public class BrowserLists {

    static WebDriver driver;


    public static WebDriver startIEbrowser() {
        driver = new InternetExplorerDriver();
        driver.get("http://automationpractice.com/index.php");
        driver.manage().deleteAllCookies();
        PageFactory.initElements(driver, loginPage.class);
        PageFactory.initElements(driver, AutoPracticePOM.class);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
        return driver;
    }

    public static WebDriver startFOXbrowser() {
        driver = new FirefoxDriver();
        driver.get("http://automationpractice.com/index.php");
        driver.manage().deleteAllCookies();
        PageFactory.initElements(driver, loginPage.class);
//        PageFactory.initElements(driver, AutoPracticePOM.class);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return driver;
    }

    public static WebDriver startCHROMEbrowser() {
        driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        driver.manage().deleteAllCookies();
        PageFactory.initElements(driver, loginPage.class);
//        PageFactory.initElements(driver, AutoPracticePOM.class);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return driver;
    }

    public static WebDriver startOPERAbrowser() {
        driver = new OperaDriver();
        driver.get("http://automationpractice.com/index.php");
        driver.manage().deleteAllCookies();
        PageFactory.initElements(driver, loginPage.class);
        PageFactory.initElements(driver, AutoPracticePOM.class);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return driver;
    }
}





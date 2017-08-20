package Pages;

import Utility.BaseClass;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage extends BaseClass {
    static WebDriver driver;
    Logger log = Logger.getLogger("loginPage");

    public loginPage(WebDriver driver) {
        this.driver = driver;
    }

    By signIn = By.xpath("//a[contains(text(),'Sign in')]");
    //    By signIn = By.xpath("/html/body/div/div[1]/header/div[2]/div/div/nav/div[1]/a");
    By uname = By.id("email");
    By pword = By.name("passwd");
    By login = By.id("SubmitLogin");


    public void logonToHomePage(String uid, String pwd) throws Throwable {

        driver.findElement(signIn).click();
        Thread.sleep(3000);
        driver.findElement(uname).sendKeys(uid);
        driver.findElement(pword).sendKeys(pwd);
        Thread.sleep(4000);
        log.info("Driver Instance used on Login Page is :" + driver);
        driver.findElement(login).click();
        Thread.sleep(4000);

    }

}
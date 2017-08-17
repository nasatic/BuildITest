package Pages;

import Utility.AbstractPageClass;
import Utility.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage extends BaseClass {
    static WebDriver driver;

    public loginPage(WebDriver driver) {
        this.driver = driver;
    }


    By signIn = By.xpath("//a[contains(text(),'Sign in')]");
    By uname = By.id("email");
    By pword = By.name("passwd");
    By login = By.id("SubmitLogin");

    //from home page

    By searchField = By.xpath(".//*[@id='search_query_top']");
    By searchButton = By.xpath(".//*[@id='searchbox']/button");
    By logout = By.xpath("//a[@class='logout']");
    By womenTab = By.xpath(".//*[@id='block_top_menu']/ul/li[1]/a");
    By myAccounts = By.xpath(".//*[@id='left_column']/div[4]/p/a");
    By myOrderButton = By.xpath("//div[@id='center_column']/div/div/ul/li/a/span");


    public void logonToHomePage(String uid, String pwd) throws Throwable {

        driver.findElement(signIn).click();
        Thread.sleep(3000);
        driver.findElement(uname).sendKeys(uid);
        driver.findElement(pword).sendKeys(pwd);
        Thread.sleep(4000);
        System.out.println("Driver Instance used on Login Page is :" + driver);
        driver.findElement(login).click();
        Thread.sleep(4000);

    }

    //from homePage class
    public void searchAnItem(String searchtext) throws Throwable {
        driver.findElement(searchField).sendKeys(searchtext);
        Thread.sleep(2000);
        driver.findElement(searchButton).click();
        Thread.sleep(3000);
        System.out.println("Driver Instance used on Home Page is :" + driver);

    }
}
package Pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends loginPage {
    Logger log = Logger.getLogger("HomePage");

    public HomePage(WebDriver driver) {
        super(driver);

    }

    By searchField = By.xpath(".//*[@id='search_query_top']");
    By searchButton = By.xpath(".//*[@id='searchbox']/button");
    By myAccounts = By.xpath(".//*[@id='left_column']/div[4]/p/a");
    By myOrderButton = By.xpath("//div[@id='center_column']/div/div/ul/li/a/span");


    public void searchAnItem(String searchtext) throws Throwable {
        driver.findElement(searchField).sendKeys(searchtext);
        Thread.sleep(2000);
        driver.findElement(searchButton).click();
        Thread.sleep(3000);
        log.info("Driver Instance used on Home Page is :" + driver);
    }


    public void gotoOrderPage() throws Throwable {
        driver.findElement(myAccounts).click();
        Thread.sleep(3000);
        log.info("Driver Instance used on Home Page is :" + driver);
        driver.findElement(myOrderButton).click();
    }


}




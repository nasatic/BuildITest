package Utility;

import Pages.loginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static Utility.BrowserLists.driver;

public abstract class AbstractPageClass{
//    static WebDriver driver;
//
//    public AbstractPageClass(WebDriver driver) {
//        this.driver = driver;
//    }

    //loginPage class page objects
    By signIn = By.xpath("//a[contains(text(),'Sign in')]");
    By uname = By.id("email");
    By pword = By.name("passwd");
    By login = By.id("SubmitLogin");

    //HomePage class page objects
    By searchField = By.xpath(".//*[@id='search_query_top']");
    By searchButton = By.xpath(".//*[@id='searchbox']/button");
    /**
     *
     */
    By logout = By.xpath("//a[@class='logout']");
    By womenTab = By.xpath(".//*[@id='block_top_menu']/ul/li[1]/a");
    By myAccounts = By.xpath(".//*[@id='left_column']/div[4]/p/a");
    By myOrderButton = By.xpath("//div[@id='center_column']/div/div/ul/li/a/span");

    //OrderHistoryPage class page objects
    By zeroOrderText = By.xpath(".//*[@id='block-history']/p");
    /**
     *
     */
    By logoutLink = By.xpath("//a[contains(text(),'Sign out')]");
    By addressButton = By.xpath("//span[contains(text(),'My addresses')]");
    By backHome = By.xpath("//div[@id='center_column']/ul/li/a/span");

    //AddressPage class objects
    By AddAddressBtn = By.xpath("//div[@id='center_column']/div[2]/a/span");
    By Address1 = By.xpath(".//*[@id='address1']");
    By Address2 = By.xpath(".//*[@id='address2']");
    By City = By.xpath(".//*[@id='city']");
    By State = By.xpath("//select[@id='id_state']/option[3]");
    By PostCode = By.xpath(".//*[@id='postcode']");
    By HomePhone = By.id("phone");
    By Mobile = By.id("phone_mobile");
    By AddInfo = By.id("other");
    By AddressAlias = By.id("alias");
    By Save = By.id("submitAddress");
    By DeleteAddress = By.xpath("//div[@id='center_column']/div/div/div[2]/ul/li[9]/a[2]/span");


    //methods from LoginPage class
//    public abstract void logonToHomePage(String uid, String pwd) throws InterruptedException, Throwable {
//        driver.findElement(signIn).click();
//        Thread.sleep(3000);
//        driver.findElement(uname).sendKeys(uid);
//        driver.findElement(pword).sendKeys(pwd);
//        Thread.sleep(4000);
//        System.out.println("Driver Instance used on Login Page is :" + driver);
//        driver.findElement(login).click();
//        Thread.sleep(4000);
//    }

    public abstract void logonToHomePage(String uid, String pwd) throws Throwable;
    public abstract void searchAnItem(String searchtext) throws Throwable;
    public abstract void gotoOrderPage() throws Throwable;
    public abstract void assertOrderPage() throws Exception;
    public abstract void addSecondAddress() throws Throwable;
    public abstract void goBackHome() throws Throwable;
    public abstract void deleteAddedAddress() throws Throwable;
    public abstract void logoutOfPage() throws Throwable;
    public abstract void shutdown();

//    public void searchAnItem(String searchtext) throws Throwable {
//        driver.findElement(searchField).sendKeys(searchtext);
//        Thread.sleep(2000);
//        driver.findElement(searchButton).click();
//        Thread.sleep(3000);
//        System.out.println("Driver Instance used on Home Page is :" + driver);
//    }

//    public void gotoOrderPage() throws Throwable {
//        driver.findElement(myAccounts).click();
//        Thread.sleep(3000);
//        System.out.println("Driver Instance used on Home Page is :" + driver);
//        driver.findElement(myOrderButton).click();
////		Thread.sleep(3000);
//    }

//    public void assertOrderPage() throws Exception {
//        System.out.println("Order Page title is :" + " " + driver.getTitle());
//
//        if ("You have not placed any orders.".equals(driver.findElement(zeroOrderText).getText())) {
//            System.out.println("Zero Order Page Text is :" + " " + driver.findElement(zeroOrderText).getText());
//        } else
//            throw new Exception("Page assertion Failed!!!!!!!!!!!!!!!!");
//    }

//    public void goBackHome() throws Throwable {
//        driver.findElement(backHome).click();
//        Thread.sleep(4000);
//        System.out.println("Driver Instance used on Order History Page is :" + driver);
//        driver.findElement(addressButton).click();
//
//    }
//
//    //from addressPage
//    public void addSecondAddress() throws Throwable {
//        driver.findElement(AddAddressBtn).click();
//        Thread.sleep(3000);
//        driver.findElement(Address1).sendKeys("20 Green Lane");
//        driver.findElement(Address2).sendKeys("Forest Field");
//        driver.findElement(City).sendKeys("GreenFord");
//        driver.findElement(State).click();
//        driver.findElement(PostCode).sendKeys("72514");
//        driver.findElement(Mobile).sendKeys("214-225-1247");
//        driver.findElement(HomePhone).sendKeys("214-898-3347");
//        driver.findElement(AddInfo).sendKeys("This is a day that the lord has made, we should be glad and rejoice in it");
//        driver.findElement(AddressAlias).sendKeys("My 2nd Address");
//        driver.findElement(Save).click();
//        Thread.sleep(3000);
//
//    }
//
//    public void deleteAddedAddress() throws Throwable {
//        driver.findElement(DeleteAddress).click();
//        Thread.sleep(2000);
//        driver.switchTo().alert().accept();
//        Thread.sleep(3000);
//        System.out.println("Driver Instance used on Address Page is :" + driver);
//    }
//
//    public void logoutOfPage() throws Throwable {
//        driver.findElement(logoutLink).click();
//        System.out.println("Driver Instance used on Address Page is :" + driver);
//        Thread.sleep(3000);
//
//    }
//
//    public void shutdown() {
//        driver.close();
//        driver.quit();
//    }

//    public abstract void logonToHomePage(String uid, String pwd) throws Throwable;
//    public abstract void searchAnItem(String searchtext) throws Throwable;
//
//    public abstract void gotoOrderPage() throws Throwable;
//    public abstract void assertOrderPage() throws Exception;
//    public abstract void goBackHome() throws Throwable;
//    public abstract void addSecondAddress() throws Throwable;
//
//    public abstract void deleteAddedAddress() throws Throwable;
//
//    public abstract void logoutOfPage() throws Throwable;
//    public abstract void shutdown();


//    //methods from orderHistoryPage class ;
//    public abstract void assertOrderPage() throws Exception;
//    public abstract void goBackHome() throws Throwable;
//
//    // methods from addressPage class
//    public abstract void deleteAddedAddress() throws Throwable;
//    public abstract void logoutOfPage() throws Throwable;
//    public abstract void addSecondAddress() throws Throwable;
//    public abstract void shutdown();

}

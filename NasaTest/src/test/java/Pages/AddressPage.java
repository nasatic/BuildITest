package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddressPage extends OrderHistoryPage {

	public AddressPage(WebDriver driver) {
		super(driver);
		
	}  

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

	public void addSecondAddress() throws Throwable {
		driver.findElement(AddAddressBtn).click();
		Thread.sleep(3000);
		driver.findElement(Address1).sendKeys("20 Green Lane");
		driver.findElement(Address2).sendKeys("Forest Field");
		driver.findElement(City).sendKeys("GreenFord");
		driver.findElement(State).click();
		driver.findElement(PostCode).sendKeys("72514");
		driver.findElement(Mobile).sendKeys("214-225-1247");
		driver.findElement(HomePhone).sendKeys("214-898-3347");
		driver.findElement(AddInfo).sendKeys("This is a day that the lord has made, we should be glad and rejoice in it");
		driver.findElement(AddressAlias).sendKeys("My 2nd Address");
		driver.findElement(Save).click();
		Thread.sleep(3000);

	}
	public void deleteAddedAddress() throws Throwable {
		driver.findElement(DeleteAddress).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		System.out.println("Driver Instance used on Address Page is :" + driver);
	}

	public void logoutOfPage() throws Throwable {
		driver.findElement(logout).click();
		System.out.println("Driver Instance used on Address Page is :" + driver);
		Thread.sleep(3000);

	}

	public void shutdown() {
		driver.close();
		driver.quit();
	}
}
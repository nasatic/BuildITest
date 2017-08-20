package Pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderHistoryPage extends HomePage {
	Logger log = Logger.getLogger("OrderHistoryPage");

	public OrderHistoryPage(WebDriver driver) {
		super(driver);

	}

	By zeroOrderText = By.xpath(".//*[@id='block-history']/p");
	By logout = By.xpath("//a[contains(text(),'Sign out')]");
	By addressButton = By.xpath("//span[contains(text(),'My addresses')]");
	By backHome = By.xpath("//div[@id='center_column']/ul/li/a/span");

//	@Override
	public void assertOrderPage() throws Exception {
		log.info("Order Page title is :" + " " + driver.getTitle());

		if ("You have not placed any orders.".equals(driver.findElement(zeroOrderText).getText())) {
			log.info("Zero Order Page Text is :" + " " + driver.findElement(zeroOrderText).getText());
		} else
			throw new Exception("Page assertion Failed!!!!!!!!!!!!!!!!");
	}
//	@Override
	public void goBackHome() throws Throwable {
		driver.findElement(backHome).click();
		Thread.sleep(4000);
		log.info("Driver Instance used on Order History Page is :" + driver);
		driver.findElement(addressButton).click();

	}

}
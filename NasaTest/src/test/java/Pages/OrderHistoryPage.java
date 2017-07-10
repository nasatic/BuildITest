package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderHistoryPage extends HomePage {

	public OrderHistoryPage(WebDriver driver) {
		super(driver);

	}

	By zeroOrderText = By.xpath(".//*[@id='block-history']/p");
	By logout = By.xpath("//a[contains(text(),'Sign out')]");
	By addressButton = By.xpath("//span[contains(text(),'My addresses')]");
	By backHome = By.xpath("//div[@id='center_column']/ul/li/a/span");

	public void assertOrderPage() throws Exception {
		System.out.println("Order Page title is :" + " " + driver.getTitle());

		if ("You have not placed any orders.".equals(driver.findElement(zeroOrderText).getText())) {
			System.out.println("Zero Order Page Text is :" + " " + driver.findElement(zeroOrderText).getText());
		} else
			throw new Exception("Page assertion Failed!!!!!!!!!!!!!!!!");
	}

	public void goBackHome() throws Throwable {
		driver.findElement(backHome).click();
		Thread.sleep(4000);
		System.out.println("Driver Instance used on Order History Page is :" + driver);
		driver.findElement(addressButton).click();

	}

}
package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends loginPage {
	
	public HomePage(WebDriver driver) {
		super(driver);

	}

	By searchField = By.xpath(".//*[@id='search_query_top']");
	By searchButton = By.xpath(".//*[@id='searchbox']/button");
    By logout = By.xpath("//a[@class='logout']");
    By womenTab = By.xpath(".//*[@id='block_top_menu']/ul/li[1]/a");
    By myAccounts = By.xpath(".//*[@id='left_column']/div[4]/p/a");
    By myOrderButton = By.xpath("//div[@id='center_column']/div/div/ul/li/a/span");
    


	public void searchAnItem(String searchtext) throws Throwable {

		driver.findElement(searchField).sendKeys(searchtext);
		Thread.sleep(2000);
		driver.findElement(searchButton).click();
		Thread.sleep(3000);
		System.out.println("Driver Instance used on Home Page is :" + driver);

	}
	
	public void gotoOrderPage() throws Throwable{
		driver.findElement(myAccounts).click();
		Thread.sleep(3000);
		System.out.println("Driver Instance used on Home Page is :" + driver);
		driver.findElement(myOrderButton).click();
//		Thread.sleep(3000);
	}
		
		
	}




package StepDef;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestingPlaceOrder {
	
	
	static WebDriver driver = null;
	

	public static void main(String[] args) throws InterruptedException {
		
		

		
		    File file = new File("C:\\Users\\Public\\geckodriver.exe");
		    System.setProperty("org.apache.commons.logging.Log", "org.apache.commons.logging.impl.Jdk14Logger");
		    System.setProperty("webdriver.gecko.driver", "C:\\Users\\Public\\geckodriver.exe");
		    driver = new FirefoxDriver();
		    driver.get("http://automationpractice.com");
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		    Thread.sleep(3000);
		    driver.findElement(By.xpath(".//*[@id='header']/div[2]/div/div/nav/div[1]/a")).click();
		    Thread.sleep(3000);

	
		    driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("test1@email.com");
		    Thread.sleep(3000);

	
		    driver.findElement(By.xpath(".//*[@id='passwd']")).sendKeys("password1");
		    Thread.sleep(2000);
		    driver.findElement(By.id("SubmitLogin")).click();
		    Thread.sleep(3000);

		
		    String homePageText = driver.findElement(By.xpath(".//*[@id='center_column']/h1")).getText();
		    System.out.println("Key HomePage text :" + " " + homePageText);
		    Thread.sleep(3000);
		    System.out.println("Braaaaaaaaaaaaavvvvvvvvvvvvvvvvooooooooooooo: AmLogged on!!!!!!!!");
		    Thread.sleep(3000);
	

			System.out.println("-----------------------------------------User is now logged in ---------------------------------------");

		
		    driver.findElement(By.id("search_query_top")).sendKeys("DRESSES");
//		    Thread.sleep(3000);
		    driver.findElement(By.xpath(".//*[@id='searchbox']/button")).click();
//		    Thread.sleep(2000);

			
		    String sText = driver.findElement(By.xpath(".//*[@id='categories_block_left']/h2")).getText();
		    String sText1 = driver.findElement(By.xpath(".//*[@id='informations_block_left_1']/p/a")).getText();
		    String sText2 = driver.findElement(By.xpath(".//*[@id='manufacturers_block_left']/p/a")).getText();
		    Assert.assertEquals("CATEGORIES", sText);
		    Assert.assertEquals("INFORMATION", sText1);
		    Assert.assertEquals("MANUFACTURERS", sText2);
		    System.out.println("Key Page Texts are :" + ":" + sText + ":" + sText1 + ":" + sText2);

	
		    Thread.sleep(2000);
		    driver.findElement(By.xpath(".//*[@id='left_column']/div[4]/div/ul/li[1]/a")).click();

		    Thread.sleep(2000);
		    String OrderPage = driver.findElement(By.xpath(".//*[@id='center_column']/h1")).getText();
		    Assert.assertEquals("ORDER HISTORY", OrderPage);
		    Thread.sleep(2000);

	
		    driver.findElement(By.xpath(".//*[@id='center_column']/ul/li[1]/a/span")).click();
		    Thread.sleep(2000);
		
		    driver.findElement(By.xpath(".//*[@id='header']/div[2]/div/div/nav/div[2]/a")).click();
		    Thread.sleep(6000);
		    
	
		    String myPage = driver.findElement(By.xpath(".//*[@id='login_form']/h3")).getText();
//		    = driver.findElement(By.xpath(".//*[@id='login_form']/h3")).getText();
		    Assert.assertEquals("ALREADY REGISTERED?", myPage);
		    System.out.println("Logout page should have: " + myPage);

		    driver.close();
		    driver.quit();
		}
		


	}



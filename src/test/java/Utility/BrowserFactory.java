package Utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class BrowserFactory {

	static WebDriver driver;
	static DesiredCapabilities capabilities;

	public static WebDriver startBrowser(String browserName, String url) {

		if (browserName.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();		
			
		} else if (browserName.equalsIgnoreCase("IE")) {
			capabilities = DesiredCapabilities.internetExplorer();
			capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
			driver = new InternetExplorerDriver(capabilities);

		} else if (browserName.equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver();

		} else if (browserName.equalsIgnoreCase("Opera")) {
			driver = new OperaDriver();

		}
		driver.manage().window().maximize();		
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		return driver;

	}
}

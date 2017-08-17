package Utility;


import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenPrint {
	
	
	
	public static void getScreenShot(WebDriver driver, String printName) {
		
		try{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File ("./ScreenShots/"+printName+".png"));
		System.out.println("Screen Print taken");
		
	} catch (Exception e) {
		System.out.println("Exception while screen printing: " +e.getMessage());
	}

}
}



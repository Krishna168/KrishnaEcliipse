package library;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;

public class Utility {

	public static void captureScreenshot(WebDriver driver, String screenshotName) {
		// TODO Auto-generated method stub

		try {
			TakesScreenshot ts= (TakesScreenshot)driver;

			File src = ts.getScreenshotAs(OutputType.FILE);
			File desc = new File("./Screenshots/"+screenshotName+".png");
			FileUtils.copyFile(src, desc);

			System.out.println("Screenshot is taken");
		} catch (Exception e) {
		 System.out.println("Exception while taking screenshot"+e.getMessage());
		} 
	}

}

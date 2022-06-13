package Utilites;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.windows.WindowsDriver;
import io.cucumber.java.Scenario;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;



import base.BaseClass;



public class screenshot  {
	
	BaseClass baseClass = new BaseClass();
	
	public static WebDriver driver =BaseClass.driver;
	public static Scenario scenario;

	
	public void takeScreenshot(WebDriver driver)
	{

	try
	{
		if (driver != null)
		{
			 try
			 {
                 byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
                scenario.attach(screenshot, "image/png", "screenshot");
             } catch (WebDriverException wde) {
                 System.err.println(wde.getMessage());
             } catch (ClassCastException cce) {
                 cce.printStackTrace();
             }

		}
		else
			driver=null;

	}
	catch(Exception e)
	{
		System.out.println(e.getMessage());
	}

	}


	/*public static void WindowCapture_(WindowsDriver driver, String fileName) {
		try {
			TakesScreenshot ts = (TakesScreenshot)driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(source, new File("./target/cucumber-html-reports/ScreenShots/"+fileName+".jpeg"));
		} catch (Exception e) {
			System.out.println("Error While Taking Screenshot "+ e.getMessage());
			e.printStackTrace();
		}
	}*/


	public static void WindowCapture(WindowsDriver driver, String fileName) {
		try {
			byte[] source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(source, "image/png", "souce");
		} catch (Exception e) {
			System.out.println("Error While Taking Screenshot "+ e.getMessage());
			e.printStackTrace();
		}
	}

	public static void WebCapture(WebDriver driver, String fileName) {
//	public static void WebCapture(BaseClass driver, String fileName) {
		try {
			byte[] source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(source, "image/png", "source");
		} catch (Exception e) {
			System.out.println("Error While Taking Screenshot "+ e.getMessage());
			e.printStackTrace();
		}
	}

	public static void AppiumCapture(AppiumDriver driver, String fileName) {
//	public static void WebCapture(BaseClass driver, String fileName) {
		try {
			byte[] source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			BaseClass.scenario.attach(source, "image/png", "source");
		} catch (Exception e) {
			System.out.println("Error While Taking Screenshot "+ e.getMessage());
			e.printStackTrace();
		}
	}

}

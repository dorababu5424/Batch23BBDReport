package base;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {


    public  static WebDriver driver;
    public static Scenario scenario;


    @Before
    public void LunchBrowser(Scenario scenario){

    	
        System.out.println(scenario.getName());

        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();

        driver.manage().window().maximize();
  
    }

    @After
    public void KilBrowser(Scenario scenario){

        if (scenario.isFailed()){

            TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
            byte[] screenshot = takesScreenshot.getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"image/png","source");
        }
        
        driver.quit();
    }
    
    
    
    
    
    
   
    
}

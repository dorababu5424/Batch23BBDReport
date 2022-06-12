package base;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {


    public  static WebDriver driver=null;
    public static Scenario scenario=null;


    @Before
    public void LunchBrowser(Scenario scenario){

        System.out.println(scenario.getName());

        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://naveenautomationlabs.com/gitcourse/");
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

    public static void WebCapture(WebDriver driver, String fileName) {
//	public static void WebCapture(BaseClass driver, String fileName) {
        Scenario scenario1;
        try {
            byte[] source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(source, "image/png", "source");

        } catch (Exception e) {
            System.out.println("Error While Taking Screenshot "+ e.getMessage());
            e.printStackTrace();
        }
    }
}

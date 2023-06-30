package Utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import java.io.IOException;
import java.time.Duration;

public class Drivermanager {
    public static WebDriver driver;
    @BeforeMethod
    public static void driverlaunch() throws IOException {
        Configreader configreader=new Configreader();
        configreader.loadproperties();
        String url= configreader.getkey("url");
        String browser=configreader.getkey("browser");
        switch (browser){
            case ("chrome"):
                WebDriverManager.chromedriver().setup();
                driver=new ChromeDriver();
                driver.manage().window().maximize();
                break;
            case ("firefox"):
                WebDriverManager.firefoxdriver().setup();
                driver=new FirefoxDriver();
                driver.manage().window().maximize();
        }
        driver.get(url);

    }
}

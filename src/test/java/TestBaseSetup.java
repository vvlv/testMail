import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class TestBaseSetup {
    private WebDriver driver;
    public WebDriver getDriver() {
        initChromeDriver();
        return driver;
    }


    private  WebDriver initChromeDriver() {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\serge\\Downloads\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        return driver;
    }
}

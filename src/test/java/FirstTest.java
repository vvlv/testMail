import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.lang.reflect.Field;
import java.util.concurrent.TimeUnit;

public class FirstTest extends TestBaseSetup {


    private WebDriver driver;


    @Before
    public void setUp() {
        driver = getDriver();
    }



    @Test
    public void testMail  () throws InterruptedException {
        Locators test =  new Locators(driver);
        test.goMail();
        test.goKino();
        Thread.sleep(5000);
        test.goTomorrow();
        test.goMetro();
        test.goGenre();
        test.goCheckbox();
        test.goSelection();
        //test.close();
    }
}

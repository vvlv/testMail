import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class FirstTest extends TestBaseSetup {

    private WebDriver driver;

    @Before
    public void setUp() {
         driver = getDriver();
    }

    @Test
    public void testMail() throws InterruptedException {
        Locators test = new Locators(driver);
        test.goMail();
        test.goKino();
        Thread.sleep(5000);
        test.goTomorrow();
        test.goMetro();
        test.goGenre();
        test.goCheckbox();
        test.goSelection();
        //test.close();
        FinalPageLocators check = new FinalPageLocators(driver);
        check.titleCheck();

    }
  //  @Test
   // public void checkTestMail (){
   //     FinalPageLocators check = new FinalPageLocators(driver);
  //      check.titleCheck();
   // }
}

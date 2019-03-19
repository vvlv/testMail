import org.junit.Test;

public class FirstTest extends TestBaseSetup {



    @Test
    public void testMail() throws InterruptedException {
        Locators test = new Locators(driver);
        test.goMail();
        test.goKino();
        test.goTomorrow();
        test.goMetro();
        test.goGenre();
        test.goCheckbox();
        test.goSelection();
        //test.close();
    }
    @Test
    public void checkTestMail (){
        FinalPageLocators check = new FinalPageLocators(driver);
      //  check.titleCheck();
        check.twoIsD();
    }
}

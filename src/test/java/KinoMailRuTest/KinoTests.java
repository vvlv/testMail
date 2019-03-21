package KinoMailRuTest;

import org.junit.Test;

public class KinoTests extends WDSetup {

    @Test
    public void testMail() throws InterruptedException {
        KinoMailPage test = new KinoMailPage(WDSetup.driver);
        test.goMail();
        test.goKino();
        test.goTomorrow();
        test.goMetro();
        test.goGenre();
        test.goCheckbox();
        test.goSelection();
    }
    @Test
    public void checkTestMail (){
        KinoMailSecondPage check = new KinoMailSecondPage(WDSetup.driver);
        check.titleCheck();
        check.twoIsD();
        check.metrometro();
        check.tomorrowtwow();
        check.testTTest();
        check.dramaCheck();
        check.comedyCheck();
        check.finalCheck();
    }
}
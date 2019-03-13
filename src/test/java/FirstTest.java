import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class FirstTest extends WebDriverSettings {
    @Test
    public void firstTest() throws InterruptedException {
        //1. Перейти на https://afisha.mail.ru/
        driver.get("https://kino.mail.ru");
        //2. В блоке под поиском выбираем "Сходить в кино"
        WebElement inKino = driver.findElementByName("clb6796617");
        inKino.click();
        Thread.sleep(5000);
        //3. Выбираем день "Завтра"
        WebElement today = driver.findElementByXPath("//div[@class='input-group input-group_fixed']//div[@class='dropdown__field js-dates__toggle']");
        today.click();
        WebElement todaylist = driver.findElementByXPath("//*[@data-title='Завтра']//..");
        todaylist.click();
        //4. Вводим метро "Курская" и выбираем из предложенных вариантов Курская (кольцевая)
        WebElement metro = driver.findElementByXPath("//div[@class='input-group input-group_fixed']//input[@class='input__field js-suggest__input']");
        metro.clear();
        metro.sendKeys("Курская");
        WebElement kyrskay = driver.findElementByXPath("//div[@class='suggest js-suggest__list']//div[@class='suggest__item js-suggest__item']");
        kyrskay.click();
        //5. Выставляем жанр "Драма" и "Комедия"
        WebElement genreWindowSelect = driver.findElementByXPath("//form[@class='js-module']//*[contains(@placeholder,'Все жанры')]");
genreWindowSelect.click();
/*
WebElement genreDramaSelect = driver.findElementByXPath("/html/body/div[2]/div[9]/div[4]/div/div[5]/div/form/div[1]/div[3]/div/div[2]/div/div[1]/div[1]/label");
genreDramaSelect.click();
WebElement genreComedySelect = driver.findElementByXPath("/html/body/div[2]/div[9]/div[4]/div/div[5]/div/form/div[1]/div[3]/div/div[2]/div/div[1]/div[2]/label");
genreComedySelect.click();
*/
        //6. Ставим чекбокс "Только сеансы в 2D"
        WebElement onlyTwoD = driver.findElementByXPath(("//div[@class='js-module']//label[@class='checkbox__side checkbox__label']"));
        onlyTwoD.click();
        //7. Жмем "Подобрать"
        WebElement podbor = driver.findElementByName("clb6796813");
        podbor.click();
        //8. Убедиться что открыта страница "Киноафиша Москвы" и на форме выставлены заданные параметры.

    }
}


//Все действия необходимо логировать.

//Тест
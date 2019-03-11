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
    public void firstTest() {
        //1. Перейти на https://afisha.mail.ru/
        driver.get("https://kino.mail.ru");
        //2. В блоке под поиском выбираем "Сходить в кино"
        WebElement inKino = driver.findElementByName("clb6796617");
        inKino.click();
        //3. Выбираем день "Завтра"
WebElement today = driver.findElementByXPath("//div[@class='input-group input-group_fixed']//div[@class='dropdown__field js-dates__toggle']");
today.click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

WebElement todaylist = driver.findElementByXPath( "//div[@class='suggest__inner js-scrollable__view dropdown__scroll']//label[@class='checkbox__side checkbox__label']");
todaylist.click();

        //4. Вводим метро "Курская" и выбираем из предложенных вариантов Курская (кольцевая)
        WebElement metro = driver.findElementByXPath("//div[@class='input-group input-group_fixed']//input[@class='input__field js-suggest__input']");
        metro.clear();
        metro.sendKeys("Курская");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        Select select = new Select(metro);

        select.getOptions();
        select.selectByIndex(2);
        //5. Выставляем жанр "Драма" и "Комедия"
        WebElement drama = driver.findElementByXPath("/html/body/div[2]/div[9]/div[4]/div/div[5]/div/form/div[1]/div[3]/div/div[1]/div[2]");
drama.click();
WebElement dramaone = driver.findElementByXPath("/html/body/div[2]/div[9]/div[4]/div/div[5]/div/form/div[1]/div[3]/div/div[2]/div/div[1]/div[1]/label");
dramaone.click();
WebElement comedy = driver.findElementByXPath("/html/body/div[2]/div[9]/div[4]/div/div[5]/div/form/div[1]/div[3]/div/div[2]/div/div[1]/div[2]/label");
comedy.click();

        //6. Ставим чекбокс "Только сеансы в 2D"
        Wait<WebDriver> wait = new WebDriverWait(driver, 4, 1000);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[9]/div[3]/div/div[5]/div/form/div[2]/span[1]/div/div[1]/label")));

        WebElement onlyTwoD = driver.findElementByXPath(("/html/body/div[2]/div[9]/div[3]/div/div[5]/div/form/div[2]/span[1]/div/div[1]/label"));
        //      onlyTwoD.click(); /html/body/div[2]/div[9]/div[3]/div/div[5]/div/form/div[2]/span[1]/div/div[1]/label
        //      WebElement onlyTwoD = driver.findElement(By.xpath("//div[@class='checkbox checkbox_colored margin_right_20']//label[@class='checkbox__side checkbox__label']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(onlyTwoD).click().perform();
        //    onlyTwoD.click();




        //7. Жмем "Подобрать"
        WebElement podbor = driver.findElementByName("6796813");
        podbor.click();
        //8. Убедиться что открыта страница "Киноафиша Москвы" и на форме выставлены заданные параметры.

       // WebElement search = driver.findElement(By.id("header-search"));
       // search.clear();
       // search.sendKeys("наушники");
    }
}


/*
1. Перейти на https://afisha.mail.ru/
2. В блоке под поиском выбираем "Сходить в кино"
3. Выбираем день "Завтра"
4. Вводим метро "Курская" и выбираем из предложенных вариантов Курская (кольцевая)
5. Выставляем жанр "Драма" и "Комедия"
6. Ставим чекбокс "Только сеансы в 2D"
7. Жмем "Подобрать"
8. Убедиться что открыта страница "Киноафиша Москвы" и на форме выставлены заданные параметры.

Все действия необходимо логировать.

 */
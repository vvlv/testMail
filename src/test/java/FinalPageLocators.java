import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.logging.Logs;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.logging.Logger;

import static org.junit.Assert.assertEquals;

public class FinalPageLocators extends TestBaseSetup{
    // private WebDriver driver;
    //   Проверки на:
    //1. Находимся на нужной странице =  "Киноафиша Москвы - Mail.ru Кино"
    private String title = "Mail.ru Кино — фильмы, сериалы и телешоу из самых популярных онлайн-кинотеатров" ;
    //2. Выбран день "Завтра"
    private String tomorrowtwo = driver.findElement(By.xpath("//div[(@class='input-group__item')]//div[@class='dropdown__text js-dates__title']")).getText();

    //3. Выставлена станция "Курская" кольцевой линии
    //  @FindBy (xpath = "//div[@class='input-group__item']//*[@data-id='68']")
    //  private WebDriver metrochech;
    private  String metroXpathCheck = "//div[@class='input-group__item']//*[@data-id='68']";
    //4. Выставлен жанр "Драма"
    Boolean testOne = driver.findElements(By.xpath("//div[@class='input__tags-inner js-filter_selected_list']//*[@data-value='1']")).size() > 0;

    //5. Выставлен жанр "Комедия"
    Boolean testTwo = driver.findElements(By.xpath("//div[@class='input__tags-inner js-filter_selected_list']//*[@data-value='3']")).size() > 0;

    //6. Выставлен чекбокс "Только сеансы в 2D"
    //Элемент для проверки
    //  @FindBy (xpath = "//div[@class='checkbox checkbox_colored margin_right_20']//input[@checked='checked']") // and @name='is_2d'
    // private WebDriver checkbox;
    Boolean twoIsDCheck = driver.findElements(By.xpath("//div[@class='checkbox checkbox_colored margin_right_20']//input[@checked='checked']")).size() > 0;




    public FinalPageLocators(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
  // LOGS    LOGS    LOGS   LOGS   LOGS
    Logs logs = driver.manage().logs();
    LogEntries logEntries = logs.get(LogType.DRIVER);

    //  1.
    //Сверяем тайтл

    public void titleCheck () {
// переоформить
        String actualTitle = driver.getTitle();
        String expectedTitle = title;
        boolean titleproverka = actualTitle != expectedTitle;
        if (titleproverka)
        {System.out.println("True");
        }else {System.out.println("False");
        }
    }
    //   2.
    //Выбран день "Завтра"
    boolean a = tomorrowtwo.equals("Завтра");
    public void tomorrowtwow () {

        if (a) {System.out.println("День выбран правильно");} else {System.out.println("День выбран НЕ правильно"+tomorrowtwo);}
        // System.out.println(tomorrowtwo + "<-------------------------------");
    }
    //3. Выставлена станция "Курская" кольцевой линии

    Boolean meto = driver.findElements(By.xpath(metroXpathCheck)).size() > 0;


    public void metrometro (){

        if (meto) {System.out.println("METRO true");}
        else {System.out.println(" METRO false");}
    }
    //4. Выставлен жанр "Драма"
    public void dramaCheck () {
        if (testOne) {System.out.println("Жанр 'Драма' выбран");}
        else {System.out.println("Жанр 'Драма' не выбран");}
    }
    //5. Выставлен жанр "Комедия"
    public void comedyCheck () {
        if (testTwo) {System.out.println("Жанр 'Комедия' выбран");}
        else {System.out.println("Жанр 'Комедия' не выбран");}
    }
    //6. Выставлен и "Драма" и "Комедия"
    public void testTTest () {
        if (testOne&&testTwo){System.out.println("True <----------------");
        } else {
            System.out.println("false <----------------");}
    }
    //6. Выставлен чекбокс "Только сеансы в 2D"

    public void twoIsD (){

        if (twoIsDCheck) {System.out.println("CheckBox 2d = TRUE");}
        else {System.out.println("CheckBox 2d = FALSE");}
    }
    //6. Все ли выставлено?
    public void finalCheck (){
        if (twoIsDCheck&&testOne&&testTwo&&meto&&a) {System.out.println("TRUE");} else  {System.out.println("FALSE");}
    }



}
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.junit.Assert.assertEquals;


public class FinalPageLocators extends TestBaseSetup{
    // private WebDriver driver;
    //   Проверки на:
    //1. Находимся на нужной странице =  "Киноафиша Москвы - Mail.ru Кино"
    private String title = "Mail.ru Кино — фильмы, сериалы и телешоу из самых популярных онлайн-кинотеатров" ;
    //2. Выбран день "Завтра"

    //3. Выставлена станция "Курская" кольцевой линии

    //4. Выставлен жанр "Драма"

    //5. Выставлен жанр "Комедия"

    //6. Выставлен чекбокс "Только сеансы в 2D"
    //Элемент для проверки
    @FindBy (xpath = "//div[@class='checkbox checkbox_colored margin_right_20']//input[@checked='checked']") // and @name='is_2d'
    private WebDriver checkbox;




    public FinalPageLocators(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    //  1.
    //Сверяем тайтл
    public void titleCheck () {
        String actualTitle = driver.getTitle();
        String expectedTitle = title;
        assertEquals(expectedTitle, actualTitle);
        System.out.println("penis");
    }
    //   2.
    //Выбран день "Завтра"

    //3. Выставлена станция "Курская" кольцевой линии

    //4. Выставлен жанр "Драма"
    Boolean isPresent = driver.findElements(By.xpath("//div[@class='checkbox checkbox_colored margin_right_20']//input[@checked='checked']")).size() > 0;

    public void twoIsD (){

        if (isPresent==true) {System.out.println("чек бокс true");}
        else {System.out.println("false");}
    }
    //5. Выставлен жанр "Комедия"

    //6. Выставлен чекбокс "Только сеансы в 2D"

    //6. Все ли выставлено?

}
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.junit.Assert.assertEquals;

public class FinalPageLocators {
private WebDriver driver;
    //   Проверки на:
    //1. Находимся на нужной странице =  "Киноафиша Москвы - Mail.ru Кино"
    private String title = "Mail.ru Кино — фильмы, сериалы и телешоу из самых популярных онлайн-кинотеатров" ;
    //2. Выбран день "Завтра"
    //3. Выставлена станция "Курская" кольцевой линии
    //4. Выставлен жанр "Драма"
    //5. Выставлен жанр "Комедия"
    //6. Выставлен чекбокс "Только сеансы в 2D"
    @FindBy (name = "is_2d")
    private WebDriver checkboxt;


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
    public void tomorrowCheck () {

    }
}

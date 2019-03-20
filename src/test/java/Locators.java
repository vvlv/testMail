import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Locators  {

    private WebDriver driver;

    //1. Перейти на майл ру
    private String url = "https://kino.mail.ru";
    //2. В блоке под поиском выбираем "Сходить в кино"
    @FindBy(name = "clb6796617")
    private WebElement inKino;
    //3. Выбираем день "Завтра"
    @FindBy(xpath = "//div[@class='input-group input-group_fixed']//div[@class='dropdown__field js-dates__toggle']")
    private WebElement today;
    @FindBy(xpath = "//*[@data-title='Завтра']//..")
    private WebElement todaylist;
    //4. Вводим метро "Курская" и выбираем из предложенных вариантов Курская (кольцевая)
    @FindBy(xpath = "//div[@class='input-group input-group_fixed']//input[@class='input__field js-suggest__input']")
    private WebElement metro;
    @FindBy(xpath = "//*[@data-id='68']")
    private WebElement kyrskay;
    //5. Выставляем жанр "Драма" и "Комедия"
    @FindBy(xpath = "//form[@class='js-module']//*[contains(@placeholder,'Все жанры')]")
    private WebElement genreWindowSelect;
    @FindBy(xpath = "//*[@class='checkbox__inner']/span[contains(.,'драма')]/../..")
    private WebElement genreDramaSelect;
    @FindBy(xpath = "//*[@class='checkbox__inner']/span[contains(.,'комедия')]/../..")
    private WebElement genreComedySelect;
    //6. Ставим чекбокс "Только сеансы в 2D"
    @FindBy(xpath = "//div[@class='js-module']//label[@class='checkbox__side checkbox__label']")
    private WebElement onlyTwoD;
    //7. Жмем "Подобрать"
    @FindBy(name = "clb6796813")
    private WebElement podbor;

    public Locators(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;   }


    public void goMail (){
        driver.get(url);
    } //1- Перейти на майл ру

    public void goKino () throws InterruptedException {
        inKino.click(); Thread.sleep(1000);} //2- В блоке под поиском выбираем "Сходить в кино"
    public void goTomorrow () {today.click(); todaylist.click();}//3. Выбираем день "Завтра"
    public void goMetro () {metro.clear();
        metro.sendKeys("Курская");        kyrskay.click(); }//4. Вводим метро "Курская" и выбираем из предложенных вариантов Курская (кольцевая)
    public void goGenre () throws InterruptedException {
        genreWindowSelect.click();
        Thread.sleep(1000);
        genreDramaSelect.click();
        Thread.sleep(1000);
        genreComedySelect.click();

    }//5. Выставляем жанр "Драма" и "Комедия"
    public void goCheckbox ()
    {
        onlyTwoD.click();
    }//6. Ставим чекбокс "Только сеансы в 2D"
    public void goSelection () {
        podbor.click();
    }//7. Жмем "Подобрать"

}
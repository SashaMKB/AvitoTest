import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class AvitoPage {

    private WebDriver driver;
    private WebDriverWait webDriverWaitwait;

    @FindBy(className = "style-header-add-favorite-M7nA2")
    private WebElement favoriteButton;

    @FindBy(tagName = "strong")
    private WebElement nameButton;


    public AvitoPage(WebDriver driver) {
        this.driver = driver;
        this.webDriverWaitwait = new WebDriverWait(driver, Duration.ofSeconds(5));
        PageFactory.initElements(driver, this);
    }

    public void goToCard() {
        driver.get("https://www.avito.ru/nikel/knigi_i_zhurnaly/domain-driven_design_distilled_vaughn_vernon_2639542363");
    }

    public void clickToAddFavorites() {
        favoriteButton.click();
    }

    public void goToListOfFavorite() {
        driver.get("https://www.avito.ru/favorites");
    }

    public void checkAdd() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        Assert.assertTrue(wait.until(ExpectedConditions.visibilityOf(nameButton)).isDisplayed());
    }
}

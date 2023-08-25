import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AvitoPage {

    private WebDriver driver;
    private WebDriverWait webDriverWaitwait;

    @FindBy(xpath = "//*[@id=\"app\"]/div/div[3]/div[1]/div/div[2]/div[3]/div[1]/div[1]/div/div[3]/div/div/div/div[1]/button")
    private WebElement favoriteButton;

    @FindBy(xpath = "//*[@id=\"app\"]/div/div[1]/div/div/div[1]/a[1]/div/svg/path")
    private WebElement linkToFavoriteButton;

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
}

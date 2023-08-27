import org.testng.annotations.Test;

public class AvitoTest extends BaseTest {

    @Test
    public void checkAddToFavorites() {
        AvitoPage page = new AvitoPage(driver);
        page.goToCard();
        page.clickToAddFavorites();
        page.goToListOfFavorite();
        page.checkAdd();
    }
}

package UITests;

import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

public class AnimeGoLoginTestPage extends BaseTest {

    @Test
    public void loginOperationWithBadCreds(){
        AnimeGoLoginPage animeGoLoginPage = new AnimeGoLoginPage();
        Selenide.open("login");
        animeGoLoginPage.authOperation("test@mail.ru", "12345678");
        animeGoLoginPage.isErrorMessageDisplayed();

    }



}

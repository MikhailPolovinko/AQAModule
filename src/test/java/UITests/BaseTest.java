package UITests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;

public class BaseTest {

    @BeforeAll

    public static void setCofiguration(){
        Configuration.baseUrl= "https://animego.me/";
        Configuration.browser= "chrome";
        Configuration.screenshots= false;
        Configuration.savePageSource= false;

    }
}

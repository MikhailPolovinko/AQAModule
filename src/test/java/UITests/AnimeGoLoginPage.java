package UITests;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class AnimeGoLoginPage {

    private static final SelenideElement userLogininput = $(By.id("username"));
    private static final SelenideElement userPasswordinput = $(By.id("password"));
    private static final SelenideElement submitButton = $(By.xpath(".//button[text()='Войти']"));
    private static final SelenideElement invalidCredsErrorMessage = $(By.xpath(".//div[text()='Недействительные аутентификационные данные.']"));

 public void authOperation (String login, String password){
        setUserLogin(login);
        setUserPassword(password);
        pushSubmitButton();
 }

    public void setUserLogin(String login){
        userLogininput.shouldBe(visible).setValue(login);
    }

    public void setUserPassword(String password){
        userPasswordinput.shouldBe(visible).setValue(password);
    }

    public void  pushSubmitButton(){
        submitButton.shouldBe(visible).click();
}
    public void isErrorMessageDisplayed(){
        invalidCredsErrorMessage.shouldBe(visible);
    }
}

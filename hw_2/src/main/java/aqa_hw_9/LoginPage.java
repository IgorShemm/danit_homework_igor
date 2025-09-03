package aqa_hw_9;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {

    private static final By EMAIL_FIELD = By.cssSelector("input[placeholder='E-mail або номер мобільного телефону']");
    private static final By PASSWORD_FIELD = By.cssSelector("input[placeholder='Пароль']");
    private static final By SUBMIT_BUTTON = By.cssSelector("button.btn.btn--graphite[type='submit']");
    private static final By ERROR_MESSAGE = By.cssSelector("div.error");

    public void enterEmail(String email) {
        $(EMAIL_FIELD).shouldBe(Condition.visible).clear();
        $(EMAIL_FIELD).setValue(email);
    }

    public void enterPassword(String password) {
        $(PASSWORD_FIELD).shouldBe(Condition.visible).clear();
        $(PASSWORD_FIELD).setValue(password);
    }

    public void clickLoginButton() {
        $(SUBMIT_BUTTON).shouldBe(Condition.visible).scrollIntoView(true).click();
    }

    public String getErrorMessage() {
        return $(ERROR_MESSAGE).shouldBe(Condition.visible).getText();
    }
}
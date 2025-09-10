package aqa_hw_12;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import com.codeborne.selenide.SelenideElement;
import java.time.Duration;

public class LoginPage {

    public void enterEmail(String email) {
        $("input[placeholder='E-mail або номер мобільного телефону']")
                .shouldBe(visible, Duration.ofSeconds(10))
                .setValue(email);
    }

    public void enterPassword(String password) {
        $("input[placeholder='Пароль']")
                .shouldBe(visible, Duration.ofSeconds(10))
                .setValue(password);
    }

    public void clickLoginButton() {
        SelenideElement loginButton = $("button.btn.btn--graphite.rounded-border--lg.m_b-10[type='submit']")
                .shouldBe(visible, Duration.ofSeconds(10));
        executeJavaScript("arguments[0].click();", loginButton);
    }

    public String getValidationErrorMessage() {
        return $("div.error.m_b-5")
                .shouldBe(visible, Duration.ofSeconds(10))
                .getText();
    }
}
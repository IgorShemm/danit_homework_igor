package aqa_hw_10;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.executeJavaScript;

public class LoginPage {

    private final SelenideElement loginModal = $(".modal-content");
    private final SelenideElement emailInput = $("input[name='auth_login']");
    private final SelenideElement passwordInput = $("input[name='auth_password']");
    private final SelenideElement loginButton = $(".ui-btn-account");

    @Step("Check that login modal is visible")
    public LoginPage checkLoginModalVisible() {
        loginModal.shouldBe(visible);
        return this;
    }

    @Step("Enter email: {email}")
    public LoginPage enterEmail(String email) {
        emailInput.shouldBe(visible).shouldBe(enabled).setValue(email);
        return this;
    }

    @Step("Enter password")
    public LoginPage enterPassword(String password) {
        passwordInput.shouldBe(visible).shouldBe(enabled).setValue(password);
        return this;
    }

    @Step("Focus login button via JS")
    public LoginPage focusLoginButton() {
        executeJavaScript("arguments[0].focus();", loginButton);
        return this;
    }

    @Step("Click login button via JS")
    public LoginPage clickLogin() {
        executeJavaScript("arguments[0].click();", loginButton);
        return this;
    }

    @Step("Check if login modal is still visible")
    public boolean isLoginModalStillVisible() {
        return loginModal.isDisplayed();
    }
}
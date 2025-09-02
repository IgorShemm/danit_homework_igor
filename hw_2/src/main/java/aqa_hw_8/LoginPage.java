package aqa_hw_8;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {
    private WebDriver driver;
    private WebDriverWait wait;

    private static final By EMAIL_FIELD = By.cssSelector("input[placeholder='E-mail або номер мобільного телефону']");
    private static final By PASSWORD_FIELD = By.cssSelector("input[placeholder='Пароль']");
    private static final By SUBMIT_BUTTON = By.cssSelector("button.btn.btn--graphite[type='submit']");
    private static final By ERROR_MESSAGE = By.cssSelector("div.error");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void enterEmail(String email) {
        WebElement emailField = wait.until(ExpectedConditions.visibilityOfElementLocated(EMAIL_FIELD));
        emailField.clear();
        emailField.sendKeys(email);
    }

    public void enterPassword(String password) {
        WebElement passwordField = wait.until(ExpectedConditions.visibilityOfElementLocated(PASSWORD_FIELD));
        passwordField.clear();
        passwordField.sendKeys(password);
    }

    public void clickLoginButton() {
        WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(SUBMIT_BUTTON));

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", loginButton);
    }

    public String getErrorMessage() {
        WebElement errorMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(ERROR_MESSAGE));
        return errorMessage.getText();
    }
}
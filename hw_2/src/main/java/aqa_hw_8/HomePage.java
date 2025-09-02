package aqa_hw_8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {
    private WebDriver driver;
    private WebDriverWait wait;

    private static final By SEARCH_FIELD = By.cssSelector("[type='text']");
    private static final By SEARCH_BUTTON = By.cssSelector("button.search__btn");
    private static final By LOGIN_BUTTON = By.cssSelector("a.user-button.login-button");

    public HomePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }

    public void enterSearchText(String text) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(SEARCH_FIELD));
        WebElement searchField = driver.findElement(SEARCH_FIELD);
        searchField.clear();
        searchField.sendKeys(text);
    }

    public void clickOnSearchButton() {
        wait.until(ExpectedConditions.elementToBeClickable(SEARCH_BUTTON));
        driver.findElement(SEARCH_BUTTON).click();
    }

    public void clickOnLoginButton() {
        wait.until(ExpectedConditions.elementToBeClickable(LOGIN_BUTTON));
        driver.findElement(LOGIN_BUTTON).click();
    }
}
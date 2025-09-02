package aqa_hw_8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProductDetailsPage {
    private WebDriver driver;
    private WebDriverWait wait;

    private static final By PRODUCT_TITLE = By.cssSelector("h1.title__main");
    private static final By COMPARE_BUTTON = By.cssSelector("button.many__price-btn");
    private static final By SHOPS_LIST = By.id("productOffersListContainer");
    private static final By PRODUCT_PRICE = By.cssSelector("span.many__price-sum.text-orange");

    public ProductDetailsPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(7));
    }

    public String getProductPageTitle() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PRODUCT_TITLE));
        return driver.findElement(PRODUCT_TITLE).getText();
    }

    public void clickOnCompareButton() {
        wait.until(ExpectedConditions.elementToBeClickable(COMPARE_BUTTON));
        driver.findElement(COMPARE_BUTTON).click();
    }

    public boolean verifyShopsListComponentIsDisplayed() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(SHOPS_LIST));
        return driver.findElement(SHOPS_LIST).isDisplayed();
    }

    public String getProductPrice() {
        WebElement priceElement = wait.until(ExpectedConditions.visibilityOfElementLocated(PRODUCT_PRICE));
        return priceElement.getText().trim();
    }
}
package aqa_hw_8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class SearchResultPage {
    private WebDriver driver;
    private WebDriverWait wait;

    private static final By TITLE = By.cssSelector("h1.catalog-title__main");
    private static final By PRODUCTS = By.cssSelector("div.list-item");
    private static final By PRODUCT_PRICE = By.cssSelector("div.text-md.text-orange.text-lh--1");

    public SearchResultPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(7));
    }

    public String getTitleText() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(TITLE));
        return driver.findElement(TITLE).getText();
    }

    public String getProductName(int index) {
        wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(PRODUCTS, index));
        List<WebElement> items = driver.findElements(PRODUCTS);
        return items.get(index).findElement(By.cssSelector(".list-item__title-container")).getText();
    }

    public void clickOnProduct(int index) {
        wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(PRODUCTS, index));
        List<WebElement> items = driver.findElements(PRODUCTS);
        items.get(index).findElement(By.cssSelector(".list-item__photo")).click();
    }

    public String getProductPrice(int index) {
        wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(PRODUCTS, index));
        List<WebElement> items = driver.findElements(PRODUCTS);
        return items.get(index).findElement(PRODUCT_PRICE).getText().trim();
    }
}
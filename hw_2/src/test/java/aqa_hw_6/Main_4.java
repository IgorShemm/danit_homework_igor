package aqa_hw_6;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class Main_4 {

    @Test
    public void testCompareButtonPresence() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://hotline.ua/");

        FluentWait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(15))
                .pollingEvery(Duration.ofMillis(500))
                .ignoring(NoSuchElementException.class)
                .ignoring(StaleElementReferenceException.class);

        wait.until(ExpectedConditions.presenceOfElementLocated(By.tagName("body")));

        WebElement searchInput = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.cssSelector("input[type='text']")));

        String searchQuery = "смартфон";
        searchInput.sendKeys(searchQuery);
        searchInput.sendKeys(Keys.ENTER);

        WebElement comparePricesLink = wait.until(ExpectedConditions.elementToBeClickable(
                By.cssSelector("a.btn.btn--orange")));
        comparePricesLink.click();

        WebElement compareButton = wait.until(ExpectedConditions.elementToBeClickable(
                By.cssSelector("button.many__price-btn.btn--wide.btn--orange")));
        assertTrue(compareButton.isDisplayed());

        driver.quit();
    }
}
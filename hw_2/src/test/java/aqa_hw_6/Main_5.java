package aqa_hw_6;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class Main_5 {

    @Test
    public void testAddToFavorites() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://hotline.ua/");

        Wait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofMillis(500))
                .ignoring(NoSuchElementException.class)
                .ignoring(StaleElementReferenceException.class);

        String searchQuery = "планшет";

        WebElement productSearchField = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[type='text']"))
        );
        productSearchField.sendKeys(searchQuery);
        productSearchField.sendKeys(Keys.ENTER);

        WebElement firstProduct = wait.until(
                ExpectedConditions.elementToBeClickable(By.cssSelector("a.item-title.text-md.link.link--black"))
        );
        firstProduct.click();

        WebElement favButton = wait.until(
                ExpectedConditions.elementToBeClickable(By.cssSelector("div.action-button--bookmark"))
        );
        favButton.click();

        WebElement modalText = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.title__text"))
        );
        assertTrue(modalText.getText().contains("Зберегти в"));

        driver.quit();
    }
}
package aqa_hw_6;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class Main {

    @Test
    public void searchTabletsViaAutosuggest() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://hotline.ua/");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement searchInput = wait.until(ExpectedConditions.elementToBeClickable(
                By.cssSelector("input[placeholder='Знайти товар, магазин, бренд']")
        ));
        searchInput.sendKeys("планшети");

        WebElement firstSuggestion = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.cssSelector("li.autosuggest__results-item")
        ));
        firstSuggestion.click();

        WebElement pageTitle = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.cssSelector("h1")
        ));
        assertTrue(pageTitle.getText().toLowerCase().contains("планшет"));

        driver.quit();
    }
}
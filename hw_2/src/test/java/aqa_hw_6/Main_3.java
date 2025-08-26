package aqa_hw_6;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class Main_3 {

    @Test
    public void changeLanguageAndVerifyCityName() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://hotline.ua/");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement citySelector = wait.until(ExpectedConditions.elementToBeClickable(
                By.cssSelector("div.location__city")
        ));
        citySelector.click();

        WebElement odessaOption = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//span[contains(@class,'cities-list__link') and contains(text(),'Одеса')]")
        ));
        odessaOption.click();

        WebElement languageButton = wait.until(ExpectedConditions.elementToBeClickable(
                By.cssSelector("div.lang-button.header__lang-icon")
        ));
        languageButton.click();

        WebElement russianOption = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//div[@class='lang-item' and normalize-space(text())='RU']")
        ));
        russianOption.click();

        WebElement cityName = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.cssSelector("div.location__city")
        ));
        assertTrue(cityName.getText().contains("Одесса"));

        driver.quit();
    }
}
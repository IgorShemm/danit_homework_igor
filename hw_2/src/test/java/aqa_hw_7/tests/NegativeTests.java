package aqa_hw_7.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class NegativeTests extends BaseTest {

    @Test
    public void searchInvalidProduct() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(5));

        WebElement searchInput = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.cssSelector("input[type='text']")
        ));
        searchInput.sendKeys("asdasdasd123");
        wait.until(ExpectedConditions.attributeToBeNotEmpty(searchInput, "value"));
        searchInput.sendKeys(Keys.ENTER);

        WebElement noResultsBlock = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.cssSelector("div.search__no-items-title")
        ));
        Assert.assertTrue(noResultsBlock.getText().contains("нічого не знайдено"));
    }
}
package aqa_hw_7.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class ComparisonTests extends BaseTest {

    private final String searchQuery = "смартфон";

    @Test
    public void addProoductsAndOpenComparisonSafely() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(7));

        WebElement searchInput = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.cssSelector("input[type='text']")
        ));
        searchInput.sendKeys(searchQuery);
        Thread.sleep(5000);
        searchInput.sendKeys(Keys.ENTER);

        wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(
                By.cssSelector("button.list-item-compare__icon"), 1
        ));
        List<WebElement> buttons = getDriver().findElements(By.cssSelector("button.list-item-compare__icon"));

        buttons.get(0).click();
        wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(
                By.cssSelector("button.list-item-compare__icon svg use[href*='#i-compare-solid']"), 0
        ));
        buttons.get(1).click();
        wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(
                By.cssSelector("button.list-item-compare__icon svg use[href*='#i-compare-solid']"), 1
        ));

        WebElement solidIcon = wait.until(ExpectedConditions.presenceOfElementLocated(
                By.cssSelector("button.list-item-compare__icon svg use[href*='#i-compare-solid']")
        ));
        WebElement parentButton = solidIcon.findElement(By.xpath("./ancestor::button"));
        wait.until(ExpectedConditions.elementToBeClickable(parentButton)).click();

        String secondTab = getDriver().getWindowHandles().stream().toList().get(1);
        getDriver().switchTo().window(secondTab);

        WebElement countBlock = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.cssSelector("div.text-md")
        ));
        String countText = countBlock.getText().replaceAll("[^0-9]", "");
        Assert.assertEquals(countText, "2");
    }

    @Test
    public void verifyAddedProductImagesInComparison() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(7));

        WebElement searchInput = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.cssSelector("input[type='text']")
        ));
        searchInput.sendKeys(searchQuery);
        Thread.sleep(5000);
        searchInput.sendKeys(Keys.ENTER);

        wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(
                By.cssSelector("button.list-item-compare__icon"), 1
        ));
        List<WebElement> buttons = getDriver().findElements(By.cssSelector("button.list-item-compare__icon"));

        wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(
                By.cssSelector("img.rounded-border--sm"), 1
        ));
        List<WebElement> images = getDriver().findElements(By.cssSelector("img.rounded-border--sm"));
        String firstSrc = images.get(0).getAttribute("src");
        String secondSrc = images.get(1).getAttribute("src");

        buttons.get(0).click();
        wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(
                By.cssSelector("button.list-item-compare__icon svg use[href*='#i-compare-solid']"), 0
        ));
        buttons.get(1).click();
        wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(
                By.cssSelector("button.list-item-compare__icon svg use[href*='#i-compare-solid']"), 1
        ));

        WebElement solidIcon = wait.until(ExpectedConditions.presenceOfElementLocated(
                By.cssSelector("button.list-item-compare__icon svg use[href*='#i-compare-solid']")
        ));
        WebElement parentButton = solidIcon.findElement(By.xpath("./ancestor::button"));
        wait.until(ExpectedConditions.elementToBeClickable(parentButton)).click();

        String secondTab = getDriver().getWindowHandles().stream().toList().get(1);
        getDriver().switchTo().window(secondTab);

        wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(
                By.cssSelector("img.rounded-border--sm"), 1
        ));
        List<WebElement> comparedImages = getDriver().findElements(By.cssSelector("img.rounded-border--sm"));
        List<String> comparedSrcs = new ArrayList<>();
        for (WebElement img : comparedImages) {
            comparedSrcs.add(img.getAttribute("src"));
        }

        Assert.assertTrue(comparedSrcs.contains(firstSrc));
        Assert.assertTrue(comparedSrcs.contains(secondSrc));
    }
}
package aqa_hw_7.tests;

import aqa_hw_7.data_provider.ProvideData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class CityLanguageTests extends BaseTest {

    @Test(dataProvider = "getCityData", dataProviderClass = ProvideData.class)
    public void selectCityAndVerify(String cityName) {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(5));

        WebElement cityBlock = wait.until(ExpectedConditions.elementToBeClickable(
                By.cssSelector("div.location")
        ));
        cityBlock.click();

        WebElement cityOption = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//span[@class='cities-list__link' and text()='" + cityName + "']")
        ));
        cityOption.click();

        WebElement selectedCity = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.cssSelector("div.location__city")
        ));
        Assert.assertEquals(selectedCity.getText().trim(), cityName);
    }

    @Test
    public void switchLanguageToRuThenUaAndVerifySearchText() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(15));

        WebElement langButton = wait.until(ExpectedConditions.elementToBeClickable(
                By.cssSelector("div.lang-button")
        ));
        new Actions(getDriver()).moveToElement(langButton).click().perform();
        Thread.sleep(2000);

        WebElement ruOption = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//div[contains(@class,'lang-item') and normalize-space()='RU']")
        ));
        ruOption.click();
        Thread.sleep(3000);

        WebElement searchTextRu = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.cssSelector("div.search-section__text")
        ));
        String textRu = searchTextRu.getText().toLowerCase();
        Assert.assertTrue(textRu.contains("найди") || textRu.contains("сравни") || textRu.contains("выбери"));

        WebElement langButtonAgain = wait.until(ExpectedConditions.elementToBeClickable(
                By.cssSelector("div.lang-button")
        ));
        new Actions(getDriver()).moveToElement(langButtonAgain).click().perform();
        Thread.sleep(2000);

        WebElement uaOption = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//div[contains(@class,'lang-item') and normalize-space()='UA']")
        ));
        uaOption.click();
        Thread.sleep(3000);

        WebElement searchTextUa = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.cssSelector("div.search-section__text")
        ));
        String textUa = searchTextUa.getText().toLowerCase();
        Assert.assertTrue(textUa.contains("знайди") || textUa.contains("порівняй") || textUa.contains("вибери"));
    }
}
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;
import java.util.NoSuchElementException;

public class Main_4 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://hotline.ua/");

        FluentWait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(15))
                .pollingEvery(Duration.ofMillis(500))
                .ignoring(NoSuchElementException.class);

        wait.until(ExpectedConditions.presenceOfElementLocated(By.tagName("body")));

        WebElement searchInput = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.cssSelector("input[placeholder='Знайти товар, магазин, бренд']")));
        searchInput.sendKeys("смартфон");
        searchInput.sendKeys(Keys.ENTER);

        WebElement comparePricesLink = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//a[contains(text(),'Порівняти Ціни')]")));
        comparePricesLink.click();

        WebElement compareButton = wait.until(ExpectedConditions.elementToBeClickable(
                By.cssSelector("button.many__price-btn.btn--wide.btn--orange")));
        if (compareButton.isDisplayed()) {
            System.out.println("✅ Compare button is present and clickable.");
        } else {
            System.out.println("❌ Compare button not found.");
        }

        driver.quit();
    }
}
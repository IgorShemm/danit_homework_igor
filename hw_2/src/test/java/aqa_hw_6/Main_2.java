package aqa_hw_6;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

public class Main_2 {

    @Test
    public void checkTitleText() {
        String searchQuery = "ноутбуки";
        String expectedTitle = "Історія розвитку штучного інтелекту: від перших роботів до AI у ноутбуках";

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://hotline.ua/");
        driver.findElement(By.linkText("Гід покупця")).click();
        driver.findElement(By.cssSelector("input[type='text'][placeholder*='Що вибираєте?']")).sendKeys(searchQuery, Keys.ENTER);
        driver.findElement(By.cssSelector("a.link.guide-card-item__inner")).click();

        WebElement title = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.cssSelector("h1.guides-article__title"))
        );

        String actualTitle = title.getText();
        Assert.assertEquals(expectedTitle, actualTitle);

        driver.quit();
    }
}
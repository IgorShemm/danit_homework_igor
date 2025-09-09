package aqa_hw_6;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Main {

    public static void main(String[] args) {
        String searchQuery = "ноутбуки";
        String expectedTitle = "Історія розвитку штучного інтелекту: від перших роботів до AI у ноутбуках";

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
        driver.manage().window().maximize();
        driver.get("https://hotline.ua/");

        WebElement guideLink = driver.findElement(By.linkText("Гід покупця"));
        guideLink.click();

        WebElement searchInput = driver.findElement(By.cssSelector("input[type='text'][placeholder*='Що вибираєте?']"));
        searchInput.click();
        searchInput.sendKeys(searchQuery, Keys.ENTER);

        WebElement firstArticle = driver.findElement(By.cssSelector("a.link.guide-card-item__inner"));
        firstArticle.click();

        WebElement articleTitle = driver.findElement(By.cssSelector("h1.guides-article__title"));
        String actualTitle = articleTitle.getText();

        Assert.assertEquals(expectedTitle, actualTitle);

        driver.quit();
    }

}
package aqa_hw_3.task_1;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.String.format;
import static java.lang.Thread.sleep;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        try {
            String wordToFind = "iPhone";

            driver.get("https://hotline.ua/");
            driver.manage().window().maximize();

            WebElement searchField = driver.findElement(By.cssSelector("[type='text']"));
            searchField.sendKeys(wordToFind);
            sleep(3000);

            WebElement searchButton = driver.findElement(By.cssSelector("[title='Поиск']"));
            searchButton.click();
            sleep(7000);

            WebElement titleElement = driver.findElement(By.cssSelector("[class='catalog-title__main']"));
            String pageTitleString = titleElement.getText();

            Assert.assertTrue(format("<%s> title doesn't contain <%s> word", pageTitleString, wordToFind), pageTitleString.contains(wordToFind));
        } catch (AssertionError ex) {
            ex.printStackTrace();
        } finally {
            driver.quit();
        }
    }

}

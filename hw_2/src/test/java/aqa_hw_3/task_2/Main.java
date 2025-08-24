package aqa_hw_3.task_2;

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
            driver.get("https://hotline.ua/ua/computer/noutbuki-netbuki/");
            driver.manage().window().maximize();
            sleep(5000);

            WebElement titleElement = driver.findElement(By.cssSelector(".catalog-title__main"));
            String pageTitleString = titleElement.getText();

            Assert.assertTrue(
                    format("<%s> title doesn't contain <%s> word", pageTitleString, "Ноутбуки"),
                    pageTitleString.contains("Ноутбуки")
            );
        } catch (AssertionError ex) {
            ex.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}
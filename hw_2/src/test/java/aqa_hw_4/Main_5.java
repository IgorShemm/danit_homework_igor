package aqa_hw_4;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.sleep;

public class Main_5 {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://hotline.ua/");
        driver.manage().window().maximize();

        sleep(5000);

        WebElement compareButton = driver.findElement(By.cssSelector("div.header__icon"));
        compareButton.click();

        sleep(3000);

        WebElement emptyMessage = driver.findElement(By.cssSelector("p.m_b-10"));
        Assert.assertTrue(emptyMessage.isDisplayed());

        driver.quit();
    }
}
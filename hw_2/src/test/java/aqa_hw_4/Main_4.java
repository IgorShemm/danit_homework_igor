package aqa_hw_4;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.sleep;

public class Main_4 {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://hotline.ua/");
        driver.manage().window().maximize();

        sleep(5000);

        WebElement gamerSection = driver.findElement(By.cssSelector("a.categories-section__link.link--black:has(i.icon-section--categories--game)"));
        gamerSection.click();

        sleep(5000);

        WebElement gamerDesks = driver.findElement(By.cssSelector("div.section-navigation__link-text"));
        Assert.assertTrue(gamerDesks.isDisplayed());

        driver.quit();
    }
}
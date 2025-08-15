package aqa_hw_4;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.sleep;

public class Main_2 {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://hotline.ua/");
        driver.manage().window().maximize();

        sleep(5000);

        WebElement reviewsLink = driver.findElement(By.xpath("//a[@class='services-section__link link--black shopReviews']"));
        reviewsLink.click();

        sleep(5000);

        WebElement firstReview = driver.findElement(By.xpath("(//div[@class='store-feedback reviews-info__reviews'])[1]"));
        Assert.assertTrue(firstReview.isDisplayed());

        driver.quit();
    }
}
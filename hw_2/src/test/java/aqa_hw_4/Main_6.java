package aqa_hw_4;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.sleep;

public class Main_6 {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://hotline.ua/");
        driver.manage().window().maximize();

        sleep(5000);

        WebElement adSection = driver.findElement(By.cssSelector("a[data-tracking-id='global-35']"));
        adSection.click();

        sleep(3000);

        WebElement phone1 = driver.findElement(By.cssSelector("a[href='tel:+380444963461']"));
        Assert.assertTrue(phone1.isDisplayed());

        WebElement phone2 = driver.findElement(By.cssSelector("a[href='tel:380444963462']"));
        Assert.assertTrue(phone2.isDisplayed());

        WebElement email = driver.findElement(By.cssSelector("a[href='mailto:ads@hotline.ua']"));
        Assert.assertTrue(email.isDisplayed());

        driver.quit();
    }
}
package aqa_hw_4;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.sleep;

public class Main_1 {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://hotline.ua/");
        driver.manage().window().maximize();

        WebElement userIcon = driver.findElement(By.xpath("//div[@class='user-button__image flex middle-xs center-xs']"));
        userIcon.click();

        sleep(2000);

        Assert.assertTrue(driver.getCurrentUrl().endsWith("/login/"));

        driver.quit();
    }

}
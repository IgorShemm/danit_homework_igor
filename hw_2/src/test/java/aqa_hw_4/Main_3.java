package aqa_hw_4;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.sleep;

public class Main_3 {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://hotline.ua/");
        driver.manage().window().maximize();

        sleep(5000);

        WebElement locationBlock = driver.findElement(By.xpath("//div[@class='location flex middle-xs']"));
        locationBlock.click();

        sleep(3000);

        WebElement odessaOption = driver.findElement(By.xpath("//span[@class='cities-list__link' and text()='Одеса']"));
        odessaOption.click();

        sleep(5000);

        WebElement updatedLocation = driver.findElement(By.xpath("//div[@class='location__city']"));
        Assert.assertEquals("Одеса", updatedLocation.getAttribute("title").trim());

        driver.quit();
    }
}
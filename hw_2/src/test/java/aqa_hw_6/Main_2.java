package aqa_hw_6;

import org.junit.jupiter.api.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class Main_2 {

    private WebDriver driver;
    private WebDriverWait wait;

    @BeforeEach
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://hotline.ua/");
    }

    @Test
    public void checkCatalogMenuItem() {
        WebElement catalogButton = wait.until(ExpectedConditions.elementToBeClickable(
                By.cssSelector("div.button-menu-main")
        ));
        catalogButton.click();

        WebElement menuItem = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.cssSelector("a.menu-main__item-link[href='/ua/bt/']")
        ));

        assertTrue(menuItem.isDisplayed());
    }

    @AfterEach
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
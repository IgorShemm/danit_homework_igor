import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main_5 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
        driver.manage().window().maximize();

        try {
            driver.get("https://hotline.ua/");

            WebElement searchInput = driver.findElement(By.cssSelector("input[placeholder='Знайти товар, магазин, бренд']"));
            searchInput.sendKeys("планшет");
            searchInput.sendKeys(Keys.ENTER);

            WebElement firstProduct = driver.findElement(By.cssSelector("a.item-title.text-md.link.link--black"));
            firstProduct.click();

            WebElement favButton = driver.findElement(By.cssSelector("div.action-button--bookmark"));
            favButton.click();

            WebElement modalText = driver.findElement(By.cssSelector("span.title__text"));
            if (!modalText.getText().contains("Зберегти в")) {
                throw new RuntimeException();
            }

        } finally {
            driver.quit();
        }
    }
}
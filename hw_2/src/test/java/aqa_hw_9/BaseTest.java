package aqa_hw_9;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeMethod;

import static com.codeborne.selenide.Selenide.open;

public class BaseTest {

    @BeforeMethod
    public void setUp() {
        Configuration.browser = "chrome";
        Configuration.browserSize = "2560x1440";
        Configuration.timeout = 5000;
        open("https://hotline.ua/");
    }
}
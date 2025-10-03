package aqa_fp;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.testng.annotations.BeforeMethod;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class BaseTest {

    @BeforeMethod
    public void setUp() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide()
                .screenshots(true)
                .savePageSource(false)
        );

        Configuration.browser = "chrome";
        Configuration.timeout = 10000;
        open("https://prom.ua/");
        getWebDriver().manage().window().maximize();
    }
}
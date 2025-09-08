package aqa_hw_11;

import com.codeborne.selenide.Configuration;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static aqa_hw_11.TestRailController.publishResults;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class BaseTest {

    protected int testCaseId;

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup(); // автоматическая настройка драйвера

        Configuration.browser = "chrome";
        Configuration.timeout = 10000;
        open("https://www.yakaboo.ua/");
        getWebDriver().manage().window().maximize();
    }

    @AfterMethod
    public void publishTestResultsToTestRail(ITestResult testResult) {
        if (testCaseId == 0) return; // если ID не указан — пропускаем

        int statusId = testResult.isSuccess() ? 1 : 5;
        publishResults(statusId, testCaseId);
    }
}
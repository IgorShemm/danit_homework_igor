package aqa_hw_10;

import io.qameta.allure.*;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.actions;
import static com.codeborne.selenide.Selenide.sleep;
import static org.openqa.selenium.Keys.ESCAPE;
import static org.testng.Assert.assertTrue;

@Epic("Promotions")
@Feature("Promotions Page")
public class PromotionsTests extends BaseTest {

    @Test
    @Description("Open promotions page and verify promotions are listed")
    @Link(name = "Yakaboo", url = "https://www.yakaboo.ua/")
    @Issue("PROMO-002")
    public void openPromotionsAndCheckPromotionsExist() {
        sleep(5000);
        actions().sendKeys(ESCAPE).perform();

        new HomePage()
                .clickPromotionsLink();

        PromotionsPage promotionsPage = new PromotionsPage()
                .checkPromotionsVisible();

        int actualCount = promotionsPage.getPromotionCount();
        assertTrue(actualCount >= 5, "Expected at least 5 promotions, but got " + actualCount);
    }
}
package aqa_fp;

import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThanOrEqual;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class HomepageCartTests extends BaseTest {

    @Test
    public void shouldAddFiveVisibleProductsToCart() throws InterruptedException {
        HomePage homePage = new HomePage();
        homePage.scrollToFirstBuyButton();

        $$("button[data-qaid='buy-button']").shouldHave(sizeGreaterThanOrEqual(5));

        for (int i = 0; i < 5; i++) {
            $$("button[data-qaid='buy-button']").get(i).click();
            $("span[data-qaid='counter']").shouldHave(text(String.valueOf(i + 1)));
        }

        String actualCount = $("span[data-qaid='counter']").getText();
        Assert.assertEquals(actualCount, "5");
    }
}
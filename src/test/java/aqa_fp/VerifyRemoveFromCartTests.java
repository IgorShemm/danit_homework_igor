package aqa_fp;

import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class VerifyRemoveFromCartTests extends BaseTest {

    @Test
    public void shouldRemoveProductFromCartPanel() {
        HomePage homePage = new HomePage();
        SearchResultsPage searchResultsPage = new SearchResultsPage();

        homePage.enterSearchQuery("iPhone");
        searchResultsPage.clickBuyButtonOnFirstProduct();

        $("span[data-qaid='counter']").shouldHave(text("1"));
        searchResultsPage.clickCartIcon();

        $("button[data-testid='remove_btn']").shouldBe(visible).click();
        $("span[data-testid='title_text']").shouldHave(text("Кошик порожній")).shouldBe(visible);

        Assert.assertEquals($("span[data-testid='title_text']").getText().toLowerCase(), "кошик порожній");
    }
}
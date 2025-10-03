package aqa_fp;

import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class VerifyAddToCartTests extends BaseTest {

    @Test
    public void shouldAddProductToCartFromSearchResults() {
        HomePage homePage = new HomePage();
        SearchResultsPage searchResultsPage = new SearchResultsPage();

        homePage.enterSearchQuery("смартфон");

        searchResultsPage.verifyFirstProductTitle();
        String expectedTitle = searchResultsPage.getFirstProductTitleText();

        searchResultsPage.clickBuyButtonOnFirstProduct();
        $("span[data-qaid='counter']").shouldHave(text("1"));
        searchResultsPage.clickCartIcon();

        $("span.-ROQ5._1wiJa.Cn-P6").shouldBe(visible);
        String actualTitle = searchResultsPage.getCartPanelProductTitle();

        Assert.assertTrue(actualTitle.toLowerCase().contains("iphone"));
        Assert.assertEquals(actualTitle, expectedTitle);
    }
}
package aqa_fp;

import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class ProductCheckoutConsistencyTests extends BaseTest {

    @Test
    public void shouldMatchProductTitleAndPriceOnCheckoutPage() {
        String searchQuery = "PlayStation 4";

        HomePage homePage = new HomePage();
        homePage.enterSearchQuery(searchQuery);

        SearchResultsPage searchResultsPage = new SearchResultsPage();
        searchResultsPage.clickFirstProduct();

        ProductDetailsPage productDetailsPage = new ProductDetailsPage();
        String expectedTitle = productDetailsPage.getProductTitleText();
        String expectedPrice = productDetailsPage.getProductPriceText();

        productDetailsPage.clickBuyNowButton();

        String actualTitle = $("span[data-testid='product_name']").shouldBe(visible).getText();
        String actualPrice = $("span[data-testid='price']").shouldBe(visible).getText();

        Assert.assertEquals(actualTitle, expectedTitle);
        Assert.assertTrue(actualPrice.contains(expectedPrice));
    }
}
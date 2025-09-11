package aqa_hw_9;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ProductTests extends BaseTest {

    @Test
    public void verifyProductTitleMatchesSearchResult() {
        int secondProductIndex = 1;

        HomePage homePage = new HomePage();
        homePage.enterSearchText("iPhone 15");
        homePage.clickOnSearchButton();

        SearchResultPage searchResultPage = new SearchResultPage();
        String expectedProductName = searchResultPage.getProductName(secondProductIndex);
        searchResultPage.clickOnProduct(secondProductIndex);

        ProductDetailsPage productDetailsPage = new ProductDetailsPage();
        String actualProductTitle = productDetailsPage.getProductPageTitle();

        Assert.assertTrue(actualProductTitle.contains(expectedProductName));
    }

    @Test
    public void verifyCompareButtonOpensShopsList() {
        int secondProductIndex = 1;

        HomePage homePage = new HomePage();
        homePage.enterSearchText("PlayStation 5");
        homePage.clickOnSearchButton();

        SearchResultPage searchResultPage = new SearchResultPage();
        searchResultPage.clickOnProduct(secondProductIndex);

        ProductDetailsPage productDetailsPage = new ProductDetailsPage();
        productDetailsPage.clickOnCompareButton();

        Assert.assertTrue(productDetailsPage.verifyShopsListComponentIsDisplayed());
    }

    @Test
    public void verifyProductPriceMatchesSearchResult() {
        int firstProductIndex = 0;

        HomePage homePage = new HomePage();
        homePage.enterSearchText("iPhone 15");
        homePage.clickOnSearchButton();

        SearchResultPage searchResultPage = new SearchResultPage();
        String expectedPrice = searchResultPage.getProductPrice(firstProductIndex);
        searchResultPage.clickOnProduct(firstProductIndex);

        ProductDetailsPage productDetailsPage = new ProductDetailsPage();
        String actualPrice = productDetailsPage.getProductPrice();

        Assert.assertEquals(actualPrice, expectedPrice);
    }
}
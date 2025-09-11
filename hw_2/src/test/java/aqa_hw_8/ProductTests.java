package aqa_hw_8;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ProductTests extends BaseTest {

    @Test
    public void verifyProductTitleMatchesSearchResult() {
        int secondProductIndex = 1;

        HomePage homePage = new HomePage(getDriver());
        homePage.enterSearchText("iPhone 15");
        homePage.clickOnSearchButton();

        SearchResultPage searchResultPage = new SearchResultPage(getDriver());
        String expectedProductName = searchResultPage.getProductName(secondProductIndex);
        searchResultPage.clickOnProduct(secondProductIndex);

        ProductDetailsPage productDetailsPage = new ProductDetailsPage(getDriver());
        String actualProductTitle = productDetailsPage.getProductPageTitle();

        Assert.assertTrue(actualProductTitle.contains(expectedProductName));
    }

    @Test
    public void verifyCompareButtonOpensShopsList() {
        int secondProductIndex = 1;

        HomePage homePage = new HomePage(getDriver());
        homePage.enterSearchText("PlayStation 5");
        homePage.clickOnSearchButton();

        SearchResultPage searchResultPage = new SearchResultPage(getDriver());
        searchResultPage.clickOnProduct(secondProductIndex);

        ProductDetailsPage productDetailsPage = new ProductDetailsPage(getDriver());
        productDetailsPage.clickOnCompareButton();

        Assert.assertTrue(productDetailsPage.verifyShopsListComponentIsDisplayed());
    }

    @Test
    public void verifyProductPriceMatchesSearchResult() {
        int firstProductIndex = 0;

        HomePage homePage = new HomePage(getDriver());
        homePage.enterSearchText("iPhone 15");
        homePage.clickOnSearchButton();

        SearchResultPage searchResultPage = new SearchResultPage(getDriver());
        String expectedPrice = searchResultPage.getProductPrice(firstProductIndex);
        searchResultPage.clickOnProduct(firstProductIndex);

        ProductDetailsPage productDetailsPage = new ProductDetailsPage(getDriver());
        String actualPrice = productDetailsPage.getProductPrice();

        Assert.assertEquals(actualPrice, expectedPrice);
    }
}
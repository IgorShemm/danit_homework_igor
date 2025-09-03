package aqa_hw_9;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ProductTests extends BaseTest {

    @Test
    public void verifyProductTitleMatchesSearchResult() {
        HomePage homePage = new HomePage();
        homePage.enterSearchText("iPhone 15");
        homePage.clickOnSearchButton();

        SearchResultPage searchResultPage = new SearchResultPage();
        String expectedProductName = searchResultPage.getProductName(1);
        searchResultPage.clickOnProduct(1);

        ProductDetailsPage productDetailsPage = new ProductDetailsPage();
        String actualProductTitle = productDetailsPage.getProductPageTitle();

        Assert.assertTrue(actualProductTitle.contains(expectedProductName));
    }

    @Test
    public void verifyCompareButtonOpensShopsList() {
        HomePage homePage = new HomePage();
        homePage.enterSearchText("PlayStation 5");
        homePage.clickOnSearchButton();

        SearchResultPage searchResultPage = new SearchResultPage();
        searchResultPage.clickOnProduct(1);

        ProductDetailsPage productDetailsPage = new ProductDetailsPage();
        productDetailsPage.clickOnCompareButton();

        Assert.assertTrue(productDetailsPage.verifyShopsListComponentIsDisplayed());
    }

    @Test
    public void verifyProductPriceMatchesSearchResult() {
        HomePage homePage = new HomePage();
        homePage.enterSearchText("iPhone 15");
        homePage.clickOnSearchButton();

        SearchResultPage searchResultPage = new SearchResultPage();
        String expectedPrice = searchResultPage.getProductPrice(0);
        searchResultPage.clickOnProduct(0);

        ProductDetailsPage productDetailsPage = new ProductDetailsPage();
        String actualPrice = productDetailsPage.getProductPrice();

        Assert.assertEquals(actualPrice, expectedPrice, "Цены не совпадают между поиском и карточкой товара");
    }
}
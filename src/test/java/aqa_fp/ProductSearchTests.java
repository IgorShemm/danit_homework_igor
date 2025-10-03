package aqa_fp;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ProductSearchTests extends BaseTest {

    @Test
    public void shouldOpenCorrectProductFromSearchResults() {
        String searchQuery = "iPhone";

        HomePage homePage = new HomePage();
        homePage.enterSearchQuery(searchQuery);

        SearchResultsPage searchResultsPage = new SearchResultsPage();
        String expectedTitle = searchResultsPage.getFirstProductTitleText();
        searchResultsPage.clickFirstProduct();

        ProductDetailsPage productDetailsPage = new ProductDetailsPage();
        String actualTitle = productDetailsPage.getProductTitleText();

        Assert.assertTrue(actualTitle.equals(expectedTitle));
    }
}
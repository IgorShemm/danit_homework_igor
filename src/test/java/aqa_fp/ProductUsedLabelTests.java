package aqa_fp;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class ProductUsedLabelTests extends BaseTest {

    @Test
    public void shouldShowUsedLabelAfterFilterApplied() {
        HomePage homePage = new HomePage();
        SearchResultsPage searchResultsPage = new SearchResultsPage();
        ProductDetailsPage productDetailsPage = new ProductDetailsPage();

        homePage.enterSearchQuery("смартфон");
        searchResultsPage.clickUsedSmartphonesFilter();
        searchResultsPage.clickFirstProduct();

        assertEquals(productDetailsPage.getUsedLabelText(), "Вживані");
    }
}
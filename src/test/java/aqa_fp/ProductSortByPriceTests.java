package aqa_fp;

import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.CollectionCondition.*;

public class ProductSortByPriceTests extends BaseTest {

    @Test
    public void shouldSortProductsByPriceAscending() {
        String query = "смартфон";
        HomePage homePage = new HomePage();
        homePage.enterSearchQuery(query);

        $$("div[data-qaid='product_price']")
                .shouldHave(sizeGreaterThan(0))
                .get(0).shouldBe(visible);

        SearchResultsPage searchResultsPage = new SearchResultsPage();
        Assert.assertTrue(searchResultsPage.checkFirstFivePricesSorted());
    }
}
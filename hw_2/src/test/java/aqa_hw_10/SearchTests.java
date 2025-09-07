package aqa_hw_10;

import io.qameta.allure.*;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.actions;
import static org.openqa.selenium.Keys.ESCAPE;
import static org.openqa.selenium.Keys.ENTER;
import static com.codeborne.selenide.Selenide.sleep;

@Epic("Search")
@Feature("Search Functionality")
public class SearchTests extends BaseTest {

    @Test
    @Description("Search for product and verify it appears in results")
    @Link(name = "Yakaboo", url = "https://www.yakaboo.ua/")
    @Issue("SEARCH-001")
    public void searchProductAndVerifyResult() {
        String query = "Математика";

        sleep(5000);
        actions().sendKeys(ESCAPE).perform();

        new HomePage()
                .enterSearchQuery(query);
        sleep(3000);
        actions().sendKeys(ENTER).perform();

        SearchResultsPage resultsPage = new SearchResultsPage()
                .checkResultsVisible()
                .checkProductTitleVisible(query);

        String expectedImageName = resultsPage.getFirstProductImageName();

        ProductDetailsPage productPage = resultsPage
                .clickOnProductByTitle(query);

        productPage.checkProductImageMatches(expectedImageName);
    }
}

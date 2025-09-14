package aqa_hw_10;

import io.qameta.allure.*;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.actions;
import static com.codeborne.selenide.Selenide.sleep;
import static com.codeborne.selenide.Condition.visible;
import static org.openqa.selenium.Keys.ESCAPE;

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

        $("input[type='search']").shouldBe(visible).setValue(query);
        sleep(3000);
        $("input[type='search']").pressEnter();

        SearchResultsPage resultsPage = new SearchResultsPage()
                .checkResultsVisible()
                .checkProductTitleVisible(query);

        String expectedImageName = resultsPage.getFirstProductImageName();

        ProductDetailsPage productPage = resultsPage
                .clickOnProductByTitle(query);

        productPage.checkProductImageMatches(expectedImageName);
    }
}
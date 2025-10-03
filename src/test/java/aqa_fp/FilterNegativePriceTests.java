package aqa_fp;

import org.testng.annotations.Test;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class FilterNegativePriceTests extends BaseTest {

    @Test
    public void shouldShowNoResultsForNegativeMaxPrice() {
        String query = "ssd";

        HomePage homePage = new HomePage();
        homePage.enterSearchQuery(query);

        SearchResultsPage resultsPage = new SearchResultsPage();
        resultsPage.setMaxPrice("-100");
        resultsPage.submitPriceFilter();

        resultsPage.getNoResultsMessage().shouldBe(visible).shouldHave(text("Перепрошуємо, ми нічого не знайшли."));
    }
}
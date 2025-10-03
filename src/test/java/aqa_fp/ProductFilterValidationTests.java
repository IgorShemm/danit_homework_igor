package aqa_fp;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

import static org.apache.commons.lang3.StringUtils.containsIgnoreCase;

public class ProductFilterValidationTests extends BaseTest {

    @Test
    public void shouldContainMicrophoneKeywordInFilteredResults() {
        String searchQuery = "PlayStation 5";
        String expectedKeyword = "мікрофон";

        HomePage homePage = new HomePage();
        homePage.enterSearchQuery(searchQuery);

        SearchResultsPage searchResultsPage = new SearchResultsPage();
        searchResultsPage.clickMicrophoneFilter();

        List<String> titles = searchResultsPage.getFirstProductTitles(5);

        for (String title : titles) {
            Assert.assertTrue(containsIgnoreCase(title, expectedKeyword));
        }
    }
}
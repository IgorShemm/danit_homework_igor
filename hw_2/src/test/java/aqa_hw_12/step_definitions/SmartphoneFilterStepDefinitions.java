package aqa_hw_12.step_definitions;

import aqa_hw_12.SearchResultPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class SmartphoneFilterStepDefinitions {

    private SearchResultPage searchResultsPage = new SearchResultPage();

    private String firstTitleBeforeFilter;
    private String firstTitleAfterFilter;

    @When("User saves first product title")
    public void saveFirstProductTitle() {
        firstTitleBeforeFilter = searchResultsPage.getFirstProductTitle();
    }

    @When("User applies battery filter")
    public void applyBatteryFilter() {
        searchResultsPage.applyBatteryFilter();
    }

    @Then("verify first product title has changed")
    public void verifyFirstProductTitleHasChanged() {
        firstTitleAfterFilter = searchResultsPage.getFirstProductTitle();
        Assert.assertNotEquals("Product title should change after filter",
                firstTitleBeforeFilter, firstTitleAfterFilter);
    }

    @Then("verify filtered product has NFC")
    public void verifyFilteredProductHasNfc() {
        Assert.assertTrue("Filtered product should have NFC",
                searchResultsPage.firstProductHasNfc());
    }
}
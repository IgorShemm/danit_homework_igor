package aqa_hw_12.step_definitions;

import aqa_hw_12.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class HomePageStepDefinitions {

    private HomePage homePage = new HomePage();

    @Given("User opens Home Page")
    public void openHomePage() {
        homePage.openHomePage();
    }

    @When("User enters {string} word into search field on Home Page")
    public void entersSearchWord(String wordToSearch) {
        homePage.entersSearchWord(wordToSearch);
    }

    @When("User clicks on search button on Home Page")
    public void clickOnSearchButton() {
        homePage.clickOnSearchButton();
    }

    @When("User clicks on main catalog button on Home Page")
    public void clickOnMainCatalogButton() {
        homePage.clickOnMainCatalogButton();
    }

    @Then("verify main catalog menu appears on Home Page")
    public void verifyMainCatalogMenuIsDisplayed() {
        Assert.assertTrue(homePage.verifyMainCatalogMenuIsDisplayed());
    }

    @When("User clicks on login button on Home Page")
    public void clickOnLoginButton() {
        homePage.clickOnLoginButton();
    }

    @When("User enters search query {string}")
    public void enterSearchQuery(String query) {
        homePage.entersSearchWord(query);
    }

    @When("User clicks search button")
    public void clickSearchButton() {
        homePage.clickOnSearchButton();
    }
}
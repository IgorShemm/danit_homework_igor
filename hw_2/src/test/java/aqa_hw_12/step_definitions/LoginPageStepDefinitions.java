package aqa_hw_12.step_definitions;

import aqa_hw_12.LoginPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginPageStepDefinitions {

    private LoginPage loginPage = new LoginPage();

    @When("User enters login value {string}")
    public void enterLoginValue(String loginValue) {
        loginPage.enterEmail(loginValue);
    }

    @When("User enters password {string}")
    public void enterPassword(String password) {
        loginPage.enterPassword(password);
    }

    @When("User clicks login button")
    public void clickLoginButton() {
        loginPage.clickLoginButton();
    }

    @Then("verify validation error message contains {string}")
    public void verify_validation_error_message_contains(String expectedMessage) {
        String actualMessage = loginPage.getValidationErrorMessage();
        Assert.assertTrue("Expected message to contain: " + expectedMessage + "\nActual: " + actualMessage,
                actualMessage.contains(expectedMessage));
    }
}
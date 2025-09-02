package aqa_hw_8;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends BaseTest {

    @Test
    public void verifyErrorMessageForInvalidLogin() {
        HomePage homePage = new HomePage(getDriver());
        homePage.clickOnLoginButton();

        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.enterEmail("wrongEmail");
        loginPage.enterPassword("123456");
        loginPage.clickLoginButton();

        String actualError = loginPage.getErrorMessage();
        Assert.assertTrue(actualError.contains("Введіть коректний email"));
    }
}

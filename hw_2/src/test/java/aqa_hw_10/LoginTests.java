package aqa_hw_10;

import io.qameta.allure.*;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.actions;
import static com.codeborne.selenide.Selenide.sleep;
import static org.openqa.selenium.Keys.ESCAPE;
import static org.testng.Assert.assertTrue;

@Epic("Authorization")
@Feature("Login Modal")
public class LoginTests extends BaseTest {

    @Test
    @Description("Invalid login shows error message")
    @Link(name = "Yakaboo", url = "https://www.yakaboo.ua/")
    @Issue("AUTH-001")
    public void invalidLoginShowsErrorMessage() {
        sleep(5000);
        actions().sendKeys(ESCAPE).perform();

        new HomePage()
                .clickLoginButton();

        LoginPage loginPage = new LoginPage()
                .checkLoginModalVisible()
                .enterEmail("invalid@example.com")
                .enterPassword("wrongpassword")
                .focusLoginButton()
                .clickLogin();

        assertTrue(
                loginPage.isLoginModalStillVisible(),
                "Login modal should remain visible after invalid login"
        );
    }
}
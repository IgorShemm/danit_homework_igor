package aqa_fp;

import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;

public class LoginNegativeTests extends BaseTest {

    @Test
    public void shouldShowErrorOnInvalidPassword() {
        String email = "test@gmail.com";
        String password = "11111111";

        HomePage homePage = new HomePage();
        CabinetSidebarPage cabinetSidebar = new CabinetSidebarPage();

        homePage.clickCabinetButton();
        cabinetSidebar.clickSignInButton();
        $("button[data-qaid='close_btn']").should(appear).click();
        cabinetSidebar.clickEmailLoginOption();

        cabinetSidebar.enterEmail(email);
        cabinetSidebar.confirmEmail();

        cabinetSidebar.enterPassword(password);
        cabinetSidebar.confirmPassword();

        Assert.assertEquals(cabinetSidebar.getErrorText(), "Перевірте правильність введеного пароля");
    }
}
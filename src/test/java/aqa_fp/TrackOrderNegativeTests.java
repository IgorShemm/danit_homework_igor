package aqa_fp;

import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class TrackOrderNegativeTests extends BaseTest {

    @Test
    public void shouldShowErrorForUnknownPhoneNumber() {
        String phone = "951697555";

        HomePage homePage = new HomePage();
        CabinetSidebarPage cabinetSidebar = new CabinetSidebarPage();

        homePage.clickCabinetButton();
        cabinetSidebar.clickTrackOrderButton();

        $("input[id='phone']").should(appear).click();
        actions().sendKeys(phone).perform();

        $("button[data-qaid='submit_phone_btn']").shouldBe(enabled).click();

        String actualText = $("span[data-qaid='no_orders_text']").should(appear).getText();
        boolean isUkr = actualText.contains("Ми не знайшли замовлень");
        boolean isRus = actualText.contains("Мы не нашли заказов");
        Assert.assertTrue(isUkr || isRus);
    }
}
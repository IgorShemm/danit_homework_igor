package aqa_fp;

import org.testng.annotations.Test;
import static com.codeborne.selenide.Selenide.*;
import static org.testng.Assert.assertTrue;

public class CartUndoTests extends BaseTest {

    @Test
    public void shouldRestoreDeletedProductInCartSidebar() {
        HomePage homePage = new HomePage();

        homePage.clickFirstBuyButton();
        homePage.openCartSidebar();
        homePage.clickDeleteFromCart();
        homePage.clickUndoDelete();

        assertTrue($("svg[data-qaid='SvgDelete']").isDisplayed() && $("svg[data-qaid='SvgDelete']").isEnabled());
        
        $("svg[data-qaid='SvgDelete']").click();
    }
}
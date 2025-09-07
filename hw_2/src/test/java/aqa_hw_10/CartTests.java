package aqa_hw_10;

import io.qameta.allure.*;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.actions;
import static com.codeborne.selenide.Selenide.sleep;
import static org.openqa.selenium.Keys.ESCAPE;
import static org.openqa.selenium.Keys.ENTER;
import static org.testng.Assert.assertTrue;

@Epic("Cart")
@Feature("Add to Cart")
public class CartTests extends BaseTest {

    @Test
    @Description("Search for product and add it to cart")
    @Link(name = "Yakaboo", url = "https://www.yakaboo.ua/")
    @Issue("CART-001")
    public void searchAndAddProductToCart() {
        String query = "Математика";

        sleep(5000);
        actions().sendKeys(ESCAPE).perform();

        new HomePage()
                .enterSearchQuery(query);
        sleep(3000);
        actions().sendKeys(ENTER).perform();

        SearchResultsPage resultsPage = new SearchResultsPage()
                .checkResultsVisible()
                .checkProductTitleVisible(query);

        ProductDetailsPage productPage = resultsPage
                .clickOnProductByTitle(query);

        productPage
                .clickBuyButton()
                .checkCartCounterIsOne();

        assertTrue(
                true, // если checkCartCounterIsOne() не выбросил исключение — значит всё ок
                "Cart counter should show '1' after adding product"
        );
    }
}
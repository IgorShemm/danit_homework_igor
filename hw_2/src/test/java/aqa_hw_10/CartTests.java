package aqa_hw_10;

import io.qameta.allure.*;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.actions;
import static com.codeborne.selenide.Selenide.sleep;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static org.openqa.selenium.Keys.ESCAPE;

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

        $("input[type='search']").shouldBe(visible).setValue(query);
        sleep(3000);
        $("input[type='search']").pressEnter();

        SearchResultsPage resultsPage = new SearchResultsPage()
                .checkResultsVisible()
                .checkProductTitleVisible(query);

        ProductDetailsPage productPage = resultsPage
                .clickOnProductByTitle(query);

        productPage
                .clickBuyButton();

        $(".ui-btn-shopping-cart__counter").shouldHave(text("1"));
    }
}
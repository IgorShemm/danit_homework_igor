package aqa_fp;

import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;
import com.codeborne.selenide.SelenideElement;

public class ProductWholesaleCartTests extends BaseTest {

    @Test
    public void shouldAddWholesaleProductToCartWithCorrectTotal() {
        HomePage homePage = new HomePage();
        SearchResultsPage searchResultsPage = new SearchResultsPage();
        ProductDetailsPage productDetailsPage = new ProductDetailsPage();

        homePage.enterSearchQuery("ssd");
        searchResultsPage.clickFirstProduct();

        SelenideElement target = $$("span[data-qaid='opt_price']")
                .findBy(text("від 50 шт."));

        String rawPrice = target.getAttribute("data-qaprice");
        String rawQty = target.getText().replaceAll(".*від\\s*(\\d+)\\s*шт.*", "$1");

        int unitPrice = Integer.parseInt(rawPrice);
        int quantity = Integer.parseInt(rawQty);
        int expectedTotal = unitPrice * quantity;

        productDetailsPage.clickWholesalePriceButton("від 50 шт.");

        productDetailsPage.assertCartQuantityIs(quantity);
        productDetailsPage.assertCartTotalPriceIs(expectedTotal);

        productDetailsPage.deleteProductFromCart();
    }
}
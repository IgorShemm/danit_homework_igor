package aqa_fp;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class ProductDetailsPage {

    public String getProductTitleText() {
        return $("h1[data-qaid='product_name']").getText();
    }

    public String getProductPriceText() {
        return $("div[data-qaid='product_price']").shouldBe(visible).getText();
    }

    public void clickBuyNowButton() {
        $("button[data-qaid='buy_now_btn']").shouldBe(visible).click();
    }

    public void clickWholesalePriceButton(String labelText) {
        $$("span[data-qaid='opt_price']")
                .findBy(text(labelText))
                .shouldBe(visible, enabled)
                .click();
    }

    public void assertCartQuantityIs(int expectedQty) {
        $("input[data-testid='input']").shouldHave(value(String.valueOf(expectedQty)));
    }

    public void assertCartTotalPriceIs(int expectedPrice) {
        $("span[data-testid='product_price']")
                .shouldHave(attribute("data-test-productprice", String.valueOf(expectedPrice)));
    }

    public void deleteProductFromCart() {
        $("button[data-testid='remove_btn']").shouldBe(visible, enabled).click();
    }

    public String getUsedLabelText() {
        $("button[data-qaid='all_descriptions']").shouldBe(visible).click();
        return $("div[data-qaid='Стан'] span").shouldBe(visible).getText();
    }
}
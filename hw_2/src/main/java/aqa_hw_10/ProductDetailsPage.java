package aqa_hw_10;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class ProductDetailsPage {

    private final SelenideElement buyButton = $(".add-to-cart");
    private final SelenideElement productImage = $("#product-image");
    private final SelenideElement cartCounter = $(".ui-btn-shopping-cart__counter");

    @Step("Click 'Купити' button")
    public ProductDetailsPage clickBuyButton() {
        buyButton.shouldBe(visible).click();
        return this;
    }

    @Step("Check product image filename contains '{expectedImageName}'")
    public ProductDetailsPage checkProductImageMatches(String expectedImageName) {
        String actualSrc = productImage.shouldBe(visible).getAttribute("src");
        if (!actualSrc.contains(expectedImageName)) {
            throw new AssertionError("Image mismatch: expected fragment '" + expectedImageName + "', but got '" + actualSrc + "'");
        }
        return this;
    }

    @Step("Check cart counter shows '1'")
    public ProductDetailsPage checkCartCounterIsOne() {
        cartCounter.shouldBe(visible).shouldHave(text("1"));
        return this;
    }
}

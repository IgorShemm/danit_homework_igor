package aqa_hw_9;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class ProductDetailsPage {

    private static final By PRODUCT_TITLE = By.cssSelector("h1.title__main");
    private static final By COMPARE_BUTTON = By.cssSelector("button.many__price-btn");
    private static final By SHOPS_LIST = By.id("productOffersListContainer");
    private static final By PRODUCT_PRICE = By.cssSelector("span.many__price-sum.text-orange");

    public String getProductPageTitle() {
        return $(PRODUCT_TITLE).shouldBe(Condition.visible).getText();
    }

    public void clickOnCompareButton() {
        $(COMPARE_BUTTON).shouldBe(Condition.visible).click();
    }

    public boolean verifyShopsListComponentIsDisplayed() {
        return $(SHOPS_LIST).shouldBe(Condition.visible).isDisplayed();
    }

    public String getProductPrice() {
        return $(PRODUCT_PRICE).shouldBe(Condition.visible).getText().trim();
    }
}
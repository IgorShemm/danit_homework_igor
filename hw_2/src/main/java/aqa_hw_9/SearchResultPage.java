package aqa_hw_9;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import java.util.List;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;

public class SearchResultPage {

    private static final By TITLE = By.cssSelector("h1.catalog-title__main");
    private static final By PRODUCTS = By.cssSelector("div.list-item");
    private static final By PRODUCT_PRICE = By.cssSelector("div.text-md.text-orange.text-lh--1");

    public String getTitleText() {
        return $(TITLE).shouldBe(Condition.visible).getText();
    }

    public String getProductName(int index) {
        $$(PRODUCTS).shouldHave(sizeGreaterThan(index));
        return $$(PRODUCTS).get(index).find(By.cssSelector(".list-item__title-container")).getText();
    }

    public void clickOnProduct(int index) {
        $$(PRODUCTS).shouldHave(sizeGreaterThan(index));
        $$(PRODUCTS).get(index).find(By.cssSelector(".list-item__photo")).click();
    }

    public String getProductPrice(int index) {
        $$(PRODUCTS).shouldHave(sizeGreaterThan(index));
        return $$(PRODUCTS).get(index).find(PRODUCT_PRICE).getText().trim();
    }
}
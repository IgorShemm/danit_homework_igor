package aqa_fp;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import java.util.List;
import java.util.stream.Collectors;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class SearchResultsPage {

    public void verifyFirstProductTitle() {
        $("a[data-qaid='product_link'] span[data-qaid='product_name']").shouldBe(visible);
    }

    public String getFirstProductTitleText() {
        return $("a[data-qaid='product_link'] span[data-qaid='product_name']").getText();
    }

    public void clickFirstProduct() {
        $("a[data-qaid='product_link']").click();
    }

    public void clickBuyButtonOnFirstProduct() {
        $("button[data-qaid='buy-button']").click();
    }

    public void clickCartIcon() {
        $("button[data-qaid='shopping_cart']").click();
    }

    public String getCartPanelProductTitle() {
        return $("span.-ROQ5._1wiJa.Cn-P6").getText();
    }

    public void clickMicrophoneFilter() {
        $$("span.MRJ0d").findBy(text("Мікрофони")).click();
        $$("span[data-qaid='product_name']").get(0).shouldBe(visible);
    }

    public List<String> getFirstProductTitles(int count) {
        return $$("span[data-qaid='product_name']")
                .stream()
                .limit(count)
                .map(SelenideElement::getText)
                .collect(Collectors.toList());
    }

    public boolean checkFirstFivePricesSorted() {
        $("span[data-qaid='sort_by_price']").click();
        Selenide.sleep(2000);
        $$("div[data-qaid='product_price']")
                .shouldHave(CollectionCondition.sizeGreaterThan(4))
                .get(0).shouldBe(visible);


        for (int i = 0; i < 4; i++) {
            double current = Double.parseDouble($$("div[data-qaid='product_price']").get(i).getAttribute("data-qaprice"));
            double next = Double.parseDouble($$("div[data-qaid='product_price']").get(i + 1).getAttribute("data-qaprice"));
            if (current > next) return false;
        }
        return true;
    }

    public void setMaxPrice(String value) {
        $("div[data-qaid='price_local__lte']")
                .$("input[data-qaid='input_field_textbox']")
                .setValue(value);
    }

    public void submitPriceFilter() {
        $("button[data-qaid='accept_price']").click();
    }

    public SelenideElement getNoResultsMessage() {
        return $("[data-qaid='bad_filter_title']");
    }

    public void clickUsedSmartphonesFilter() {
        $$("span.MRJ0d").findBy(text("Вживані")).click();
    }
}
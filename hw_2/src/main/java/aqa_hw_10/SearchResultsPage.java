package aqa_hw_10;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$$;

public class SearchResultsPage {

    private final ElementsCollection productCards = $$(".category-card");
    private final ElementsCollection productTitles = $$(".category-card__name");

    @Step("Check that search results are visible")
    public SearchResultsPage checkResultsVisible() {
        productCards.first().shouldBe(visible);
        return this;
    }

    @Step("Check product with title '{title}' is visible")
    public SearchResultsPage checkProductTitleVisible(String title) {
        productTitles.findBy(text(title)).shouldBe(visible);
        return this;
    }

    @Step("Click on product with title '{title}'")
    public ProductDetailsPage clickOnProductByTitle(String title) {
        productTitles.findBy(text(title)).click();
        return new ProductDetailsPage();
    }

    @Step("Get image filename from first product")
    public String getFirstProductImageName() {
        String src = productCards.first()
                .$("img.product-image__thumb")
                .shouldBe(visible)
                .getAttribute("src");
        return src.substring(src.lastIndexOf("/") + 1);
    }
}

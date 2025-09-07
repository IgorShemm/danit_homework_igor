package aqa_hw_10;

import com.codeborne.selenide.ElementsCollection;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$$;

public class PromotionsPage {

    private final ElementsCollection promotionCards = $$(".promotion-card");

    @Step("Check that at least one promotion is visible")
    public PromotionsPage checkPromotionsVisible() {
        promotionCards.first().shouldBe(visible);
        return this;
    }

    @Step("Get number of promotions")
    public int getPromotionCount() {
        return promotionCards.size();
    }
}

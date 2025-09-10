package aqa_hw_12;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class ProductDetailsPage {

    public String getProductName() {
        return $("h1.title__main").shouldBe(visible).getText();
    }

}

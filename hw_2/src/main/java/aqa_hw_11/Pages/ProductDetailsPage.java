package aqa_hw_11.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;

public class ProductDetailsPage {

    private final SelenideElement englishLanguageButton =
            $$("a.type-book_lang_label").findBy(text("Англійська"));

    private final SelenideElement descriptionBlock =
            $("#product-description");

    public void switchToEnglishLanguage() {
        englishLanguageButton.shouldBe(visible).click();
    }

    public String getBookDescription() {
        descriptionBlock.shouldBe(visible);
        return descriptionBlock.getText();
    }
}
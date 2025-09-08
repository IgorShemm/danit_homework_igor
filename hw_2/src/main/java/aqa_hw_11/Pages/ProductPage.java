package aqa_hw_11.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;

public class ProductPage {

    private final SelenideElement englishLanguageSwitch =
            $$("a.type-book_lang_label").findBy(text("Англійська"));

    public void switchToEnglishLanguage() {
        englishLanguageSwitch.shouldBe(visible).click();
    }
}
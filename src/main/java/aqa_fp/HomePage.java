package aqa_fp;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

import com.codeborne.selenide.SelenideElement;

public class HomePage {

    public void enterSearchQuery(String query) {
        $("input[name='search_term']").setValue(query);
        $("[data-qaid='search_btn']").click();
    }

    public void clickCabinetButton() {
        $("button[data-qaid='show_sidebar']").click();
    }

    public String getLocalizedInterestText() {
        return $("div.M3v0L.C6zKA span._3Trjq.vj3pM.F7Tdh.aXB7S").getText();
    }

    public SelenideElement getBottomLanguageButton() {
        return $("button[data-qaid='lang_menu']");
    }

    public SelenideElement getThemeSwitchButton() {
        return $("button[data-qaid='theme_switch']");
    }

    public String getCurrentThemeText() {
        return $("button[data-qaid='theme_switch'] span._3Trjq.pYEmk").getText();
    }

    public void scrollToFirstBuyButton() {
        SelenideElement firstButton = $$("button[data-qaid='buy-button']").get(0);
        firstButton.shouldBe(visible, enabled);
    }

    public void clickFirstBuyButton() {
        $$("button[data-qaid='buy-button']").first()
                .shouldBe(visible, enabled)
                .click();

        $("span[data-qaid='counter']").shouldHave(text("1"));
    }

    public void openCartSidebar() {
        $("button[data-qaid='shopping_cart']")
                .shouldBe(visible, enabled)
                .click();
    }

    public void clickDeleteFromCart() {
        $("svg[data-qaid='SvgDelete']")
                .shouldBe(visible, enabled)
                .click();
    }

    public void clickUndoDelete() {
        $("button.P3IXJ._2yXTO.rC5uT")
                .shouldBe(visible)
                .click();
    }

}
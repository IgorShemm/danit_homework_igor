package aqa_hw_12;

import com.codeborne.selenide.Selenide;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class HomePage {

    public void openHomePage() {
        Selenide.open("https://hotline.ua/");
    }

    public void entersSearchWord(String wordToSearch) {
        $("[type='text']").setValue(wordToSearch);
        sleep(3000);
    }

    public void clickOnSearchButton() {
        $("button.search__btn").click();
    }

    public void clickOnMainCatalogButton() {
        $("div.button-menu-main").click();
    }

    public boolean verifyMainCatalogMenuIsDisplayed() {
        return $("ul.menu-main__list").shouldBe(visible).isDisplayed();
    }

    public void clickOnLoginButton() {
        $("a.user-button.login-button").shouldBe(visible).click();
    }
}
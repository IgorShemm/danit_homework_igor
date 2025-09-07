package aqa_hw_10;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Condition.visible;

public class HomePage {

    private final SelenideElement loginButton = $(".account-text");
    private final SelenideElement searchInput = $("input[type='search']");
    private final SelenideElement promotionsLink = $("a.navigation-link[href='/ua/promotions']");

    @Step("Click 'Увійти' to open login modal")
    public LoginPage clickLoginButton() {
        loginButton.shouldBe(visible).click();
        return new LoginPage();
    }

    @Step("Enter search query: {query}")
    public HomePage enterSearchQuery(String query) {
        searchInput.setValue(query);
        return this;
    }

    @Step("Click 'Акції 🔥' link")
    public HomePage clickPromotionsLink() {
        promotionsLink.shouldBe(visible).click();
        return this;
    }
}

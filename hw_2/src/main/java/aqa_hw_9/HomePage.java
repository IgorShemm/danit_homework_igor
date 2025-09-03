package aqa_hw_9;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class HomePage {

    private static final By SEARCH_FIELD = By.cssSelector("[type='text']");
    private static final By SEARCH_BUTTON = By.cssSelector("button.search__btn");
    private static final By LOGIN_BUTTON = By.cssSelector("a.user-button.login-button");

    public void enterSearchText(String text) {
        $(SEARCH_FIELD).shouldBe(Condition.visible).clear();
        $(SEARCH_FIELD).setValue(text);
    }

    public void clickOnSearchButton() {
        $(SEARCH_BUTTON).shouldBe(Condition.visible).click();
    }

    public void clickOnLoginButton() {
        $(LOGIN_BUTTON).shouldBe(Condition.visible).click();
    }
}
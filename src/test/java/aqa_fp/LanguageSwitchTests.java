package aqa_fp;

import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

import com.codeborne.selenide.SelenideElement;

public class LanguageSwitchTests extends BaseTest {

    @Test
    public void shouldSwitchLanguageUsingBottomLangMenu() {
        HomePage homePage = new HomePage();

        SelenideElement langButton = homePage.getBottomLanguageButton();
        langButton.scrollIntoView(true);
        executeJavaScript("arguments[0].click();", langButton);
        $("ul[data-qaid='lang_popup']").should(appear);
        $("span[data-qaid='ru_lang']").click();

        $("body").shouldHave(text("Тебя заинтересует"));
        Assert.assertEquals(homePage.getLocalizedInterestText(), "Тебя заинтересует");

        langButton = homePage.getBottomLanguageButton();
        langButton.scrollIntoView(true);
        executeJavaScript("arguments[0].click();", langButton);
        $("ul[data-qaid='lang_popup']").should(appear);
        $("span[data-qaid='ua_lang']").click();

        $("body").shouldHave(text("Тебе зацікавить"));
        Assert.assertEquals(homePage.getLocalizedInterestText(), "Тебе зацікавить");
    }
}
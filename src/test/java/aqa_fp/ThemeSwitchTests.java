package aqa_fp;

import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

import com.codeborne.selenide.SelenideElement;

public class ThemeSwitchTests extends BaseTest {

    @Test
    public void shouldSwitchThemeUsingBottomThemeMenu() {
        HomePage homePage = new HomePage();

        SelenideElement themeButton = homePage.getThemeSwitchButton();
        themeButton.scrollIntoView(true).click();
        $("button[data-qaid='dark']").should(appear).click();

        $("button[data-qaid='theme_switch'] span._3Trjq.pYEmk").shouldBe(visible);
        String darkThemeText = homePage.getCurrentThemeText().toLowerCase();
        Assert.assertTrue(darkThemeText.contains("темн"));

        themeButton = homePage.getThemeSwitchButton();
        themeButton.scrollIntoView(true).click();
        $("button[data-qaid='light']").should(appear).click();

        $("button[data-qaid='theme_switch'] span._3Trjq.pYEmk").shouldBe(visible);
        String lightThemeText = homePage.getCurrentThemeText().toLowerCase();
        Assert.assertTrue(lightThemeText.contains("светл") || lightThemeText.contains("світл"));
    }
}
package aqa_hw_11;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import aqa_hw_11.pages.ProductPage;
import aqa_hw_11.pages.ProductDetailsPage;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Condition.text;

public class ProductLanguageTest extends BaseTest {

    @Test
    public void bookDescriptionShouldBeInEnglishAfterLanguageSwitch() {
        testCaseId = 5;

        String query = "Harry Potter";

        sleep(5000);
        actions().sendKeys(Keys.ESCAPE).perform();

        $("input[type='search']").shouldBe(visible).setValue(query);
        sleep(3000);
        $("input[type='search']").pressEnter();

        $$("a.ui-card-title").findBy(text("The Harry Potter. Wizarding Almanac"))
                .shouldBe(visible).click();

        ProductPage productPage = new ProductPage();
        productPage.switchToEnglishLanguage();

        ProductDetailsPage productDetailsPage = new ProductDetailsPage();
        String description = productDetailsPage.getBookDescription();

        boolean containsEnglishLettersOnly = description.replaceAll("[^A-Za-z]", "").length() > 20;
        Assert.assertTrue(containsEnglishLettersOnly, "Опис книги не на англійській: " + description);
    }
}
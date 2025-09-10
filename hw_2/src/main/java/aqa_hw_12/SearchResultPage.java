package aqa_hw_12;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.WebElementsCondition;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThanOrEqual;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.sleep;

import java.time.Duration;

public class SearchResultPage {

    public String getTitle() {
        return $("h1.catalog-title__main").shouldBe(visible).getText();
    }

    public String getProductName(int productIndex) {
        ElementsCollection productNames = $$("div.list-item [class='list-item__title-container m_b-5']")
                .shouldHave(sizeGreaterThanOrEqual(productIndex - 1));
        return productNames.get(productIndex - 1).getText();
    }

    public void clickOnProductPicture(int productIndex) {
        ElementsCollection productsPicturesElements = $$("div.list-item div.list-item__photo")
                .shouldHave(sizeGreaterThanOrEqual(productIndex - 1));
        productsPicturesElements.get(productIndex - 1).click();
    }

    public String getFirstProductTitle() {
        $$("div.list-item__title-container a.item-title")
                .filter(visible)
                .shouldHave(sizeGreaterThanOrEqual(1), Duration.ofSeconds(12));
        return $$("div.list-item__title-container a.item-title")
                .filter(visible)
                .first()
                .getText();
    }

    public void applyBatteryFilter() {
        $("a[href='/ua/mobile/mobilnye-telefony-i-smartfony/385521/']")
                .shouldBe(visible, Duration.ofSeconds(10))
                .click();

        sleep(4000);
    }

    public boolean firstProductHasNfc() {
        return $("div.specs__text")
                .shouldBe(visible, Duration.ofSeconds(12))
                .getText()
                .contains("NFC: +");
    }
}
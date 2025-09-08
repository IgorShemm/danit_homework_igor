package aqa_hw_11.pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Condition.text;

public class PublisherListPage {

    private final ElementsCollection publisherLinks =
            $$("ul.etm-list__list li.etm-list__list-item a.etm-list__list-item--link");

    private final SelenideElement latinLanguageFilter =
            $$("li.navigation-item").findBy(text("Латинська"));

    public void selectLatinLanguage() {
        latinLanguageFilter.shouldBe(visible).click();
    }

    public SelenideElement getPublisherByIndex(int index) {
        return publisherLinks.get(index).shouldBe(visible);
    }

    public String getPublisherNameByIndex(int index) {
        return getPublisherByIndex(index).getText();
    }

    public int getPublisherCount() {
        return publisherLinks.size();
    }
}
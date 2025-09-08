package aqa_hw_11.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Condition.visible;

public class HomePage {

    private final SelenideElement publishersLink = $("a[href='/ua/book_publisher/view/all']");

    public void openPublishersPage() {
        publishersLink.shouldBe(visible).click();
    }
}
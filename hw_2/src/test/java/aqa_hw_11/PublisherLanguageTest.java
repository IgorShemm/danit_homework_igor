package aqa_hw_11;

import org.testng.Assert;
import org.testng.annotations.Test;
import aqa_hw_11.pages.HomePage;
import aqa_hw_11.pages.PublisherListPage;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class PublisherLanguageTest extends BaseTest {

    @Test
    public void publishersShouldBeInLatinAfterFilterApplied() {
        testCaseId = 4;

        HomePage homePage = new HomePage();
        homePage.openPublishersPage();

        PublisherListPage publisherListPage = new PublisherListPage();
        publisherListPage.selectLatinLanguage();

        publisherListPage.getPublisherByIndex(0)
                .shouldBe(visible)
                .shouldNotHave(text("А-ба-ба-га-ла-ма-га"));

        for (int i = 0; i < Math.min(5, publisherListPage.getPublisherCount()); i++) {
            String name = publisherListPage.getPublisherNameByIndex(i);
            Assert.assertTrue(name.matches(".*[A-Za-z]+.*"), "Название не на латинице: " + name);
        }
    }
}
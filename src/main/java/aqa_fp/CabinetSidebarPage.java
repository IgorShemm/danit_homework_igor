package aqa_fp;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class CabinetSidebarPage {


    public void clickSignInButton() {
        $("button[data-qaid='sign_in_mob_sidebar']").click();
    }

    public void clickEmailLoginOption() {
        $("a._0cNvO._T_c9").shouldBe(visible).scrollIntoView(true).click();
    }

    public void enterEmail(String email) {
        $("input[id='email_field']").setValue(email);
    }

    public void confirmEmail() {
        $("button[id='emailConfirmButton']").shouldBe(enabled).click();
    }

    public void enterPassword(String password) {
        $("input[id='enterPassword']").setValue(password);
    }

    public void confirmPassword() {
        $("button[id='enterPasswordConfirmButton']").shouldBe(enabled).click();
    }

    public String getErrorText() {
        return $("span[data-qaid='error_field']").should(appear).getText();
    }

    public void clickTrackOrderButton() {
        $("a[href='/shipments?app_no_folow=1']").shouldBe(visible).scrollIntoView(true).click();
    }
}
package de.sconto.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import de.sconto.utils.PropertiesLoader;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {

    public static final String validEmail = PropertiesLoader.loadProperty("valid.email");
    public static final String validPassword = PropertiesLoader.loadProperty("valid.password");

    public LoginPage enterData() {
        $("#loginEmail").shouldBe(Condition.visible).val(validEmail);
        $("#loginPassword").shouldBe(Condition.visible).val(validPassword);
        return Selenide.page(this);

    }

    public HomePage clickOnAnmelden() {
        $("#login-submit").click();
        return Selenide.page(HomePage.class);
    }
}

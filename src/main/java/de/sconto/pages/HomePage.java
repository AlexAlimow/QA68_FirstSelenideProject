package de.sconto.pages;

import com.codeborne.selenide.Selenide;
import de.sconto.utils.PropertiesLoader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Selenide.$;

public class HomePage {

    public static final String baseURL = PropertiesLoader.loadProperty("url");

    @FindBy(css = ".consentForm__acceptButton:nth-child(2)")
    WebElement acceptAll;

    public HomePage clickOnAcceptCookies() {
        if ($(acceptAll).exists()){
            $(acceptAll).click();
        }
        return Selenide.page(this);
    }


    public LoginPage clickOnLoginIcon() {
        $(".headerElement__icon--login").click();
        return Selenide.page(LoginPage.class);
    }

    public ProfilePage clickOnUserStatus() {
        $(".headerElement__status--login").click();
        return Selenide.page(ProfilePage.class);
    }

    public HomePage clickOnMoebelLink() {
        $(".menu__link--moebel a span span").click();
        return Selenide.page(HomePage.class);
    }

    public HomePage clickOnSofasPage() {
        $("#Möbel .flyoutTile__Headline--selected a").click();
        $("[href='/artikel/60407647']").click();
        return Selenide.page(HomePage.class);
    }

}

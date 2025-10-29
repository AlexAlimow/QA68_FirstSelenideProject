package de.sconto.pages;

import com.codeborne.selenide.Selenide;
import de.sconto.utils.PropertiesLoader;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class ProfilePage {

    public static final String userName = PropertiesLoader.loadProperty("user.name");


    public ProfilePage verifyUserName() {
        $(".titleHeadline").shouldHave(text(userName));
        return Selenide.page(this);
    }
}

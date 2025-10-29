package de.sconto.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;

import static com.codeborne.selenide.Selenide.$;

public class CartPage {
    public CartPage verifyItem() {
        $("span.simpleText--articleNameFont")
                .shouldHave(Condition.text("Ecksofa mit Schlaffunktion Luis"));
        return Selenide.page(this);
    }
}

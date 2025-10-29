package de.sconto.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class ItemPage {
    public ItemPage addItemToCart() {
        $("button[data-testid='addToCartButton']").click();
        return Selenide.page(ItemPage.class);
    }

    public ItemPage clickToCartPage() {
        $("#zipCode").setValue("54290");
//$("cartOverlayToCartButton").click();
        $$("button").findBy(Condition.text("In den Warenkorb")).click();
        $("[data-testid='cartOverlayToCartButton']").click();

        return Selenide.page(ItemPage.class);
    }
}

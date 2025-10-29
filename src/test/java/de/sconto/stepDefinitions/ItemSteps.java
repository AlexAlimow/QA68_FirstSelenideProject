package de.sconto.stepDefinitions;

import com.codeborne.selenide.Selenide;
import de.sconto.pages.CartPage;
import de.sconto.pages.HomePage;
import de.sconto.pages.ItemPage;
import de.sconto.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static de.sconto.pages.HomePage.baseURL;

public class ItemSteps {

    HomePage home;
    LoginPage login;
    ItemPage itemPage;
    CartPage cart;

    @Given("User on Home page")
    public void on_Home_page() {
        //home = open("https://www.sconto.de", HomePage.class);
        home = open(baseURL, HomePage.class);
        getWebDriver().manage().window().maximize();
        home.clickOnAcceptCookies();
    }

    @When("User click on Login")
    public void click_on_Login() {
        home.clickOnLoginIcon();
    }

    @And("User enter data")
    public void enter_correct_data() {
        login = Selenide.page(LoginPage.class);
        login.enterData();
    }

    @And("User click on Anmelden")
    public void click_on_Anmelden() {
        login.clickOnAnmelden();
    }

    @And("User click on Moebel link")
    public void click_on_Moebel_link(){
        home.clickOnMoebelLink();
    }
    @And("User goes to Sofas page and click on first sofa")
    public void click_on_Sofas_page(){
        home.clickOnSofasPage();
    }

    @And("User add item to cart")
    public void add_item_to_cart(){
        itemPage = Selenide.page(ItemPage.class);
        itemPage.addItemToCart();
    }

    @And("User goes to cart page")
    public void go_to_cart_page(){
        itemPage.clickToCartPage();
    }

    @Then("User verifies his item added to cart")
    public void verifies_item_added_to_cart(){
        cart = Selenide.page(CartPage.class);
        cart.verifyItem();
    }

}

package de.sconto.stepDefinitions;

import com.codeborne.selenide.Selenide;
import de.sconto.pages.HomePage;
import de.sconto.pages.LoginPage;
import de.sconto.pages.ProfilePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static de.sconto.pages.HomePage.baseURL;

public class LoginSteps {
    HomePage home;
    LoginPage login;
    ProfilePage profile;

    @Given("User is on Home page")
    public void is_on_Home_page() {
        //home = open("https://www.sconto.de", HomePage.class);
        home = open(baseURL, HomePage.class);
        getWebDriver().manage().window().maximize();
        home.clickOnAcceptCookies();
    }

    @When("User clicks on Login icon")
    public void click_on_Login_icon() {
        home.clickOnLoginIcon();
    }

    @And("User enters correct data")
    public void enters_Correct_data() {
        login = Selenide.page(LoginPage.class);
        login.enterData();
    }

    @And("User clicks on Anmelden button")
    public void click_on_Anmelden_button() {
        login.clickOnAnmelden();
    }

    @And("User clicks on User status")
    public void click_on_User_status() {
        home.clickOnUserStatus();
    }

    @Then("User verifies his name is displayed")
    public void verify_user_name(){
        profile = Selenide.page(ProfilePage.class);
        profile.verifyUserName();
    }
}

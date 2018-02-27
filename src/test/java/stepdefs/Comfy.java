package stepdefs;

import Pages.BaseObject;
import Pages.ComfyFieldPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class Comfy  {
    ComfyFieldPage comfyFieldPage=new ComfyFieldPage();

    @Given("^I non-loged user I go to Comfy$")
    public void iNonLogedUserIGoToComfy() throws Throwable {
        comfyFieldPage.openingComfyPage();
        // Write code here that turns the phrase above into concrete actions
    }

    @And("^I go to Odessa city$")
    public void iGoToOdessaCity() throws Throwable {
        comfyFieldPage.chooseYourCity();
        comfyFieldPage.chooseOdessa();
        // Write code here that turns the phrase above into concrete actions
    }

    @When("^I ented 'холодильник' in search filed$")
    public void iEntedХолодильникInSearchFiled() throws Throwable {
        comfyFieldPage.searchFredge();
        // Write code here that turns the phrase above into concrete actions
    }

    @And("^Click on Search button$")
    public void clickOnSearchButton() throws Throwable {
       comfyFieldPage.searchButton.click(); // Write code here that turns the phrase above into concrete actions
    }

    @Then("^I see all products 'холодильник'$")
    public void iSeeAllProductsХолодильник() throws Throwable {
        Assert.assertEquals( comfyFieldPage.titleSearchResult.getText(), "Холодильники в Одессе");// Write code here that turns the phrase above into concrete actions
    }
}

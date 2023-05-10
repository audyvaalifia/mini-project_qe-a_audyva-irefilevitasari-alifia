package starter.stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.PurchaseNeg;

public class PurchaseNegSteps {
    @Steps
    PurchaseNeg PurchaseNeg;

    @Given("I am on the home page")
    public void onTheNonAccountHomePage(){
        PurchaseNeg.openUrl("https://alta-shop.vercel.app/");
        PurchaseNeg.validateOnHomePage();
    }
    @When("I click beli button in one of many products")
    public void clickLoginHomeButton(){
        PurchaseNeg.clickLoginHomeButton();
    }
    @And("I click Cart icon")
    public void clickCartIcon(){
        PurchaseNeg.clickCartIcon();
    }
    @And("I click Bayar button")
    public void clickBayarButton(){
        PurchaseNeg.clickBayarButton();
    }
    @Then("I am redirected to login form")
    public void validateOnCartPage(){
        PurchaseNeg.validateOnCartPage();
    }
}

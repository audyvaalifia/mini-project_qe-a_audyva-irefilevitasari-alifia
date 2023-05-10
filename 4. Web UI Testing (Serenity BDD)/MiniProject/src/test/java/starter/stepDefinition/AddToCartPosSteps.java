package starter.stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.AddToCartPos;

public class AddToCartPosSteps {
    @Steps
    AddToCartPos AddToCartPos;

    @Given("I am on the Home page")
    public void onTheNonAccountHomePage(){
        AddToCartPos.openUrl("https://alta-shop.vercel.app/");
        AddToCartPos.validateOnHomePage();
    }
    @When("I click beli button in one of many items")
    public void clickLoginHomeButton(){
        AddToCartPos.clickLoginHomeButton();
    }
    @And("I click cart icon")
    public void clickCartIcon(){
        AddToCartPos.clickCartIcon();
    }
    @Then("I have my product on the cart")
    public void validateOnCartPage(){
        AddToCartPos.validateOnCartPage();
    }
}

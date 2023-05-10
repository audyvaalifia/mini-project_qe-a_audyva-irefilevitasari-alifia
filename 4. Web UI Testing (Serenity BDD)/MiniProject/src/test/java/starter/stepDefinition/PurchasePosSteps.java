package starter.stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.PurchasePos;

public class PurchasePosSteps {
    @Steps
    PurchasePos PurchasePos;

    @Given("I am on the non-account Homepage")
    public void onTheNonAccountHomePage(){
        PurchasePos.openUrl("https://alta-shop.vercel.app/");
        PurchasePos.validateOnNonAccountHomePage();
    }
    @When("I click login icon")
    public void clickLoginHomeButton(){
        PurchasePos.clickLoginHomeButton();
    }
    @And("I input Valid email")
    public void inputValidEmail(){
        PurchasePos.inputValidEmail("dummy3@gmail.com");
    }
    @And("I input Valid Password")
    public void inputValidPassword(){
        PurchasePos.inputValidPassword("alterraaudyva");
    }

    @And("I click login Button")
    public void clickRegisterButton(){
        PurchasePos.clickRegisterButton();
    }
    @And("I am on my account home page")
    public void onLoginForm(){
        PurchasePos.validateOnLoginForm();
    }
    @When("I click Beli button in one of many products")
    public void clickBeliButton(){
        PurchasePos.clickBeliButton();
    }
    @And("I click Cart Icon")
    public void clickCartIcon(){
        PurchasePos.clickCartIcon();
    }
    @And("I click Bayar Button")
    public void clickBayarButton(){
        PurchasePos.clickBayarButton();
    }
    @Then("I am redirected to transaction history page")
    public void validateOnTransactionPage(){
        PurchasePos.validateOnTransactionPage();
    }
}


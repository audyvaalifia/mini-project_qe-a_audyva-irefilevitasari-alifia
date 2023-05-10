package starter.stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.RegisterPos;

public class RegisterPosSteps {
    @Steps
    RegisterPos RegisterPos;

    @Given("I am on the non-account home page")
    public void onTheNonAccountHomePage(){
        RegisterPos.openUrl("https://alta-shop.vercel.app/");
        RegisterPos.validateOnNonAccountHomePage();
    }
    @When("I click login home button")
    public void clickLoginHomeButton(){
        RegisterPos.clickLoginHomeButton();
    }
    @And("I click Register link")
    public void clickRegisterLink(){
        RegisterPos.clickRegisterLink();
    }
    @And("I input Full name")
    public void inputFullName(){
        RegisterPos.inputFullName("Audyva Irefilevitasari Alifia");
    }
    @And("I input valid email")
    public void inputValidEmail(){
        RegisterPos.inputValidEmail("dummy12@gmail.com");
    }
    @And("I input valid password")
    public void inputValidPassword(){
        RegisterPos.inputValidPassword("alterraaudyva");
    }

    @And("I click Register button")
    public void clickRegisterButton(){
        RegisterPos.clickRegisterButton();
    }
    @Then("I am on the login form")
    public void onLoginForm(){
        RegisterPos.validateOnLoginForm();
    }
}

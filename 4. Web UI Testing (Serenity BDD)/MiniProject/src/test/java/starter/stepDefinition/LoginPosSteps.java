package starter.stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.LoginPos;

public class LoginPosSteps {
    @Steps
    LoginPos LoginPos;

    @Given("I am on the non-account Home page")
    public void onTheNonAccountHomePage(){
        LoginPos.openUrl("https://alta-shop.vercel.app/");
        LoginPos.validateOnNonAccountHomePage();
    }
    @When("I click login home icon")
    public void clickLoginHomeButton(){
        LoginPos.clickLoginHomeButton();
    }
    @And("I input valid Email")
    public void inputValidEmail(){
        LoginPos.inputValidEmail("dummy3@gmail.com");
    }
    @And("I input valid Password")
    public void inputValidPassword(){
        LoginPos.inputValidPassword("alterraaudyva");
    }

    @And("I click Login button")
    public void clickRegisterButton(){
        LoginPos.clickRegisterButton();
    }
    @Then("I am on the account home page")
    public void onLoginForm(){
        LoginPos.validateOnMyAccountHomePage();
    }
}

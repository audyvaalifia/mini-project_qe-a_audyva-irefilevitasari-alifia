package starter.stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.LoginNeg;

public class LoginNegSteps {
    @Steps
    LoginNeg LoginNeg;

    @Given("I am on the nonaccount Home page")
    public void onTheNonAccountHomePage(){
        LoginNeg.openUrl("https://alta-shop.vercel.app/");
        LoginNeg.validateOnNonAccountHomePage();
    }
    @When("I click login-home icon")
    public void clickLoginHomeButton(){
        LoginNeg.clickLoginHomeButton();
    }
    @And("I input Valid Email")
    public void inputValidEmail(){
        LoginNeg.inputValidEmail("audyvairefilevitasarialifia9@gmail.com");
    }
    @And("I input invalid Password")
    public void inputInalidPassword(){
        LoginNeg.inputInvalidPassword("akjsnaDSNANDADN");
    }

    @And("I click Login Button")
    public void clickRegisterButton(){
        LoginNeg.clickRegisterButton();
    }
    @Then("I am still remain in Login form")
    public void onLoginForm(){
        LoginNeg.validateOnLoginForm();
    }
}

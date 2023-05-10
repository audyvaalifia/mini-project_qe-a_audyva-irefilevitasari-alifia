package starter.stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.RegisterNeg;

public class RegisterNegSteps {
    @Steps
    RegisterNeg RegisterNeg;

    @Given("I am on the non-account homepage")
    public void onTheNonAccountHomePage(){
        RegisterNeg.openUrl("https://alta-shop.vercel.app/");
        RegisterNeg.validateOnNonAccountHomePage();
    }
    @When("I click Login home icon")
    public void RegisterNeg1(){
        RegisterNeg.RegisterNeg1();
    }
    @And("I click Register Link")
    public void RegisterNeg2(){
        RegisterNeg.RegisterNeg2();
    }
    @And("I input Fullname")
    public void RegisterNeg3(){
        RegisterNeg.RegisterNeg3("Audyva Irefilevitasari Alifia");
    }
    @And("I input already existed email")
    public void RegisterNeg4(){
        RegisterNeg.RegisterNeg4("dummy3@gmail.com");
    }
    @And("I input password")
    public void RegisterNeg5(){
        RegisterNeg.RegisterNeg5("alterraaudyva");
    }

    @And("I click Register Button")
    public void RegisterNeg6(){
        RegisterNeg.RegisterNeg6();
    }
    @Then("I am still remain in Register form")
    public void onLoginForm(){
        RegisterNeg.validateOnLoginForm();
    }
}

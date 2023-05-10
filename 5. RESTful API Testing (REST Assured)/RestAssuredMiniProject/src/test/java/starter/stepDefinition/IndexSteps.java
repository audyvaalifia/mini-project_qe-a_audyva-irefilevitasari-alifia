package starter.stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.index.Get;

public class IndexSteps {
    @Steps
    Get get;

    @Given("I set Get API endpoint")
    public void setGetApiEndpoints() {
        get.setApiEndpoint();
    }

    @When("I send Get HTTP request")
    public void sendGetHttpRequest() {
        get.sendGetHttpRequest();
    }

    @Then("I receive valid HTTP Response code is 200")
    public void receiveValidHttpResponse() {
        get.validateHttpResponseCode200();
    }

    @And("I receive valid data for say hello")
    public void receiveValidDataForDetailProduct() {
        get.validateSayHello();
    }

   }
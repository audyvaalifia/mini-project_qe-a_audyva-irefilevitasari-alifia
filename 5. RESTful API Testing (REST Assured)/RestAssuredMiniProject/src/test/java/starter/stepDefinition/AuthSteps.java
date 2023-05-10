package starter.stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.auth.Get;
import starter.auth.PostReg;
import starter.auth.PostLog;

public class AuthSteps {
    @Steps
    Get get;
    @Steps
    PostReg postreg;
    @Steps
    PostLog postlog;

    @Given("I set Get api endpoint")
    public void setGetApiEndpoints() {
        get.setApiEndpoint();
    }

    @When("I send Get HTTP Request")
    public void sendGetHttpRequest() {
        get.sendGetHttpRequest();
    }

    @Then("I receive valid HTTP Response code 200")
    public void receiveValidHttpResponse() {
        get.validateHttpResponseCode200();
    }

    @And("I receive valid data for user information")
    public void receiveValidDataForDetailProduct() {
        get.validateDataRatingProduct();
    }

//BATAS
    @Given("I set Post api endpoint")
    public void setPostApiEndpoints() {
        postreg.setPostApiEndpoint();
    }

    @When("I send Post HTTP Request")
    public void sendPostHttpRequest() {
        postreg.sendPostHttpRequest();
    }

    @Then("I receive valid HTTP Response code 201")
    public void receiveValidHttp201() {
        postreg.validateHttpResponseCode201();
    }

    @And("I receive valid data for new user account")
    public void receiveValidDataForRatingProduct() {
        postreg.validateDataRatingProduct();
    }

//BATAS
    @Given("I set Post API endpoint")
    public void setPostApiEndpoint() {
        postlog.setPostApiEndpoint();
    }

    @When("I send Post HTTP request")
    public void sendPostHTTPRequest() {
        postlog.sendPostHttpRequest();
    }

    @Then("I receive valid HTTP Response code is 201")
    public void receiveValidHTTP201() {
        postlog.validateHttpResponseCode201();
    }

    @And("I receive valid data for existing user account")
    public void receiveValidDataRatingProduct() {
        postlog.validateDataRatingProduct();
    }

}
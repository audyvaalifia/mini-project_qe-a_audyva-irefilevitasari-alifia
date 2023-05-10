package starter.stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.category.Get;
import starter.category.Post;
import starter.category.Delete;

public class CategorySteps {
    @Steps
    Get get;
    @Steps
    Post post;
    @Steps
    Delete delete;

    @Given("I set GET api endpoint")
    public void setGetApiEndpoints() {
        get.setApiEndpoint();
    }

    @When("I send GET HTTP Request")
    public void sendGetHttpRequest() {
        get.sendGetHttpRequest();
    }

    @Then("I receive valid HTTP response code is 200")
    public void receiveValidHttpResponse() {
        get.validateHttpResponseCode200();
    }

    @And("I receive valid data for product category")
    public void receiveValidDataForDetailProduct() {
        get.validateDataRatingProduct();
    }

    //BATAS
    @Given("I set POST api endpoint")
    public void setPostApiEndpoints() {
        post.setPostApiEndpoint();
    }

    @When("I send POST HTTP Request")
    public void sendPostHttpRequest() {
        post.sendPostHttpRequest();
    }

    @Then("I receive valid HTTP response code is 201")
    public void receiveValidHttp201() {
        post.validateHttpResponseCode201();
    }

    @And("I receive valid data for new product category")
    public void receiveValidDataForRatingProduct() {
        post.validateDataRatingProduct();
    }

//BATAS
    @Given("I set DELETE api endpoint")
    public void setDeleteApiEndpoints() {
        delete.setApiEndpoint();
    }

    @When("I send DELETE HTTP Request")
    public void sendDeleteHttpRequest() {
        delete.sendDeleteHttpRequest();
    }

    @Then("I receive valid HTTP response code is 204")
    public void receiveValidHTTPresponse() {
        delete.validateHttpResponseCode204();
    }


}
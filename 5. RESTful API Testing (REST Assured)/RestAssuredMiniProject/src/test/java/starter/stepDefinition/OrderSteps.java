package starter.stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.order.Get;
import starter.order.Post;

public class OrderSteps {
    @Steps
    Get get;
    @Steps
    Post post;

    @Given("I set Get API endpoints")
    public void setGetApiEndpoints() {
        get.setApiEndpoint();
    }

    @When("I send Get Http Request")
    public void sendGetHttpRequest() {
        get.sendGetHttpRequest();
    }

    @Then("I receive valid Http Response code 200")
    public void receiveValidHttpResponse() {
        get.validateHttpResponseCode200();
    }

    @And("I receive valid data for the order")
    public void receiveValidDataForDetailProduct() {
        get.validateDataTheOrder();
    }

 //BATAS
    @Given("I set Post API endpoints")
    public void setPostApiEndpoints() {
        post.setPostApiEndpoint();
    }

    @When("I send Post Http Request")
    public void sendPostHttpRequest() {
        post.sendPostHttpRequest();
    }

    @Then("I receive valid Http Response code 201")
    public void receiveValidHttp201() {
        post.validateHttpResponseCode201();
    }

    @And("I receive valid data for new order")
    public void receiveValidDataForRatingProduct() {
        post.validateDataNewOrder();
    }



}
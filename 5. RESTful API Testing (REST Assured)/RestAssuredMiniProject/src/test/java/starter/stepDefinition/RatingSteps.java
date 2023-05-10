package starter.stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.rating.Get;
import starter.rating.Post;

public class RatingSteps {
    @Steps
    Get get;
    @Steps
    Post post;

    @Given("I set GET API endpoints")
    public void setGetApiEndpoints() {
        get.setApiEndpoint();
    }

    @When("I send GET Http request")
    public void sendGetHttpRequest() {
        get.sendGetHttpRequest();
    }

    @Then("I receive valid Http response code 200")
    public void receiveValidHttpResponse() {
        get.validateHttpResponseCode200();
    }

    @And("I receive valid data for rating product")
    public void receiveValidDataForDetailProduct() {
        get.validateDataRatingProduct();
    }

    //BATAS
    @Given("I set POST API endpoints")
    public void setPostApiEndpoints() {
        post.setPostApiEndpoint();
    }

    @When("I send POST Http request")
    public void sendPostHttpRequest() {
        post.sendPostHttpRequest();
    }

    @Then("I receive valid Http response code 201")
    public void receiveValidHttp201() {
        post.validateHttpResponseCode201();
    }

    @And("I receive valid data for new rating product")
    public void receiveValidDataForRatingProduct() {
        post.validateDataRatingProduct();
    }
}
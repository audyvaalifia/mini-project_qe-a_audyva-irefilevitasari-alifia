package starter.stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.comment.Get;
import starter.comment.Post;

public class CommentSteps {
    @Steps
    Get get;
    @Steps
    Post post;

    @Given("I set GET API endpoint")
    public void setGetApiEndpoints() {
        get.setApiEndpoint();
    }

    @When("I send GET Http Request")
    public void sendGetHttpRequest() {
        get.sendGetHttpRequest();
    }

    @Then("I receive valid Http response code is 200")
    public void receiveValidHttpResponse() {
        get.validateHttpResponseCode200();
    }

    @And("I receive valid data for product comment")
    public void receiveValidDataForDetailProduct() {
        get.validateDataRatingProduct();
    }

    //BATAS
    @Given("I set POST API endpoint")
    public void setPostApiEndpoints() {
        post.setPostApiEndpoint();
    }

    @When("I send POST Http Request")
    public void sendPostHttpRequest() {
        post.sendPostHttpRequest();
    }

    @Then("I receive valid Http response code is 201")
    public void receiveValidHttp201() {
        post.validateHttpResponseCode201();
    }

    @And("I receive valid data for new product comment")
    public void receiveValidDataForRatingProduct() {
        post.validateDataRatingProduct();
    }
}
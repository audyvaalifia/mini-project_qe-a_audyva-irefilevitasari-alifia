package starter.stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.product.Delete;
import starter.product.Get;
import starter.product.Post;

public class ProductSteps {
    @Steps
    Get get;
    @Steps
    Post post;
    @Steps
    Delete delete;

    @Given("I set GET api endpoints")
    public void setGetApiEndpoints() {
        get.setApiEndpoint();
    }

    @When("I send GET HTTP request")
    public void sendGetHttpRequest() {
        get.sendGetHttpRequest();
    }

    @Then("I receive valid HTTP response code 200")
    public void receiveValidHttpResponse() {
        get.validateHttpResponseCode200();
    }

    @And("I receive valid data for detail product")
    public void receiveValidDataForDetailProduct() {
        get.validateDataDetailProduct();
    }
//BATAS
    @Given("I set POST api endpoints")
    public void setPostApiEndpoints() {
        post.setPostApiEndpoint();
    }

    @When("I send POST HTTP request")
    public void sendPostHttpRequest() {
        post.sendPostHttpRequest();
    }

    @Then("I receive valid HTTP response code 201")
    public void receiveValidHttp201() {
        post.validateHttpResponseCode201();
    }

    @And("I receive valid data for new product")
    public void receiveValidDataForNewProduct() {
        post.validateDataNewProduct();
    }
//BATAS
    @Given("I set DELETE api endpoints")
    public void setDeleteApiEndpoints() {
        delete.setApiEndpoint();
    }

    @When("I send DELETE HTTP request")
    public void sendDeleteHttpRequest() {
        delete.sendDeleteHttpRequest();
    }

    @Then("I receive valid HTTP response code 204")
    public void receiveValidHTTPresponse() {
        delete.validateHttpResponseCode204();
    }


}

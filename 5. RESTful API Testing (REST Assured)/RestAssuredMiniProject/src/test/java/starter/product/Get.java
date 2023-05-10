package starter.product;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class Get {
    protected static String url = "https://altashop-api.fly.dev/api/";

    @Step("I set GET api endpoints")
    public String setApiEndpoint(){
        return url + "products/13437";
    }
    @Step("I send GET HTTP request")
    public void sendGetHttpRequest(){
        SerenityRest.given().get(setApiEndpoint());
    }
    @Step("I receive valid HTTP response code 200")
    public void validateHttpResponseCode200(){
        restAssuredThat(response -> response.statusCode(200));
    }
    @Step("I receive valid data for detail product")
    public void validateDataDetailProduct(){
        restAssuredThat(response -> response.body("'data'.'ID'", equalTo(13437)));
        restAssuredThat(response -> response.body("'data'.'Name'", equalTo("Bracelet")));
    }


}

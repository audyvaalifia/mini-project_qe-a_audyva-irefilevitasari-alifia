package starter.rating;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class Get {
    protected static String url = "https://altashop-api.fly.dev/api/products/";

    @Step("I set GET api endpoints")
    public String setApiEndpoint(){
        return url + "13425/ratings";
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
    public void validateDataRatingProduct(){
        restAssuredThat(response -> response.body("'data'", equalTo(4)));
    }


}

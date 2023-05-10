package starter.comment;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class Get {
    protected static String url = "https://altashop-api.fly.dev/api/";

    @Step("I set GET API endpoint")
    public String setApiEndpoint(){
        return url + "products/13425/comments";
    }
    @Step("I send GET HTTP Request")
    public void sendGetHttpRequest(){
        SerenityRest.given().get(setApiEndpoint());
    }
    @Step("I receive valid HTTP response code is 200")
    public void validateHttpResponseCode200(){
        restAssuredThat(response -> response.statusCode(200));
    }
    @Step("I receive valid data for product comment")
    public void validateDataRatingProduct(){
        restAssuredThat(response -> response.body("'Content'", equalTo(null)));
    }


}

package starter.product;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class Delete {
    protected static String url = "https://altashop-api.fly.dev/api/";

    @Step("I set DELETE api endpoints")
    public String setApiEndpoint(){
        return url + "products/13448";
    }
    @Step("I send DELETE HTTP request")
    public void sendDeleteHttpRequest(){
        SerenityRest.given().delete(setApiEndpoint());
    }
    @Step("I receive valid HTTP response code 204")
    public void validateHttpResponseCode204(){
        restAssuredThat(response -> response.statusCode(200));
    }


}

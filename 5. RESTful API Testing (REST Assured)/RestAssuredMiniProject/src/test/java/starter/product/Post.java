package starter.product;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class Post {
    protected static String url = "https://altashop-api.fly.dev/api/";

    @Step("I set POST api endpoints")
    public String setPostApiEndpoint(){
        return url + "products";
    }
    @Step("I send POST HTTP request")
    public void sendPostHttpRequest(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("Name", "DVD Mugen Train");
        requestBody.put("Price", 120000);

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostApiEndpoint());
    }


    @Step("I receive valid HTTP response code 201")
    public void validateHttpResponseCode201(){
        restAssuredThat(response -> response.statusCode(200));
    }
    @Step("I receive valid data for new product")
    public void validateDataNewProduct(){
        restAssuredThat(response -> response.body("'data'.'Name'", equalTo("DVD Mugen Train")));
    }


}
